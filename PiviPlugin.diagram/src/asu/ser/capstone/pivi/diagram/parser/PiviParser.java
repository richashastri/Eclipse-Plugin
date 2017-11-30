package asu.ser.capstone.pivi.diagram.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PiviParser {

	StartNode startNode;
	List<StatementNode> statements;
	StringBuilder generatedCode;
	Stack<StatementNode> ifStack;
	Stack<StatementNode> whileStack;
	StringBuilder methodDefinitionCode;
	Stack<StatementNode> methodStack;
	StringBuilder threadDefinitionCode;
	Stack<StatementNode> threadStack;
	Stack<StatementNode> syncStack;
	int counter = 0;


	public PiviParser() {
		statements = new ArrayList<>();
		generatedCode = new StringBuilder();
		ifStack = new Stack<>();
		whileStack = new Stack<>();
		methodDefinitionCode = new StringBuilder();
		methodStack = new Stack<>();
		threadDefinitionCode = new StringBuilder();
		threadStack = new Stack<>();
		syncStack = new Stack<>();

	}

	public void ParseDiagram(String path, String fileName) {
		File piviFile = new File(path + "/" + fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(piviFile);
			doc.getDocumentElement().normalize();

			this.startNode = new StartNode(doc);
			this.setStatements(doc);
			this.generateCode();
			this.saveToFile(path);

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void saveToFile(String path) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String fileName = path + "/src/Solution.java";

		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(generatedCode.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateCode() 
	{
		if(counter == 0)
		{
			generatedCode.append("public class Solution {\n");
		}
		else
		{
			generatedCode.append("public class Solution extends Thread {\n");
		}
		generatedCode.append("public static void main(String[] args) { \n");
		int index = startNode.outputIndex;
		generateStatementCode(index, generatedCode);
		generatedCode.append("}\n");
		generateMethodDefinitions();
		generatedCode.append(methodDefinitionCode);
		generateThreadDefinitions();
		generatedCode.append(threadDefinitionCode);
		generatedCode.append("}\n");
	}

	private void generateStatementCode(int index, StringBuilder code) {		
		while (index != -1) {
			StatementNode statement = statements.get(index);
			if (statement instanceof IfStartNode) {
				ifStack.push(statement);
				code.append("if(");
				code.append(((IfStartNode) statement).condition);
				code.append("){\n");
				index = ((IfStartNode) statement).firstOutputIndex;
			} else if (statement instanceof IfEndNode) {
				if (!ifStack.empty()) {
					StatementNode ifStatement = ifStack.pop();
					if (ifStatement instanceof IfStartNode) {
						index = ((IfStartNode) ifStatement).secondOutputIndex;
						if (index == -1) {
							index = ((IfEndNode) statement).firstOutputIndex;
							code.append("}\n");
						} else {
							code.append("} else {\n");
						}
					}
				} else {
					index = ((IfEndNode) statement).firstOutputIndex;
					code.append("}\n");
				}
			} else if (statement instanceof InstructionNode) {
				code.append(((InstructionNode) statement).instructions);
				code.append("\n");
				index = ((InstructionNode) statement).firstOutputIndex;
			} else if (statement instanceof PrintStatementNode) {
				code.append("System.out.println(");
				code.append(((PrintStatementNode) statement).printlines);
				code.append(");\n");
				index = ((PrintStatementNode) statement).firstOutputIndex;
			} 
			else if (statement instanceof WhileStartNode) 
			{
				whileStack.push(statement);
				code.append("while(");
				code.append(((WhileStartNode) statement).condition);
				code.append("){\n");
				index = ((WhileStartNode) statement).firstOutputIndex;
			} 
			else if (statement instanceof WhileEndNode) 
			{
				if (!whileStack.isEmpty()) {
					whileStack.pop();
					code.append("}\n");
					index = ((WhileEndNode) statement).firstOutputIndex;
				}
			}
			else if (statement instanceof SyncStartNode) 
			{
				syncStack.push(statement);
				code.append("synchronized(this){\n");
				index = ((SyncStartNode) statement).firstOutputIndex;
			} 
			else if (statement instanceof SyncEndNode) 
			{
				if (!syncStack.isEmpty()) {
					syncStack.pop();
					code.append("}\n");
					index = ((SyncEndNode) statement).firstOutputIndex;
				}
			}
			else if (statement instanceof MethodEndNode){
				methodStack.pop();
				code.append("}\n");
				index = ((MethodEndNode) statement).firstOutputIndex;
			}
			
			else if (statement instanceof ThreadEndNode){
				threadStack.pop();
				code.append("}\n");
				index = ((ThreadEndNode) statement).firstOutputIndex;
			}
				
			
		}
	}

	private void generateMethodDefinitions() {
		for (StatementNode statement : statements) {
			if(statement instanceof MethodStartNode){
				methodStack.push(statement);
				String methodType = ((MethodStartNode)statement).name;
				String type = methodType.substring(0,methodType.indexOf("_"));
				System.out.println(type);
				String funcname = methodType.substring(methodType.indexOf("_")+1);
				System.out.println(funcname);
				if(type.equals("Async")){
					methodDefinitionCode.append("public void " + funcname + "(){\n");
					generateStatementCode(((MethodStartNode)statement).firstOutputIndex, methodDefinitionCode);
				}else if(type.equals("Sync")){
					methodDefinitionCode.append("synchronized public void " + funcname + "(){\n");
					generateStatementCode(((MethodStartNode)statement).firstOutputIndex, methodDefinitionCode);
				}else{
					methodDefinitionCode.append("public void " + funcname + "(){\n");
					generateStatementCode(((MethodStartNode)statement).firstOutputIndex, methodDefinitionCode);
				}
				//methodDefinitionCode.append("public void " + ((MethodStartNode)statement).name + "(){\n");
				
			}
		}
	}
	
	private void generateThreadDefinitions() 
	{
		for (StatementNode statement : statements) 
		{
			if(statement instanceof ThreadStartNode){
				threadStack.push(statement);
				threadDefinitionCode.append("public void run(){\n");
				generateStatementCode(((ThreadStartNode)statement).firstOutputIndex, threadDefinitionCode);
			}
		}
	}

	private void setStatements(Document doc) 
	{
		NodeList nStatementList = doc.getElementsByTagName("statements");
		for (int i = 0; i < nStatementList.getLength(); i++) 
		{
			Node nStatement = nStatementList.item(i);
			if (nStatement.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element element = (Element) nStatement;

				String statementType = element.getAttribute("xsi:type");

				if (statementType.contains("IfStart")) 
				{
					statements.add(new IfStartNode(element));
				} else if (statementType.contains("IfEnd")) {
					statements.add(new IfEndNode(element));
				} else if (statementType.contains("Instruction")) {
					statements.add(new InstructionNode(element));
				}  else if (statementType.contains("PrintStatement")) {
					statements.add(new PrintStatementNode(element));
				} else if (statementType.contains("WhileStart")) {
					statements.add(new WhileStartNode(element));
				} else if (statementType.contains("WhileEnd")) {
					statements.add(new WhileEndNode(element));
				} else if (statementType.contains("MethodStart")) {
					statements.add(new MethodStartNode(element));
				} else if (statementType.contains("MethodEnd")) {
					statements.add(new MethodEndNode(element));
				}
				else if (statementType.contains("ThreadStart")) 
				{
					statements.add(new ThreadStartNode(element));
					counter++;
				} 
				else if (statementType.contains("ThreadEnd")) 
				{
					statements.add(new ThreadEndNode(element));
					counter++;
				}
				else if (statementType.contains("SyncStart")) 
				{
					statements.add(new SyncStartNode(element));
				} 
				else if (statementType.contains("SyncEnd")) 
				{
					statements.add(new SyncEndNode(element));
				} 
			}
		}
	}
}
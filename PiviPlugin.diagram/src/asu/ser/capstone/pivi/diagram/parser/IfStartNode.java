package asu.ser.capstone.pivi.diagram.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IfStartNode implements StatementNode{
	public int firstInputIndex;
	public int firstOutputIndex;
	public int secondOutputIndex;
	public String condition;
	
	public IfStartNode(Element element){
		this.condition = element.getAttribute("condition");

		Node nInput = element.getElementsByTagName("inputs").item(0);
		if (nInput.getNodeType() == Node.ELEMENT_NODE) {
			Element inputElement = (Element) nInput;
			String previousPointer = inputElement.getAttribute("outputPort");
			if (!previousPointer.isEmpty()) {
				Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
				Matcher matcher = pattern.matcher(previousPointer);
				if (matcher.find()) {
					this.firstInputIndex = Integer.parseInt(matcher.group(0));
				} else {
					this.firstInputIndex = -1;
				}				
			} else {
				this.firstInputIndex = -1;
			}
		}

		NodeList nOutputs = element.getElementsByTagName("outputs");
		for (int i = 0; i < nOutputs.getLength(); i++) {
			Node nOutput = nOutputs.item(i);
			if (nOutput.getNodeType() == Node.ELEMENT_NODE) {
				Element inputElement = (Element) nOutput;
				String nextPointer = inputElement.getAttribute("inputPort");
				if (!nextPointer.isEmpty()) {
					if (i == 0) {
						Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
						Matcher matcher = pattern.matcher(nextPointer);
						if(matcher.find()){
							this.firstOutputIndex = Integer.parseInt(matcher.group(0));
						}else{
							this.firstOutputIndex = -1;
						}
					} else {
						Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
						Matcher matcher = pattern.matcher(nextPointer);
						if(matcher.find()){
							this.secondOutputIndex = Integer.parseInt(matcher.group(0));
						}else{
							this.secondOutputIndex = -1;
						}
					}
				} else {
					if (i == 0) {
						this.firstOutputIndex= -1;
					} else {
						this.secondOutputIndex = -1;
					}
				}
			}
		}
	}
}

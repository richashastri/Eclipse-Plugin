package asu.ser.capstone.pivi.diagram.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StartNode {
	public int outputIndex; 
	
	public StartNode(Document doc){
		NodeList nStartList = doc.getElementsByTagName("start");
		Node nStart = nStartList.item(nStartList.getLength() - 1);
		if (nStart.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) nStart;
			String nextPointer = element.getAttribute("startPort");
			if (!nextPointer.isEmpty()) {
				Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
				Matcher matcher = pattern.matcher(nextPointer);
				if(matcher.find()){
					this.outputIndex = Integer.parseInt(matcher.group(0));
				}else{
					this.outputIndex = -1;
				}
			} else {
				this.outputIndex = -1;
			}
		}
	}
}

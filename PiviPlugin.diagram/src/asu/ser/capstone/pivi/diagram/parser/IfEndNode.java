package asu.ser.capstone.pivi.diagram.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IfEndNode implements StatementNode{
	public int firstInputIndex;
	public int firstOutputIndex;
	public int secondInputIndex;
	
	public IfEndNode(Element element){
		NodeList nInputs = element.getElementsByTagName("inputs");
		for (int i = 0; i < nInputs.getLength(); i++) {
			Node nInput = nInputs.item(i);
			if (nInput.getNodeType() == Node.ELEMENT_NODE) {
				Element inputElement = (Element) nInput;
				String previousPointer = inputElement.getAttribute("outputPort");
				if (!previousPointer.isEmpty()) {
					if (i == 0) {
						Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
						Matcher matcher = pattern.matcher(previousPointer);
						if(matcher.find()){
							this.firstInputIndex = Integer.parseInt(matcher.group(0));
						}else{
							this.firstInputIndex = -1;
						}
					} else {
						Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
						Matcher matcher = pattern.matcher(previousPointer);
						if(matcher.find()){
							this.secondInputIndex = Integer.parseInt(matcher.group(0));
						}else{
							this.secondInputIndex = -1;
						}
					}
				} else {
					if (i == 0) {
						this.firstInputIndex = -1;
					} else {
						this.secondInputIndex = -1;
					}
				}
			}
		}

		Node nOutput = element.getElementsByTagName("outputs").item(0);
		if (nOutput.getNodeType() == Node.ELEMENT_NODE) {
			Element inputElement = (Element) nOutput;
			String nextPointer = inputElement.getAttribute("inputPort");
			if (!nextPointer.isEmpty()) {
				Pattern pattern = Pattern.compile("(?<=\\.)(.*?)(?=\\/)");
				Matcher matcher = pattern.matcher(nextPointer);
				if(matcher.find()){
					this.firstOutputIndex = Integer.parseInt(matcher.group(0));
				}else{
					this.firstOutputIndex = -1;
				}
			} else {
				this.firstOutputIndex = -1;
			}
		}

	}
}

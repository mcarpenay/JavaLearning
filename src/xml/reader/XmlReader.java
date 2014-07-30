package xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * This XmlReader class are using DOM parser to read data from XML.
 */

public class XmlReader {
	private static final String String = null;
	String path = "C:\\SeleniumDevelop\\workspace\\InClassCodingExam\\src\\xml\\reader\\data.xml";
	
	public List<Student> parseData(String tagName) throws ParserConfigurationException, SAXException, IOException{
		
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	File file = new File(path);
	Document doc = builder.parse(file);
	NodeList nodeList = doc.getDocumentElement().getChildNodes();
	List<Student> list = new ArrayList<>();
	for(int i=0;i<nodeList.getLength(); i++){
		Node node = nodeList.item(i);
		if(node instanceof Element){
			Student student = new Student();
			student.id = node.getAttributes().getNamedItem(tagName).getNodeValue();
			NodeList childNodes = node.getChildNodes();
			for(int j=0;j<childNodes.getLength();j++){
				Node cNode = childNodes.item(j);
				if(cNode instanceof Element){
					String content = cNode.getLastChild().getTextContent().trim();
					String data = cNode.getNodeName();
					switch(data){
					case "firstName":
						student.firstName = content;
						break;
					case "lastName":
						student.lastName = content;
						break;
					case "score":
						//convert content into string letter grade to store in score
						student.score  = getLetterGrade(content);  
						break;	
					}
				}
			}
			list.add(student);
		}
		
	 }
	return list;		
  }

	
	public String getLetterGrade(String cont){
		String  grade ="";
		int val;
		val = Integer.parseInt(cont);
		if(val>89 & val<101){ grade= "A";}
		if(val>79 && val<90){grade=  "B";}
		if(val>69 && val<80){grade=  "C";}
		return grade;
		
	}
	
	
	
}

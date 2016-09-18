package Task7_1;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for management contact
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ManagementContact {
	/**
	 * @Function for get contact from xml file
	 * @Input: name, phone
	 * @Output: none
	 */
	public Contact getContact(Node node) {
		Contact ct = new Contact();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			ct.setName(element.getElementsByTagName("name").item(0)
					.getChildNodes().item(0).getNodeValue());
			ct.setPhone(element.getElementsByTagName("phone").item(0)
					.getChildNodes().item(0).getNodeValue());
		}
		return ct;
	}
	
	/**
	 * @Function for handling file xml
	 * @Input: xmlFile
	 * @Output: none
	 */
	public Document getDocument(String filePath) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException{
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbFactory.newDocumentBuilder();
		Document doc = builder.newDocument();
		
		Element rootElement;
		File xmlFile = new File(filePath);
		
		if(xmlFile.isFile()) {
			doc = builder.parse(new FileInputStream(xmlFile));
		}else{
			rootElement = doc.createElement("contacts");
			doc.appendChild(rootElement);
		}
		return doc;
	}
	
	/**
	 * @Function for display information of contact from xml file 
	 * @Input: xmlFile
	 * @Output: information
	 */
	public List<Contact> viewContact() throws ParserConfigurationException, SAXException, IOException {
		String filePath = "src/Task7_1/contact.xml";
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		List<Contact> lst = new ArrayList<>();
		NodeList nodeList = doc.getElementsByTagName("contact");
		for (int i = 0; i < nodeList.getLength(); i++) {
			lst.add(getContact(nodeList.item(i)));
		}
		return lst;
	}
	
	/**
	 * @Function for add information of contact to xml file 
	 * @Input: information of contact
	 * @Output: none
	 */
	public void addContact(String filePath) throws IOException, SAXException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter information of new contact");
		System.out.println("Enter name: ");
		String nameCT = input.readLine();
		System.out.println("Enter phone: ");
		String phoneCT = input.readLine();
		
		Contact c = new Contact(nameCT, phoneCT);
		
		try{
			Document doc = getDocument(filePath);
			Element rootElement = doc.getDocumentElement();
			
			//contact
			Element contact = doc.createElement("contact");
			rootElement.appendChild(contact);
			
			//name element
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(c.name));
			contact.appendChild(name);
			
			//phone element
			Element phone  = doc.createElement("phone");
			phone.appendChild(doc.createTextNode(c.phone));
			contact.appendChild(phone);
			
			//write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer tran = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("src/Task7_1/contact.xml"));
			
			tran.transform(source, result);
		
		}catch(ParserConfigurationException | TransformerException pce) {
			System.out.println("Cannot insert new contact. Error: " + pce.getMessage());
		}
	}
	
	/**
	 * @Function for search information of contact to xml file 
	 * @Input: name of contact
	 * @Output: result
	 */
	public Contact searchContactByName(List<Contact> lst, String name) {
		for (Object o : lst) {
			Contact c = (Contact) o;
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * @Function for search information of contact to xml file 
	 * @Input: phone number of contact
	 * @Output: result
	 */
	public Contact searchContactByPhone(List<Contact> lst, String phone) {
		for (Object o : lst) {
			Contact c = (Contact) o;
			if (c.getPhone().equals(phone)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * @Function for delete information of contact to xml file 
	 * @Input: name of contact
	 * @Output: result
	 */
	public void deleteContactByName(List<Contact> list, String name) {
		Contact c = searchContactByName(list, name);
		if (c != null) {
			list.remove(c);
			System.out.println("Delete contact successful!");
		} else {
			System.out.println("Delete contact failure!");
		}
	}

	/**
	 * @Function for delete information of contact to xml file 
	 * @Input: phone number of contact
	 * @Output: result
	 */
	public void deleteContactByPhone(List<Contact> list, String phone) {
		Contact c = searchContactByPhone(list, phone);
		if (c != null) {
			list.remove(c);
			System.out.println("Delete contact successful!");
		} else {
			System.out.println("Delete contact failure!");
		}
	}

	/**
	 * @Function for write all information of contact to xml file 
	 * @Input: information of contact 
	 * @Output: result
	 */
	public void writeXMLFile(List<Contact> lst)
			throws TransformerException, FileNotFoundException, SAXException, IOException {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("contact");
			doc.appendChild(rootElement);
			String filePath = "src/Task7_1/contact.xml";
			for (Contact c : lst) {
				// contact
				Element contact = doc.createElement("contact");
				rootElement.appendChild(contact);

				// name element
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.getName()));
				contact.appendChild(name);

				// phone element
				Element phone = doc.createElement("phone");
				phone.appendChild(doc.createTextNode(c.getPhone()));
				contact.appendChild(phone);

				// write the content into xml file
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty(OutputKeys.METHOD, "xml");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(filePath));
				transformer.transform(source, result);
			}

		} catch (ParserConfigurationException pce) {
			System.out.println("Cannot insert new contact. Error: " + pce.getMessage());
		}
	}
}

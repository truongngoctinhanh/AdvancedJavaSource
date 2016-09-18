package Task7_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for handling xml file
 */
public class ManagementEmployee {
	public List<Department> de;
    public List<Employee> em;

    public ManagementEmployee() {
        this.de = new ArrayList<>();
        this.em = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        em.add(emp);
    }

    public void addDepartment(Department depart) {
        de.add(depart);
    }

    // load employee
    public void loadEmployee() throws SAXException {
        //read listNode
        File fXmlFile = new File("src/Task7_2/employee.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        NodeList nList = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            //normalize tree
            doc.getDocumentElement().normalize();
            nList = doc.getElementsByTagName("employee");
        } catch (ParserConfigurationException | IOException e) {
            System.out.println(e.getMessage());
        }

        //get element
        if (nList != null) {
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                Element element = (Element) node;
                String id = element.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue();
                String name = element.getElementsByTagName("fullname").item(0).getChildNodes().item(0).getNodeValue();
                String gender = element.getElementsByTagName("gender").item(0).getChildNodes().item(0).getNodeValue();
                String dateOfBirth = element.getElementsByTagName("date").item(0).getChildNodes().item(0).getNodeValue();
                String address = element.getElementsByTagName("address").item(0).getChildNodes().item(0).getNodeValue();
                String phone = element.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue();
                String email = element.getElementsByTagName("email").item(0).getChildNodes().item(0).getNodeValue();
                double salary = Double.parseDouble(element.getElementsByTagName("salary").item(0).getChildNodes().item(0).getNodeValue());
                String department = element.getElementsByTagName("idDep").item(0).getChildNodes().item(0).getNodeValue();
                Employee emp = new Employee(id, name, gender, dateOfBirth, address, phone,	email, salary, department);
                em.add(emp);
            }
        }
    }

    // load department
    public void loadDepartment() throws SAXException {
        //read listNode
        File fXmlFile = new File("src/Task7_2/department.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        NodeList nList = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            
            //normalize tree
            doc.getDocumentElement().normalize();
            nList = doc.getElementsByTagName("department");
            
        } catch (ParserConfigurationException | IOException e) {
            System.out.println(e.getMessage());
        }
        //get element
        if (nList != null) {
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                Element element = (Element) node;
                String id = element.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue();
                String name = element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();

                Department depart = new Department(id, name);
                de.add(depart);
            }
        }
    }

    /**
	 * @Function for display all information of employees
	 * @Input: list employees
	 * @Output: information
	 */
    public void displayInfoEmployee(int d) {
        for(int i=0;i<em.size();i++){
            if(em.get(i).getDepartment().equals(de.get(d-1).getId())){
                em.get(i).displayInfoEmployee();
            }
        }
    }

    /**
	 * @Function for display all information of departments
	 * @Input: list departments
	 * @Output: information
	 */
    public void showAllDeparment() {
        for (int i = 0; i < de.size(); i++) {
            de.get(i).showInfo();
        }
    }

    // get size department
    public int getSizeDepartment() {
        return de.size();
    }

    /**
	 * @Function for add new information of employee
	 * @Input: information of employee
	 * @Output: none
	 */
    public void addNewEmployee(String id, String name, String gender, String dateOfBirth, String address, String phone,
			String email, double salary, int idx) {
        em.add(new Employee(id, name, gender, dateOfBirth, address, phone,	email, salary, de.get(idx).getId()));
        System.out.println("Add successfully!");
    }
    
    /**
	 * @Function for update information to xml file
	 * @Input: information of employee
	 * @Output: none
	 */
    public void updateFileData(){
        //== rewrite file nhan_vien.xml ==//
        Path path = Paths.get("src/Task7_2/employee.xml");
        if (!Files.exists(path)) {
            File file = new File("src/Task7_2/employee.xml");
        }

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            //create root elements
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("department");
            doc.appendChild(rootElement);

            for (int i = 0; i < em.size(); i++) {
                Employee e = em.get(i);
                //employee element
                Element contact = doc.createElement("employee");
                rootElement.appendChild(contact);

                //id element
                Element id = doc.createElement("id");
                id.appendChild(doc.createTextNode(e.getId()));
                contact.appendChild(id);

                //name element
                Element name = doc.createElement("fullname");
                name.appendChild(doc.createTextNode(e.getName()));
                contact.appendChild(name);
                
                //gender element
                Element gender = doc.createElement("gender");
                gender.appendChild(doc.createTextNode(e.getGender()));
                contact.appendChild(gender);
                
                //date of birth element
                Element dateOfBirth = doc.createElement("date");
                dateOfBirth.appendChild(doc.createTextNode(e.getDateOfBirth()));
                contact.appendChild(dateOfBirth);
                
              //address element
                Element address = doc.createElement("address");
                address.appendChild(doc.createTextNode(e.getAddress()));
                contact.appendChild(address);
                
              //phone number element
                Element phone = doc.createElement("phone");
                phone.appendChild(doc.createTextNode(e.getPhone()));
                contact.appendChild(phone);
                
              //email element
                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(e.getEmail()));
                contact.appendChild(email);
                //salary element
                Element salary = doc.createElement("salary");
                salary.appendChild(doc.createTextNode(Double.toString(e.getSalary())));
                contact.appendChild(salary);
                               
                //address element
                Element idDepart = doc.createElement("idDep");
                idDepart.appendChild(doc.createTextNode(e.getDepartment()));
                contact.appendChild(idDepart);
            }
            //Write the content into file contact.xml
            TransformerFactory tranformer = TransformerFactory.newInstance();
            Transformer tf = tranformer.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Task7_2/employee.xml"));
            tf.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getMessage());
        }
        
        //== rewrite file don_vi.xml ==//
        path = Paths.get("src/Task7_2/department.xml");
        if (!Files.exists(path)) {
            //File file = new File("src/Task7_2/department.xml");
        }

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            //create root elements
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("departments");
            doc.appendChild(rootElement);

            for (int i = 0; i < de.size(); i++) {
                Department d = de.get(i);
                //employee element
                Element contact = doc.createElement("department");
                rootElement.appendChild(contact);

                //id element
                Element id = doc.createElement("id");
                id.appendChild(doc.createTextNode(d.getId()));
                contact.appendChild(id);

                //name element
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(d.getName()));
                contact.appendChild(name);
                
            }
            //Write the content into file contact.xml
            TransformerFactory tranformer = TransformerFactory.newInstance();
            Transformer tf = tranformer.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Task7_2/department.xml"));
            tf.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}

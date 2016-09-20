package PartII_XMLFile;
/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for management CD
 * 
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;


public class MainForControllerCD {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, TransformerException, SAXException, ParserConfigurationException {
		List<CD> listCDData = new ArrayList<>();
		List<CD> listCDFile = new ArrayList<>(); 
		CDController controller = new CDController();
		
		// Get list of CD from database
		listCDData = controller.getCDFromData(); 
		
		// Write list of CD to file CD.xml
		controller.writeXMLFile(listCDData); 
		
		// Read list of CD from file CD.xml
		listCDFile = controller.getCDFromXML();
		
		// Display list information of CD 
		System.out.println("List CD from file cd.xml");
		for(CD cd : listCDFile){
			cd.displayInfoCD();
		}
	}

}

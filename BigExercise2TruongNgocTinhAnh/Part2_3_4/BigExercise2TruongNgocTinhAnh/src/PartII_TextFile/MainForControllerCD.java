package PartII_TextFile;

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

public class MainForControllerCD {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		List<CD> listCDData = new ArrayList<>(); 
		List<CD> listCDFile = new ArrayList<>(); 
		CDController controller = new CDController();
		
		// Get list CD from database
		listCDData = controller.getAllCD(); 
		
		// Write list CD to file cd.txt
		controller.writeCDToFile(listCDData);
		
		// Read list CD from file cd.txt
		listCDFile = controller.readCDFromFile();
		
		// Display list CD 
		System.out.println("List CD from cd.txt file");
		for(CD cd : listCDFile){
			cd.displayInfoCD();
		}
	}

}

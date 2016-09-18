package Task7_1;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for management contact
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public class MainForManagementContact {

	public static String check() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------");
		System.out.println("Do you want to continue other activity? ");
		System.out.println("Please choose y / n? ");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("Choice value is not valid!");
		return check;
	}
	
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException, TransformerException {
		// TODO Auto-generated method stub
		ManagementContact manage = new ManagementContact();
		List<Contact> list = new ArrayList<>();
		list = manage.viewContact();
		try {
			String check = "y";
			while (check.equals("y")) {
				BufferedReader input = new BufferedReader(
						new InputStreamReader(System.in));
				System.out
						.println("What do you want: \nPress 1: View your contact "
								+ "\nPress 2: Search contact "
								+ "\nPress 3: Add contact "
								+ "\nPress 4: Delete contact "
								+ "\nPress 5: Update contact "
								+ "\nPress 6: Exit");
				System.out.println("Please choose 1 / 2 / 3 / 4 / 5 / 6 ");
				int choose = Integer.parseInt(input.readLine());
				switch (choose) {
				case 1:
					// View list contact
					for (Object o : list) {
						Contact ct = (Contact) o;
						ct.displayContact();
					}
					check = check();
					break;
				case 2:
					// Search contact
					System.out.println("Press 1: Search by name");
					System.out.println("Press 2: Search by phone number");
					int replySearch = Integer.parseInt(input.readLine());
					switch (replySearch) {
						case 1:
							System.out.print("Enter name to search: ");
							String nameSeacrh = input.readLine();
							Contact con = manage.searchContactByName(list, nameSeacrh);
							if (con == null) {
								System.out.println("Contact is not exist");
							} else {
								con.displayContact();
							}
							break;
						case 2:
							System.out.print("Enter phone number to search: ");
							String phoneSeacrh = input.readLine();
							Contact con1 = manage.searchContactByPhone(list, phoneSeacrh);
							if (con1 == null) {
								System.out.println("Contact is not exist");
							} else {
								con1.displayContact();
							}
							break;
						default:
							throw new ArithmeticException("Invalid value! Please choose again!");
					}
					check = check();
					break;
				case 3:
					// Add new contact
					String reply = "y";
					while (reply.equals("y")) {
						manage.addContact("src/Task7_1/contact.xml");
						System.out
								.println("------------------------------------------");
						System.out
								.println("Do you want to continue add new contact? ");
						System.out.println("Please choose y / n? ");
						reply = input.readLine().toLowerCase();
						if (!reply.equals("y") && !reply.equals("n"))
							throw new ArithmeticException("Choice value is not valid!");
					}
					check = check();
					break;
				case 4:
					// Delete contact
					System.out.println("Press 1: Delete by name");
					System.out.println("Press 2: Delete by phone number");
					int replyDelete = Integer.parseInt(input.readLine());
					switch (replyDelete) {
						case 1:
							System.out.print("Enter name to delete: ");
							String nameDelete = input.readLine();
							manage.deleteContactByName(list, nameDelete);							
							break;
						case 2:
							System.out.print("Enter phone number to delete: ");
							String phoneDelete = input.readLine();
							manage.deleteContactByPhone(list, phoneDelete);
							break;
						default:
							throw new ArithmeticException("Invalid value! Please choose again!");
					}
					check = check();
					break;
				case 5:
					// Update contact
					int checkUpdate = 0;
					System.out.print("Enter name to update: ");
					String name = input.readLine();
					System.out.print("Enter phone to update: ");
					String phone = input.readLine();
					for (Contact c : list) {
						if (c.getName().equals(name)) {
							c.setPhone(phone);
							checkUpdate = 1;
						}
					}
					
					if (checkUpdate == 1) {
						System.out.println("Update successful!");
					} else {
						System.out.println("Update failure!");
					}
					check = check();
					break;
				case 6:
					manage.writeXMLFile(list);
					check = "n";
					check = check();
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}

package Task2_7_ManagementTelephoneDirectory;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
 * @Version: 01
 * @Class main for management telephone directory
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainForManagementTelephoneDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String check = "y";
			ArrayList<TelephoneDirectory> directory = new ArrayList<>();
			HandlingDirectory handling = new HandlingDirectory();
			
			//Default list contacts
			directory.add(new TelephoneDirectory("Anh", "01688559952"));
			directory.add(new TelephoneDirectory("Rubi", "01688559955"));
			directory.add(new TelephoneDirectory("Rumi", "01688559957"));
			while (check.equals("y")) {
				handling.listChoice();
				int choice = Integer.parseInt(input.readLine());

				switch (choice) {
				case 1: {
					//Display telephone directory
					if (!directory.isEmpty()) {
						for (TelephoneDirectory td : directory) {
							td.displayDirectory();
						}
					} else {
						System.out.println("Telephone directory is empty!");
					}
				}
					break;
				case 2: {
					//Add new contact
					System.out.print("Enter name: ");
					String name = input.readLine();
					System.out.print("Enter phone: ");
					String phone = input.readLine();
					directory.add(new TelephoneDirectory(name, phone));
					System.out.println("Adding completed!");
				}
					break;
				case 3: {
					//Search contact
					System.out.println("Press 1: Search name");
					System.out.println("Press 2: Search phone: ");
					int reChoice = Integer.parseInt(input.readLine());
					switch (reChoice) {
					case 1: {
						//Search contact by name
						System.out.print("Enter name to search: ");
						String name = input.readLine();
						int checkSearch = 0;
						for (TelephoneDirectory td : directory) {
							if (td.getName().equals(name)) {
								td.displayDirectory();
								checkSearch = 1;
							}
						}
						if (checkSearch == 0) {
							System.out.println("Name is not exists in telephone directory!");
						}
					}
						break;
					case 2: {
						//Search contact by phone
						System.out.print("Enter phone to search: ");
						String phone = input.readLine();
						int checkSearch = 0;
						for (TelephoneDirectory td : directory) {
							if (td.getPhone().equals(phone)) {
								td.displayDirectory();
								checkSearch = 1;
							}
						}
						if (checkSearch == 0) {
							System.out.println("Phone is not exists in telephone directory!");
						}
					}
						break;
					default:
						System.out.println("Invalid value! Please choose again!");
						break;
					}
				}
					break;
				case 4: {
					//Delete contact
					System.out.println("Press 1: Delete by name");
					System.out.println("Press 2: Delete by phone");
					int reply = Integer.parseInt(input.readLine());
					handling.deleteContact(reply, directory);
				}
					break;
				case 5: {
					//Update contact
					System.out.print("Enter name to update: ");
					String name = input.readLine();
					System.out.print("Enter phone number update: ");
					String phone = input.readLine();
					for (TelephoneDirectory td : directory) {
						if (td.getName().equals(name)) {
							directory.set(directory.indexOf(td), new TelephoneDirectory(name, phone));
						}
					}
				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
				System.out.println("Do you want continue with other activity ? ");
				System.out.println("Please choose y / n");
				check = handling.checkContinue();
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

package Task2_7_ManagementTelephoneDirectory;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
 * @Version: 01
 * @Class main for handling telephone directory
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class HandlingDirectory {
	/**
	 * @Function check do you want continue
	 * @Input: y or n
	 * @Output: none
	 */
	public String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	/**
	 * @Function for choose list activity
	 * @Input: number from 1 to 5
	 * @Output: none
	 */
	public void listChoice() {
		System.out.println("What do you want ? ");
		System.out.println("Press 1: View telephone directory");
		System.out.println("Press 2: Add new Contacts");
		System.out.println("Press 3: Search Contacts");
		System.out.println("Press 4: Remove Contacts");
		System.out.println("Press 5: Update Contacts");
		System.out.println("--------------------------------------------");
	}

	/**
	 * @Function for delete contact
	 * @Input: choice (1 or 2)
	 * @Output: none
	 */
	public void deleteContact(int choice, ArrayList<TelephoneDirectory> directory) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<TelephoneDirectory> temp = new ArrayList<>();
		switch (choice) {
		case 1: {
			//Delete by name
			System.out.print("Enter name to remove: ");
			String name = input.readLine();
			String checkRemove = "n";
			for (TelephoneDirectory td : directory) {
				if (td.getName().equals(name)) {
					temp.add(td);
				}
			}
			for(TelephoneDirectory td  : temp){
				td.displayDirectory();
			}
			System.out
			.println("Do you want remove this contact? (y/n)");
			checkRemove = checkContinue();
			if (checkRemove.equals("y")) {
				directory.removeAll(temp);
				System.out.println("Remove contacts completed!");
				
			}
		}
			break;
		case 2: {
			//Delete by phone
			System.out.print("Enter phone to remove: ");
			String phone = input.readLine();
			String checkRemove = "n";
			for (TelephoneDirectory td : directory) {
				if (td.getPhone().equals(phone)) {
					temp.add(td);
				}
			}
			for(TelephoneDirectory td : temp){
				td.displayDirectory();
			}
			System.out
			.println("Do you want remove this contact? (y/n)");
			checkRemove = checkContinue();
			if (checkRemove.equals("y")) {
				directory.removeAll(temp);
				System.out.println("Remove contacts completed!");
				
			}
		}
		break;
		default:
			System.out.println("Invalid value! Please choose again!");
			break;
		}
	}
}

package Task7_2;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for management employee
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xml.sax.SAXException;

public class MainForManagementEmployee {

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

	public static void main(String[] args) throws SAXException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ManagementEmployee manage = new ManagementEmployee();
		manage.loadDepartment();
		manage.loadEmployee();
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("1. Display all employee in a department");
				System.out.println("2. Add new employee");
				System.out.println("3. Update to xml file");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1:
					// Display all employee in a department
					System.out.println("List of department");
					manage.showAllDeparment();
					System.out.println("Choose department: ");
					int d = Integer.parseInt(input.readLine());
					System.out.println("List employee of deparment you choice");
					manage.displayInfoEmployee(d);;
					check = check();
					break;
				case 2:
					// Add new employee
					System.out.println("Add new employee into a department");
					System.out.println("List of department");
					manage.showAllDeparment();
					System.out.println("Choose department: ");
					int dep = Integer.parseInt(input.readLine());
					System.out.println("Enter information of new employee");
					System.out.print("ID: ");
					String id = input.readLine();
					System.out.print("Full name: ");
					String name = input.readLine();
					System.out.print("Gender (Male: 1 / Female: 0): ");
					String gender = input.readLine();
					System.out.print("Date of birth: ");
					String date = input.readLine();
					System.out.print("Address: ");
					String address = input.readLine();
					System.out.print("Phone number: ");
					String phone = input.readLine();
					System.out.print("Email: ");
					String email = input.readLine();
					System.out.print("Salary: ");
					double salary;
					while (true) {
						salary = Double.parseDouble(input.readLine());
						if (salary > 0) {
							break;
						}
					}
					manage.addNewEmployee(id, name, gender, date, address, phone, email, salary, dep);
					check = check();
					break;
				case 3:
					//Update to xml file
					manage.updateFileData();
					System.out.println("Completed!");
					check = check();
					break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (Exception ex) {
			System.out.println("Err: " + ex.getMessage());
		}
	}
}

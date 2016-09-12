package Task2_5_ManagementStaff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
 * @Version: 01
 * @Class for management staff
 */
public class MainForManagementStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			List<Staff> staff = new ArrayList<>();
			// Default information of staff
			Staff staff1 = new Staff("Tinh Anh	", 23, 5000000);
			staff.add(staff1);
			Staff staff2 = new Staff("Thanh Thảo	", 23, 5500000);
			staff.add(staff2);
			Staff staff3 = new Staff("Phú Tiên	", 29, 6000000);
			staff.add(staff3);
			Staff staff4 = new Staff("Tr�?ng Thuận	", 22, 4000000);
			staff.add(staff4);
			Staff staff5 = new Staff("Tấn Hòa	", 22, 2000000);
			staff.add(staff5);

			String active = "y";
			while (active.equals("y")) {
				System.out.println("Please choose activity !");
				System.out.println("1. View all staff");
				System.out.println("2. Add new employee to staff");
				System.out.println("Please choose 1 / 2 ");
				int choice = Integer.parseInt(input.readLine());
				if (choice < 1 || choice > 2)
					throw new ArithmeticException(
							"Invalid value! Please choose again!");
				switch (choice) {
				case 1:
					// Display information of student
					System.out
							.println("------------------------------------------");
					Collections.sort(staff);

					int i = 1;
					for (Staff s : staff) {
						System.out.println(i + ". " + s.displayInfoStudent());
						i++;
					}
					break;
				case 2:
					// Add information of new employee to staff
					String reply = "y";
					while (reply.equals("y")) {
						System.out.print("Enter name: ");
						String name = input.readLine();
						System.out.print("Enter age: ");
						int age = Integer.parseInt(input.readLine());
						System.out.print("Enter salary: ");
						double salary = Double.parseDouble(input.readLine());
						staff.add(new Staff(name, age, salary));
						System.out
								.println("------------------------------------------");
						System.out.println("Do you want to add new staff ? ");
						System.out.println("Please choose y / n? ");
						reply = input.readLine().toLowerCase();
						if (!reply.equals("y") && !reply.equals("n"))
							throw new ArithmeticException(
									"Choice value is not valid!");
					}
					break;
				}
				System.out
						.println("------------------------------------------");
				System.out.println("Do you want to continue other activity? ");
				System.out.println("Please choose y / n? ");
				active = input.readLine().toLowerCase();
				if (!active.equals("y") && !active.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}

		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

}

package Task2_3_ManagementStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 07- 09 -2016
 * @Version: 01
 * @Class for management student
 */
public class MainForManageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			// Default information of student
			Map<Integer, Student> student = new TreeMap<Integer, Student>();
			Student student1 = new Student("Tinh Anh	", 23, "Bình Thuận");
			student.put(1, student1);
			Student student2 = new Student("Thanh Thảo	", 23, "Bến tre");
			student.put(2, student2);
			Student student3 = new Student("Phú Tiên	", 29, "Hooc Môn");
			student.put(3, student3);
			Student student4 = new Student("Tr�?ng Thuận	", 22, "�?ồng Nai");
			student.put(4, student4);
			Student student5 = new Student("Tấn Hòa	", 22, "Vĩnh Long");
			student.put(5, student5);

			String active = "y";
			while (active.equals("y")) {
				System.out.println("Please choose activity !");
				System.out.println("1. View all dictionary");
				System.out.println("2. Add new word to the dictionary");
				System.out.println("3. Find word in dictionary");
				System.out.println("4. Delete a word in dictionary");
				System.out.println("Please choose 1 / 2 / 3 / 4 ");
				int choice = Integer.parseInt(input.readLine());
				if (choice < 1 || choice > 4)
					throw new ArithmeticException(
							"Invalid value! Please choose again!");
				switch (choice) {
				case 1:
					// Display information of student
					System.out
							.println("------------------------------------------");
					for (Object key : student.keySet()) {
						System.out.println(key + ". "
								+ student.get(key).displayInfoStudent());
					}
					break;
				case 2:
					// Add information of new student
					String reply = "y";
					int i = 6;
					while (reply.equals("y")) {
						System.out.print("Enter name: ");
						String name = input.readLine();
						System.out.print("Enter age: ");
						int age = Integer.parseInt(input.readLine());
						System.out.print("Enter place of birth: ");
						String place = input.readLine();
						student.put(i++, new Student(name, age, place));
						System.out
								.println("------------------------------------------");
						System.out.println("Do you want to add new student ? ");
						System.out.println("Please choose y / n? ");
						reply = input.readLine().toLowerCase();
						if (!reply.equals("y") && !reply.equals("n"))
							throw new ArithmeticException(
									"Choice value is not valid!");
					}
					break;
				case 3:
					// Find word in dictionary
					System.out.println("Enter id of student to search: ");
					int idSearch = Integer.parseInt(input.readLine());
					int check = 0;
					for (Object key : student.keySet()) {
						student.containsKey(idSearch);
						System.out.println(idSearch + ". "
								+ student.get(idSearch).displayInfoStudent());
						check = 1;
						break;
					}
					if (check == 0)
						System.out.println(idSearch + " not exist");
					break;
				case 4:
					// Delete a word in dictionary
					System.out.println("Enter id of student delete: ");
					int idDelete = Integer.parseInt(input.readLine());
					int check2 = 0;
					for (Object key : student.keySet()) {
						student.containsKey(idDelete);
						student.remove(idDelete);
						check2 = 1;
						break;
					}
					if (check2 == 0)
						System.out.println(idDelete + " not exist");
					else
						System.out
								.println("Deleted information of student with id "
										+ idDelete + " completed!");
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

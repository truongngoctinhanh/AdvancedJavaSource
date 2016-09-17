package Task6_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14- 09 -2016
 * @Version: 01
 * @Class for management student
 */
public class MainForStatisticStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		HandlingStudent handling = new HandlingStudent();
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("What do you want:");
				System.out.println("Press 1: Add new student ");
				System.out.println("Press 2: View list of students ");
				System.out.println("Press 3: Statistic GPA ");
				int choice = Integer.parseInt(input.readLine());
				List<Student> student = new ArrayList<>();
				switch (choice) {
				case 1: {
					handling.writeFile(handling.addStudent());
					System.out.println("------------------------------------------");
	                System.out.println("Do you want to continue ? ");
	                System.out.println("Please choose y / n? ");
	                check = input.readLine().toLowerCase();
	                if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
				}
					break;
				case 2: {
					student = handling.readFile();
					for (Object o : student) {
						Student st = (Student) o;
						st.displayInfoStudent();
					}
					System.out.println("------------------------------------------");
	                System.out.println("Do you want to continue ? ");
	                System.out.println("Please choose y / n? ");
	                check = input.readLine().toLowerCase();
	                if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
				}
					break;
				case 3: {

				}
					break;
				default:
					throw new ArithmeticException("Choice is not valid!");
				}
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

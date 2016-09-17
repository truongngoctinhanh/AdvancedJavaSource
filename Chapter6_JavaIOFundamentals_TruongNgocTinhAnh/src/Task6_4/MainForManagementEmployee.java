package Task6_4;
/**
 * @Author: Truong Ngoc Tinh Anh 
 * @Date: 14 - 09 -2016 
 * @Version: 01 Class for
 * @class for management employee
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainForManagementEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		HandlingEmployee handling = new HandlingEmployee();
		List<Employee> lst = new ArrayList<>();
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("What do you want:");
				System.out.println("Press 1: View list of employee ");
				System.out.println("Press 2: Search new employee ");
				System.out.println("Press 3: Add new employee ");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				case 1: {
					for (Object o : lst) {
						Employee employee = (Employee) o;
						employee.DisplayInfoEmployee();
					}
					System.out.println("------------------------------------------");
	                System.out.println("Do you want to continue ? ");
	                System.out.println("Please choose y / n? ");
	                check = input.readLine().toLowerCase();
	                if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
				}
					break;
				case 2: 
					System.out.println("--------- Search employee ------------");
					System.out.print("Enter name of employee to search: ");
					String name = input.readLine();
					Employee search = handling.searchEmployee(name);
					if(search == null){
						System.out.println("Employee is not exists!");
					}else{
						search.DisplayInfoEmployee();
					}System.out.println("------------------------------------------");
	                System.out.println("Do you want to continue ? ");
	                System.out.println("Please choose y / n? ");
	                check = input.readLine().toLowerCase();
	                if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
					break;
				case 3: 
					Employee employee = new Employee();
					employee = handling.createEmployee();
					lst.add(employee);
					handling.addEmployee();
					System.out.println("------------------------------------------");
	                System.out.println("Do you want to continue ? ");
	                System.out.println("Please choose y / n? ");
	                check = input.readLine().toLowerCase();
	                if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
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

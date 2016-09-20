package PartIV_Stream;

/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for management Employee
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class MainForManagementEmployee {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		HandlingEmployee handling = new HandlingEmployee();

		// Create list 15 employee
		list = handling.createListEmployee();
		System.out.println("--- List of employees: ");
		for (Employee employee : list) {
			employee.displayInfoEmployee();
		}

		// Amount employees with salary > 3000000
		System.out.println("Amount employees with salary > 3000000: " + handling.countEmployee(list));

		// Display amount employees with salary > 3000000
		handling.displayEmployee(list);

		// Find employees with name is "Anh"
		List<Employee> name = new ArrayList<>();
		name = handling.findEmployee(list);
		if (name == null) {
			System.out.println("Not found!");
		} else {
			for (Employee employee : name) {
				employee.displayInfoEmployee();
			}
		}

		// Average age of employees
		System.out.println("Average age of employees: " + handling.calAverageAge(list));

		// Statistics salary employee
		System.out.println("Statistics salary employee: ");
		handling.statisticSalary(list);
	}
}

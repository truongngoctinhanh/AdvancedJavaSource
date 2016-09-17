package Task6_4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14 - 09 -2016
 * @Version: 01 Class for
 * @class for handling employee
 */
public class HandlingEmployee {
	/**
	 * @Function for create object employee
	 * @Input: name, coefficient, number of depended people, allowance
	 * @Output: none
	 */
	List<Employee> lst = new ArrayList<>();
	public Employee createEmployee() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter name of employee: ");
		String name = input.readLine();
		System.out.print("Enter coefficient: ");
		double coefficient = Double.parseDouble(input.readLine());
		System.out.print("Enter number of depended people: ");
		int num = Integer.parseInt(input.readLine());
		System.out.print("Enter allowance: ");
		double allowance = Double.parseDouble(input.readLine());

		Employee employee = new Employee(name, coefficient, num, allowance);

		return employee;
	}

	/**
	 * @Function for add information of new employee
	 * @Input: name, coefficient, number of depended people, allowance
	 * @Output: none
	 */
	public void addEmployee() {
		
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(
					"src/Task6_4/employee.txt"));
			out.reset();
			for (Object o : lst) {
				Employee e = (Employee) o;
				out.writeObject(e);
			}

			System.out.println("Adding completed !");
			out.flush();

			out.close();
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	/**
	 * @Function for display information of all employees
	 * @Input: name, coefficient, number of depended people, allowance
	 * @Output: none
	 */
	public void displayInfo() throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		FileInputStream file = new FileInputStream("src/Task6_4/employee.txt");
		if (file.available() != 0) {
			try {
				in = new ObjectInputStream(file);
				while (true) {
					lst.add((Employee) in.readObject());
				}
			} catch (EOFException e) {
				in.close();
			}
		} else {
			System.out.println("File employee.txt empty!");
		}
	}

	/**
	 * @Function for search employee
	 * @Input: name
	 * @Output: information or null
	 */
	public Employee searchEmployee(String name) {
		for (Object o : lst) {
			Employee e = (Employee) o;
			if (e.getName().equals(name)) {
				return e;
			}

		}
		return null;
	}
}

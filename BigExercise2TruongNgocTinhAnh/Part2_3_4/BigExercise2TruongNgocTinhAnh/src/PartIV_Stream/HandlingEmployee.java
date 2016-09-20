package PartIV_Stream;

/**
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for handling Employee
 * 
 */
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class HandlingEmployee {
	/**
	 * @Function for add 15 employee to list Employee
	 * @Input: name, age, salary
	 * @Output: list Employee
	 */
	public List<Employee> createListEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));
		list.add(new Employee("Nguyen Van Minh", 22, 2000000));
		list.add(new Employee("Nguyen Hoang Phu Tien", 29, 3800000));
		list.add(new Employee("Nguyen Van Nhut", 24, 3200000));
		list.add(new Employee("Nguyen Minh Nhut", 22, 4100000));
		list.add(new Employee("Huynh Tan Hoa", 22, 500000));
		return list;
	}

	/**
	 * @Function for count amount employees with salary > 3000000
	 * @Input: list Employee
	 * @Output: amount
	 */
	public int countEmployee(List<Employee> list) {
		int count = 0;
		count = (int) list.stream().filter(Employee -> Employee.getSalary() > 3000000).count();
		System.out.println("Amount of Employees with salary > 3000000: " + count);
		return count;
	}

	/**
	 * @Function for display amount employees with salary > 3000000
	 * @Input: list Employee
	 * @Output: information of employee
	 */
	public void displayEmployee(List<Employee> list) {
		List<Employee> salary = list.stream().filter(Employee -> Employee.getSalary() > 3000000)
				.collect(Collectors.toList());
		System.out.println("List employees with salary > 3000000:");
		for (Employee employee : salary) {
			employee.displayInfoEmployee();
		}
	}

	/**
	 * @Function for find employees with name is "Anh"
	 * @Input: list Employee
	 * @Output: information of employee or null
	 */
	public List<Employee> findEmployee(List<Employee> lst) {
		List<Employee> result = new ArrayList<>();
		result = lst.stream().filter(Employee -> Employee.getName().contains("Anh")).collect(Collectors.toList());
		return result;
	}

	/**
	 * @Function for calculate average age of employee
	 * @Input: list Employee
	 * @Output: result
	 */
	public double calAverageAge(List<Employee> lst) {
		List<Integer> age = new ArrayList<>();
		for (Employee employee : lst) {
			age.add(employee.getAge());
		}

		IntSummaryStatistics statistics = age.stream().mapToInt((x) -> x).summaryStatistics();
		return statistics.getAverage();
	}

	/**
	 * @Function for statistics salary employee
	 * @Input: list Employee
	 * @Output: result
	 */
	public void statisticSalary(List<Employee> lst) {
		List<Double> salary = new ArrayList<>();
		for (Employee employee : lst) {
			salary.add(employee.getSalary());
		}

		DoubleSummaryStatistics statistics = salary.stream().mapToDouble((x) -> x).summaryStatistics();
		System.out.println("Max salary: " + statistics.getMax());
		System.out.println("Min salary: " + statistics.getMin());
		System.out.println("Avg salary: " + statistics.getAverage());
	}
}

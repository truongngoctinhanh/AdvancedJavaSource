package PartIV_Stream;

/**
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for declare Employee object
 * 
 */

public class Employee {
	String name;
	int age;
	double salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (this.age > 0)
			this.age = age;
		else
			System.out.println("Age value invalid");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (this.salary > 0)
			this.salary = salary;
		else
			System.out.println("Salary value invalid");
	}

	/**
	 * @Function for display information of Employee
	 * @Input: name, age, salary
	 * @Output: information
	 */
	public void displayInfoEmployee() {
		System.out.println("----------------------------------------------");
		System.out.println("Name: " + name + " | Age: " + age);
		System.out.println("Salary: " + salary);
	}
}

package Task2_5_ManagementStaff;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
 * @Version: 01
 * @Class for management staff
 */
public class Staff implements Comparable<Staff> {
	public String name;
	public int age;
	public double salary;

	public Staff(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Staff() {
		super();
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
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @Function for display information of staff
	 * @Input: none
	 * @Output: information of staff
	 */
	public String displayInfoStudent() {
		return this.name + " | Age: " + this.age + " | Salary: " + this.salary;
	}

	/**
	 * @Function override compareTo method for search by salary
	 * @Input: none
	 * @Output: number
	 */
	@Override
	public int compareTo(Staff o) {
		// TODO Auto-generated method stub
		if (this.salary < o.salary) {
			return 1;
		} else if (this.salary < o.salary) {
			return 0;
		} else
			return -1;
	}
}

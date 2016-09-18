package Task7_2;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for declare employee object
 */
public class Employee {
	private String id;
	private String name;
	private String gender;
	private String dateOfBirth;
	private String address;
	private String phone;
	private String email;
	private double salary;
	private String department;

	public Employee(String id, String name, String gender, String dateOfBirth, String address, String phone,
			String email, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @Function for display information of employee
	 * @Input: id, name, gender, date of birth, address, phone number, email, salary, department
	 * @Output: information
	 */
	public void displayInfoEmployee() {
		System.out.println("---------------------------------------");
		System.out.println("Id employee: " + this.id);
		System.out.println("Full name: " + this.name);
		if (this.gender.equalsIgnoreCase("1")) {
			System.out.println("Gender: male");
		} else if (this.gender.equalsIgnoreCase("0")) {
			System.out.println("Gender: female");
		} else
			System.out.println("Gender: Undefined");
		System.out.println("Date of birth: " + this.dateOfBirth);
		System.out.println("Address: " + this.address);
		System.out.println("Phone number: " + this.phone);
		System.out.println("Email: " + this.email);
		System.out.println("Salary: " + this.salary);
		System.out.println("Department: " + this.department);
	}

}

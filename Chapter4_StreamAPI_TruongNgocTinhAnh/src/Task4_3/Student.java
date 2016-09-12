package Task4_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 12- 09 -2016
 * @Version: 01
 * @Class for declare Student object and calculate average mark of student
 */
public class Student {
	private String firstname;
	private String lastname;
	private int age;
	private double mark1;
	private double mark2;	
	
	public Student(String firstname, String lastname, int age, double mark1,
			double mark2) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public Student() {
		super();
	}
	
	/**
	 * @Function for calculate average mark
	 * @Input: mark 1, mark 2
	 * @Output: average mark
	 */
	public double calculateAverage(){
		return (mark1 + mark2 ) / 2;
	}
	
	/**
	 * @Function for display information of student
	 * @Input: none
	 * @Output: information of student
	 */
	public void display() {
		System.out.println(this.lastname + this.firstname + "\tage = " + this.age + "\tmark 1 = " + this.mark1 
				+ " & mark 2 = " + this.mark2 + "\tavg = " + this.calculateAverage());
	}
	
}

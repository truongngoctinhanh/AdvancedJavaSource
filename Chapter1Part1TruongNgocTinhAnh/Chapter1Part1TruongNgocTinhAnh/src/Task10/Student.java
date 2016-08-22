package Task10;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare Student object extend Human object and add calculateGPA method, showInformation method
 */
public class Student extends Human{
	private String grade;
	private double pointOfSemester1;
	private double pointOfSemester2;
	public Student() {
		super();
	}
	public Student(String grade, double pointOfSemester1,
			double pointOfSemester2, String fullName, String dateOfBirth, String address,
			String phoneNumber) {
		super(fullName, dateOfBirth, address, phoneNumber);
		this.grade = grade;
		this.pointOfSemester1 = pointOfSemester1;
		this.pointOfSemester2 = pointOfSemester2;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getPointOfSemester1() {
		return pointOfSemester1;
	}
	public void setPointOfSemester1(double pointOfSemester1) {
		this.pointOfSemester1 = pointOfSemester1;
	}
	public double getPointOfSemester2() {
		return pointOfSemester2;
	}
	public void setPointOfSemester2(double pointOfSemester2) {
		this.pointOfSemester2 = pointOfSemester2;
	}
	
	//Function for calculate GPA of student
	public double calculateGPA(){
		double result = 0;
		result = (this.pointOfSemester1 + this.pointOfSemester2)/2;
		return result;
	}
	
	//Function for override showInformation method
	public void showInformation(){
		System.out.println("..............................................");
		System.out.println("Full name of Student: " + this.fullName);
		System.out.println("Date of birth : " + this.dateOfBirth);
		System.out.println("Address of teacher: " + this.address);
		System.out.println("Phone number of teacher: " + this.phoneNumber);
		System.out.println("The grade : " + this.grade);
		System.out.println("The point of semester 1: " + this.pointOfSemester1);
		System.out.println("The point of semester 2: " + this.pointOfSemester2);
	}
	
}

package Task10;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare Teacher object extend Human object and add calculateSalary method, showInformation method
 */
public class Teacher extends Human {
	private final double basicSalary = 1260000;
	private String homeroom;
	private double coefficientsOfSalary;
	private double allowance;
	public Teacher() {
		super();
	}
	public Teacher(String homeroom, double coefficientsOfSalary,
			double allowance, String fullName, String dateOfBirth, String address,
			String phoneNumber) {
		super(fullName, dateOfBirth, address, phoneNumber);
		this.homeroom = homeroom;
		this.coefficientsOfSalary = coefficientsOfSalary;
		this.allowance = allowance;
	}
	public String getHomeroom() {
		return homeroom;
	}
	public void setHomeroom(String homeroom) {
		this.homeroom = homeroom;
	}
	public double getCoefficientsOfSalary() {
		return coefficientsOfSalary;
	}
	public void setCoefficientsOfSalary(double coefficientsOfSalary) {
		this.coefficientsOfSalary = coefficientsOfSalary;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double calculateSalary(){
		double result = 0;
		result = this.coefficientsOfSalary * basicSalary + allowance;
		return result;
	}
	
	public void showInformation(){
		System.out.println(".............................................");
		System.out.println("Full name of teacher: " + this.fullName);
		System.out.println("Date of birth : " + this.dateOfBirth);
		System.out.println("Address of teacher: " + this.address);
		System.out.println("Phone number of teacher: " + this.phoneNumber);
		System.out.println("The homeroom is : " + this.homeroom);
		System.out.println("Coefficients salary: " + this.coefficientsOfSalary);
		System.out.println("Allowance: " + this.allowance);
	}
}


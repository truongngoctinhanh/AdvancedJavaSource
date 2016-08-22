package Task10;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare Human object
 */
public class Human {
	protected String fullName;
	protected String dateOfBirth;
	protected String address;
	protected String phoneNumber;
	
	public Human() {
		super();
	}
	
	public Human(String fullName, String dateOfBirth, String address,
			String phoneNumber) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void showInformation(){
		System.out.println("..............................................");
		System.out.println("Full name of Student: " + this.fullName);
		System.out.println("Date of birth : " + this.dateOfBirth);
		System.out.println("Address of teacher: " + this.address);
		System.out.println("Phone number of teacher: " + this.phoneNumber);
		
	}
}

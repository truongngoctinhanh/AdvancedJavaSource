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
		if (this.fullName.length() > 0)
			this.fullName = fullName;
		else
			System.out.println("Value is NULL");
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		if (this.dateOfBirth.length() > 0)
			this.dateOfBirth = dateOfBirth;
		else
			System.out.println("Value is NULL");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (this.address.length() > 0)	
			this.address = address;
		else
			System.out.println("Value is NULL");
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if (this.phoneNumber.length() > 0)
			this.phoneNumber = phoneNumber;
		else
			System.out.println("Value is NULL");
	}
	
	/**	 
	 * Function for display information of Human
	 * Output: information of Human
	 */
	public void showInformation(){
		System.out.println("..............................................");
		System.out.println("Full name of Student: " + this.fullName);
		System.out.println("Date of birth : " + this.dateOfBirth);
		System.out.println("Address of teacher: " + this.address);
		System.out.println("Phone number of teacher: " + this.phoneNumber);
		
	}
}

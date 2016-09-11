package Task2_7_ManagementTelephoneDirectory;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
 * @Version: 01
 * @Class for declare TelephoneDirectory object
 */
public class TelephoneDirectory {
	private String name;
	private String phone;
	public TelephoneDirectory(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public TelephoneDirectory() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void displayDirectory(){
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
	}
}

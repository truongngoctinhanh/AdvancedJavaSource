package Task7_1;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for declare contact object
 */
public class Contact {
	public String name;
	public String phone;
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public Contact() {
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
	
	/**
	 * @Function for display information of contact
	 * @Input: name, phone
	 * @Output: information
	 */
	public void displayContact() {
		System.out.println(this.name + " : " + this.phone);
	}
	
	
}

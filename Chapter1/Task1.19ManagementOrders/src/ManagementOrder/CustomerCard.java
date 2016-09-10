package ManagementOrder;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:33 AM
 * @Class for declare information of customer card and display information method
 */
public class CustomerCard extends Information {

	private String customerID;
	public Order m_Order;

	public CustomerCard(){

	}
	
	public CustomerCard(String customerID, Order m_Order, String address, String email, String identityCardNumber,
			String name, String phoneNumber) {
		super(address, email, identityCardNumber,
				name, phoneNumber);
		this.customerID = customerID;
		this.m_Order = m_Order;
	}

	
	public String getCustomerID() {
		return customerID;
	}


	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	public Order getM_Order() {
		return m_Order;
	}


	public void setM_Order(Order m_Order) {
		this.m_Order = m_Order;
	}
	
	/**
	 * Function for display information of customer card
	 * Input: none
	 * Output: information of customer card
	 */
	public void displayInfoCard(){
		System.out.println("------------------------- CUSTOMER CARD ------------------------------");
		System.out.println("ID of card: " + this.customerID + " | Name: " + this.name);
		System.out.println("Identity Card Number of payer: " + this.identityCardNumber + " | Email of payer: " + this.email);
		System.out.println("Address of payer: " + this.address + " | Phone number of payer: " + this.phoneNumber);
	}

}
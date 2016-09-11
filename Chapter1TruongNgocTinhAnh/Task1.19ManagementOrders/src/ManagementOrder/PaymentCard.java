package ManagementOrder;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:40 AM
 * @Class for declare information of payment card and display information method
 */
public class PaymentCard extends Information {

	protected String cardID;
	protected String dateCreated;

	public PaymentCard(){

	}
	
	
	public PaymentCard(String cardID, String dateCreated, String address, String email, String identityCardNumber,
			String name, String phoneNumber) {
		super(address, email, identityCardNumber,
				name, phoneNumber);
		this.cardID = cardID;
		this.dateCreated = dateCreated;
	}
	
	

	public String getCardID() {
		return cardID;
	}


	public void setCardID(String cardID) {
		this.cardID = cardID;
	}


	public String getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/**
	 * Function for display information of customer card
	 * Input: none
	 * Output: information of customer card
	 */
	public void displayInfoCard(){
		System.out.println("--------------------- PAYMENT CARD --------------------------");
		System.out.println("ID of card: " + this.cardID + " | Date created of card: " + this.dateCreated);
		System.out.println("Name: " + this.name + " | Identity Card Number of payer: " + this.identityCardNumber);
		System.out.println("Email of payer: " + this.email + " | Address of payer: " + this.address);
		System.out.println("Phone number of payer: " + this.phoneNumber);
	}

}
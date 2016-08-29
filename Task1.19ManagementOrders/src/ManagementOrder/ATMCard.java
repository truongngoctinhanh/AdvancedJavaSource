package ManagementOrder;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:39 AM
 * @Class for declare information of ATM card and calculate remaining money method
 */
public class ATMCard extends PaymentCard implements IAuthMethod {

	private double remainingMoney;

	public ATMCard(){

	}

	public ATMCard(double remainingMoney, String cardID, String dateCreated, String address, String email, String identityCardNumber,
			String name, String phoneNumber) {
		super(cardID, dateCreated, address, email, identityCardNumber,
				name, phoneNumber);
		this.remainingMoney = remainingMoney;
	}
	public ATMCard(String cardID, double remainingMoney) {
		super();
		this.remainingMoney = remainingMoney;
	}
	
	public double getRemainingMoney() {
		return remainingMoney;
	}

	public void setRemainingMoney(double remainingMoney) {
		this.remainingMoney = remainingMoney;
	}

	public String getAuthMethod(){
		return "Enter PIN";
	}
	/**
	 * Function for calculate remaining money
	 * Input: money
	 * Output: remaining money
	 */
	public void calcBalance(double money){
		remainingMoney = this.remainingMoney - money;
	}
	
}
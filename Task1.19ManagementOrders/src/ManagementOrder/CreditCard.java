package ManagementOrder;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:38 AM
 * @Class for declare information of credit card
 */
public class CreditCard extends PaymentCard implements IAuthMethod {

	private String expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard(){

	}
	
	
	public CreditCard(String expirationDate, double maxDebt, String type, String cardID, String dateCreated, String address, String email, String identityCardNumber,
			String name, String phoneNumber) {
		super(cardID, dateCreated, address, email, identityCardNumber,
				name, phoneNumber);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public CreditCard(String cardID, String expirationDate, double maxDebt, String type) {
		super();
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}
	public String getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}


	public double getMaxDebt() {
		return maxDebt;
	}


	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getAuthMethod(){
		return "Enter signature";
	}

}
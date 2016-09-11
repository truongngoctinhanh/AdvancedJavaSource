package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare gold object
 */
public class Gold extends Transaction{
	private double exchangeRate;
	private String kindsOfGold;
	public Gold() {
		super();
	}
	public Gold(String id, String date, int quantity) {
		super(id, date, quantity);
	}
	
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getKindsOfGold() {
		return kindsOfGold;
	}
	public void setKindsOfGold(String kindsOfGold) {
		this.kindsOfGold = kindsOfGold;
	}
	//Function for override DisplayInfoTransaction method
	@Override
	public void DisplayInfoTransaction(){
		System.out.println("Transaction ID: " + this.id);
		System.out.println("Date of transaction: " + this.date);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Kinds of gold : " + this.kindsOfGold);
	}
	
	// Calculate total money to transaction gold
	public double calculateMoney(int kindsOfGold){
		
		double money = 0;
		switch(kindsOfGold){
			case 1:
				money = GoldTransaction.SJC9999.calMoney(quantity);
				break;
			case 2:
				money = GoldTransaction.G24K.calMoney(quantity);
				break;				
		}
		return money;
	}
	
	public void setUnitPrice(int kindsOfGold){
		if(kindsOfGold == 1)
			exchangeRate = GoldTransaction.SJC9999.getPrice();
		else if(kindsOfGold == 2)
			exchangeRate = GoldTransaction.G24K.getPrice();
	}
}

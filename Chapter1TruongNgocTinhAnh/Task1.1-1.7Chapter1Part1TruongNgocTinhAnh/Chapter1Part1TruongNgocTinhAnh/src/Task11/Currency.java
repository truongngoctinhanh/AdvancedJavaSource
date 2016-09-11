package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare Currency object
 */
public class Currency extends Transaction {
	private double unitPrice;
	private String kindsOfCurrency;
	double priceSell;
	double priceBuy;
	public Currency() {
		super();
	}
	public Currency(String id, String date, int quantity) {
		super(id, date, quantity);
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getKindsOfCurrency() {
		return kindsOfCurrency;
	}
	public void setKindsOfCurrency(String kindsOfCurrency) {
		this.kindsOfCurrency = kindsOfCurrency;
	}
	public double getPriceSell() {
		return priceSell;
	}
	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}
	public void setPriceSell(int type) {
		if(type == 1)
			priceSell = CurrencyTransaction.USD.getPriceSell();
		else if(type == 2)
			priceSell = CurrencyTransaction.EUR.getPriceSell();
		else if(type == 3)
			priceSell = CurrencyTransaction.AUD.getPriceSell();
	}
	
	public void setPriceBuy(int type) {
		if(type == 1)
			priceBuy = CurrencyTransaction.USD.getPriceBuy();
		else if(type == 2)
			priceBuy = CurrencyTransaction.EUR.getPriceBuy();
		else if(type == 3)
			priceBuy = CurrencyTransaction.AUD.getPriceBuy();
	}
	
	//Function for override DisplayInfoTransaction method
	@Override
	public void DisplayInfoTransaction(){
		System.out.println("Transaction ID: " + this.id);
		System.out.println("Date of transaction: " + this.date);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Unit price : " + this.unitPrice);
		System.out.println("Kinds of currency : " + this.kindsOfCurrency);
	}
	
	// Calculate total money to buy currency depend kinds of currency
	public double calculateMoneyBuy(int kindsOfCurrency){
		
		double money = 0;
		switch(kindsOfCurrency){
			
			case 1:
				money = CurrencyTransaction.USD.calculateMoneyBuy(quantity);
				break;
			case 2:
				money = CurrencyTransaction.EUR.calculateMoneyBuy(quantity);
				break;
			case 3:
				money = CurrencyTransaction.AUD.calculateMoneyBuy(quantity);
				break;
		}
		return money;
	}
	
	// Calculate total money to sell currency depend kindsOfCurrency
	public double calculateMoneySell(int kindsOfCurrency){
		double money = 0;
		switch(kindsOfCurrency){
		
		case 1:
			money = CurrencyTransaction.USD.calculateMoneySell(quantity);
			break;
		case 2:
			money = CurrencyTransaction.EUR.calculateMoneySell(quantity);
			break;
		case 3:
			money = CurrencyTransaction.AUD.calculateMoneySell(quantity);
			break;
		}
		return money;
		
	}
}

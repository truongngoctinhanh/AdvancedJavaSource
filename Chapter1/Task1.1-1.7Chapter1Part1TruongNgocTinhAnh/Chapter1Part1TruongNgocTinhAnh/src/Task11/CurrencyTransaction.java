package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for enum currency transaction to total money to buy and to sell currency depend quantity
 */
public enum CurrencyTransaction {

	USD(22250, 22335),
	EUR(24457, 25050),
	AUD(16530, 17226);
	
	public double priceBuy;
	public double priceSell;
	
	private CurrencyTransaction(double priceBuy, double priceSell) {
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
	}

	public double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(double priceBuy) {
		this.priceBuy = priceBuy;
	}

	public double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}
	
	 // Calculate total money to buy currency depend quantity
	 
	public double calculateMoneyBuy(int quantity){
		return this.getPriceBuy() * quantity;
	}
	
	// Calculate total money to sell currency depend quantity
	public double calculateMoneySell(int quantity){
		return this.getPriceSell() * quantity + (quantity * this.getPriceSell()) * 0.1;
	}
}


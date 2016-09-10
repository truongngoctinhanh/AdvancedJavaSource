package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for enum gold transaction to total money of gold transaction
 */
public enum GoldTransaction {
	SJC9999(3550000),
	G24K(3514100);
	
	public double price;

	private GoldTransaction(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Function for calculate total money with quantity gold.
	 * Input: quantity
	 * Output: money
	 */
	public double calMoney(double quantity){
		return this.price * quantity;
	}
}


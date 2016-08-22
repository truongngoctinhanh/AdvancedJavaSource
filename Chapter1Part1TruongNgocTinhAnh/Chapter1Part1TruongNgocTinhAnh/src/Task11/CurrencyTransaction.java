package Task11;

public class CurrencyTransaction extends Transaction {
	private double unitPrice;
	private String kindsOfGold;
	public CurrencyTransaction() {
		super();
	}
	public CurrencyTransaction(double unitPrice, String kindsOfGold) {
		super();
		this.unitPrice = unitPrice;
		this.kindsOfGold = kindsOfGold;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getKindsOfGold() {
		return kindsOfGold;
	}
	public void setKindsOfGold(String kindsOfGold) {
		this.kindsOfGold = kindsOfGold;
	}
}

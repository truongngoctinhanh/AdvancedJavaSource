package Task11;

public class GoldTransaction {
	private double exchangeRate;
	private String kindsOfCurrency;
	public GoldTransaction() {
		super();
	}
	public GoldTransaction(double exchangeRate, String kindsOfCurrency) {
		super();
		this.exchangeRate = exchangeRate;
		this.kindsOfCurrency = kindsOfCurrency;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getKindsOfCurrency() {
		return kindsOfCurrency;
	}
	public void setKindsOfCurrency(String kindsOfCurrency) {
		this.kindsOfCurrency = kindsOfCurrency;
	}
	
}

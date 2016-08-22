package Task11;

public class Transaction {
	protected String id;
	protected String date;
	protected int quantity;
	public Transaction() {
		super();
	}
	
	public Transaction(String id, String date, int quantity) {
		super();
		this.id = id;
		this.date = date;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

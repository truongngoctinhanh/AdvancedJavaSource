package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare Transaction object
 */
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
	
	//Function for Display Information Transaction
	public void DisplayInfoTransaction(){
		System.out.println("Transaction ID: " + this.id);
		System.out.println("Date of transaction: " + this.date);
		System.out.println("Quantity : " + this.quantity);
	}
	
}

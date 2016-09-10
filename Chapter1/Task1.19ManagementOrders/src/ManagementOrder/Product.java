package ManagementOrder;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29- August-2016 8:37:37 AM
 * @Class for declare information of product
 */
public class Product  extends OrderDetail {

	private String name;
	private double price;

	public Product(){

	}
	
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayInfoOrder(){
		System.out.println(this.name + " | Price: " + this.price );
	}

}
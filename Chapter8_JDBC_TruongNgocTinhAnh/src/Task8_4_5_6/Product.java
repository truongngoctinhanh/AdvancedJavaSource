package Task8_4_5_6;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for declare product object
 */
public class Product {
	public int id;
	public String name;
	public double price;
	public int amount;
	public int categoryId;
	public Product(int id, String name, double price, int amount, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryId = categoryId;
	}
	
	public Product(String name, double price, int amount, int categoryId) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryId = categoryId;
	}
	
	public Product(int id, double price, int amount) {
		super();
		this.id = id;
		this.price = price;
		this.amount = amount;
	}
	
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	

	/**
	 * @Function for display information of products in mySql database
	 * @Input: database
	 * @Output: information of products
	 */
	public void displayInfoProduct(){
		System.out.println(name + " - Price: " + price);
		System.out.println("Amount: " + amount + " - Category ID: ");
	}
	
}

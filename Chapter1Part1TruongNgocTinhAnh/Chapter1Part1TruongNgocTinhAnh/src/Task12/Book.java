package Task12;

public class Book {
	protected String id;
	protected String name;
	protected String date;
	protected double unitPrice;
	protected double quantity;
	protected String publishingCompany;
	public Book() {
		super();
	}
	public Book(String id, String name, String date, double unitPrice,
			double quantity, String publishingCompany) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.publishingCompany = publishingCompany;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	public double calculateFee(){
		return calculateFee();
	}
	
	public void DisplayInfoBook(){
		System.out.println("..............................................");
		System.out.println("Book ID: " + this.id);
		System.out.println("Name of book : " + this.name);
		System.out.println("Inputting date : " + this.date);
		System.out.println("Unit price: " + this.unitPrice);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Publishing company: " + this.publishingCompany);
		
	}
	
	
	

}

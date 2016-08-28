package Task9;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare Computer object and method calculate money of computers, method show information of computers
 */
public class Computer {
	protected String id;
	protected double unitPrice;
	protected String manufacturer;
	protected double numOfImport;
	protected Computer() {
		super();
	}
	public Computer(String id, double unitPrice, String manufacturer,
			double numOfImport) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.manufacturer = manufacturer;
		this.numOfImport = numOfImport;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getNumOfImport() {
		return numOfImport;
	}
	public void setNumOfImport(double numOfImport) {
		this.numOfImport = numOfImport;
	}
	
	/**
	 * Function for calculate money of computer
	 * Input: unit price, number of import
	 * Output: Money
	 */
	public double calculateMoney(){
		double money = 0;
		money = this.unitPrice * this.numOfImport;
		return money;
	}
	/**
	 * Function for display information of computer
	 * Input: none
	 * Output: information of computer
	 */
	public void showInformation(){
		System.out.println("Information of Computer");
		System.out.println("ID of computer: " + this.id);
		System.out.println("Unit price of computer: " + this.unitPrice);
		System.out.println("Manufacturer of computer: " + this.manufacturer);
	}
}

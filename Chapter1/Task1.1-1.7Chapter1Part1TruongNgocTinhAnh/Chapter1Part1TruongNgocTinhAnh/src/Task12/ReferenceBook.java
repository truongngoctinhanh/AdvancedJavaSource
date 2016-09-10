package Task12;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare RefernceBook object extend Book object and add calculateFee method, DisplayInfoBook method
 */
public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(double tax, String id, String name, String date, double unitPrice,
			double quantity, String publishingCompany) {
		super(id, name, date, unitPrice, quantity, publishingCompany);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		if (tax >= 0.01 && tax <= 1)
			this.tax = tax;
		else
   			throw new ArithmeticException("Invalid value ! Please re-enter: ");
	}

	//Function for override calculateFee method
	@Override
	public double calculateFee() {
		double fee = 0;
		fee = (this.quantity * this.unitPrice) + (this.quantity * this.unitPrice) * this.tax;
		return fee;
	}
	
	//Function for override DisplayInfoBook method
	@Override
	public void DisplayInfoBook(){
		System.out.println("..............................................");
		System.out.println("Book ID: " + this.id);
		System.out.println("Name of book : " + this.name);
		System.out.println("Inputting date : " + this.date);
		System.out.println("Unit price: " + this.unitPrice);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Publishing company: " + this.publishingCompany);
		System.out.println("Tax: " + this.tax);
	}
}

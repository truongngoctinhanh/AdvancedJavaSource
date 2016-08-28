package Task12;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare TextBook object extend Book object and add calculateFee method, DisplayInfoBook method
 */
public class TextBook extends Book {
	private int status;

	public TextBook(int status, String id, String name, String date, double unitPrice,
			double quantity, String publishingCompany) {
		super(id, name, date, unitPrice, quantity, publishingCompany);
		this.status = status;
	}

	public TextBook() {
		super();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * Function for override calculateFee() method to calculate fee of text book
	 * Input: quantity, unit price, status
	 * Output: fee of book
	 */
	@Override
	public double calculateFee() {
		double fee = 0;
		if (this.status == 0)
			fee = this.quantity * this.unitPrice;
		else
			fee = this.quantity * this.unitPrice * 0.5;
		return fee;
	}
	
	/**
	 * Function for override DisplayInfoBook method to display information of text book
	 * Output: information of text book
	 */
	@Override
	public void DisplayInfoBook(){
		System.out.println("..............................................");
		System.out.println("Book ID: " + this.id);
		System.out.println("Name of book : " + this.name);
		System.out.println("Inputting date : " + this.date);
		System.out.println("Unit price: " + this.unitPrice);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Publishing company: " + this.publishingCompany);
		if (this.status == 1)
			System.out.println("Publishing company: odd" );
		else
			System.out.println("Publishing company: new" );
	}
}

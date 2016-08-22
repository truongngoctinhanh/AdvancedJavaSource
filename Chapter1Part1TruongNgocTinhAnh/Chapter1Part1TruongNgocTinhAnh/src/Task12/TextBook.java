package Task12;

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

	@Override
	public double calculateFee() {
		double fee = 0;
		if (this.status == 0)
			fee = this.quantity * this.unitPrice;
		else
			fee = this.quantity * this.unitPrice * 0.5;
		return fee;
	}
	
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

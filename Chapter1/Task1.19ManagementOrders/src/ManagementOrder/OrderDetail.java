package ManagementOrder;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:41 AM
 * @CLass for declare information of order detail
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public OrderDetail(){

	}

	public OrderDetail(int quantity, Product m_Product) {
		super();
		this.quantity = quantity;
		this.m_Product = m_Product;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}

	/**
	 * Function for calculate total of each product
	 * Input: price and quantity
	 * Output: money
	 */
	public double calLineTotal(){
		return m_Product.getPrice() * this.quantity;
	}
	
	/**
	 * Function for display information of order
	 * Input: none
	 * Output: information of order
	 */
	public void displayInfoOrder(){
		System.out.println("Name of product: " + m_Product.getName() + 
				" | Price: " + m_Product.getPrice() + 
				" | Quantity: " + this.quantity );
	}
	
}
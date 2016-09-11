package ManagementOrder;

import java.util.List;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:36 AM
 * @CLass for declare information of order and calculate money method
 */
public class Order {

	private String orderDate;
	private int printOrder;
	private int status;
	public List<OrderDetail> list;
	public PaymentCard m_Card;

	public Order(){

	}

	
	public Order(String orderDate, int printOrder, int status,
			List<OrderDetail> list, PaymentCard m_Card) {
		super();
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
		this.list = list;
		this.m_Card = m_Card;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public int isPrintOrder() {
		return printOrder;
	}


	public void setPrintOrder(int printOrder) {
		this.printOrder = printOrder;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public List<OrderDetail> getList() {
		return list;
	}


	public void setList(List<OrderDetail> list) {
		this.list = list;
	}


	public PaymentCard getM_Card() {
		return m_Card;
	}


	public void setM_Card(PaymentCard m_Card) {
		this.m_Card = m_Card;
	}

	/**
	 * Function for calculate total of detail order list
	 * Input: result of calLineTotal() method
	 * Output: money
	 */
	public double calSubTotal(){
		double money = 0;
		for(OrderDetail detail : list){
			money += detail.calLineTotal();
		}
		return money;
	}

	/**
	 * Function for calculate tax
	 * Input: result of calSubTotal() method
	 * Output: tax
	 */
	public double calTax(){
		double tax = 0;
		if(printOrder == 1)
			tax = calSubTotal() * 0.1;
		return tax;
	}

	/**
	 * Function for calculate total money to pay
	 * Input: result of calSubTotal() method and calSubTotal() method
	 * Output: money
	 */
	public double calTotalAmount(){
		return calTax() + calSubTotal();
	}
	
	/**
	 * Function for display information of order
	 * Input: none
	 * Output: information of order
	 */
	public void displayInfoOrder(){
		System.out.println("---------------------- ORDER -------------------------");
		System.out.println("Date of order: " + this.orderDate);
		if (this.status == 1)
			System.out.println("Status of order: Just order");
		else if (this.status == 2)
			System.out.println("Status of order: Paid");
		else
			System.out.println("Status of order: Received the goods");
		
		if (this.printOrder == 1)
			System.out.println("Print of order: yes");
		else 
			System.out.println("Print of order: no");
		
		
	}
	

}
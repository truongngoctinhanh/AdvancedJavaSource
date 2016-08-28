package Task18;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare outer class GiftBox and inner class Gift
 */

//Outer class
public class GiftBox {
	public String shape;
	public String color;
	final int price = 10000;
	public GiftBox (String shape, String color) {
		this.shape = shape;
		this.color = color;
	}
	
	//inner class
	class Gift {
		public String name;
		public double weight;
		final int FEE = 200;
		public Gift (String name, double weight) {
			this.name = name;
			this.weight = weight;
		}
		/**
		 * Function for calculate fee of gift
		 * Input: weight, fee, price of gift box
		 * Output: fee of gift
		 */
		public double calFee() {
			return weight * FEE + GiftBox.this.price;
		}
		
		/**
		 * Function for display information of gift
		 * Input: none
		 * Output: information of gift
		 */
		public void displayInfoGift() {
			System.out.println("-------------GIFT INFORMATION -------------");
			System.out.println("Name of gift: " + this.name);
			System.out.println("Weight of gift: " + this.weight);
			System.out.println("Shape of gift: " + shape);
			System.out.println("Color of gift: " + color);
		}
	}
}

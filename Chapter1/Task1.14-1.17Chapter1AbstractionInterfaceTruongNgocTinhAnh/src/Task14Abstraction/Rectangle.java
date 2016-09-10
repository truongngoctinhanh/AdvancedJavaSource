package Task14Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23- 08 -2016
 * Version: 1.0
 * Class for declare Rectangle object and 
 * override calPerimater method, calArea method, displayInfoShape method
 */
public class Rectangle extends Shape {
	private double height;
	private double width;
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	public Rectangle() {
		super();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**	
	 * Function for calculate perimeter of rectangle
	 * Input: height and width of rectangle
	 * Output: perimeter of rectangle
	 */
	@Override
	public double calPerimeter(){
		return (this.height + this.width) * 2;
	}
	
	/**	
	 * Function for calculate area of rectangle
	 * Input: height and width of rectangle
	 * Output: area of rectangle
	 */
	@Override
	public double calArea(){
		return this.height * this.width;
	}
	
	/**	
	 * Function for display Information of rectangle
	 * Input: perimeter and area of rectangle
	 * Output: Information about perimeter and area of rectangle
	 */
	@Override
	public void displayInfoShape(){
		System.out.println(String.format("The perimeter of rectangle: %.3f", this.calPerimeter()));
		System.out.println(String.format("The area of rectangle: %.3f", this.calArea()));
	}
}

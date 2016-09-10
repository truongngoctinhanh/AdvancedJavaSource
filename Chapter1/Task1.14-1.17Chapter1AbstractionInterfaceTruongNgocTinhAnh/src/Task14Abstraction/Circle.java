package Task14Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23- 08 -2016
 * Version: 1.0
 * Class for declare Circle object and 
 * override calPerimater method, calArea method, displayInfoShape method
 */
public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**	
	 * Function for calculate perimeter of circle
	 * Input: radius of circle
	 * Output: perimeter of circle
	 */
	@Override
	public double calPerimeter(){
		return this.radius * 2 * Math.PI;
	}
	
	/**	
	 * Function for calculate area of circle
	 * Input: radius of circle
	 * Output: perimeter of circle
	 */
	@Override
	public double calArea(){
		return this.radius * this.radius * Math.PI;
	}
	
	/**	
	 * Function for display Information of circle
	 * Input: perimeter and area of circle
	 * Output: Information about perimeter and area of circle
	 */
	@Override
	public void displayInfoShape(){
		System.out.println(String.format("The perimeter of cirle: %.3f", this.calPerimeter()));
		System.out.println(String.format("The area of cirle: %.3f", this.calArea()));
	}
}

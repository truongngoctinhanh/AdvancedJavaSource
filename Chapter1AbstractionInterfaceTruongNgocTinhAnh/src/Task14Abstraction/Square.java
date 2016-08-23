package Task14Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23- 08 -2016
 * Version: 1.0
 * Class for declare Square object and 
 * override calPerimater method, calArea method, displayInfoShape method
 */
public class Square extends Shape {
	private double sideOfSquare;

	public Square() {
		super();
	}

	public Square(double sideOfSquare) {
		super();
		this.sideOfSquare = sideOfSquare;
	}

	public double getSideOfSquare() {
		return sideOfSquare;
	}

	public void setSideOfSquare(double sideOfSquare) {
		this.sideOfSquare = sideOfSquare;
	}
	
	//Function for calculate perimeter of Square
	@Override
	public double calPerimeter(){
		return this.sideOfSquare * 4;
	}
	
	//Function for calculate area of Square
	@Override
	public double calArea(){
		return this.sideOfSquare * this.sideOfSquare;
	}
	
	//Function for display Information of Square
	@Override
	public void displayInfoShape(){
		System.out.println(String.format("The perimeter of square: %.3f", this.calPerimeter()));
		System.out.println(String.format("The area of square: %.3f", this.calArea()));
	}
}

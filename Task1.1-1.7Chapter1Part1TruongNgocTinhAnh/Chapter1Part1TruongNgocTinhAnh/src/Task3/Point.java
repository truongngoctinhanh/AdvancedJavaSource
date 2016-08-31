package Task3;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for declared points object
 */
public class Point {
	public double x;
	public double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}


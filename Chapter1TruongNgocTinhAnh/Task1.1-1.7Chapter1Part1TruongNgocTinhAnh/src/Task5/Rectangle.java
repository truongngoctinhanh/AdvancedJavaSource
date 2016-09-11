package Task5;

import Task3.Point;

/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for declared Rectangle object  
 */
public class Rectangle {
	Point A;
    Point C;
	public Rectangle() {
		super();
	}
	public Rectangle(Point a, Point c) {
		super();
		A = a;
		C = c;
	}
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
    
}

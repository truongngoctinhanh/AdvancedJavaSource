package Task4;

import Task3.Point;

/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for declared Circle object  
 */
public class Circle {
	Point O;
	Point R;
	public Circle(Point o, Point r) {
		super();
		O = o;
		R = r;
	}
	public Circle() {
		super();
	}
	public Point getO() {
		return O;
	}
	public void setO(Point o) {
		O = o;
	}
	public Point getR() {
		return R;
	}
	public void setR(Point r) {
		R = r;
	}
}


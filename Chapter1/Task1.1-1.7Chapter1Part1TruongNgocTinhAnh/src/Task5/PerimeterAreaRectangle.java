package Task5;

import Task3.Point;

/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for calculate the perimeter and area of a Rectangle
 */
public class PerimeterAreaRectangle {
	Point A;
	Point C;
	PerimeterAreaRectangle(Point A, Point C){
        this.A = A;
        this.C = C;
    }
	
	//Function for get the height of Rectangle
	public double getHeight(){
        double height = Math.abs(this.A.getX() - this.C.getX());
        return height;
    }
	
	//Function for get the weight of Rectangle
	public double getWeight() {
        double weight = Math.abs(this.A.getY() - this.C.getY());
        return weight;
    }
	
	//Function for calculate the perimeter of Rectangle
	public double calculatePerimeter(){
        double perimeter = (this.getHeight() + this.getWeight()) * 2;
        return perimeter;
    }
	
	//Function for calculate the area of Rectangle
	public double calculateArea(){
        double area = this.getHeight() * this.getWeight();
        return area;
    }
}

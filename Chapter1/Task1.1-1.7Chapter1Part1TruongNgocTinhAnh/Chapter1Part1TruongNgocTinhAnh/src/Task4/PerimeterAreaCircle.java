package Task4;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for calculate the perimeter and area of a Circle
 */
import java.text.DecimalFormat;

import Task3.Distance;

public class PerimeterAreaCircle {
	Distance dis;
	PerimeterAreaCircle (Distance dis) {
        this.dis = dis;
     
    }
	
	//Function for calculate the perimeter of Circle
	public double getPerimeter(){
		if (dis == null)
			throw new NullPointerException("distance is null");	
		double per = 0;
		double radius = dis.getDistance();
		per = Math.PI * 2 * radius;
		DecimalFormat df = new DecimalFormat("#.000");
		per = Double.parseDouble(df.format(per));
		return per;
	}
	
	//Function for calculate the area of Circle
	public double getArea(){
		if (dis == null)
			throw new NullPointerException("distance is null");
		double area = 0;
		double radius = dis.getDistance();
		area = Math.PI * radius * radius;
		DecimalFormat df = new DecimalFormat("#.000");
		area = Double.parseDouble(df.format(area));
		return area;
	}
}

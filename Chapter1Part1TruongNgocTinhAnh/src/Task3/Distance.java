package Task3;

import java.text.DecimalFormat;

/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for calculate the distance of 2 points
 */
public class Distance {
	    Point p1 ;
	    Point p2 ;
	    public Distance (Point p1, Point p2) {
	        this.p1 = p1;
	        this.p2 = p2;
	    }
	    public Distance () {
	    	
	    }
	    
	    //Function for calculate the distance of 2 points
		public double getDistance() {
		    double dis = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
		    DecimalFormat df = new DecimalFormat("#.000");
			dis = Double.parseDouble(df.format(dis));
		    return dis;
		}

}

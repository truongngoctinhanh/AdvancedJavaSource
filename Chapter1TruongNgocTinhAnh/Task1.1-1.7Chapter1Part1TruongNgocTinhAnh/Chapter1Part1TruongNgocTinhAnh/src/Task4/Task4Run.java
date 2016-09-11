package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Task3.Distance;
import Task3.Point;

public class Task4Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter point O: ");
		System.out.println("Enter x-coordinate of point O: ");        
        try{
        int pointOx  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter y-coordinate of point O: ");
        int pointOy  = Integer.parseInt(input.readLine()); 
        
        System.out.println("Enter point R: ");
        System.out.println("Enter x-coordinate of point R: ");
        int pointRx  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter y-coordinate of point R: ");
        int pointRy  = Integer.parseInt(input.readLine()); 
        
        Point O = new Point(pointOx, pointOy);
        Point R = new Point(pointRx, pointRy);
        Distance dis = new Distance(O, R);
        PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
        
        System.out.println("Radius of Circle: " + dis.getDistance());
        System.out.println("Perimeter of Circle: " + pa.getPerimeter());
        System.out.println("Area of Circle: " + pa.getArea());
        
        }catch(IOException | NumberFormatException | ArithmeticException ex){
        	System.out.println("Error: " + ex.getMessage());
        }
	}

}

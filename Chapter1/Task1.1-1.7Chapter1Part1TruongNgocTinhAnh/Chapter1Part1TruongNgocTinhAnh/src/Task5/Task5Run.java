package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Task3.Point;

public class Task5Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter point A: ");
		System.out.println("Enter x-coordinate of point A: ");        
        try{
        int pointAx  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter y-coordinate of point A: ");
        int pointAy  = Integer.parseInt(input.readLine()); 
        
        System.out.println("Enter point C: ");
        System.out.println("Enter x-coordinate of point C: ");
        int pointCx  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter y-coordinate of point C: ");
        int pointCy  = Integer.parseInt(input.readLine()); 
        
        Point A = new Point(pointAx, pointAy);
        Point C = new Point(pointCx, pointCy);
        PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
        
        if((A.getX() == C.getX()) || (A.getY() == C.getY())){
            System.out.println("Not is rectangle!");
        }else{
        	System.out.println("Perimeter of Rectangle: " + pa.calculatePerimeter());
            System.out.println("Area of Rectangle: " + pa.calculateArea());
        	}  
        }catch(IOException | NumberFormatException | ArithmeticException ex){
        	System.out.println("Error: " + ex.getMessage());
        }
	}

}

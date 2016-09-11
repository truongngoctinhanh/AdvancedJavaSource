package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task3Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter point A: ");
		System.out.println("Enter x-coordinate of point A: ");        
        try{
        int pointAx  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter y-coordinate of point A: ");
        int pointAy  = Integer.parseInt(input.readLine());
        
        System.out.println("Enter point B: ");
        System.out.println("Enter x-coordinate of point B: ");
        int pointBx  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter y-coordinate of point B: ");
        int pointBy  = Integer.parseInt(input.readLine()); 
        
        Point A = new Point(pointAx, pointAy);
        Point B = new Point(pointBx, pointBy);
        Distance dis = new Distance(A, B);
        System.out.println("Distance of A and B: " + dis.getDistance());
        
        
        }catch(IOException | NumberFormatException | ArithmeticException ex){
        	System.out.println("Error: " + ex.getMessage());
        }
	}

}

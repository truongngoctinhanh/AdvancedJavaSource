package FactoryTeacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForShareTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.println("Do you want download document: ");
			System.out.println("Please choose y or n ");
			String check = input.readLine().toLowerCase();
	        if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
	        	        
	        String reply = "y" ;
	        if (reply.equals("y")){
	        	SingleTeacher object = SingleTeacher.getInstance();
	        	System.out.println(object.shareDocument());
	        }
			
			
			
		}catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

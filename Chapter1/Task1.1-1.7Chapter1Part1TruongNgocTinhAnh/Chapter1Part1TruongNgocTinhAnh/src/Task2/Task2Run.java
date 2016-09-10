package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter number 1: ");
        try{
        int num1 = Integer.parseInt(input.readLine());        
        System.out.println("Enter number 2: ");
        int num2 = Integer.parseInt(input.readLine());
        cal.setNumber1(num1);
        cal.setNumber2(num2);
        
		System.out.println(num1 + " + " + num2 + " = " + cal.addTwoNumbers());
		System.out.println(num1 + " - " + num2 + " = " + cal.subtractTwoNumbers());
		System.out.println(num1 + " * " + num2 + " = " + cal.multiTwoNumbers());
		System.out.println(num1 + " / " + num2 + " = " + cal.divideTwoNumbers());
        
        }catch(IOException | NumberFormatException | ArithmeticException ex){
        	System.out.println("Error: " + ex.getMessage());
        }
	}

}

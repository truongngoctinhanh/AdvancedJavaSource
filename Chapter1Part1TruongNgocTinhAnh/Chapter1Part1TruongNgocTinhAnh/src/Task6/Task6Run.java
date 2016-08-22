package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter your name: ");        
        try{
        String name  = input.readLine(); 
        System.out.println("Enter coefficient of salary: ");
        double coef  = Double.parseDouble(input.readLine()); 
        System.out.println("Enter amount of dependent people: ");
        int depe  = Integer.parseInt(input.readLine()); 
        System.out.println("Enter allowance: ");
        double allo  = Double.parseDouble(input.readLine()); 
        
        Salary sal = new Salary(name, coef, depe, allo);
                
        System.out.println(String.format("Income is : %.0f", sal.calculateIncome()) + " vnd");
        System.out.println(String.format("Taxable income is : %.0f", sal.calculateTaxableIncome())+ " vnd");
        System.out.println(String.format("Personal income tax is: %.0f", sal.calculatePersonalIncomeTax()) + " vnd");
        System.out.println(String.format("Actual Income is : %.0f", sal.calculateActualIncome()) + " vnd");
        
        }catch(IOException | NumberFormatException | ArithmeticException ex){
        	System.out.println("Error: " + ex.getMessage());
        }
	}

}

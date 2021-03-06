package Task15Abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String check = "y" ;
    		while (check.equals("y")) {
    			System.out.print("Enter Instrument name: ");
                String name = input.readLine();
                System.out.print("Enter production unit: ");
                String unit = input.readLine();
                
                System.out.println("-------------------------------------");
                System.out.println("Press 1 if you choose Stringed Instrument ");
                System.out.println("Press 2 if you choose Nonstringed Instrument ");
                System.out.println("Please choose 1 / 2 : ");                
                int rep = Integer.parseInt(input.readLine());
                if (rep != 1 && rep != 2) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                
                if (rep == 1){
                	System.out.print("Enter number of strings: ");
                	String num = input.readLine();
                	StringedInstruments str = new StringedInstruments(num, name, unit);
                	str.displayInfo();
                	str.play();
                }else{
                	System.out.print("Enter usage of Instrument: ");
                	String usage = input.readLine();
                	NonstringedInstruments non = new NonstringedInstruments(usage, name, unit);
                	non.displayInfo();
                	non.play();
                }
                
                System.out.println("------------------------------------------");
                System.out.println("Do you want to continue ? ");
                System.out.println("Please choose y / n ? ");
                check = input.readLine().toLowerCase();
                if(!check.equals("y") && !check.equals("n")) throw new ArithmeticException("Choice value is not valid!");
    		}
            
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

package Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainForManagementComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String reply = "y" ;
            ArrayList<Computer> arrayCom = new ArrayList<Computer>();
            while (reply.equals("y")) {
            	//Enter information of computer
            	System.out.println("Enter information of computer: ");
                System.out.print("Enter ID: ");
                String id = input.readLine();
                System.out.print("Enter unit price: ");
                double price = Integer.parseInt(input.readLine());
                if (price <= 0) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                System.out.print("Enter manufacturer:");
                String manu = input.readLine();
                System.out.print("Enter the number of import:");
                double num = Integer.parseInt(input.readLine());
                if (num < 0) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                //Choose type of computer
                System.out.println("-------------------------------------");
                System.out.println("Press 1 if your computer is Desktop ");
                System.out.println("Press 2 if your computer is Laptop ");
                System.out.println("Please choose 1 / 2 : ");
                int rep = Integer.parseInt(input.readLine());
                if (rep != 1 && rep != 2) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                //Enter separate information of each computer
                if (rep == 1){
                	System.out.print("Enter CPU:");
                	String cpu = input.readLine();
                	System.out.print("Enter RAM:");
                	String ram = input.readLine();
                	arrayCom.add(new Desktop(cpu, ram, id, price, manu, num));
                	System.out.println("Information of desktop created!");
                }else{
                	System.out.print("Enter the weight of computer: ");
                	int wei = Integer.parseInt(input.readLine());
            		System.out.print("Enter the time of battery: ");
            		int bat = Integer.parseInt(input.readLine());
            		System.out.print("Enter the size of screen: ");
                	double scr = Double.parseDouble(input.readLine());
                	arrayCom.add(new Laptop(wei, bat, scr, id, price, manu, num));
                	System.out.println("Information of laptop created!");
                }
                
                System.out.println("------------------------------------------");
                System.out.println("Do you want to add new Computer ? ");
                System.out.println("Please choose y / n ? ");
                reply = input.readLine().toLowerCase();
                if(!reply.equals("y") && !reply.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
            
            //Calculate total money and display information of computer
            double totalPrice = 0;
            for (Computer com : arrayCom) {
                com.showInformation();
                totalPrice += com.calculateMoney();
            }
            System.out.println("------------------------------------------");
            System.out.println(String.format("Total price: %.0f", totalPrice));            
            
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

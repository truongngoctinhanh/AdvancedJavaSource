package Task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task12Run {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String reply = "y" ;
            ArrayList<TextBook> arrayTeBo = new ArrayList<TextBook>();
            ArrayList<ReferenceBook> arrayReBo = new ArrayList<ReferenceBook>();
            while (reply.equals("y")) {
            	System.out.println("Enter information of books: ");
                System.out.print("Enter ID of book: ");
                String id = input.readLine();
                System.out.print("Enter name of book: ");
                String name = input.readLine();
                System.out.print("Enter inputting date: ");
                String date = input.readLine();
                System.out.print("Enter unit price: ");
                double price = Integer.parseInt(input.readLine());
                if (price <= 0) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                System.out.print("Enter quantity: ");
                double quan = Integer.parseInt(input.readLine());
                if (quan < 0) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                System.out.print("Enter publishing company: ");
                String pub = input.readLine();
                
                System.out.println("-------------------------------------");
                System.out.println("Press 1: Text Book ");
                System.out.println("Press 2: Reference Book ");
                System.out.println("Please choose 1 / 2 : ");
                int rep = Integer.parseInt(input.readLine());
                if (rep != 1 && rep != 2) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                
                if (rep == 1){
                	System.out.println("Enter status: (Press 0: new / Press 1: old");
                	System.out.println("Please choose 0 / 1 : ");
                	int status = Integer.parseInt(input.readLine());
                	arrayTeBo.add(new TextBook(status, id, name, date, price, quan, pub));
                }else{
                	System.out.print("Enter tax: ");
                	double tax = Double.parseDouble(input.readLine());
                	arrayReBo.add(new ReferenceBook(tax, id, name, date, price, quan, pub));
                }
                
                System.out.println("------------------------------------------");
                System.out.println("Do you want to add new Book ? ");
                System.out.println("Please choose y / n ? ");
                reply = input.readLine().toLowerCase();
                if(!reply.equals("y") && !reply.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
            
            double totalPrice1 = 0;
            double totalPrice2 = 0;
            int count = 0;
            for (TextBook bo : arrayTeBo) {
                bo.DisplayInfoBook();
                totalPrice1 += bo.calculateFee();
                
            }
            for (ReferenceBook bo : arrayReBo) {
                bo.DisplayInfoBook();
                totalPrice2 += bo.calculateFee();
                count++;
            }
            System.out.println("------------------------------------------");
            System.out.println(String.format("Total price of Text book: %.0f", totalPrice1));
            System.out.println(String.format("Total price of Reference book: %.0f", totalPrice2));
            double average = totalPrice2 / count;
            System.out.println(String.format("Average price of Reference book: %.0f", average));
            
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

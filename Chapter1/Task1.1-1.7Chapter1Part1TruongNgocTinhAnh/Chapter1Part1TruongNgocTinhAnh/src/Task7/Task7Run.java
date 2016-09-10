package Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task7Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String reply = "y" ;
            ArrayList<ManagementCD> arrayCD = new ArrayList<ManagementCD>();
            while (reply.equals("y")) {
                System.out.println("Enter information of CD: ");
                System.out.print("Enter ID: ");
                String id = input.readLine();
                System.out.print("Enter name of CD: ");
                String name = input.readLine();
                System.out.print("Enter singer: ");
                String singer = input.readLine();
                System.out.print("Enter number of songs: ");
                int numOfSongs = Integer.parseInt(input.readLine());
                if (numOfSongs <= 0) {
                    throw new ArithmeticException("Number of songs is not valid!");
                }
                System.out.print("Enter price: ");
                double price = Double.parseDouble(input.readLine());
                if (price <= 0) {
                    throw new ArithmeticException("Price is not valid!");
                }
                arrayCD.add(new ManagementCD(id, name, singer, numOfSongs, price));
                System.out.println("------------------------------------------");
                System.out.println("Do you want to add new CD ? ");
                System.out.println("Please choose y / n? ");
                reply = input.readLine().toLowerCase();
                if(!reply.equals("y") && !reply.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
            System.out.println("------------------------------------------");
            double totalPrice = 0;
            for (ManagementCD cd : arrayCD) {
                cd.showCD();
                totalPrice += cd.getPrice();
            }
            System.out.println("------------------------------------------");
            System.out.println(String.format("Total price: %.0f", totalPrice));
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

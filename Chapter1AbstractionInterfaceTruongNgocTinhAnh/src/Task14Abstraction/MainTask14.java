package Task14Abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
    		String check = "y" ;
    		while (check.equals("y")) {
    			System.out.println("Enter shape: ");
            	System.out.println("Press 1: Circle ");
            	System.out.println("Press 2: Rectangle ");
            	System.out.println("Press 3: Square ");
            	System.out.println("Please choose 1 or 2 or 3 ");
            	int reply = Integer.parseInt(input.readLine());
            	if (reply != 1 && reply != 2 && reply != 3) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                } 
            	
                switch (reply) {
                	case 1:
                		System.out.print("Enter radius: ");
                		double rad = Double.parseDouble(input.readLine());
                		Circle cir = new Circle(rad);
                		cir.displayInfoShape();
                		break;
                	case 2:
                		System.out.print("Enter height: ");
                		double hei = Double.parseDouble(input.readLine());
                		System.out.print("Enter width: ");
                		double wid = Double.parseDouble(input.readLine());
                		Rectangle rec = new Rectangle(hei, wid);
                		rec.displayInfoShape();
                		break;
                	case 3: 
                		System.out.print("Enter side of square: ");
                		double sid = Double.parseDouble(input.readLine());
                		Square squ = new Square(sid);
                		squ.displayInfoShape();
                		break;
                	default:
                		System.out.println("Invalid value! Please choose again!");
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

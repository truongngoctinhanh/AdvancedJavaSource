package Task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForServicesToSendGifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	System.out.print("Enter shape of gift: ");
    		String shape = input.readLine();
    		System.out.print("Enter color of gift: ");
    		String color = input.readLine();
    		System.out.print("Enter name of gift: ");
    		String name = input.readLine();
    		System.out.print("Enter weight of gift: ");
    		double wei = Double.parseDouble(input.readLine());
    		GiftBox gb = new GiftBox(shape, color);
    		GiftBox.Gift inner = gb.new Gift(name, wei);
    		
    		System.out.print("--------------------------------------------");
    		System.out.print("The information of gift created: ");
    		inner.displayInfoGift();
    		System.out.println("Total fee: " + inner.calFee());
                		
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

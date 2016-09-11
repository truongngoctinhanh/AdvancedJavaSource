package ObserverTransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			Account account = new Account();
			List<Observer> observers = new ArrayList<>();
			account.setState(10000000);
			MobiObserver mobi = new MobiObserver(account);
			EmailObserver email = new EmailObserver(account);
			int check = 1;
			while (check == 1) {
				System.out.println("1. Withdraw money \n2. Tranfer money");
				System.out.println("Please choose 1 / 2 ");
				int reply = Integer.parseInt(input.readLine());
				if (reply != 1 && reply != 2) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}
				
				System.out.println("Enter money: ");
				double money = Double.parseDouble(input.readLine());
				if (money < 0) throw new ArithmeticException("Invalid values! Please choose again!");
				
				if (money <= account.getState()) {						
					System.out.println(mobi.update());
					System.out.println(email.update());
				}
				else
					System.out.println("Your balance is not enough. Please enter money again !");
				
				System.out.println("Do you want continue: \n1. Yes \n2. No ");
				System.out.println("Please choose 1 / 2 ");
				check = Integer.parseInt(input.readLine());
				if (check != 1 && check != 2) {
					throw new ArithmeticException("Invalid values! Please choose again!");
				}

			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());

		}
	}

}

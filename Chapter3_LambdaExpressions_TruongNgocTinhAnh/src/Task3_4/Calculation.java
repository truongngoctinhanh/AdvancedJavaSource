package Task3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 09- 09 -2016
 * @Version: 01
 * @Class for calculate summation, subtraction, multiplication, division (use
 *        lambda expression)
 */
public class Calculation {

	interface Operator {
		public Integer operate(Integer x1, Integer x2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			String active = "y";
			while (active.equals("y")) {
				System.out
						.println("Choose calculation  \n1. +  \n2. -  \n3. *  \n4. /1");
				int reply = Integer.parseInt(input.readLine());
				System.out.println("Enter fist number: ");
				int x1 = Integer.parseInt(input.readLine());
				System.out.println("Enter second number: ");
				int x2 = Integer.parseInt(input.readLine());
				
				switch (reply) {				
				case 1:
					Operator add = (Integer x, Integer y) -> x + y;
					System.out.println(x1 + " + " + x2 + " = "
							+ add.operate(x1, x2));
					break;
				case 2:
					Operator subtract = (Integer x, Integer y) -> x - y;
					System.out.println(x1 + " - " + x2 + " = "
							+ subtract.operate(x1, x2));
					break;
				case 3:
					Operator multip = (Integer x, Integer y) -> x * y;
					System.out.println(x1 + " * " + x2 + " = "
							+ multip.operate(x1, x2));
					break;
				case 4:
					Operator divide = (Integer x, Integer y) -> x / y;
					System.out.println(x1 + " / " + x2 + " = "
							+ divide.operate(x1, x2));
					break;
				}
				System.out
						.println("------------------------------------------");
				System.out
						.println("Do you want to continue calculate area of other shape? ");
				System.out.println("Please choose y / n? ");
				active = input.readLine().toLowerCase();
				if (!active.equals("y") && !active.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

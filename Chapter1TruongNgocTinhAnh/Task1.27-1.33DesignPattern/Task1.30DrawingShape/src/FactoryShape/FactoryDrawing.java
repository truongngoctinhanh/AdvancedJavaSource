package FactoryShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 11:29:35 AM
 * @class for management drawing shape
 */
public class FactoryDrawing {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {

			CircleFactory circle = new CircleFactory();
			RectangleFactory rectangle = new RectangleFactory();
			SquareFactory square = new SquareFactory();

			int check = 1;
			while (check == 1) {
				System.out
						.println("Do you want draw the 1. Circle / 2. Rectangle / 3. Square: ");
				System.out.println("Please choose 1 / 2 / 3 ");
				int reply = Integer.parseInt(input.readLine());
				if (reply != 1 && reply != 2 && reply != 3) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}
				switch (reply) {
				case 1:
					circle.getShape().draw();

					break;
				case 2:
					rectangle.getShape().draw();
					break;
				case 3:
					square.getShape().draw();
					break;
				}
				System.out.println("Do you want continue: \n1. Yes \n2. No ");
				System.out.println("Please choose 1 / 2 ");
				check = Integer.parseInt(input.readLine());
				if (check != 1 && check != 2) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}

			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());

		}

	}

}
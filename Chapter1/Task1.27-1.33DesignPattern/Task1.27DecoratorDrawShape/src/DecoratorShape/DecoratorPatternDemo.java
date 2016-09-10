package DecoratorShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 10:40:53 AM
 * @class for management draw shape
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			Circle circle  = new Circle();
			Rectangle rectangle = new Rectangle();
			RedShapeDecorator shapeDecCir = new RedShapeDecorator(circle);
			RedShapeDecorator shapeDecRec = new RedShapeDecorator(rectangle);
			int check = 1;
			while (check == 1) {
				System.out.println("Shape: 1. Circle / 2. Rectangle ");
				System.out.println("Please choose shape 1 / 2 ");
				int replyShape = Integer.parseInt(input.readLine());
				if (replyShape != 1 && replyShape != 2) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}
				
				System.out.println("Do you want to choose the way to decorate (1. Yes / 2. No): ");
				System.out.println("Please choose 1 / 2 ");
				int replyDec = Integer.parseInt(input.readLine());
				if (replyDec != 1 && replyDec != 2) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}
				
				switch (replyShape) {
				case 1:
					if (replyDec == 2)
						System.out.println(circle.draw() + "with normal border");
					else
						System.out.println(shapeDecCir.draw());
					break;
				case 2:
					if (replyDec == 2)
						System.out.println(rectangle.draw() + "with normal border");
					else
						System.out.println(shapeDecRec.draw());
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
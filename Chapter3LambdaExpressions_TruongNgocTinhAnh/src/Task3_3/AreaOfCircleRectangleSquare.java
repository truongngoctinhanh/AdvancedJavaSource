package Task3_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 09- 09 -2016
 * @Version: 01
 * @Class for calculate area of circle, rectangle and square (use lambda expression)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircleRectangleSquare {
	interface Area1 {
		public double calArea(double x1, double x2);
	}

	interface Area2 {
		public double calArea(double x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			String active = "y";
			while (active.equals("y")) {
			System.out
					.println("Calculate area of \n1. Circle  \n2. Rectangle  \n3. Square");
			int reply = Integer.parseInt(input.readLine());			
				switch (reply) {
				case 1:
					System.out.println("Enter radius: ");
					double r = Double.parseDouble(input.readLine());
					Area1 circle = (double x1, double x2) -> x1
							* Math.pow(x2, 2);
					System.out.println("S = PI * (r * r) = "
							+ circle.calArea(Math.PI, r));
					break;
				case 2:
					System.out.println("Enter height: ");
					double H = Double.parseDouble(input.readLine());
					System.out.println("Enter width: ");
					double W = Double.parseDouble(input.readLine());
					Area1 rectangle = (double x1, double x2) -> x1 * x2;
					System.out
							.println("S = W * H = " + rectangle.calArea(W, H));
					break;
				case 3:
					System.out.println("Enter side: ");
					double s = Double.parseDouble(input.readLine());
					Area2 square = (double x) -> x * x;
					System.out.println("S = s * s = " + square.calArea(s));
					break;
				}
				System.out
						.println("------------------------------------------");
				System.out.println("Do you want to continue calculate area of other shape? ");
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

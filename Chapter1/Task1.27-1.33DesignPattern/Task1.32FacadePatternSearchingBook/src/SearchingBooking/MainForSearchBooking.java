package SearchingBooking;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 05- 09 -2016
 * @Version: 01
 * @Class for management search booking
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForSearchBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String active = "y";
			while (active.equals("y")) {
				//Choose type of booking
				System.out.println("Enter type of booking: ");
				System.out.println("Press 1: Hotel");
				System.out.println("Press 2: Flight");
				System.out.println("Press 3: Train");
				int typeBooking = Integer.parseInt(input.readLine());
				System.out.print("Enter date: ");
				String date = input.readLine();
				System.out.print("Enter hour: ");
				String hour = input.readLine();
				System.out.print("Enter place: ");
				String place = input.readLine();
				BookingFacade booking = new BookingFacade();
				if (typeBooking == 1) {
					System.out.println(booking.bookHotel(date, hour, place));
				} else if (typeBooking == 2) {
					System.out.println(booking.bookFlight(date, hour, place));
				} else if (typeBooking == 3) {
					System.out.println(booking.bookTrain(date, hour, place));
				} else {
					throw new ArithmeticException("Type of booking is not valid!");
				}
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue other booking activity? ");
				System.out.println("Please choose y / n? ");
				active = input.readLine().toLowerCase();
				if (!active.equals("y") && !active.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}
		} catch (IOException | NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

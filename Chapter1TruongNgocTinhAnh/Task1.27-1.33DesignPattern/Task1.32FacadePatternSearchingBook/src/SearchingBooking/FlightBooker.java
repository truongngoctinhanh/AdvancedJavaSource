package SearchingBooking;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 05- 09 -2016
 * @Version: 01
 * @Class for override getInformation method of Booker class
 */
public class FlightBooker implements Booker{
	@Override
	public String getInformation(String date, String hour, String place) {
		return "Date: " + date + ", hour: " + hour + ", place: " + place + " \nFlight A, B and C"; 
	}

	public FlightBooker() {
		super();
	}
}

package SearchingBooking;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 05- 09 -2016
 * @Version: 01
 * @Class for declare type of booking 
 */
public class BookingFacade {
	private Booker flightBooker;
	private Booker hotelBooker;
	private Booker trainBooker;
	
	public BookingFacade(){
		flightBooker = new FlightBooker();
		hotelBooker = new HotelBooker();
		trainBooker = new TrainBooker();
	}
	
	public String bookFlight(String date, String hour, String place){
		return flightBooker.getInformation(date, hour, place);
	}
	
	public String bookHotel(String date, String hour, String place){
		return hotelBooker.getInformation(date, hour, place);
	}
	
	public String bookTrain(String date, String hour, String place){
		return trainBooker.getInformation(date, hour, place);
	}
}

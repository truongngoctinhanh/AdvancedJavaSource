package Task9;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare Laptop object extend Computer object and override method show information of computer
 */
public class Laptop extends Computer {
	private int weight;
	private int timeOfBattery;
	private double sizeOfScreen;
	
	public Laptop() {
		super();
	}
	
	public Laptop(int weight, int timeOfBattery, double sizeOfScreen,String id, double unitPrice, String manufacturer,
			double numOfImport) {
		super(id, unitPrice, manufacturer, numOfImport);
		this.weight = weight;
		this.timeOfBattery = timeOfBattery;
		this.sizeOfScreen = sizeOfScreen;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTimeOfBattery() {
		return timeOfBattery;
	}

	public void setTimeOfBattery(int timeOfBattery) {
		this.timeOfBattery = timeOfBattery;
	}

	public double getSizeOfScreen() {
		return sizeOfScreen;
	}

	public void setSizeOfScreen(double sizeOfScreen) {
		this.sizeOfScreen = sizeOfScreen;
	}
	
	//Function for override showInformation method
	@Override
	public void showInformation(){
		System.out.println("Information of Laptop");
		System.out.println("...................................................");
		System.out.println("ID of computer: " + this.id);
		System.out.println("Unit price of computer: " + this.unitPrice);
		System.out.println("Manufacturer of computer: " + this.manufacturer);
		System.out.println("The weight of computer: " + this.weight);
		System.out.println("The time of battery: " + this.timeOfBattery);
		System.out.println("The size of screen: " + this.sizeOfScreen);
	}
	
}

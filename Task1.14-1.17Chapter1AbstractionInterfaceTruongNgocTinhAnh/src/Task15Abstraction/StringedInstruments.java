package Task15Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23- 08 -2016
 * Version: 1.0
 * Class for declare StringedInstrument object and 
 * override play method, displayInfo method
 */
public class StringedInstruments extends Instrument {
	private String numOfStrings;

	public StringedInstruments() {
		super();
	}

	public StringedInstruments(String numOfStrings, String name, String productionUnit) {
		super(name, productionUnit);
		this.numOfStrings = numOfStrings;
	}

	public String getNumOfStrings() {
		return numOfStrings;
	}

	public void setNumOfStrings(String numOfStrings) {
		this.numOfStrings = numOfStrings;
	}
	
	/**	
	 * Function for override abstract play() method to display usage of nonstringed Instrument
	 * Input: Instrument name and Number of strings of nonstringed Instrument
	 * Output: information usage of nonstringed Instrument
	 */
	@Override
	public void play() {
		System.out.println("Instrument name: " + this.name + " | Number of strings: " + this.numOfStrings);
	}
	
	/**	
	 * Function for override abstract displayInfo() method to display information of Instrument
	 * Input: name and production unit of Instrument
	 * Output: information of Instrument
	 */
	@Override
	public void displayInfo() {
		System.out.println("Instrument name: " + this.name);
		System.out.println("Production unit" + this.productionUnit);
	}
	
}

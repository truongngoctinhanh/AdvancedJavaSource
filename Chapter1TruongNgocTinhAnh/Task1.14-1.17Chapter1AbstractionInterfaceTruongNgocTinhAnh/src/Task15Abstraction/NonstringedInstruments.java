package Task15Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23- 08 -2016
 * Version: 1.0
 * Class for declare NonstringedInstrument object and 
 * override play method, displayInfo method
 */
public class NonstringedInstruments extends Instrument {
	private String usage;

	public NonstringedInstruments() {
		super();
	}

	public NonstringedInstruments(String usage, String name, String productionUnit) {
		super(name, productionUnit);
		this.usage = usage;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	/**	
	 * Function for override abstract play() method to display usage of stringed Instrument
	 * Input: usage of stringed Instrument
	 * Output: information usage of stringed Instrument
	 */
	@Override
	public void play() {
		System.out.println("Usage of " + this.name + " : " + this.usage);
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

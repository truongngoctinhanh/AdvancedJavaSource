package Task15Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23- 08 -2016
 * Version: 1.0
 * Class for declare Instrument object and abstract play() method, abstract displayInfo() method
 */
public abstract class Instrument {
	protected String name;
	protected String productionUnit;
	public Instrument() {
		super();
	}
	
	public Instrument(String name, String productionUnit) {
		super();
		this.name = name;
		this.productionUnit = productionUnit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductionUnit() {
		return productionUnit;
	}
	public void setProductionUnit(String productionUnit) {
		this.productionUnit = productionUnit;
	}
	
	//Function for abstract void play()
	public abstract void play();
	
	//Function for abstract void displayInfo()
	public abstract void displayInfo();
	
}

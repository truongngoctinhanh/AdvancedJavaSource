package Task16;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare abstract class Vehicle 
 */
public abstract class Vehicle {

	String name;
	String manufacturer;
	String color;
	String owner;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String name, String manufacturer, String color, String owner) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.color = color;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//Funtion for declare abstract toString method
	public abstract String toString();
}

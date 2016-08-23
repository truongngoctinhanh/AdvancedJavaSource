package Task16;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare class Car extends Vehicle implements ISpeed, IConsumeFuel
 */
public class Car extends Vehicle implements ISpeed, IConsumeFuel{
	String gearType;
	String carType;
	MovingByTime time;
	MovingByFuel fuel;
	
	public Car() {
		super();
	}

	public Car(String name, String manufacturer, String color, String owner,
			String gearType, String carType) {
		super(name, manufacturer, color, owner);
		this.gearType = gearType;
		this.carType = carType;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public MovingByTime getTime() {
		return time;
	}

	public void setTime(MovingByTime time) {
		this.time = time;
	}

	public MovingByFuel getFuel() {
		return fuel;
	}

	public void setFuel(MovingByFuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car gearType=" + gearType + ", carType=" + carType + ", name="
				+ name + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", owner=" + owner;
	}

	//Function for  calculate kilometer with each hour
	@Override
	public double calConsumeFuel() {
		return time.distance / time.time;
	}

	//Function for  calculate kilometer witch each a liter of fuel
	@Override
	public double calSpeed() {
		return fuel.distance / fuel.fuel;
	}
}

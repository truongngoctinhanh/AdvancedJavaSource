package Task16;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare class Ship extends Vehicle implements ISpeed, IConsumeFuel
 */
public class Ship extends Vehicle implements ISpeed, IConsumeFuel {
	double weight;
	double capacity;
	double downStreamSpeed;
	double upStreamSpeed;
	double fuelConsumptionStart;
	String fuelType;
	MovingByFuel fuel;
	MovingByTime time;
	
	public Ship() {
		super();
	}

	public Ship(String name, String manufacturer, String color, String owner,
			double weight, double capacity, double downStreamSpeed,
			double upStreamSpeed, double fuelConsumptionStart, String fuelType) {
		super(name, manufacturer, color, owner);
		this.weight = weight;
		this.capacity = capacity;
		this.downStreamSpeed = downStreamSpeed;
		this.upStreamSpeed = upStreamSpeed;
		this.fuelConsumptionStart = fuelConsumptionStart;
		this.fuelType = fuelType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDownStreamSpeed() {
		return downStreamSpeed;
	}

	public void setDownStreamSpeed(double downStreamSpeed) {
		this.downStreamSpeed = downStreamSpeed;
	}

	public double getUpStreamSpeed() {
		return upStreamSpeed;
	}

	public void setUpStreamSpeed(double upStreamSpeed) {
		this.upStreamSpeed = upStreamSpeed;
	}

	public double getFuelConsumptionStart() {
		return fuelConsumptionStart;
	}

	public void setFuelConsumptionStart(double fuelConsumptionStart) {
		this.fuelConsumptionStart = fuelConsumptionStart;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public MovingByFuel getFuel() {
		return fuel;
	}

	public void setFuel(MovingByFuel fuel) {
		this.fuel = fuel;
	}

	public MovingByTime getTime() {
		return time;
	}

	public void setTime(MovingByTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Ship [weight=" + weight + ", capacity=" + capacity
				+ ", downStreamSpeed=" + downStreamSpeed + ", upStreamSpeed="
				+ upStreamSpeed + ", fuelConsumptionStart="
				+ fuelConsumptionStart + ", fuelType=" + fuelType + ", name="
				+ name + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", owner=" + owner + "]";
	}

	//Function for  calculate kilometer with each hour
	@Override
	public double calConsumeFuel() {
	
		return time.distance / time.time + upStreamSpeed - downStreamSpeed;
	}

	//Function for  calculate kilometer witch each a liter of fuel
	@Override
	public double calSpeed() {
		return fuel.distance / (fuel.fuel - fuelConsumptionStart);
	}
}

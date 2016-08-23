package Task16;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare class MovingByFuel extends Moving
 */
public class MovingByFuel extends Moving {
	double fuel;

	public MovingByFuel() {
		super();
	}

	public MovingByFuel(double distance, double fuel) {
		super(distance);
		this.fuel = fuel;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
}

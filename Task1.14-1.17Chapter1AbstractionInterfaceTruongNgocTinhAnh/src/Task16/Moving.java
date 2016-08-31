package Task16;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare abstract class Moving
 */
public abstract class Moving {
	double distance;
	
	public Moving() {
		super();
	}

	public Moving(double distance) {
		super();
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
}

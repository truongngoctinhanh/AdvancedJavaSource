package Task16;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare class MovingByTime extends Moving
 */
public class MovingByTime extends Moving {
	double time;

	public MovingByTime() {
		super();
	}
	
	public MovingByTime(double distance, double time) {
		super(distance);
		this.time = time;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
}

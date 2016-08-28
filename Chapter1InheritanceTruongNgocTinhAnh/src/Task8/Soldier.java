package Task8;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 21- 08 -2016
 * Version: 01
 * Class for declare Soldier object and fight() method
 */
public class Soldier {
	protected String name;
	protected int power;
	protected String weapon;
	protected Soldier() {
		super();
	}
	public Soldier(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	/**
	 * Function for calculate power of fight
	 * Input: power
	 * Output: power
	 */
	public int fight(){
		return this.power - 1;
	}
	
	
	

}

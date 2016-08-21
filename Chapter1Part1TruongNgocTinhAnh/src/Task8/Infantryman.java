package Task8;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 21- 08 -2016
 * Version: 01
 * Class for declare Infantryman object and override fight() method
 */
public class Infantryman extends Soldier{
	public Infantryman(String name, int power, String weapon){
		super(name, power, weapon);
	}
	@Override
	public void fight(){
		this.setPower(getPower() - 2);
	}
}

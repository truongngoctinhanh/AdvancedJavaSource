package Task8;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 21- 08 -2016
 * Version: 01
 * Class for declare Trooper object and override fight() method
 */
public class Trooper extends Soldier{
	public Trooper (String name, int power, String weapon){
		super(name, power, weapon);
	}
	
	@Override
	public int fight(){
		return this.power - 3;
	}
}

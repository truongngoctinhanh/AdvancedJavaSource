package Task17;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare Fish object extends Animals and implements INonMolt, IWater, ISwimming
 */
public class Fish extends Animals implements INonMolt, IWater, ISwimming {
	public Fish() {
		super();
	}
	
	public Fish(String name, String mainFood) {
		super(name, mainFood);
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The fish moves by swimming");
	}

	@Override
	public void liveInWater() {
		// TODO Auto-generated method stub
		System.out.println("The fish live under the water");
	}

	@Override
	public void growthNormal() {
		// TODO Auto-generated method stub
		System.out.println("The fish growths normally ");
	}

}

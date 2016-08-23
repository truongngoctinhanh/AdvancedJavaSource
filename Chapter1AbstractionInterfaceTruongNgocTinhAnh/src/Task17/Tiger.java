package Task17;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare Tiger object extends Animals and implements IBurrowing, INonMolt, IRunning, ISwimming
 */
public class Tiger extends Animals implements IBurrowing, INonMolt, IRunning, ISwimming{
	public Tiger() {
		super();
	}
	
	public Tiger(String name, String mainFood) {
		super(name, mainFood);
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The tigers moves by swimming");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The tigers moves by running");
	}

	@Override
	public void growthNormal() {
		// TODO Auto-generated method stub
		System.out.println("The tigers growths normally ");
	}

	@Override
	public void burrowing() {
		// TODO Auto-generated method stub
		System.out.println("The tigers burrows to live in it");
	}

}

package Task17;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare Boa object extends Animals and implements IBurrowing, IMolt, ISwimming
 */
public class Boa extends Animals implements IBurrowing, IMolt, ISwimming{
	public Boa() {
		super();
	}
	
	public Boa(String name, String mainFood) {
		super(name, mainFood);
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The boa moves by swiming");
	}

	@Override
	public void molting() {
		// TODO Auto-generated method stub
		System.out.println("The boa growths by molting");
	}

	@Override
	public void burrowing() {
		// TODO Auto-generated method stub
		System.out.println("The boa burrows to live in it");
	}
	
}

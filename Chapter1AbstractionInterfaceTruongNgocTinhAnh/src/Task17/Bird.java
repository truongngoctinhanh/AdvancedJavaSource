package Task17;

public class Bird extends Animals implements IFlying, INonMolt,INesting, IRunning {
	public Bird() {
		super();
	}
	
	public Bird(String name, String mainFood) {
		super(name, mainFood);
	}
	
	
	@Override
	public void fly() {
		System.out.println("The birds moves by flying");
	}
	
	@Override
	public void nesting() {
		System.out.println("Bird lives in the nest");
	}

	@Override
	public void growthNormal() {
		System.out.println("Bird growths normally");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The birds moves by running");
	}
}

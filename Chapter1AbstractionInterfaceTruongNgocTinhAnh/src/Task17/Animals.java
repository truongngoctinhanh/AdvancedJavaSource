package Task17;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 -2016
 * Version: 1.0
 * Class for declare Animals object and showInformation() method
 */
public class Animals {
	protected String name;
	protected String mainFood;
	
	public Animals() {
		super();
	}
	
	public Animals(String name, String mainFood) {
		super();
		this.name = name;
		this.mainFood = mainFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainFood() {
		return mainFood;
	}

	public void setMainFood(String mainFood) {
		this.mainFood = mainFood;
	}
	
	/**
	 * Function for display information of animal
	 * Input: name, main food of animal
	 * Output: information of animal
	 */
	public void showInformation(){
		System.out.println("Name: " + name);
		System.out.println("Main food: " + mainFood);
	}
	
	
}

package Task2_4_ManagementPet;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08 - 09 - 2016
 * @Version: 01
 * @Class for declare Dog object
 */
public class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}
}

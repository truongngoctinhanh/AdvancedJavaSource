package Task2_4_ManagementPet;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08 - 09 - 2016
 * @Version: 01
 * @Class for declare Cat object
 */
public class Cat {
	private String name;

	public Cat(String name) {
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

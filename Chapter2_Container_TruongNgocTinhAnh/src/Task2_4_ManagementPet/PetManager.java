package Task2_4_ManagementPet;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08 - 09 - 2016
 * @Version: 01
 * @Class for PetManager class use generic container
 */
import java.util.ArrayList;
import java.util.List;

public class PetManager<T> {
	private List<T> pets;

	public void setPets(List<T> pets) {
		this.pets = pets;
	}

	public List<T> getPets() {
		if (pets == null) {
			pets = new ArrayList<>();
		}
		return pets;
	}
}

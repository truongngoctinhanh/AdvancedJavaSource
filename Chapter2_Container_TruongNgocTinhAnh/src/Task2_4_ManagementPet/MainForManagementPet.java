package Task2_4_ManagementPet;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08 - 09 - 2016
 * @Version: 01
 * @Class main for management pet
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForManagementPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PetManager<Dog> managerDog = new PetManager<Dog>();
			PetManager<Cat> managerCat = new PetManager<Cat>();
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter list dog: ");
			String Dogs = input.readLine();
			System.out.println("Enter list cat: ");
			String Cats = input.readLine();
			String DogNames[] = Dogs.split(",");
			String CatNames[] = Cats.split(",");
			// Enter dog into list dog
			for (String DogName : DogNames) {
				managerDog.getPets().add(new Dog(DogName));
			}
			// Enter cat into list cat
			for (String CatName : CatNames) {
				managerCat.getPets().add(new Cat(CatName));
			}
			// Display list dog
			System.out.println("-----------------DOG--------------------");
			if (managerDog != null && !managerDog.getPets().isEmpty()) {
				for (int i = 0; i < managerDog.getPets().size(); i++) {
					System.out.println(managerDog.getPets().get(i).toString());
				}
			}
			// print list cat
			System.out.println("---------------- CAT------------------");
			if (managerCat != null && !managerCat.getPets().isEmpty()) {
				for (int i = 0; i < managerCat.getPets().size(); i++) {
					System.out.println(managerCat.getPets().get(i).toString());
				}
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

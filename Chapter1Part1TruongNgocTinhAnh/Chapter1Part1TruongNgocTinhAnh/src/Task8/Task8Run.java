package Task8;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 21- 08 -2016
 * Version: 01
 * Class for declare Trooper object and override fight() method
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8Run {
	public static int fightSoldier(Infantryman in, Trooper tr, int fight) {
        if (fight != 1 && fight != 2) {
            throw new ArithmeticException("Invalid values!!! Please choose again: ");
        }
        int result = 0;
        while (in.getPower() >= 0 || tr.getPower() >= 0) {
            if (fight == 1) {
                tr.fight();
                in.fight();
            } else {
                in.fight();
                tr.fight();
            }
        }
        if (in.getPower() > tr.getPower()) {
            result = 0;
        } else {
        	result = 1;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter information of infantryman: ");
            System.out.print("Enter name: ");
            String nameIn = input.readLine();
            System.out.print("Enter power: ");
            int powerIn = Integer.parseInt(input.readLine());
            if (powerIn <= 0) {
                throw new ArithmeticException("Power is not valid!");
            }
            System.out.print("Enter weapon:");
            String weaponIn = input.readLine();

            Infantryman in = new Infantryman(nameIn, powerIn, weaponIn);
            System.out.println("Information of Infantryman created!");

            System.out.println("Enter information of trooper: ");
            System.out.print("Enter name: ");
            String nameTr = input.readLine();
            System.out.print("Enter power: ");
            int powerTr = Integer.parseInt(input.readLine());
            if (powerTr <= 0) {
                throw new ArithmeticException("Power is not valid!");
            }
            System.out.print("Enter weapon: ");
            String weaponTr = input.readLine();

            Trooper tr = new Trooper(nameTr, powerTr, weaponTr);
            System.out.println("Information of Trooper created!");
            System.out.println("-------------------------------------");
            System.out.println("Press 1 if you want to infantryman fighting before ");
            System.out.println("Press 2 if you want to trooper fighting before ");
            System.out.println("Please choose 1 / 2 : ");
            
            int choose = Integer.parseInt(input.readLine());
            int result = fightSoldier(in, tr, choose);
            if (result == 0) {
                System.out.println("Infantryman win!");
            } else {
                System.out.println("Tropper win!");
            }
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

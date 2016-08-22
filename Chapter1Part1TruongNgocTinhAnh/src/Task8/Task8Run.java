package Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8Run {
	public static int warOfSoldier(Infantryman in, Trooper tr, int firstHit) {
        if (firstHit != 1 && firstHit != 2) {
            throw new ArithmeticException("Who first hit is not valid!");
        }
        int result = 0;
        while (in.getPower() >= 0 || tr.getPower() >= 0) {
            if (firstHit == 1) {
                tr.fight();
                in.fight();
            } else {
                in.fight();
                tr.fight();
            }
        }
        if (tr.getPower() > in.getPower()) {
            result = 2;
        } else {
            return 1;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter information of Infantryman: ");
            System.out.print("Enter name: ");
            String nameInfan = input.readLine();
            System.out.print("Enter power: ");
            int powerInfan = Integer.parseInt(input.readLine());
            if (powerInfan <= 0) {
                throw new ArithmeticException("Enter is not valid!");
            }
            System.out.print("Enter weapon:");
            String weaponInfan = input.readLine();

            Infantryman in = new Infantryman(nameInfan, powerInfan, weaponInfan);
            System.out.println("--->Infantryman created!");

            System.out.println("Input information of trooper: ");
            System.out.print("Input name: ");
            String nameOfTr = input.readLine();
            System.out.print("Input power: ");
            int powerOfTr = Integer.parseInt(input.readLine());
            if (powerOfTr <= 0) {
                throw new ArithmeticException("Power is not valid!");
            }
            System.out.print("Input weapon: ");
            String weaponOfTr = input.readLine();

            Trooper tr = new Trooper(nameOfTr, powerOfTr, weaponOfTr);
            System.out.println("--->Trooper created!");
            System.out.println("-------------------------------------");
            System.out.println("Ready, who is first hit ");
            System.out.println("Press 1 is infantryman.");
            System.out.println("Press 2 is trooper.");
            int choice = Integer.parseInt(input.readLine());
            int result = warOfSoldier(in, tr, choice);
            if (result == 1) {
                System.out.println("Infantryman win!");
            } else {
                System.out.println("Tropper win!");
            }
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

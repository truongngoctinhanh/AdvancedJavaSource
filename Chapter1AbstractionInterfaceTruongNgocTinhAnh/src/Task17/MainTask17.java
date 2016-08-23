package Task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTask17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String check = "y" ;
        	ArrayList<Bird> arrBird = new ArrayList<>();
			ArrayList<Fish> arrFish = new ArrayList<>();
			ArrayList<Boa> arrBoa = new ArrayList<>();
			ArrayList<Tiger> arrTiger = new ArrayList<>();
    		while (check.equals("y")) {
    			System.out.print("Enter Animal name: ");
                String name = input.readLine();
                System.out.print("Enter main food of animal: ");
                String food = input.readLine();
                
                System.out.println("-------------------------------------");
                System.out.println("Press 1 if you choose Bird ");
                System.out.println("Press 2 if you choose Fish ");
                System.out.println("Press 3 if you choose Tiger ");
                System.out.println("Press 4 if you choose Boa ");
                System.out.println("Please choose 1 / 2 / 3 / 4 ");                
                int rep = Integer.parseInt(input.readLine());
                if (rep != 1 && rep != 2 && rep != 3 && rep != 4) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                System.out.println("-----------------------------------------");
				switch (rep) {
				case 1: {
					arrBird.add(new Bird(name, food));
					System.out.println("Add bird successfull!");
					System.out.println("Do you want continue (y/n)");
					check = input.readLine().toLowerCase();
				}
					break;
				case 2: {
					arrFish.add(new Fish(name, food));
					System.out.println("Add fish successfull!");
					System.out.println("Do you want continue (y/n)");
					check = input.readLine().toLowerCase();
				}
					break;
				case 3: {
					arrTiger.add(new Tiger(name, food));
					System.out.println("Add tiger successful!");
					System.out.println("Do you want continue (y/n)");
					check = input.readLine().toLowerCase();
				}
					break;
				case 4:{
					arrBoa.add(new Boa(name, food));
					System.out.println("Add snake successful!");
					System.out.println("Do you want continue (y/n)");
					check = input.readLine().toLowerCase();
				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
			}
			System.out.println("-----------------------------------------");
			if(!arrBird.isEmpty()){
				for(Bird bird : arrBird){
					bird.showInformation();
					bird.fly();
					bird.run();
					bird.nesting();
					System.out.println("-----------------------------------------");
				}
			}
			if(!arrFish.isEmpty()){
				for(Fish fish : arrFish){
					fish.showInformation();
					fish.swim();
					fish.growthNormal();
					fish.liveInWater();
					System.out.println("------------------------------------------");
				}
			}
			if(!arrTiger.isEmpty()){
				for(Tiger tiger : arrTiger){
					tiger.showInformation();
					tiger.burrowing();
					tiger.run();
					tiger.growthNormal();
					tiger.swim();
					System.out.println("-------------------------------------------");
				}
			}
			if(!arrBoa.isEmpty()){
				for(Boa boa : arrBoa){
					boa.showInformation();
					boa.burrowing();
					boa.molting();
					boa.swim();
					
				}
			}
            
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}

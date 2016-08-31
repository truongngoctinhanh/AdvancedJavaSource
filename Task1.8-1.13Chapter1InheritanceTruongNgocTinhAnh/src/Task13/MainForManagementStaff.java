package Task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainForManagementStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
		ArrayList<BusinessStaff> arrBus = new ArrayList<BusinessStaff>();
        ArrayList<ProductionStaff> arrPro = new ArrayList<ProductionStaff>();
        String check = "y";
        while (check.equals("y")) {
        	//Enter information of employee
            System.out.print("Enter name of employee: ");
            String name = input.readLine();
            System.out.print("Enter coefficient: ");
            double coef = Double.parseDouble(input.readLine());
            System.out.print("Enter amount of people: ");
            int amount = Integer.parseInt(input.readLine());
            System.out.print("Enter allowance: ");
            double allo = Double.parseDouble(input.readLine());
            System.out.println("-----------------------------------------");
            
            //Choose type of staff
            System.out.println("Press 1: Business staff");
            System.out.println("Press 2: Production staff");
            System.out.println("Please choose 1 / 2");
            
            int option = Integer.parseInt(input.readLine());
            if(option != 1 && option != 2){
                throw new ArithmeticException("Invalid value");
            }
            System.out.println("-----------------------------------------");
            //Enter separate information of each staff
            if(option == 1){
                System.out.print("Enter Business salary: ");
                double salaryBus = Double.parseDouble(input.readLine());
                if(salaryBus <= 0){
                    throw new ArithmeticException("Invalid value!");
                }
                System.out.print("Enter rate of Business salary: ");
                double rateBus = Double.parseDouble(input.readLine());
                if(rateBus <= 0){
                    throw new ArithmeticException("Invalid value!");
                }
                arrBus.add(new BusinessStaff(salaryBus, rateBus, name, coef, amount, allo));
                System.out.print("Do you want continue ? (y / n)");
                check = input.readLine().toLowerCase();
                if (!check.equals("y") && !check.equals("n")) {
                    throw new ArithmeticException("Invalid value!");
                }
            }else{
                System.out.print("Enter amount of product:");
                int amounts = Integer.parseInt(input.readLine());
                if(amounts <= 0){
                    throw new ArithmeticException("Invalid value!");
                }
                arrPro.add(new ProductionStaff(amount, name, coef, amount, allo));
                System.out.print("Do you want continue ? (y/n)");
                check = input.readLine().toLowerCase();
                if (!check.equals("y") && !check.equals("n")) {
                    throw new ArithmeticException("Invalid value!");
                }
            }
        }
        double salaryTrade = 0;
        double salaryPro = 0;
        int countTrade = 0;
        int countPro = 0;
        System.out.println("-----------------------------------------");
        
        //Calculate actual income and show information of business staff
        for(BusinessStaff bus : arrBus){
            bus.DisplayInfoEmployee();
            salaryTrade += bus.calculateActualIncome();
            countTrade ++;
        }
      //Calculate actual income and show information of production staff
        for(ProductionStaff pro: arrPro){
            pro.DisplayInfoEmployee();
            salaryPro += pro.calculateActualIncome();
            countPro ++;
        }
        System.out.println("-----------------------------------------");
        //Display salary of business staff and production staff
        if(countTrade != 0){
            System.out.println(String.format("Average salary of Business staff: %.0f", (salaryTrade / countTrade)));
        }
        if(countPro != 0){
            System.out.println(String.format("Average salary of production staff: %.0f", (salaryPro / countPro)));
        }
    } catch (IOException | NumberFormatException | ArithmeticException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
	}

}

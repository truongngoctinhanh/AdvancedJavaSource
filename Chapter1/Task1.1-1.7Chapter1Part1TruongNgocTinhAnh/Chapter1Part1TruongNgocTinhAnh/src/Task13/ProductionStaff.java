package Task13;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare production staff object and override calculateIncome method
 */
import Task6.Employee;

public class ProductionStaff extends Employee{
	final double RATEBONUS = 0.05;
    final int AMOUNT = 1000;
    private int amount;

    public ProductionStaff() {
    }

    public ProductionStaff(int amount, String name, double coefficient, int amountOfPeople,
			double allowance) {
        super(name, coefficient, amountOfPeople, allowance);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    //Function for calculate salary of production employee
    @Override
    public double calculateIncome() {
        double bonus = (this.amount - this.AMOUNT) * this.RATEBONUS;
        return super.calculateIncome() + bonus;
    }
    
  //Function for override DisplayInfoEmployee method
    @Override
    public void DisplayInfoEmployee(){
    	System.out.println("...................................................");
		System.out.println("Full name of Employee: " + this.name);
		System.out.println("Coefficient : " + this.coefficient);
		System.out.println("Amount of dependent people: " + this.amountOfPeople);
		System.out.println(String.format("Allowance:  %.0f ", this.allowance));
		System.out.println("Amount of product: " + this.amount);
	}
}

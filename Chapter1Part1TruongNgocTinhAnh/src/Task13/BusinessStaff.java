package Task13;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 1.0
 * Class for declare Business staff object and override calculateIncome method
 */
import Task6.Employee;

public class BusinessStaff extends Employee {
	private double salaryTrade;
    private double rateSalaryTrade;

    public BusinessStaff() {
    }

    public BusinessStaff(double salaryTrade, double rateSalaryTrade, String name, double coefficient, int amountOfPeople,
			double allowance) {
        super(name, coefficient, amountOfPeople, allowance);
        this.salaryTrade = salaryTrade;
        this.rateSalaryTrade = rateSalaryTrade;
    }

    public double getSalaryTrade() {
        return salaryTrade;
    }

    public void setSalaryTrade(double salaryTrade) {
        this.salaryTrade = salaryTrade;
    }

    public double getRateSalaryTrade() {
        return rateSalaryTrade;
    }

    public void setRateSalaryTrade(double rateSalaryTrade) {
        this.rateSalaryTrade = rateSalaryTrade;
    }
    
    
    //Function for calculate bonus salary
    public double calculateBonus(){
        return this.getSalaryTrade() * this.getRateSalaryTrade();
    }
    
    //Function for calculate salary
    @Override
    public double calculateIncome(){
        return super.calculateIncome() + this.calculateBonus();
    }
    
  //Function for override DisplayInfoEmployee method
    @Override
    public void DisplayInfoEmployee(){
    	System.out.println("...................................................");
		System.out.println("Full name of Employee: " + this.name);
		System.out.println("Coefficient : " + this.coefficient);
		System.out.println("Amount of dependent people: " + this.amountOfPeople);
		System.out.println(String.format("Allowance:  %.0f ", this.allowance));
		System.out.println("Business salary: " + this.salaryTrade);
		System.out.println("Rate of Business salary: " + this.rateSalaryTrade);
	}
}

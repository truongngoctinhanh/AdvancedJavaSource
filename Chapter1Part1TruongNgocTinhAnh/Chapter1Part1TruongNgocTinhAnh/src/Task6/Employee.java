package Task6;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for calculate monthly salary 
 */
public class Employee {
	protected String name;
	protected double coefficient;
	protected int amountOfPeople;
	protected double allowance;
	final double AMOUNT0 = 1260000;
    final double AMOUNT1 = 9000000;
    final double AMOUNT2 = 3600000;
	
	public Employee(String name, double coefficient, int amountOfPeople,
			double allowance) {
		super();
		this.name = name;
		this.coefficient = coefficient;
		this.amountOfPeople = amountOfPeople;
		this.allowance = allowance;
	}
	
	public Employee() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
	public int getAmountOfPeople() {
		return amountOfPeople;
	}
	public void setAmountofpeople(int amountOfPeople) {
		this.amountOfPeople = amountOfPeople;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	//Function for calculate income
	public double calculateIncome(){
		double salary = 0;
		if(this.getCoefficient() < 0) throw new ArithmeticException("Coefficient is not valid!");
        if(this.getAllowance() < 0) throw new ArithmeticException("Allowance is not valid!");
        salary = this.getCoefficient() * AMOUNT0 + this.getAllowance();
        return salary;
	}
	
	//Function for calculate taxable income
	public double calculateTaxableIncome(){
		double salaryTax = 0;
		if(this.getAmountOfPeople() < 0) throw new ArithmeticException("Amount of people depend is not valid!");
        salaryTax = this.calculateIncome() - AMOUNT1 - this.getAmountOfPeople() * AMOUNT2;
        return salaryTax;
	}
	
	//Function for calculate personal income tax
	public double calculatePersonalIncomeTax(){
		double result = 0;
        double calcTaxableIncome = this.calculateTaxableIncome();
        if (calcTaxableIncome < PersonalIncomeTax.RATE1.getTaxableIncome()) {
            result = PersonalIncomeTax.RATE1.calculatePersonalIncomeTax(calcTaxableIncome);
        } else if (calcTaxableIncome < PersonalIncomeTax.RATE2.getTaxableIncome()) {
            result = PersonalIncomeTax.RATE2.calculatePersonalIncomeTax(calcTaxableIncome);
        }else if (calcTaxableIncome < PersonalIncomeTax.RATE3.getTaxableIncome()) {
            result = PersonalIncomeTax.RATE3.calculatePersonalIncomeTax(calcTaxableIncome);
        }else if (calcTaxableIncome < PersonalIncomeTax.RATE4.getTaxableIncome()) {
            result = PersonalIncomeTax.RATE4.calculatePersonalIncomeTax(calcTaxableIncome);
        }else if (calcTaxableIncome < PersonalIncomeTax.RATE5.getTaxableIncome()) {
            result = PersonalIncomeTax.RATE5.calculatePersonalIncomeTax(calcTaxableIncome);
        }else if (calcTaxableIncome < PersonalIncomeTax.RATE6.getTaxableIncome()) {
            result = PersonalIncomeTax.RATE6.calculatePersonalIncomeTax(calcTaxableIncome);
        }else{
            result = PersonalIncomeTax.RATE7.calculatePersonalIncomeTax(calcTaxableIncome);
        }
        return result;
	}
	
	//Function for calculate actual income
	public double calculateActualIncome(){
		double salary = 0;
		salary = this.calculateIncome() - this.calculatePersonalIncomeTax();
		return salary;
	}
	
	public void DisplayInfoEmployee(){
		System.out.println("Full name of Employee: " + this.name);
		System.out.println("Coefficient : " + this.coefficient);
		System.out.println("Amount of dependent people: " + this.amountOfPeople);
		System.out.println("Allowance: " + this.allowance);
	}
}

package Task2;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 - 08 -2016
 * Version: 01
 * Class for calculation 2 numbers (Addition, Subtraction, Multiplication, Division)
 */
public class Calculation {
	int number1;
	int number2;
	public Calculation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	public Calculation() {
		super();
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	//Function for the Addition of 2 numbers
	public int addTwoNumbers(){
		int sum;
		sum = number1 + number2;
		return sum;
	}
	
	//Function for the Subtract of 2 numbers
	public int subtractTwoNumbers(){
		int sub;
		sub = number1 - number2;
		return sub;
	}
	
	//Function for the Multiplication of 2 numbers
	public int multiTwoNumbers(){
		int mul;
		mul = number1 * number2;
		return mul;
	}
	
	//Function for the Division of 2 numbers
	public double divideTwoNumbers(){
		if(number2 == 0) throw new ArithmeticException("divide by zero");
		double div;		
		div = number1 / number2;
		return div;
	}
}

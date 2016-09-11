/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 18 - 08 -2016
 * Version: 01
 * Class for calculation roots of SuperlativeEquation
 */
public class Task1SuperlativeEquation {
	int a;
	int b;
	public Task1SuperlativeEquation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Task1SuperlativeEquation() {
		super();
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	//Function calculate root in Superlative Equation
	public double calculate(){
		double x = 0;
		if(a == 0)
			if(b == 0)
				x = 999999;
			else
				x = -999999;
		else{
			x = -b/a;
		}
		return x;	
	}
}

package Task10;
/**
 * Author: Truong Ngoc Tinh Anh 
 * Date: 23 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate the salary of Teacher
 * Input: coefficientsOfSalary, allowance
 * Output: salary of Teacher
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestSalary {

Teacher tea = new Teacher();
	
	//Test for calculate the GPA of Student
	@Test
	public void tess1(){
		tea.setCoefficientsOfSalary(3);;
		tea.setAllowance(1000000);
		double ac = tea.calculateSalary();
		double ex = 4780000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess2(){
		tea.setCoefficientsOfSalary(2.67);;
		tea.setAllowance(1400000);
		double ac = tea.calculateSalary();
		double ex = 4764200;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess3(){
		tea.setCoefficientsOfSalary(3.01);;
		tea.setAllowance(1510000);
		double ac = tea.calculateSalary();
		double ex = 5302600;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess4(){
		tea.setCoefficientsOfSalary(2.88);;
		tea.setAllowance(1980000);
		double ac = tea.calculateSalary();
		double ex = 5608800;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess5(){
		tea.setCoefficientsOfSalary(1.97);;
		tea.setAllowance(1066000);
		double ac = tea.calculateSalary();
		double ex = 3548200;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess6(){
		tea.setCoefficientsOfSalary(3);;
		tea.setAllowance(1000000);
		double ac = tea.calculateSalary();
		double ex = 47800000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess7(){
		tea.setCoefficientsOfSalary(2.67);;
		tea.setAllowance(1400000);
		double ac = tea.calculateSalary();
		double ex = 47642000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess8(){
		tea.setCoefficientsOfSalary(3.01);;
		tea.setAllowance(1510000);
		double ac = tea.calculateSalary();
		double ex = 5312600;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess9(){
		tea.setCoefficientsOfSalary(2.88);;
		tea.setAllowance(1980000);
		double ac = tea.calculateSalary();
		double ex = 5618800;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void tess10(){
		tea.setCoefficientsOfSalary(1.97);;
		tea.setAllowance(1166000);
		double ac = tea.calculateSalary();
		double ex = 3548200;
		assertEquals(ex, ac, 0);
	}

}

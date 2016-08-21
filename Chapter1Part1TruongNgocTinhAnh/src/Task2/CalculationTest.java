package Task2;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 18 -08 - 2016
 * Version: 01
 * UnitTest for calculation 2 numbers (Addition, Subtraction, Multiplication, Division)
 * Input: number1, number2
 * Output: Addition of 2 numbers, Subtract of 2 numbers, Multiplication of 2 numbers, Division of 2 numbers
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {
	Calculation cal = new Calculation();
	
	//Test for Addition of 2 numbers
	@Test
	public void testAddition1() {
		cal.setNumber1(0);
		cal.setNumber2(0);
		int ac = cal.addTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition2() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		int ac = cal.addTwoNumbers();
		int ex = -11;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition3() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		int ac = cal.addTwoNumbers();
		int ex = -1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition4() {
		cal.setNumber1(-1);
		cal.setNumber2(0);
		int ac = cal.addTwoNumbers();
		int ex = -1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition5() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		int ac = cal.addTwoNumbers();
		int ex = 6;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition6() {
		cal.setNumber1(0);
		cal.setNumber2(0);
		int ac = cal.addTwoNumbers();
		int ex = -1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition7() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		int ac = cal.addTwoNumbers();
		int ex = -10;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition8() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		int ac = cal.addTwoNumbers();
		int ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition9() {
		cal.setNumber1(-1);
		cal.setNumber2(0);
		int ac = cal.addTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testAddition10() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		int ac = cal.addTwoNumbers();
		int ex = 5;
		assertEquals(ex, ac, 0);
	}
	
	
	//Test for Subtraction of 2 numbers
	@Test
	public void testSubtraction1() {
		cal.setNumber1(0);
		cal.setNumber2(0);
		int ac = cal.subtractTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction2() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		int ac = cal.subtractTwoNumbers();
		int ex = -9;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction3() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		int ac = cal.subtractTwoNumbers();
		int ex = 1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction4() {
		cal.setNumber1(-1);
		cal.setNumber2(0);
		int ac = cal.subtractTwoNumbers();
		int ex = -1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction5() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		int ac = cal.subtractTwoNumbers();
		int ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction6() {
		cal.setNumber1(0);
		cal.setNumber2(0);
		int ac = cal.subtractTwoNumbers();
		int ex = -1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction7() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		int ac = cal.subtractTwoNumbers();
		int ex = -10;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction8() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		int ac = cal.subtractTwoNumbers();
		int ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction9() {
		cal.setNumber1(-1);
		cal.setNumber2(0);
		int ac = cal.subtractTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testSubtraction10() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		int ac = cal.subtractTwoNumbers();
		int ex = 5;
		assertEquals(ex, ac, 0);
	}
	
		
	//Test for Multiplication of 2 numbers
	@Test
	public void testMultiplication1() {
		cal.setNumber1(0);
		cal.setNumber2(0);
		int ac = cal.multiTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication2() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		int ac = cal.multiTwoNumbers();
		int ex = 10;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication3() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		int ac = cal.multiTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication4() {
		cal.setNumber1(-1);
		cal.setNumber2(0);
		int ac = cal.multiTwoNumbers();
		int ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication5() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		int ac = cal.multiTwoNumbers();
		int ex = 8;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication6() {
		cal.setNumber1(0);
		cal.setNumber2(0);
		int ac = cal.multiTwoNumbers();
		int ex = -1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication7() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		int ac = cal.multiTwoNumbers();
		int ex = -10;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication8() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		int ac = cal.multiTwoNumbers();
		int ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication9() {
		cal.setNumber1(-1);
		cal.setNumber2(0);
		int ac = cal.multiTwoNumbers();
		int ex = 1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMultiplication10() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		int ac = cal.multiTwoNumbers();
		int ex = 6;
		assertEquals(ex, ac, 0);
	}
				
	//Test for Division of 2 numbers
	@Test
	public void testDivision1() {
		cal.setNumber1(0);
		cal.setNumber2(1);
		double ac = cal.divideTwoNumbers();
		double ex = 0;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision2() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		double ac = cal.divideTwoNumbers();
		double ex = 10;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision3() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		double ac = cal.divideTwoNumbers();
		double ex = 0;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision4() {
		cal.setNumber1(-1);
		cal.setNumber2(-1);
		double ac = cal.divideTwoNumbers();
		double ex = 1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision5() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		double ac = cal.divideTwoNumbers();
		double ex = 2;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision6() {
		cal.setNumber1(0);
		cal.setNumber2(1);
		double ac = cal.divideTwoNumbers();
		double ex = -1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision7() {
		cal.setNumber1(-10);
		cal.setNumber2(-1);
		double ac = cal.divideTwoNumbers();
		double ex = -10;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision8() {
		cal.setNumber1(0);
		cal.setNumber2(-1);
		double ac = cal.divideTwoNumbers();
		double ex = 2;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision9() {
		cal.setNumber1(-1);
		cal.setNumber2(-1);
		double ac = cal.divideTwoNumbers();
		double ex = 0;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDivision10() {
		cal.setNumber1(4);
		cal.setNumber2(2);
		double ac = cal.divideTwoNumbers();
		double ex = 1;
		assertEquals(ex, ac, 0.01);
	}
}

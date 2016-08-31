package Task9;
/**
 * Author: Truong Ngoc Tinh Anh 
 * Date: 22 -08 - 2016
 * Version: 1.0
 * UnitTest for calculate the money of Computer
 * Input: UnitPrice, NumOfImport
 * Output: total of money
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Task9Test {

	Computer com = new Computer();
	@Test
	public void test1(){
		com.setUnitPrice(10000);
		com.setNumOfImport(10);
		double ac = com.calculateMoney();
		double ex = 100000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2(){
		com.setUnitPrice(15000);
		com.setNumOfImport(8);
		double ac = com.calculateMoney();
		double ex = 120000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3(){
		com.setUnitPrice(10500);
		com.setNumOfImport(10);
		double ac = com.calculateMoney();
		double ex = 105000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4(){
		com.setUnitPrice(20000);
		com.setNumOfImport(50);
		double ac = com.calculateMoney();
		double ex = 1000000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5(){
		com.setUnitPrice(21000);
		com.setNumOfImport(100);
		double ac = com.calculateMoney();
		double ex = 2100000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6(){
		com.setUnitPrice(10000);
		com.setNumOfImport(10);
		double ac = com.calculateMoney();
		double ex = 1000000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test7(){
		com.setUnitPrice(15000);
		com.setNumOfImport(8);
		double ac = com.calculateMoney();
		double ex = 1200000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test8(){
		com.setUnitPrice(10500);
		com.setNumOfImport(10);
		double ac = com.calculateMoney();
		double ex = 1050000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test9(){
		com.setUnitPrice(20000);
		com.setNumOfImport(50);
		double ac = com.calculateMoney();
		double ex = 10000000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test10(){
		com.setUnitPrice(21000);
		com.setNumOfImport(100);
		double ac = com.calculateMoney();
		double ex = 21000000;
		assertEquals(ex, ac, 0);
	}
}

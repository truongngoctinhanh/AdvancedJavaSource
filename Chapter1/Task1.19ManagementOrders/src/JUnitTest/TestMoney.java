package JUnitTest;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 29-August-2016 8:37:39 AM
 * @JUnit test for calculate money
 * @Input: quantity, name of product, price
 * @Output: money
 * 
 */
import static org.junit.Assert.*;


import org.junit.Test;

import ManagementOrder.OrderDetail;
import ManagementOrder.Product;

public class TestMoney {

	
	OrderDetail de = new OrderDetail();
	@Test
	public void test1() {
		de.setQuantity(1);
		de.setM_Product(new Product("Banana", 10000));
		double ex = 10000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test2() {
		de.setQuantity(2);
		de.setM_Product(new Product("grape", 10000));
		double ex = 20000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test3() {
		de.setQuantity(3);
		de.setM_Product(new Product("Candy", 10000));
		double ex = 30000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test4() {
		de.setQuantity(4);
		de.setM_Product(new Product("Mango", 10000));
		double ex = 40000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test5() {
		de.setQuantity(5);
		de.setM_Product(new Product("Water", 10000));
		double ex = 50000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test6() {
		de.setQuantity(1);
		de.setM_Product(new Product("Banana", 10000));
		double ex = 11000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test7() {
		de.setQuantity(2);
		de.setM_Product(new Product("Candy", 10000));
		double ex = 21000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test8() {
		de.setQuantity(3);
		de.setM_Product(new Product("Grape", 10000));
		double ex = 31000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test9() {
		de.setQuantity(4);
		de.setM_Product(new Product("Mango", 10000));
		double ex = 41000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void test10() {
		de.setQuantity(5);
		de.setM_Product(new Product("Water", 10000));
		double ex = 51000;
		double ac = de.calLineTotal();
		assertEquals(ex, ac, 0.01);
	}

}

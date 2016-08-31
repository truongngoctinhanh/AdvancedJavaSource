package Task12;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 24 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate fee of text book
 * Input: quantity, status, unit price of text book
 * Output: fee of text book
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestTextBook {

	TextBook tex = new TextBook();
	@Test
	public void testTextBook1() {
		tex.setStatus(0);
		tex.setQuantity(10);
		tex.setUnitPrice(11000);
		double ac = tex.calculateFee();
		double ex = 110000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook2() {
		tex.setStatus(0);
		tex.setQuantity(12);
		tex.setUnitPrice(12000);
		double ac = tex.calculateFee();
		double ex = 144000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook3() {
		tex.setStatus(1);
		tex.setQuantity(10);
		tex.setUnitPrice(11000);
		double ac = tex.calculateFee();
		double ex = 55000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook4() {
		tex.setStatus(1);
		tex.setQuantity(12);
		tex.setUnitPrice(12000);
		double ac = tex.calculateFee();
		double ex = 72000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook5() {
		tex.setStatus(1);
		tex.setQuantity(32);
		tex.setUnitPrice(14400);
		double ac = tex.calculateFee();
		double ex = 230400;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook6() {
		tex.setStatus(0);
		tex.setQuantity(10);
		tex.setUnitPrice(11000);
		double ac = tex.calculateFee();
		double ex = 115000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook7() {
		tex.setStatus(0);
		tex.setQuantity(12);
		tex.setUnitPrice(12000);
		double ac = tex.calculateFee();
		double ex = 240500;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook8() {
		tex.setStatus(1);
		tex.setQuantity(10);
		tex.setUnitPrice(11000);
		double ac = tex.calculateFee();
		double ex = 55200;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook9() {
		tex.setStatus(1);
		tex.setQuantity(12);
		tex.setUnitPrice(12000);
		double ac = tex.calculateFee();
		double ex = 122000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testTextBook10() {
		tex.setStatus(1);
		tex.setQuantity(32);
		tex.setUnitPrice(145000);
		double ac = tex.calculateFee();
		double ex = 240000;
		assertEquals(ex, ac, 0.01);
	}
}

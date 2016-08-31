package Task12;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 24 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate fee of reference book
 * Input: quantity, unit price, tax
 * Output: fee of reference book
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestReferenceBook {
	ReferenceBook ref = new ReferenceBook();
	@Test
	public void testReferenceBook1() {
		ref.setQuantity(10);
		ref.setUnitPrice(11000);;
		ref.setTax(0.1);
		double ac = ref.calculateFee();
		double ex = 121000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook2() {
		ref.setQuantity(16);
		ref.setUnitPrice(9500);;
		ref.setTax(0.6);
		double ac = ref.calculateFee();
		double ex = 243200;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook3() {
		ref.setQuantity(21);
		ref.setUnitPrice(14500);;
		ref.setTax(0.3);
		double ac = ref.calculateFee();
		double ex = 395850;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook4() {
		ref.setQuantity(31);
		ref.setUnitPrice(16800);;
		ref.setTax(0.5);
		double ac = ref.calculateFee();
		double ex = 781200;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook5() {
		ref.setQuantity(23);
		ref.setUnitPrice(12200);;
		ref.setTax(0.7);
		double ac = ref.calculateFee();
		double ex = 477020;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook6() {
		ref.setQuantity(10);
		ref.setUnitPrice(11000);;
		ref.setTax(0.1);
		double ac = ref.calculateFee();
		double ex = 121000;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook7() {
		ref.setQuantity(16);
		ref.setUnitPrice(9500);;
		ref.setTax(0.6);
		double ac = ref.calculateFee();
		double ex = 243200;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook8() {
		ref.setQuantity(21);
		ref.setUnitPrice(14500);;
		ref.setTax(0.3);
		double ac = ref.calculateFee();
		double ex = 395850;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook9() {
		ref.setQuantity(31);
		ref.setUnitPrice(16800);;
		ref.setTax(0.5);
		double ac = ref.calculateFee();
		double ex = 781200;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testReferenceBook10() {
		ref.setQuantity(23);
		ref.setUnitPrice(12200);;
		ref.setTax(0.7);
		double ac = ref.calculateFee();
		double ex = 477020;
		assertEquals(ex, ac, 0.01);
	}
}

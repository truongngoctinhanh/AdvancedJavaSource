package Task18;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 23 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate the fee of gift
 * Input: weight of gift
 * Output: total fee
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestFee {
	GiftBox gb = new GiftBox("Circle", "red");
	
	@Test
	public void testFee1() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 200);
	double ac = inner.calFee();
	double ex = 50000;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee2() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 300);
	double ac = inner.calFee();
	double ex = 70000;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee3() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 100);
	double ac = inner.calFee();
	double ex = 30000;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee4() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 111);
	double ac = inner.calFee();
	double ex = 32200;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee5() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 498);
	double ac = inner.calFee();
	double ex = 109600;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee6() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 200);
	double ac = inner.calFee();
	double ex = 55000;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee7() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 300);
	double ac = inner.calFee();
	double ex = 70010;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee8() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 100);
	double ac = inner.calFee();
	double ex = 30200;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee9() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 111);
	double ac = inner.calFee();
	double ex = 32600;
	assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testFee10() {
	GiftBox.Gift inner = gb.new Gift("Birthday", 498);
	double ac = inner.calFee();
	double ex = 109500;
	assertEquals(ex, ac, 0.01);
	}
}

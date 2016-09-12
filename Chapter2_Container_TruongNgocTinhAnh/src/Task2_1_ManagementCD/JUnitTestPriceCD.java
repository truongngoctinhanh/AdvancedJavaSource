package Task2_1_ManagementCD;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 08 - 09 - 2016
 * Version: 1.0
 * UnitTest for calculate money of book
 * Input: price of books
 * Output: money
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JUnitTestPriceCD {
	List<ManagementCD> arrayCD = new ArrayList<ManagementCD>();
	
	@Test
	public void testMoneyCD1() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		arrayCD.add(cd1);
		double ex = 20000;
		double ac = cd1.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD2() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 4, 15000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		double ex = 35000;
		double ac = cd1.getPrice() + cd2.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD3() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 4, 15000);
		ManagementCD cd3 = new ManagementCD("3", "CD 3", "ANH", 4, 18000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		arrayCD.add(cd3);
		double ex = 53000;
		double ac = cd1.getPrice() + cd2.getPrice() + cd3.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD4() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 5, 22000);
		ManagementCD cd3 = new ManagementCD("3", "CD 3", "ANH", 4, 18000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		arrayCD.add(cd3);
		double ex = 60000;
		double ac = cd1.getPrice() + cd2.getPrice() + cd3.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD5() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 44000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 4, 35000);
		ManagementCD cd3 = new ManagementCD("3", "CD 3", "ANH", 2, 18000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		arrayCD.add(cd3);
		double ex = 97000;
		double ac = cd1.getPrice() + cd2.getPrice() + cd3.getPrice();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testMoneyCD6() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		arrayCD.add(cd1);
		double ex = 18000;
		double ac = cd1.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD7() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 4, 15000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		double ex = 37000;
		double ac = cd1.getPrice() + cd2.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD8() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 4, 15000);
		ManagementCD cd3 = new ManagementCD("3", "CD 3", "ANH", 4, 18000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		arrayCD.add(cd3);
		double ex = 55000;
		double ac = cd1.getPrice() + cd2.getPrice() + cd3.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD9() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 20000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 5, 22000);
		ManagementCD cd3 = new ManagementCD("3", "CD 3", "ANH", 4, 18000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		arrayCD.add(cd3);
		double ex = 61000;
		double ac = cd1.getPrice() + cd2.getPrice() + cd3.getPrice();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testMoneyCD10() {
		ManagementCD cd1 = new ManagementCD("1", "CD 1", "ANH", 3, 44000);
		ManagementCD cd2 = new ManagementCD("2", "CD 2", "ANH", 4, 35000);
		ManagementCD cd3 = new ManagementCD("3", "CD 3", "ANH", 2, 18000);
		arrayCD.add(cd1);
		arrayCD.add(cd2);
		arrayCD.add(cd3);
		double ex = 98000;
		double ac = cd1.getPrice() + cd2.getPrice() + cd3.getPrice();
		assertEquals(ex, ac, 0);
	}
}

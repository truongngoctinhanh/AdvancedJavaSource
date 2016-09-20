package PartII_JDBC.JUnitTest;
/**
 * Author: TruongNgocTinhAnh 
 * Date: 20 - 09 - 2016
 * Version: 1.0
 * UnitTest for test searchCDByPrice() method
 * Input: price of CD
 * Output: size of list
 */
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import PartII_JDBC.CD;
import PartII_JDBC.CDController;

public class TestSearchCDByPrice {

	CDController control = new CDController();

	@Test
	public void test1() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(70000);
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(20000);
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(41000);
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(10000);
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void test5() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(100000);
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(21000);
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(26000);
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(33000);
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(44000);
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByPrice(37000);
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}


}

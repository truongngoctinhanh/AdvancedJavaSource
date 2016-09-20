package PartII_JDBC.JUnitTest;
/**
 * Author: TruongNgocTinhAnh 
 * Date: 20 - 09 - 2016
 * Version: 1.0
 * UnitTest for test searchCDByName() method
 * Input: name of CD
 * Output: size of list
 */
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import PartII_JDBC.CD;
import PartII_JDBC.CDController;

public class TestSearchByName {
	CDController control = new CDController();

	@Test
	public void test1() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove2");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove4");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove5");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove1");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void test5() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove3");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove11");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove0");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove12");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove13");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDByName("Mylove15");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}

}

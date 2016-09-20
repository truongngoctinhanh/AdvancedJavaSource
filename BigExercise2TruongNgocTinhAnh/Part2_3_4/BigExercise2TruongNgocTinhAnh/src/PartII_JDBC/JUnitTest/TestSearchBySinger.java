package PartII_JDBC.JUnitTest;
/**
 * Author: TruongNgocTinhAnh 
 * Date: 20 - 09 - 2016
 * Version: 1.0
 * UnitTest for test searchCDBySinger() method
 * Input: singer
 * Output: size of list
 */
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import PartII_JDBC.CD;
import PartII_JDBC.CDController;

public class TestSearchBySinger {

	CDController control = new CDController();

	@Test
	public void test1() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("anh");
		int ex = 4;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Anh");
		int ex = 4;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("TrongAnh");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Lena");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void test5() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Hari");
		int ex = 1;
		int ac = list.size();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Mimi");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Sumi");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Rumi");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Ben");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() throws ClassNotFoundException, SQLException {

		List<CD> list = control.searchCDBySinger("Bep");
		int ex = 1;
		int ac = list.size();
		assertNotEquals(ex, ac, 0);
	}


}

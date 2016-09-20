package PartII_JDBC.JUnitTest;
/**
 * Author: TruongNgocTinhAnh 
 * Date: 20 - 09 - 2016
 * Version: 1.0
 * UnitTest for test getAllCD() method
 * Input: list of CD
 * Output: true or false
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import PartII_JDBC.CD;
import PartII_JDBC.CDController;

public class TestGetAllCD {

	CDController controller = new CDController();

	@Test
	public void test1() {
		List<CD> list = new ArrayList<>();
		list.add(new CD(2, "Mylove2", "anh", 15, 10000));
		list.add(new CD(4, "Mylove4", "Lena", 6, 100000));
		list.add(new CD(5, "Mylove5", "QuynhAnh", 1, 41000));
		list.add(new CD(6, "Mylove", "Hari", 4, 20000));
		list.add(new CD(7, "Mylove1", "Anh", 3, 35000));
		list.add(new CD(8, "Mylove3", "TrongAnh", 1, 70000));
		List<CD> list1 = controller.getAllCD();
		boolean ac = true;
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(list1.get(i)))
				ac = false;
		}
		assertTrue(ac);
	}
	
	@Test
	public void test2() {
		List<CD> list = new ArrayList<>();
		list.add(new CD(2, "Mylove2", "anh", 15, 10000));
		list.add(new CD(4, "Mylove4", "Lena", 6, 100000));
		list.add(new CD(5, "Mylove5", "QuynhAnh", 1, 41000));
		list.add(new CD(6, "Mylove", "Hari", 4, 20000));
		list.add(new CD(7, "Mylove1", "Anh", 3, 35000));
		list.add(new CD(8, "Mylove3", "TrongAnh", 1, 70000));
		List<CD> list1 = controller.getAllCD();
		boolean ac = true;
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(list1.get(i)))
				ac = false;
		}
		assertFalse(ac);
	}
}

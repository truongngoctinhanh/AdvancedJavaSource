package PartIV_Stream.JUnitTest;
/**
 * Author: TruongNgocTinhAnh 
 * Date: 20 - 09 - 2016
 * Version: 1.0
 * UnitTest for test countEmployee() method (count amount of employee with salary > 3000000)
 * Input: list Employee
 * Output: amount of employee with salary > 3000000
 */
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import PartIV_Stream.Employee;
import PartIV_Stream.HandlingEmployee;

public class TestCount {
	HandlingEmployee han = new HandlingEmployee();
	
	@Test
	public void test1() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));
		list.add(new Employee("Nguyen Van Minh", 22, 2000000));
		list.add(new Employee("Nguyen Hoang Phu Tien", 29, 3800000));
		list.add(new Employee("Nguyen Van Nhut", 24, 3200000));
		list.add(new Employee("Nguyen Minh Nhut", 22, 4100000));
		list.add(new Employee("Huynh Tan Hoa", 22, 500000));
		int ex = 11;
		int ac = han.countEmployee(list);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		int ex = 3;
		int ac = han.countEmployee(list);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		int ex = 5;
		int ac = han.countEmployee(list);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));		
		int ex = 8;
		int ac = han.countEmployee(list);
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test5() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();		
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));
		list.add(new Employee("Nguyen Van Minh", 22, 2000000));
		list.add(new Employee("Nguyen Hoang Phu Tien", 29, 3800000));
		list.add(new Employee("Nguyen Van Nhut", 24, 3200000));
		list.add(new Employee("Nguyen Minh Nhut", 22, 4100000));
		list.add(new Employee("Huynh Tan Hoa", 22, 500000));
		int ex = 6;
		int ac = han.countEmployee(list);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));
		list.add(new Employee("Nguyen Van Minh", 22, 2000000));
		list.add(new Employee("Nguyen Hoang Phu Tien", 29, 3800000));
		list.add(new Employee("Nguyen Van Nhut", 24, 3200000));
		list.add(new Employee("Nguyen Minh Nhut", 22, 4100000));
		list.add(new Employee("Huynh Tan Hoa", 22, 500000));
		int ex = 10;
		int ac = han.countEmployee(list);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		int ex = 1;
		int ac = han.countEmployee(list);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		int ex = 3;
		int ac = han.countEmployee(list);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Truong Ngoc Tinh Anh", 23, 5000000));
		list.add(new Employee("Truong Thi Thanh Thao ", 23, 51000000));
		list.add(new Employee("Bui Thi Thuy Quynh", 22, 5500000));
		list.add(new Employee("Le Phuong Thanh", 23, 3500000));
		list.add(new Employee("Pham Thi Kim Hien", 24, 4500000));
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));		
		int ex = 5;
		int ac = han.countEmployee(list);
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test10() throws ClassNotFoundException, SQLException {
		List<Employee> list = new ArrayList<>();		
		list.add(new Employee("Nguyen Quoc Huy", 24, 1800000));
		list.add(new Employee("Dao Duc Nha", 23, 6500000));
		list.add(new Employee("Nguyen Trong Thuan", 22, 10000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2900000));
		list.add(new Employee("Nguyen Minh Quan", 22, 9500000));
		list.add(new Employee("Nguyen Van Minh", 22, 2000000));
		list.add(new Employee("Nguyen Hoang Phu Tien", 29, 3800000));
		list.add(new Employee("Nguyen Van Nhut", 24, 3200000));
		list.add(new Employee("Nguyen Minh Nhut", 22, 4100000));
		list.add(new Employee("Huynh Tan Hoa", 22, 500000));
		int ex = 4;
		int ac = han.countEmployee(list);
		assertNotEquals(ex, ac, 0);
	}
}

package Task10;
/**
 * Author: Truong Ngoc Tinh Anh  
 * Date: 23 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate the GPA of Student
 * Input: PointOfSemester1, PointOfSemester2
 * Output: GPA of Student
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestGPA {

Student std = new Student();

	//Test for calculate the GPA of Student
	@Test
	public void tess1(){
		std.setPointOfSemester1(10);
		std.setPointOfSemester2(5);
		double ac = std.calculateGPA();
		double ex = 7.5;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess2(){
		std.setPointOfSemester1(9.8);
		std.setPointOfSemester2(8);
		double ac = std.calculateGPA();
		double ex = 8.9;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess3(){
		std.setPointOfSemester1(9.1);
		std.setPointOfSemester2(8.2);
		double ac = std.calculateGPA();
		double ex = 8.65;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess4(){
		std.setPointOfSemester1(6.5);
		std.setPointOfSemester2(7.8);
		double ac = std.calculateGPA();
		double ex = 7.15;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess5(){
		std.setPointOfSemester1(2.8);
		std.setPointOfSemester2(8.3);
		double ac = std.calculateGPA();
		double ex = 5.55;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess6(){
		std.setPointOfSemester1(10);
		std.setPointOfSemester2(5);
		double ac = std.calculateGPA();
		double ex = 7.57;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess7(){
		std.setPointOfSemester1(9.8);
		std.setPointOfSemester2(8);
		double ac = std.calculateGPA();
		double ex = 8.92;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess8(){
		std.setPointOfSemester1(9.1);
		std.setPointOfSemester2(8.2);
		double ac = std.calculateGPA();
		double ex = 8.62;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess9(){
		std.setPointOfSemester1(6.5);
		std.setPointOfSemester2(7.8);
		double ac = std.calculateGPA();
		double ex = 7.17;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void tess10(){
		std.setPointOfSemester1(2.8);
		std.setPointOfSemester2(8.3);
		double ac = std.calculateGPA();
		double ex = 5.50;
		assertEquals(ex, ac, 0.01);
	}

}

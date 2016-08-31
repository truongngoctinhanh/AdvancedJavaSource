package Task5;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 -08 - 2016
 * Version: 01
 * UnitTest for calculate the perimeter and area of Rectangle
 * Input: point A, point C
 * Output: perimeter and area of Rectangle
 */
import static org.junit.Assert.*;

import org.junit.Test;

import Task3.Point;

public class Task5RunTest {
	//UnitTest for calculate the perimeter of Rectangle
	@Test
	public void testPerimeter1() {
		Point A = new Point(1,1);
		Point C = new Point(3,3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 8;
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testPerimeter2() {
		Point A = new Point(1,5);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 14;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter3() {
		Point A = new Point(-1,2);
		Point C = new Point(4,-2);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 18;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter4() {
		Point A = new Point(-5,0);
		Point C = new Point(0,-3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 16;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter5() {
		Point A = new Point(-2,-4);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 18;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter6() {
		Point A = new Point(1,1);
		Point C = new Point(3,3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 5;
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testPerimeter7() {
		Point A = new Point(1,5);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 12;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter8() {
		Point A = new Point(-1,2);
		Point C = new Point(4,-2);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 19;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter9() {
		Point A = new Point(-5,0);
		Point C = new Point(0,-3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 17;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter10() {
		Point A = new Point(-2,-4);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculatePerimeter();
		double ex = 15;
		assertEquals(ex, ac, 0.01);
	}
	
	//UnitTest for calculate the area of Rectangle
	@Test
	public void testArea1() {
		Point A = new Point(1,1);
		Point C = new Point(3,3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 4;
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea2() {
		Point A = new Point(1,5);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 10;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea3() {
		Point A = new Point(-1,2);
		Point C = new Point(4,-2);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 20;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea4() {
		Point A = new Point(-5,0);
		Point C = new Point(0,-3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 15;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea5() {
		Point A = new Point(-2,-4);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 20;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea6() {
		Point A = new Point(1,1);
		Point C = new Point(3,3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 5;
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea7() {
		Point A = new Point(1,5);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 12;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea8() {
		Point A = new Point(-1,2);
		Point C = new Point(4,-2);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 11;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea9() {
		Point A = new Point(-5,0);
		Point C = new Point(0,-3);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 10;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea10() {
		Point A = new Point(-2,-4);
		Point C = new Point(3,0);
		PerimeterAreaRectangle pa = new PerimeterAreaRectangle(A,C);
		double ac = pa.calculateArea();
		double ex = 21;
		assertEquals(ex, ac, 0.01);
	}
}

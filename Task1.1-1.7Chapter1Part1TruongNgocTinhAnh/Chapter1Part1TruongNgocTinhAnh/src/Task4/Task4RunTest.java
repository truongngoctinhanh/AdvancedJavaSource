package Task4;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 -08 - 2016
 * Version: 01
 * UnitTest for calculate the perimeter and area of Circle
 * Input: point 1, point 2
 * Output: perimeter and area of Circle
 */
import static org.junit.Assert.*;

import org.junit.Test;

import Task3.Distance;
import Task3.Point;

public class Task4RunTest {

	//UnitTest for calculate the perimeter of Circle
	@Test
	public void testPerimeter1() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 6.28;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter2() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,4);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 19.86;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter3() {
		Point p1 = new Point(-2,-1);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 14.04;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter4() {
		Point p1 = new Point(0,-3);
		Point p2 = new Point(3,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 26.66;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter5() {
		Point p1 = new Point(5,4);
		Point p2 = new Point(-8,1);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 83.83;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter6() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter7() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,4);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 19.84;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter8() {
		Point p1 = new Point(-2,-1);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 14.07;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter9() {
		Point p1 = new Point(0,-3);
		Point p2 = new Point(3,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 26.65;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter10() {
		Point p1 = new Point(5,4);
		Point p2 = new Point(-8,1);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getPerimeter();
		double ex = 83.82;
		assertEquals(ex, ac, 0.01);
	}
	
	//UnitTest for calculate the area of Circle
	
	@Test
	public void testArea1() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 3.14;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea2() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,4);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 31.41;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea3() {
		Point p1 = new Point(-2,-1);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 15.7;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea4() {
		Point p1 = new Point(0,-3);
		Point p2 = new Point(3,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 56.55;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea5() {
		Point p1 = new Point(5,4);
		Point p2 = new Point(-8,1);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 559.23;
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea6() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea7() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,4);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 19.84;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea8() {
		Point p1 = new Point(-2,-1);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 14.07;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea9() {
		Point p1 = new Point(0,-3);
		Point p2 = new Point(3,0);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 26.65;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea10() {
		Point p1 = new Point(5,4);
		Point p2 = new Point(-8,1);
		Distance dis = new Distance(p1, p2);
		PerimeterAreaCircle pa = new PerimeterAreaCircle(dis);
		double ac = pa.getArea();
		double ex = 83.82;
		assertEquals(ex, ac, 0.01);
	}
}

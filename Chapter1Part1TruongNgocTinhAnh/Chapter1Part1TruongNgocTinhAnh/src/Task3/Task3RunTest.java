package Task3;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 18 -08 - 2016
 * Version: 01
 * UnitTest for calculate the distance of 2 points
 * Input: point A, point B
 * Output: distance of 2 points A and B
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Task3RunTest {
	
	//UnitTest for calculate the distance of 2 points
	@Test
	public void testDistance1() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 0;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance2() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,2);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 2.23;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance3() {
		Point p1 = new Point(-1,-4);
		Point p2 = new Point(2,3);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 7.61;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance4() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,3);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 3;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance5() {
		Point p1 = new Point(-2,0);
		Point p2 = new Point(1,2);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 3.6;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance6() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 0.1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance7() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,2);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 2.21;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance8() {
		Point p1 = new Point(-1,-4);
		Point p2 = new Point(2,3);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 7.65;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance9() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,3);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 0;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testDistance10() {
		Point p1 = new Point(-2,0);
		Point p2 = new Point(1,2);
		Distance dis = new Distance(p1, p2);
		double ac = dis.getDistance();
		double ex = 3;
		assertEquals(ex, ac, 0.01);
	}
}

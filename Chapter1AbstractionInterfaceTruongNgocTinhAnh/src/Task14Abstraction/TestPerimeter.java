package Task14Abstraction;
/**
 * Author: Truong Ngoc Tinh Anh 
 * Date: 23 -08 - 2016
 * Version: 1.0
 * UnitTest for calculate the perimeter of shape
 * Input: Circle: radius | Rectangle: height, width | Square: sideOfSquare
 * Output: perimeter
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerimeter {
	
	//Unit test for perimeter of circle
	Circle cir = new Circle();
	@Test
	public void testCircle1() {
		cir.setRadius(3);
		double ac = cir.calPerimeter();
		double ex = 18.85;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle2() {
		cir.setRadius(3.2);
		double ac = cir.calPerimeter();
		double ex = 20.1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle3() {
		cir.setRadius(1);
		double ac = cir.calPerimeter();
		double ex = 6.28;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle4() {
		cir.setRadius(5);
		double ac = cir.calPerimeter();
		double ex = 31.41;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle5() {
		cir.setRadius(1.8);
		double ac = cir.calPerimeter();
		double ex = 11.31;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle6() {
		cir.setRadius(3);
		double ac = cir.calPerimeter();
		double ex = 18.88;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle7() {
		cir.setRadius(3.25);
		double ac = cir.calPerimeter();
		double ex = 20.1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle8() {
		cir.setRadius(1);
		double ac = cir.calPerimeter();
		double ex = 6.22;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle9() {
		cir.setRadius(5);
		double ac = cir.calPerimeter();
		double ex = 31.44;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCircle10() {
		cir.setRadius(1.8);
		double ac = cir.calPerimeter();
		double ex = 11.36;
		assertEquals(ex, ac, 0.01);
	}
	
	//Unit test for perimeter of rectangle
	Rectangle rec = new Rectangle();
	@Test
	public void testRectangle1() {
		rec.setWidth(2);
		rec.setHeight(4);
		double ac = rec.calPerimeter();
		double ex = 12;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle2() {
		rec.setWidth(1);
		rec.setHeight(7.1);
		double ac = rec.calPerimeter();
		double ex = 16.2;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle3() {
		rec.setWidth(1.6);
		rec.setHeight(3.7);
		double ac = rec.calPerimeter();
		double ex = 10.6;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle4() {
		rec.setWidth(7.5);
		rec.setHeight(3);
		double ac = rec.calPerimeter();
		double ex = 21;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle5() {
		rec.setWidth(3.44);
		rec.setHeight(1);
		double ac = rec.calPerimeter();
		double ex = 8.88;
		assertEquals(ex, ac, 0.01);
	}
	
	
	@Test
	public void testRectangle6() {
		rec.setWidth(2);
		rec.setHeight(4);
		double ac = rec.calPerimeter();
		double ex = 12.9;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle7() {
		rec.setWidth(1);
		rec.setHeight(7.1);
		double ac = rec.calPerimeter();
		double ex = 16.5;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle8() {
		rec.setWidth(1.6);
		rec.setHeight(3.7);
		double ac = rec.calPerimeter();
		double ex = 10.8;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle9() {
		rec.setWidth(7.5);
		rec.setHeight(3);
		double ac = rec.calPerimeter();
		double ex = 21.3;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testRectangle10() {
		rec.setWidth(3.44);
		rec.setHeight(1);
		double ac = rec.calPerimeter();
		double ex = 8.98;
		assertEquals(ex, ac, 0.01);
	}
	
	//Unit test for perimeter of square
	Square squ = new Square();
	@Test
	public void testSquare1() {
		squ.setSideOfSquare(4);
		double ac = squ.calPerimeter();
		double ex = 16;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare2() {
		squ.setSideOfSquare(1);
		double ac = squ.calPerimeter();
		double ex = 4;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare3() {
		squ.setSideOfSquare(3.3);
		double ac = squ.calPerimeter();
		double ex = 13.2;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare4() {
		squ.setSideOfSquare(5.8);
		double ac = squ.calPerimeter();
		double ex = 23.2;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare5() {
		squ.setSideOfSquare(1.9);
		double ac = squ.calPerimeter();
		double ex = 7.6;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare6() {
		squ.setSideOfSquare(4);
		double ac = squ.calPerimeter();
		double ex = 16.1;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare7() {
		squ.setSideOfSquare(1);
		double ac = squ.calPerimeter();
		double ex = 4.2;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare8() {
		squ.setSideOfSquare(3.3);
		double ac = squ.calPerimeter();
		double ex = 13.221;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare9() {
		squ.setSideOfSquare(5.8);
		double ac = squ.calPerimeter();
		double ex = 23.322;
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testSquare10() {
		squ.setSideOfSquare(1.9);
		double ac = squ.calPerimeter();
		double ex = 7.81;
		assertEquals(ex, ac, 0.01);
	}

}

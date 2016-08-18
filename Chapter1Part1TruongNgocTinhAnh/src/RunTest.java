import static org.junit.Assert.*;

import java.nio.charset.spi.CharsetProvider;

import org.junit.Test;


public class RunTest {

	Task1SuperlativeEquation equation = new Task1SuperlativeEquation();
	
	@Test
    public void test1(){
		equation.setA(0);
		equation.setB(0);
        double ac = equation.calculate();
        double ex = 999999;
        assertEquals(ex, ac, 0);
    }
	
	@Test
    public void test2(){
		equation.setA(0);
		equation.setB(3);
        double ac = equation.calculate();
        double ex = -999999;
        assertEquals(ex, ac, 0);
    }

	@Test
    public void test3(){
		equation.setA(2);
		equation.setB(4);
        double ac = equation.calculate();
        double ex = -2;
        assertEquals(ex, ac, 0);
    }
	@Test
    public void test4(){
		equation.setA(-1);
		equation.setB(0);
        double ac = equation.calculate();
        double ex = 0;
        assertEquals(ex, ac, 0);
    }
	@Test
    public void test5(){
		equation.setA(0);
		equation.setB(-1);
        double ac = equation.calculate();
        double ex = -999999;
        assertEquals(ex, ac, 0);
    }
	
	@Test
    public void test6(){
		equation.setA(0);
		equation.setB(0);
        double ac = equation.calculate();
        double ex = -999999;
        assertEquals(ex, ac, 0);
    }
	
	@Test
    public void test7(){
		equation.setA(0);
		equation.setB(3);
        double ac = equation.calculate();
        double ex = 999999;
        assertEquals(ex, ac, 0);
    }

	@Test
    public void test8(){
		equation.setA(2);
		equation.setB(4);
        double ac = equation.calculate();
        double ex = 2;
        assertEquals(ex, ac, 0);
    }
	@Test
    public void test9(){
		equation.setA(-1);
		equation.setB(0);
        double ac = equation.calculate();
        double ex = -1;
        assertEquals(ex, ac, 0);
    }
	@Test
    public void test10(){
		equation.setA(0);
		equation.setB(-1);
        double ac = equation.calculate();
        double ex = 0;
        assertEquals(ex, ac, 0);
    }
}

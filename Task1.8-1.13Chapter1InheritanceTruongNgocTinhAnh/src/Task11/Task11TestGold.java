package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 24 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate money of Gold
 * Input: quantity
 * Output: money of Gold
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Task11TestGold {

	Gold gold = new Gold();
    @Test
    public void testCalcGold1(){
        gold.setQuantity(1);
        double ex = 3500000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold2(){
        gold.setQuantity(2);
        double ex = 7000000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold3(){
        gold.setQuantity(3);
        double ex = 10500000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold4(){
        gold.setQuantity(4);
        double ex = 14000000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold5(){
        gold.setQuantity(5);
        double ex = 17500000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold6(){
        gold.setQuantity(6);
        double ex = 21000000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold7(){
        gold.setQuantity(7);
        double ex = 24500000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold8(){
        gold.setQuantity(8);
        double ex = 28000000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold9(){
        gold.setQuantity(9);
        double ex = 31500000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalcGold10(){
        gold.setQuantity(10);
        double ex = 35000000;
        double ac = gold.calculateMoney(1);
        assertEquals(ex, ac, 0);
    }

}

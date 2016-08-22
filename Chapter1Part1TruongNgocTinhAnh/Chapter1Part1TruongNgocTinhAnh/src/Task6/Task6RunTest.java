package Task6;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 19 -08 - 2016
 * Version: 01
 * UnitTest for calculate the actual income of a person
 * Input: name, coefficient, amount of dependent people, allowance
 * Output: actual income of a person
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Task6RunTest {
Employee sal = new Employee();
    @Test
    public void testSalary1(){
        sal.setCoefficient(2.67);
        sal.setAmountofpeople(1);;
        sal.setAllowance(12000000);
        double ex = 15225990;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);        
    }
    @Test
    public void testSalary2(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(2);
    	sal.setAllowance(100000000);
        double ex = 82158000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary3(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(3);
    	sal.setAllowance(100000000);
        double ex = 83418000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary4(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(4);
    	sal.setAllowance(100000000);
        double ex = 84634000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary5(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(5);
    	sal.setAllowance(100000000);
        double ex = 85714000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary6(){
        sal.setCoefficient(2);;
        sal.setAmountofpeople(1);;
        sal.setAllowance(100000000);
        double ex = 808980000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);        
    }
    @Test
    public void testSalary7(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(2);
    	sal.setAllowance(100000000);
        double ex = 821580000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary8(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(3);
    	sal.setAllowance(100000000);
        double ex = 834180000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary9(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(4);
    	sal.setAllowance(100000000);
        double ex = 846340000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testSalary10(){
    	sal.setCoefficient(2);
    	sal.setAmountofpeople(5);
    	sal.setAllowance(100000000);
        double ex = 857140000;
        double ac = sal.calculateActualIncome();
        assertEquals(ex, ac, 0);
    }
}

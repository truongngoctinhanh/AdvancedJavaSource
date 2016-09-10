package Task3_2;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 09- 09 -2016
 * @Version: 01
 * @Class for calculate money (use lambda expression)
 */
public class CalculateMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		List<Integer> amounts = Arrays.asList(new Integer[]{2, 3, 5, 7, });		
		int price = 5200;
		
		amounts.forEach(element -> {
			System.out.println("Total money = " + price * element + " vnd");
		});
		}catch(NullPointerException | ArithmeticException ex){
			System.out.println("Error: " + ex.getMessage());
		}
	}

}

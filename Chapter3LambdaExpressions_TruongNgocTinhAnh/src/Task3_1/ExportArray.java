package Task3_1;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 09- 09 -2016
 * @Version: 01
 * @Class for export element in array (use lambda expression)
 */
import java.util.Arrays;
import java.util.List;

public class ExportArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Default list elements in array
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		//export elements in array 
		list.forEach (n -> System.out.println(n));
	}

}

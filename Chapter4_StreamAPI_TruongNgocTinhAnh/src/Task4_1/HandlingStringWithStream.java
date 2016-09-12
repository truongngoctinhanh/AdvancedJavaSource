package Task4_1;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 12- 09 -2016
 * @Version: 01
 * @Class for handling String with Stream
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandlingStringWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Default a list with 15 elements
		List<String> list1 = Arrays.asList("anh", "truong", "ngoc", "tinh", "", "happy", 
				"12", "heo", "tinhanh", "quynh12", "truongngocquynhhuong", "abc", "", " ", "@#");
		
		//Display list1
		System.out.println("List 1 is: " + list1);
		
		//Count number of element is empty
		int count1 = (int) list1.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Number of element is empty : " + count1);
		
		//Count number of element has length >= 5
		int count2 = (int) list1.stream().filter(string -> string.length() >= 5).count();
		System.out.println("Number of element has length >= 5 : " + count2);
	
		//Count number of element begins with the value a
		int count3 = (int) list1.stream().filter(string -> string.contains("a")).count();
		System.out.println("Number of element begins with the value a : " + count3);
		
		//Count number of elements of the exact value is "happy"
		int count4 = (int) list1.stream().filter(string -> string.equals("happy")).count();
		System.out.println("Number of elements of the exact value is happy : " + count4);
		
		//Create list 2 not contain element empty
		List<String> list2 = list1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("List 2 is: " + list2);

		//Create list 3 contain element has length >= 3 and <= 6
		List<String> list3 = list1.stream().filter(string -> string.length() >= 3 && string.length() <= 6)
						.collect(Collectors.toList());
		System.out.println("List 3 is: " + list3);
	
		//Create list 4 with elements add string "happy"
		List<String> list4 = list1.stream().map(string -> string.concat("happy")).collect(Collectors.toList());
		System.out.println("List 4 is: " + list4);
	}

}

package PartIII_StringSort;
/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for sort string (using lambda)
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortByLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Truong Ngoc Tinh Anh");
		list.add("Thanh Thao");
		list.add("Le Phuong Thanh");
		list.add("Quynh Anh");
		list.add("Rubi");
		list.add("Trong Anh");
		
		// Ascending sorted according to string length
		Collections.sort(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println("---Ascending sort according to string length");
		for(String str : list){
			System.out.println(str);
		}
		
		// Descending sorted according to string length
		Collections.sort(list, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
		System.out.println("---Descending sort according to string length");
		for(String str : list){
			System.out.println(str);
		}
		
		// Sorted by alphabet
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		System.out.println("---Sorted by alphabet");
		for(String str : list){
			System.out.println(str);
		}
	}

}

package Task4_2;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 12- 09 -2016
 * @Version: 01
 * @Class for handling number with Stream
 */
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HandlingNumberWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Default a list with 15 elements
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, 13, 14, 15);

		// Display list 1
		System.out.println("List 1 is: " + list1);

		// Create list 2 contain element by the square of the elements in the
		// list 1
		List<Integer> list2 = list1.stream().map(i -> i * i)
				.collect(Collectors.toList());
		System.out.println("List 2 is: " + list2);

		// Statistics list 2
		IntSummaryStatistics stats = list2.stream().mapToInt((x) -> x)
				.summaryStatistics();
		System.out.println("Highest number in List: " + stats.getMax());
		System.out.println("Lowest number in List: " + stats.getMin());
		System.out.println("Sum of all numbers: " + stats.getSum());
		System.out.println("Average of all numbers: " + stats.getAverage());

		// Create list 3 is prime
		List<Integer> list3 = list2.stream().filter(i -> isPrime(i))
				.collect(Collectors.toList());
		System.out.println("List 3 is: " + list3);

		// Create list 2 contain element is the square numbers
		List<Integer> list4 = list1.stream().filter(i -> isSquareNumber(i))
				.collect(Collectors.toList());
		System.out.println("List 4 is: " + list4);
	}

	/**
	 * @Function for check element is prime
	 * @Input: element
	 * @Output: true or false
	 */
	public static boolean isPrime(int number) {
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index == 0);
	}

	/**
	 * @Function for check element is square number
	 * @Input: element
	 * @Output: true or false
	 */
	public static boolean isSquareNumber(int n) {
		int temp = (int)Math.sqrt(n);
	    return (temp * temp == n);
	}
}

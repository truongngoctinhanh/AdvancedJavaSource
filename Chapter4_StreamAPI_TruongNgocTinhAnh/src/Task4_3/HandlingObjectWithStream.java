package Task4_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 12- 09 -2016
 * @Version: 01
 * @Class for handling Student object with Stream
 */
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandlingObjectWithStream {
	public static void main(String[] args) {
		//Default list information of student
		List<Student> student = Arrays.asList(new Student("Tinh"," Anh", 23, 8.0, 9.0),
		new Student("Minh"," Tuan", 24, 7.0, 9.0),
		new Student("Trong"," Thuan", 22, 8.5, 9.5),
		new Student("Kim"," Hien", 20, 8.5, 9.0),
		new Student("Huong"," Giang", 24, 6.0, 7.5),
		new Student("Quynh"," Anh", 16, 8.5, 9.5),
		new Student("Thanh"," Thao", 23, 8.0, 9.0),
		new Student("Thuy"," Quynh", 15, 5.0, 5.5),
		new Student("Phuong"," Thanh", 22, 8.5, 7.5),
		new Student("Tan"," Hoa	", 15, 8.0, 6.5));
		
		Stream<Student> stream = student.stream();
		
		//Display information of student
		stream.forEach(st -> st.display());
		
		//Count number of student have old >= 18
		int countAge = (int) student.stream().filter(st -> st.getAge() >= 18).count();
		System.out.println("Number of student have old >= 18: " + countAge);
		
		//Count number of student have first name start 'H'
		int countName = (int) student.stream().filter(st -> st.getFirstname().startsWith("H")).count();
		System.out.println("Number of student have first name start 'H': " + countName);
		
		//Display List of student have first name start 'H'
		List<Student> result = student.stream().filter(st -> st.getFirstname().startsWith("H")).collect(Collectors.toList());
		System.out.println("List of student have first name start 'H': "); 
		result.forEach(st -> st.display());
		
		//Statistics student have highest average mark, lowest average mark, sum of all average mark, average of all average mark
		DoubleSummaryStatistics stats = student.stream().mapToDouble(st -> st.calculateAverage()).summaryStatistics();
		System.out.println("Highest average mark in List: " + stats.getMax());
		System.out.println("Lowest average mark in List: " + stats.getMin());
		System.out.println("Sum of all average mark: " + stats.getSum());
		System.out.println("Average of all average mark: " + stats.getAverage());
		
		//Display list of very good students
		List<Student> goodStudent = student.stream().filter(st -> st.calculateAverage() >= 8).collect(Collectors.toList());
		System.out.println("List of very good students: "); 
		goodStudent.forEach(st -> st.display());
	}
}

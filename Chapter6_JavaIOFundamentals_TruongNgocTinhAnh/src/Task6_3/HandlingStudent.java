package Task6_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14- 09 -2016
 * @Version: 01
 * @Class for handling management student and statistic student
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandlingStudent {

	/**
	 * @Function for read content from file tongketnamhoc.txt
	 * @Input: file tongketnamhoc.txt
	 * @Output: none
	 */
	public List<Student> readFile() {
		List<Student> student = new ArrayList<>();
		String name;
		int grade;
		double mark1;
		double mark2;
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/Task6_3/tongketnamhoc.txt")))) {
			while (in.available() > 0) {
				name = in.readUTF();
				grade = in.readInt();
				mark1 = in.readDouble();
				mark2 = in.readDouble();
				Student st = new Student(name, grade, mark1, mark2);
				student.add(st);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return student;
	}

	/**
	 * @Function for write content from file tongketnamhoc.txt
	 * @Input: content
	 * @Output: file tongketnamhoc.txt
	 */
	public void writeFile(Student student) {
		String name = student.getName();
		int grade = student.getGrade();
		double mark1 = student.getMark1();
		double mark2 = student.getMark2();
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/Task6_3/tongketnamhoc.txt", true)))) {
			out.writeUTF(name);
			out.writeInt(grade);
			out.writeDouble(mark1);
			out.writeDouble(mark2);
			System.out.println("Adding complete!");
			out.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	/**
	 * @Function for add new information of student
	 * @Input: information of student
	 * @Output: none
	 */
	public Student addStudent() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter information of student: ");
		System.out.print("Enter name of student: ");
		String name = input.readLine();
		System.out.print("Enter grade: ");
		int grade = Integer.parseInt(input.readLine());
		System.out.print("Enter mark of semester 1: ");
		Double mark1 = Double.parseDouble(input.readLine());
		System.out.print("Enter mark of semester 2: ");
		Double mark2 = Double.parseDouble(input.readLine());
		Student student = new Student(name, grade, mark1, mark2);
		return student;
	}

	/**
	 * @Function for statistic by learning outcomes of student
	 * @Input: information of students
	 * @Output: statistic result
	 */
	public static void statisticStudent(List<Student> student) {
		List<Student> lst10 = student.stream()
				.filter(st -> st.getGrade() == 10).collect(Collectors.toList());
		List<Student> lst11 = student.stream()
				.filter(st -> st.getGrade() == 11).collect(Collectors.toList());
		List<Student> lst12 = student.stream()
				.filter(st -> st.getGrade() == 12).collect(Collectors.toList());

		int count10 = 0;
		int count11 = 0;
		int count12 = 0;

		double sumMark10 = 0;
		double sumMark11 = 0;
		double sumMark12 = 0;

		System.out
				.println("------------------- Grade 10 -------------------");
		for (Object o : lst10) {
			Student st = (Student) o;
			st.displayInfoStudent();
			count10++;
			sumMark10 += st.calAverageMark();
		}

		System.out
				.println("------------------- Grade 11 -------------------");
		for (Object o : lst11) {
			Student st = (Student) o;
			st.displayInfoStudent();
			count11++;
			sumMark11 += st.calAverageMark();
		}

		System.out
				.println("------------------- Grade 12 -------------------");
		for (Object o : lst12) {
			Student st = (Student) o;
			st.displayInfoStudent();
			count12++;
			sumMark12 += st.calAverageMark();
		}

		System.out
				.println("-----------------------------------------------");
		Stream<Student> studentGood = student.stream();
		System.out.println("Number of good student : "
				+ studentGood.filter(st -> st.calAverageMark() >= 8).count());

		Stream<Student> studentFairly = student.stream();
		System.out.println("Number of fairly student: "
				+ studentFairly
						.filter(st -> (st.calAverageMark() >= 7 && st
								.calAverageMark() < 8)).count());

		Stream<Student> studentModerate = student.stream();
		System.out.println("Number of moderate student: "
				+ studentModerate
						.filter(st -> (st.calAverageMark() >= 5 && st
								.calAverageMark() < 7)).count());

		Stream<Student> studentWeak = student.stream();
		System.out.println("Number of weak student: "
				+ studentWeak.filter(st -> st.calAverageMark() < 5).count());

		System.out
				.println("---------------------------------------------------------");
		System.out.println("Number of student of grade 10: " + count10);
		System.out.println("The average GPA of grade 10: " + sumMark10 / count10);
		System.out
				.println("----------------------------------------------------------");
		System.out.println("Number of student of grade 11: " + count11);
		System.out.println("The average GPA of grade 10: " + sumMark11 / count11);
		System.out
				.println("----------------------------------------------------------");
		System.out.println("Number of student of grade 12: " + count12);
		System.out.println("The average GPA of grade 10: " + sumMark12 / count12);
	}
}

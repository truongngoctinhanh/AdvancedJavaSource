package Task6_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14- 09 -2016
 * @Version: 01
 * @Class for declare Student object
 */
import java.text.DecimalFormat;

public class Student {
	private String name;
	private int grade;
	private double mark1;
	private double mark2;
	
	
	public Student() {
		super();
	}

	public Student(String name, int grade, double mark1, double mark2) {
		super();
		this.name = name;
		this.grade = grade;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	/**
	 * @Function for calculate GPA
	 * @Input: mark1, mark2
	 * @Output: GPA
	 */
	public double calAverageMark(){
		return (mark1 + mark2 * 2) / 3;
	}
	
	/**
	 * @Function for display Information of Student
	 * @Input: none
	 * @Output: information
	 */
	public void displayInfoStudent(){
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("--------------------------------------------");
		System.out.println("Full name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Mark of semester 1: " + mark1);
		System.out.println("Mark of semester 2: " + mark2);
		System.out.println("GPA: " + Double.parseDouble(df.format(calAverageMark())));
	}
}

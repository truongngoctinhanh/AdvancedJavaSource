package Task2_3_ManagementStudent;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 07- 09 -2016
 * @Version: 01
 * @Class for management student
 */
public class Student {
	public String name;
	public int age;
	public String placeOfBirth;
	public Student(String name, int age, String placeOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.placeOfBirth = placeOfBirth;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	/**
	 * @Function for display information of student
	 * @Input: none
	 * @Output: information of student
	 */
	public String displayInfoStudent(){
        return this.name + " | Age: " + this.age + " | Place of birth: " + this.placeOfBirth;
    }
}

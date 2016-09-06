package ManagementScore;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:10 AM
 * @class for declare state of Student class
 */
public class Student extends Information {

	public String dayOfBirth;
	public FinalScore m_TestScore;

	public Student(){

	}

	public Student(String name, String dayOfBirth, String email, String phone) {
		super(email, name, phone);
		this.dayOfBirth = dayOfBirth;
	}
	public Student(String name, String dayOfBirth, String email, String phone, FinalScore m_TestScore) {
		super(email, name, phone);
		this.dayOfBirth = dayOfBirth;
		this.m_TestScore = m_TestScore;
	}
	
	public Student(FinalScore m_TestScore) {
		super();
		this.m_TestScore = m_TestScore;
	}
	public String getDayOfBirth() {
		return dayOfBirth;
	}


	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}


	public FinalScore getM_TestScore() {
		return m_TestScore;
	}


	public void setM_TestScore(FinalScore m_TestScore) {
		this.m_TestScore = m_TestScore;
	}


	public void finalize() throws Throwable {
		super.finalize();
	}
	
	/**
	 * @Function for display information of student
	 * @Input: none
	 * @Output: information of student
	 */	
	public void displayInfoStudent(){
		System.out.println(this.name + 
				" | Date of birth: " + this.dayOfBirth + "\nEmail: " + this.email +
				" | Phone: " + this.phone );
	}
	
	
}
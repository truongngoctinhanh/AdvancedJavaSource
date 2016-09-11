package ManagementScore;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:05 AM
 * @class for declare state of Subject class
 */
public class Subject {

	public String endDay;
	public String homeroomTeacher;
	public String nameOfSubject;
	public int numOfLesson;
	public String startDay;
	public FinalScore m_TestScore;

	public Subject(){

	}

	
	public Subject(String endDay, String homeroomTeacher, String nameOfSubject, int numOfLesson, String startDay,
			FinalScore m_TestScore) {
		super();
		this.endDay = endDay;
		this.homeroomTeacher = homeroomTeacher;
		this.nameOfSubject = nameOfSubject;
		this.numOfLesson = numOfLesson;
		this.startDay = startDay;
		this.m_TestScore = m_TestScore;
	}

	public Subject(String endDay, String homeroomTeacher, String nameOfSubject, int numOfLesson, String startDay) {
		super();
		this.endDay = endDay;
		this.homeroomTeacher = homeroomTeacher;
		this.nameOfSubject = nameOfSubject;
		this.numOfLesson = numOfLesson;
		this.startDay = startDay;
	}
	
	public String getEndDay() {
		return endDay;
	}


	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}


	public String getHomeroomTeacher() {
		return homeroomTeacher;
	}


	public void setHomeroomTeacher(String homeroomTeacher) {
		this.homeroomTeacher = homeroomTeacher;
	}


	public String getNameOfSubject() {
		return nameOfSubject;
	}


	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}


	public int getNumOfLesson() {
		return numOfLesson;
	}


	public void setNumOfLesson(int numOfLesson) {
		this.numOfLesson = numOfLesson;
	}


	public String getStartDay() {
		return startDay;
	}


	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}


	public FinalScore getM_TestScore() {
		return m_TestScore;
	}


	public void setM_TestScore(FinalScore m_TestScore) {
		this.m_TestScore = m_TestScore;
	}

	/**
	 * @Function for display information of student
	 * @Input: none
	 * @Output: information of student
	 */	
	public String displayInfoSubject(){
		
		return "Name of subject: " + nameOfSubject + " - teacher: " + homeroomTeacher + " - start date: " + startDay
				+ " - end date: " + endDay;
	}
}
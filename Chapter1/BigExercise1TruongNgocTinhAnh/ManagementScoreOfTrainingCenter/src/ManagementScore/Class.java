package ManagementScore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:07 AM
 */
public class Class {

	public String endDay;
	public String idContract;
	public String nameOfClass;
	public String startDay;
	public int totalNumOfLesson;
	public ArrayList<Subject> m_Subject;
	public ArrayList<Student> m_Student;
	public List<FinalScore> list;
	public Class(){

	}

	
	public String getEndDay() {
		return endDay;
	}


	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}


	public String getIdContract() {
		return idContract;
	}


	public void setIdContract(String idContract) {
		this.idContract = idContract;
	}


	public String getNameOfClass() {
		return nameOfClass;
	}


	public void setNameOfClass(String nameOfClass) {
		this.nameOfClass = nameOfClass;
	}


	public String getStartDay() {
		return startDay;
	}


	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}


	public int getTotalNumOfLesson() {
		return totalNumOfLesson;
	}


	public void setTotalNumOfLesson(int totalNumOfLesson) {
		this.totalNumOfLesson = totalNumOfLesson;
	}
	
	public ArrayList<Subject> getM_Subject() {
		return m_Subject;
	}


	public void setM_Subject(ArrayList<Subject> m_Subject) {
		this.m_Subject = m_Subject;
	}


	public ArrayList<Student> getM_Student() {
		return m_Student;
	}


	public void setM_Student(ArrayList<Student> m_Student) {
		this.m_Student = m_Student;
	}
	
	
	public List<FinalScore> getList() {
		return list;
	}


	public void setList(List<FinalScore> list) {
		this.list = list;
	}

	public Class(String endDay, String idContract, String nameOfClass, String startDay, int totalNumOfLesson,
			ArrayList<ManagementScore.Subject> m_Subject, ArrayList<ManagementScore.Student> m_Student) {
		super();
		this.endDay = endDay;
		this.idContract = idContract;
		this.nameOfClass = nameOfClass;
		this.startDay = startDay;
		this.totalNumOfLesson = totalNumOfLesson;
		this.m_Subject = m_Subject;
		this.m_Student = m_Student;
	}

}
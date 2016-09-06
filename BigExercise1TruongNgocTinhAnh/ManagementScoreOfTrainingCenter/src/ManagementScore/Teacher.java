package ManagementScore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:08 AM
 * @class for declare state of Teacher class
 */
public class Teacher extends Information {

	public List<Subject> ability = new ArrayList<>();
	public String typeOfTeacher;
	public Subject m_Subject;
	public Class m_Class;

	public Teacher(){

	}

	
	public Teacher(List<Subject> ability, String typeOfTeacher, Subject m_Subject, Class m_Class, String email, String name, String phone) {
		super(email, name, phone);
		this.ability = ability;
		this.typeOfTeacher = typeOfTeacher;
		this.m_Subject = m_Subject;
		this.m_Class = m_Class;
	}


	public List<Subject> getAbility() {
		return ability;
	}


	public void setAbility(List<Subject> ability) {
		this.ability = ability;
	}


	public String getTypeOfTeacher() {
		return typeOfTeacher;
	}


	public void setTypeOfTeacher(String typeOfTeacher) {
		this.typeOfTeacher = typeOfTeacher;
	}


	public Subject getM_Subject() {
		return m_Subject;
	}


	public void setM_Subject(Subject m_Subject) {
		this.m_Subject = m_Subject;
	}


	public Class getM_Class() {
		return m_Class;
	}


	public void setM_Class(Class m_Class) {
		this.m_Class = m_Class;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}
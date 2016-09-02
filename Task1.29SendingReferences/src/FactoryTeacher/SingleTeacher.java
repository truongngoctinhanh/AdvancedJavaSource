package FactoryTeacher;



/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 10:29:10 AM
 * @Class for declare teacher object
 */
public class SingleTeacher {

	private static SingleTeacher instance = new SingleTeacher();
	public SingleTeacher m_SingleTeacher;
	
	private SingleTeacher(){

	}

	public static SingleTeacher getInstance(){
		return instance;
	}

	public String shareDocument(){
		return "The references: \n - Chapter 1\n - Chapter 2\n - Chapter 3\n - Chapter4 ...";
	}
	
}
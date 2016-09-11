package ManagementScore;

import java.util.List;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:13 AM
 * @class for calculate score of test core
 */
public class FinalScore implements CalculateScore {

	public List<DailyScore> list;
	public double multipleChoiceTestScore;
	public double practiceScore;
	public Subject subject;
	public Student student;
	
	public FinalScore(){

	}
	
	public FinalScore(List<DailyScore> list, double multipleChoiceTestScore, double practiceScore, Subject subject,
			Student student) {
		super();
		this.list = list;
		this.multipleChoiceTestScore = multipleChoiceTestScore;
		this.practiceScore = practiceScore;
		this.subject = subject;
		this.student = student;
	}

	public List<DailyScore> getList() {
		return list;
	}

	public void setList(List<DailyScore> list) {
		this.list = list;
	}

	public double getMultipleChoiceTestScore() {
		return multipleChoiceTestScore;
	}

	public void setMultipleChoiceTestScore(double multipleChoiceTestScore) {
		this.multipleChoiceTestScore = multipleChoiceTestScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @Function for calculate average of all daily score
	 * @Output: score
	 */	
	public double calScore(){
		int count = 0;
		double temp = 0;
		for(DailyScore value : list){
			temp += value.calScore();
			count ++;
		}
		return temp / count;
	}
	
	/**
	 * @Function for calculate total score
	 * @Output: score
	 */	
	public double calTotalScore(){
		return calScore() * 0.3 + multipleChoiceTestScore * 0.4 + practiceScore * 0.3;
	}
	public void displayFinalScore(double fin) {
		System.out.println("Multiple Choice Test Score: " + this.multipleChoiceTestScore 
				+ " | Practice: " + this.practiceScore + "\nFinal Score: " + fin);
	}

}
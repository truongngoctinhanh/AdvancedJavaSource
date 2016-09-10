package ManagementScore;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:11 AM
 * @class for calculate score of daily core
 */
public class DailyScore implements CalculateScore {

	public double assignmentScore;
	public double diligenceScore;
	public double positiveScore;

	public DailyScore(){

	}

	
	public DailyScore(double assignmentScore, double diligenceScore, double positiveScore) {
		super();
		this.assignmentScore = assignmentScore;
		this.diligenceScore = diligenceScore;
		this.positiveScore = positiveScore;
	}

	
	public double getAssignmentScore() {
		return assignmentScore;
	}


	public void setAssignmentScore(double assignmentScore) {
		this.assignmentScore = assignmentScore;
	}


	public double getDiligenceScore() {
		return diligenceScore;
	}


	public void setDiligenceScore(double diligenceScore) {
		this.diligenceScore = diligenceScore;
	}


	public double getPositiveScore() {
		return positiveScore;
	}


	public void setPositiveScore(double positiveScore) {
		this.positiveScore = positiveScore;
	}


	public void finalize() throws Throwable {

	}

	/**
	 * @Function for calculate daily score
	 * @Input: positive score, diligence score, assignment score
	 * @Output: score
	 */
	public double calScore(){
		return this.assignmentScore * 0.6 + this.diligenceScore * 0.3 + this.positiveScore * 0.1;
	}
	
	public void displayDailyScore(double daily) {
		System.out.println("Positive score: " + this.positiveScore + " | Diligence score: " 
	+ this.diligenceScore + " | Assignment score: " + this.assignmentScore + "\nDaily Score: " + daily );
	}

}
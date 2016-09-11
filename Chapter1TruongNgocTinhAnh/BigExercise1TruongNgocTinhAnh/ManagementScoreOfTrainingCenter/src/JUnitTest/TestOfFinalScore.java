package JUnitTest;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:13 AM
 * @JUnit test for Final Score
 * @Input: list Daily score, practice Score, Multiple Choice Test Score Score
 * @Output: Final Score
 * 
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ManagementScore.DailyScore;
import ManagementScore.FinalScore;

public class TestOfFinalScore {
	FinalScore fin = new FinalScore();
	List<DailyScore> list = new ArrayList<>();
	
	@Test
	public void testFinalScore1() {
		DailyScore daily = new DailyScore(7, 2, 5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(8);
		fin.setPracticeScore(7.5);
		double expected = 5.3;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testFinalScore2() {
		DailyScore daily = new DailyScore(9, 5, 5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(5);
		fin.setPracticeScore(8.5);
		double expected = 7.39;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore3() {
		DailyScore daily = new DailyScore(8, 8, 5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(7);
		fin.setPracticeScore(6);
		double expected = 7.69;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore4() {
		DailyScore daily = new DailyScore(6, 9, 5.5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(9);
		fin.setPracticeScore(5);
		double expected = 6.84;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore5() {
		DailyScore daily = new DailyScore(7, 2, 9);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(8);
		fin.setPracticeScore(6);
		double expected = 5.7;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore6() {
		DailyScore daily = new DailyScore(7, 2, 5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(8);
		fin.setPracticeScore(7.5);
		double expected = 5.38;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testFinalScore7() {
		DailyScore daily = new DailyScore(9, 5, 5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(5);
		fin.setPracticeScore(8.5);
		double expected = 7.34;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore8() {
		DailyScore daily = new DailyScore(8, 8, 5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(7);
		fin.setPracticeScore(6);
		double expected = 7.71;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore9() {
		DailyScore daily = new DailyScore(6, 9, 5.5);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(9);
		fin.setPracticeScore(5);
		double expected = 6.88;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testFinalScore10() {
		DailyScore daily = new DailyScore(7, 2, 9);
		list.add(daily);
		fin.setList(list);
		fin.setMultipleChoiceTestScore(8);
		fin.setPracticeScore(6);
		double expected = 5.8;
		double actual = fin.calScore();
		assertEquals(expected, actual, 0.01);
	}
}

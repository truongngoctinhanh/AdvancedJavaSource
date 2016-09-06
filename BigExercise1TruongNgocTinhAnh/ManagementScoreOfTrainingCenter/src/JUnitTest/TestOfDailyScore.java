package JUnitTest;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 06-Sep-2016 9:19:13 AM
 * @JUnit test for Daily Score
 * @Input: Diligence Score, Assignment Score, Positive Score
 * @Output: Daily Score
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

import ManagementScore.DailyScore;

public class TestOfDailyScore {
	DailyScore daily = new DailyScore();
	@Test
	public void testDailyScore1() {
		daily.setDiligenceScore(0);
		daily.setAssignmentScore(0);
		daily.setPositiveScore(0);
		double expected = 0;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDailyScore2() {
		daily.setDiligenceScore(5);
		daily.setAssignmentScore(1);
		daily.setPositiveScore(9);
		double expected = 3;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testDailyScore3() {
		daily.setDiligenceScore(2);
		daily.setAssignmentScore(8);
		daily.setPositiveScore(9);
		double expected = 6.3;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDailyScore4() {
		daily.setDiligenceScore(10);
		daily.setAssignmentScore(8);
		daily.setPositiveScore(5);
		double expected = 8.3;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDailyScore5() {
		daily.setDiligenceScore(5);
		daily.setAssignmentScore(10);
		daily.setPositiveScore(9);
		double expected = 8.4;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testDailyScore6() {
		daily.setDiligenceScore(0);
		daily.setAssignmentScore(0);
		daily.setPositiveScore(0);
		double expected = 1;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDailyScore7() {
		daily.setDiligenceScore(5);
		daily.setAssignmentScore(1);
		daily.setPositiveScore(9);
		double expected = 3.2;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testDailyScore8() {
		daily.setDiligenceScore(2);
		daily.setAssignmentScore(8);
		daily.setPositiveScore(9);
		double expected = 6.1;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDailyScore9() {
		daily.setDiligenceScore(10);
		daily.setAssignmentScore(8);
		daily.setPositiveScore(5);
		double expected = 8.2;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testDailyScore10() {
		daily.setDiligenceScore(5);
		daily.setAssignmentScore(10);
		daily.setPositiveScore(9);
		double expected = 8.5;
		double actual = daily.calScore();
		assertEquals(expected, actual, 0.01);
	}
}

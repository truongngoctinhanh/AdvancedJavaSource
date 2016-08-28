package Task11;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 24 - 08 - 2016
 * Version: 1.0
 * UnitTest for calculate money buy of currency or money sell of currency
 * Input: kinds of currency
 * Output: money of currency
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Task11TestCurrency {

Currency cur = new Currency("001", "28/8", 1);

@Test
public void test1() {

	cur.setKindsOfCurrency("USD");
	double ac = cur.calculateMoneyBuy(1);
	double ex = 22250;
	assertEquals(ex, ac, 0);
}

@Test
public void test2() {

	cur.setKindsOfCurrency("USD");
	double ac = cur.calculateMoneySell(1);
	double ex = 24568.5;
	assertEquals(ex, ac, 0);
}

@Test
public void test3() {

	cur.setKindsOfCurrency("EUR");
	double ac = cur.calculateMoneyBuy(2);
	double ex = 24457;
	assertEquals(ex, ac, 0);
}

@Test
public void test4() {

	cur.setKindsOfCurrency("EUR");
	double ac = cur.calculateMoneySell(2);
	double ex = 27555.0;
	assertEquals(ex, ac, 0);
}

@Test
public void test5() {

	cur.setKindsOfCurrency("AUD");
	double ac = cur.calculateMoneyBuy(3);
	double ex = 16530;
	assertEquals(ex, ac, 0);
}

@Test
public void test6() {

	cur.setKindsOfCurrency("AUD");
	double ac = cur.calculateMoneySell(3);
	double ex = 18948.6;
	assertEquals(ex, ac, 0);
}

@Test
public void test7() {

	cur.setKindsOfCurrency("USD");
	double ac = cur.calculateMoneyBuy(1);
	double ex = 222250;
	assertEquals(ex, ac, 0);
}

@Test
public void test8() {

	cur.setKindsOfCurrency("USD");
	double ac = cur.calculateMoneySell(1);
	double ex = 124568.5;
	assertEquals(ex, ac, 0);
}

@Test
public void test9() {

	cur.setKindsOfCurrency("EUR");
	double ac = cur.calculateMoneyBuy(2);
	double ex = 244571;
	assertEquals(ex, ac, 0);
}

@Test
public void test10() {

	cur.setKindsOfCurrency("EUR");
	double ac = cur.calculateMoneySell(2);
	double ex = 275551.0;
	assertEquals(ex, ac, 0);
}

@Test
public void test11() {

	cur.setKindsOfCurrency("AUD");
	double ac = cur.calculateMoneyBuy(3);
	double ex = 165301;
	assertEquals(ex, ac, 0);
}

@Test
public void test12() {

	cur.setKindsOfCurrency("AUD");
	double ac = cur.calculateMoneySell(3);
	double ex = 118948.6;
	assertEquals(ex, ac, 0);
}
}
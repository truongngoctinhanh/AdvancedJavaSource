package Task5_4SharedCounterVariables;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13- 09 -2016
 * @Version: 01
 * @Class for shared Counter variables
 */
public class MainForSharedCounterVariavles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadCounter T1 =  new ThreadCounter(1);
		T1.start();
		Thread.sleep(1000);
		
		ThreadCounter T2 =  new ThreadCounter(1);
		T2.start();
		Thread.sleep(1000);
		
		ThreadCounter T3 =  new ThreadCounter(1);
		T3.start();
		Thread.sleep(1000);
		
		ThreadCounter T4 =  new ThreadCounter(1);
		T4.start();
		Thread.sleep(1000);
		
		ThreadCounter T5 =  new ThreadCounter(1);
		T5.start();
		Thread.sleep(1000);
		
		ThreadCounter T6 =  new ThreadCounter(1);
		T6.start();
		Thread.sleep(1000);
		
		ThreadCounter T7 =  new ThreadCounter(1);
		T7.start();
		Thread.sleep(1000);
		
		ThreadCounter T8 =  new ThreadCounter(1);
		T8.start();
		Thread.sleep(1000);
		
		ThreadCounter T9 =  new ThreadCounter(1);
		T9.start();
		Thread.sleep(1000);
		
		ThreadCounter T10 =  new ThreadCounter(1);
		T10.start();
		Thread.sleep(1000);
	}

}

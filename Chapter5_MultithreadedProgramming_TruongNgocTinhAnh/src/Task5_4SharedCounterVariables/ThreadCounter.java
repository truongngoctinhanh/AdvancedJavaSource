package Task5_4SharedCounterVariables;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13- 09 -2016
 * @Version: 01
 * @Class for declare Counter variables
 */

public class ThreadCounter extends Thread{
	private Thread t;
	private int Counter = 0;
	public ThreadCounter(int Counter) {
		this.Counter = Counter;
		
	}
	
	public synchronized int nextCounter() {
		return Counter++;
	}
	
	/**
	 * @Function for override run method
	 */
	@Override
	public void run() {
		System.out.println("Running " + Counter);
		try{
			for(int i =  3; i > 0; i--) {
				System.out.println("Thread: " + Counter + ",  " + i);
				//Let the thread sleep for a while.
				Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread " + Counter + "interrupted.");
		}	
		System.out.println("Thread " + Counter + " exiting.");
	}
	
	/**
	 * @Function for override start method
	 */
	@Override
	public void start() {
		System.out.println("Starting " + Counter);
		if(t == null) {
			t = new Thread (this);
			t.start();
		}
	}
}

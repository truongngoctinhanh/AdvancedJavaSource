package Task5_1MultithreadedApplications;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13- 09 -2016
 * @Version: 01
 * @Class for use Thread
 */
public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	
	ThreadDemo (String name) {
		threadName = name;
		System.out.println("Creating " + threadName);   
	}
	
	/**
	 * @Function for override run method
	 */
	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try{
			for(int i =  3; i > 0; i--) {
				System.out.println("Thread: " + threadName + ",  " + i);
				//Let the thread sleep for a while.
				Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread " + threadName + "interrupted.");
		}	
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	/**
	 * @Function for override start method
	 */
	@Override
	public void start() {
		System.out.println("Starting " + threadName);
		if(t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}
}

package Task5_1MultithreadedApplications;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13- 09 -2016
 * @Version: 01
 * @Class for demo Thread
 */
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo T1 =  new ThreadDemo("Google");
		T1.start();
		
		ThreadDemo T2 =  new ThreadDemo("Yahoo");
		T2.start();
		
		ThreadDemo T3 =  new ThreadDemo("Facebook");
		T3.start();

	}

}

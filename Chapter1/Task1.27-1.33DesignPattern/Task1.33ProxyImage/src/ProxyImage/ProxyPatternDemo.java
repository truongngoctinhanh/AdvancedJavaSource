package ProxyImage;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 10-Sep-2016 9:27:19 PM
 * @class main of demo
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		//image will be loaded from disk
		image.display();
		System.out.println("");
		//image will not be loaded from disk
		image.display();
	}

	public void finalize() throws Throwable {

	}

	public void main(){

	}

}
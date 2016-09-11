package ObserverTransaction;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 1:51:55 PM
 * @class for declare Observer
 */
public abstract class Observer {

	protected Account account;

	public Observer(){

	}

	public void finalize() throws Throwable {

	}

	public abstract String update();

}
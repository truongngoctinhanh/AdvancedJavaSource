package ObserverTransaction;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 1:51:59 PM
 * @class for declare class MobiObserver extends Observer
 */
public class MobiObserver extends Observer {

	public Account account;

	public MobiObserver(Account account){
		this.account = account;
		this.account.attach(this);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	
	@Override
	public String update(){
		return "Mobi: Hello. Your account was changed. \nCurrent balance is: " + account.getState() + " vnd";
	}

}
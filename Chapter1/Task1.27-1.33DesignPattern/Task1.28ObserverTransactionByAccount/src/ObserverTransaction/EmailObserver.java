package ObserverTransaction;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 1:51:58 PM
 */
public class EmailObserver extends Observer {

	public Account account;

	public EmailObserver(Account account){
		this.account = account;
		this.account.attach(this);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public String update(){
		return "Email: ABC Bank greetings to you. Your account was changed. \nCurrent balance is: " + account.getState() + " vnd";
	}

}
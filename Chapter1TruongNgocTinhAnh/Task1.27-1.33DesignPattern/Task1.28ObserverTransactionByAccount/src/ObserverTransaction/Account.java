package ObserverTransaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 1:51:57 PM
 * @class for declare account object
 */
public class Account {

	private List<Observer> observers = new ArrayList<>();
	private double state;

	public Account(){

	}

	public double getState(){
		return state;
	}

	public void setState(double state){
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}

	
	public void notifyAllObservers(){
		for (Observer observer : observers){
			observer.update();
		}
	}

	

}
package FactorySewingShop;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 3:52:25 PM
 * @class for implement interface FactoryAodai
 */
public class FactoryCheongsam implements FactoryAodai {

	public Cheongsam m_Cheongsam;

	public FactoryCheongsam(){

	}

	public void finalize() throws Throwable {

	}

	public AoDai getAodai(){
		return new Cheongsam();
	}

}
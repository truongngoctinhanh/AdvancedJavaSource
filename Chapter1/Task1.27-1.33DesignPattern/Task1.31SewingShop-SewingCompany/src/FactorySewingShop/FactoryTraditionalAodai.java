package FactorySewingShop;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 3:52:25 PM
 * @class for implement interface FactoryAodai
 */
public class FactoryTraditionalAodai implements FactoryAodai {

	public TraditionalAodai m_TraditionalAodai;

	public FactoryTraditionalAodai(){

	}

	public void finalize() throws Throwable {

	}

	public AoDai getAodai(){
		return new TraditionalAodai();
	}

}
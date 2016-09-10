package FactoryShape;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 11:29:46 AM
 * @class for declare SquareFactory class
 */
public class SquareFactory implements ShapeFactory {

	public Square m_Square;

	public SquareFactory(){

	}
	
	public Shape getShape(){
		return new Square();
	}

}
package FactoryShape;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 11:29:47 AM
 * @class for declare RectangleFactory object
 */
public class RectangleFactory implements ShapeFactory {

	public Rectangle m_Rectangle;

	public RectangleFactory(){

	}

	public Shape getShape(){
		return new Rectangle();
	}

}
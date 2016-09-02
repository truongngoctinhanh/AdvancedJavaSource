package FactoryShape;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 11:29:44 AM
 * @class for declare circleFactory object
 */
public class CircleFactory implements ShapeFactory {

	public Circle m_Circle;

	public CircleFactory(){

	}

	public Shape getShape(){
			return new Circle();
	}

}
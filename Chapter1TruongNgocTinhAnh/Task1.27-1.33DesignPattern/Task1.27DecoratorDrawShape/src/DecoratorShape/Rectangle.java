package DecoratorShape;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 10:40:52 AM
 * @class for implements interface Shape
 */
public class Rectangle implements Shape {

	public Rectangle(){

	}

	public void finalize() throws Throwable {

	}
	
	@Override
	public String draw(){
		return "Shape: Rectangle ";
	}

}
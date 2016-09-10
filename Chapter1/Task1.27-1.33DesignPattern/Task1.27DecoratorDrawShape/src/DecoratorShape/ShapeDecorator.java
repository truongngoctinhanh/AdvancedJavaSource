package DecoratorShape;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 10:40:50 AM
 * @class for implements interface Shape
 */
public abstract class ShapeDecorator implements Shape {

	public Shape shape;
	public Shape m_Shape;

	public ShapeDecorator(Shape shape){
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String draw(){
		return shape.draw();
	}

}
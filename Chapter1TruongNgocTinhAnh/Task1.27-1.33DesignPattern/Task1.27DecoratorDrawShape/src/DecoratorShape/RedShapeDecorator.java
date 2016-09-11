package DecoratorShape;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 05-September-2016 10:40:51 AM
 * @class for declare RedShapeDecorator class extends abstract ShapeDecorator class
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape){
		super(shape);
	}
	
	@Override
	public String draw(){
		return shape.draw() + " and " + setRedBorder(shape);
	}

	public String setRedBorder(Shape shape){
		return "Border Color: Red";
	}

}
package FactoryShape;
/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 01-September-2016 11:29:37 AM
 * @Class for declare circle object
 */
public class Circle implements Shape {

	public Circle(){

	}
	
	@Override
	public void draw(){
		System.out.println("You are drawing a CIRCLE");
	}

}
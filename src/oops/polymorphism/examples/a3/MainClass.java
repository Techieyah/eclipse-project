package oops.polymorphism.examples.a3;

import oops.polymorphism.examples.a2.Animal;
import oops.polymorphism.examples.a2.Cat;
import oops.polymorphism.examples.a2.Dog;

public class MainClass {
	
	//Create class shape
	//Create a method draw()
	//Create another 2 classes namely circle and square
	//override draw() method in these classes
	//and demonstrate polymorphism
	//using single object of shape class
	
	public static void main(String[] args) {
		Shape shape;
		
		shape=new Shape();
		shape.draw();
		
		shape=new Circle();
		shape.draw();
		
		shape=new Square();
		shape.draw();

	}

}

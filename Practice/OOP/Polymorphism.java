package OOP;

//Superclass
class Shape {
	public void draw() {
		System.out.println("Drawing a Shape");
	}
}

//Subclass 1
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

//Subclass 2
class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

//Subclass 3
class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Shape shape;

		shape = new Circle();
		shape.draw(); // Outputs: Drawing a Circle

		shape = new Rectangle();
		shape.draw(); // Outputs: Drawing a Rectangle

		shape = new Triangle();
		shape.draw(); // Outputs: Drawing a Triangle
	}
}

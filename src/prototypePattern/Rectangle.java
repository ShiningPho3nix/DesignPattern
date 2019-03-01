package prototypePattern;

public class Rectangle extends Shape {

	public Rectangle(String id) {
		super(id, "Rectangle");
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

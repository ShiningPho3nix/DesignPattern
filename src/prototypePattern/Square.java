package prototypePattern;

public class Square extends Shape {

	public Square(String id) {
		super(id, "Square");
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

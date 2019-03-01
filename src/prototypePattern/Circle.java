package prototypePattern;

public class Circle extends Shape {

	public Circle(String id) {
		super(id, "Circle");
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}

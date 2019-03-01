package abstractFactoryPattern;

public class RoundedSquare extends RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}
}

package abstractFactoryPattern;

import static abstractFactoryPattern.Shapes.*;

/**
 * In Abstract Factory pattern an interface is responsible for creating a
 * factory of related objects without explicitly specifying their classes. Each
 * generated factory can give the objects as per the Factory pattern.
 * 
 * @author Steffen Dworsky
 *
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory roundFactory = FactoryProducer.getFactory(true);
		Shape roundRectangle = roundFactory.getShape(RECTANGLE);
		Shape roundSquare = roundFactory.getShape(SQUARE);

		AbstractFactory factory = FactoryProducer.getFactory(false);
		Shape rectangle = factory.getShape(RECTANGLE);
		Shape square = factory.getShape(SQUARE);

		roundRectangle.draw();
		roundSquare.draw();
		rectangle.draw();
		square.draw();
	}
}

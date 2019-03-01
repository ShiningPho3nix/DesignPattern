package factoryPattern;

import static factoryPattern.Shapes.*;

import java.util.ArrayList;
import java.util.List;

/**
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author Steffen Dworsky
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape circle = sf.getShape(CIRCLE);
		Shape rectangle = sf.getShape(RECTANGLE);
		Shape square = sf.getShape(SQUARE);
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(circle);
		shapeList.add(rectangle);
		shapeList.add(square);
		for (Shape shape : shapeList) {
			shape.draw();
		}

	}
}

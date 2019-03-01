package prototypePattern;

import java.util.Hashtable;

/**
 * This pattern involves implementing a prototype interface which tells to
 * create a clone of the current object. This pattern is used when creation of
 * object directly is costly. For example, an object is to be created after a
 * costly database operation. We can cache the object, returns its clone on next
 * request and update the database as and when needed thus reducing database
 * calls.
 * 
 * We're going to create an abstract class Shape and concrete classes extending
 * the Shape class. A class ShapeCache is defined as a next step which stores
 * shape objects in a Hashtable and returns their clone when requested.
 * 
 * @author Steffen Dworsky
 *
 */
public class ShapeChache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return cachedShape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}

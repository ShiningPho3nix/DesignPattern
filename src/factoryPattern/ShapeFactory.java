package factoryPattern;

public class ShapeFactory {

	public Shape getShape(Shapes shapeType) {
		if (shapeType == null) {
			return null;
		}
		switch (shapeType) {
		case RECTANGLE:
			return new Rectangle();
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		default:
			throw new IllegalArgumentException(shapeType.toString());
		}
	}
}

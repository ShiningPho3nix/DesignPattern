package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(Shapes shapeType) {
		switch (shapeType) {
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			throw new IllegalArgumentException(shapeType.toString());
		}
	}

}

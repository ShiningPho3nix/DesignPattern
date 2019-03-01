package abstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(Shapes shapeType) {
		switch (shapeType) {
		case RECTANGLE:
			return new RoundedRectangle();
		case SQUARE:
			return new RoundedSquare();
		default:
			throw new IllegalArgumentException(shapeType.toString());
		}
	}

}

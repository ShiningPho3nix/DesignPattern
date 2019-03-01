package abstractFactoryPattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean round) {
		if (round) {
			return new RoundedShapeFactory();
		}
		return new ShapeFactory();
	}
}

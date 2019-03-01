package prototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeChache.loadCache();

		Shape shape1 = ShapeChache.getShape("1");
		Shape shape2 = ShapeChache.getShape("2");
		Shape shape3 = ShapeChache.getShape("3");

		System.out.println(shape1.getType());
		System.out.println(shape2.getType());
		System.out.println(shape3.getType());
	}
}

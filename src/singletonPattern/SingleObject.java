package singletonPattern;

/**
 * SingleObject class have its constructor as private and have a static instance
 * of itself.
 * 
 * SingleObject class provides a static method to get its static instance to
 * outside world.
 * 
 * @author Steffen Dworsky
 *
 */
public class SingleObject {

	private static SingleObject instance = new SingleObject();

	private SingleObject() {

	}

	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}

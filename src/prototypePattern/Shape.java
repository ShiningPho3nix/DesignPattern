package prototypePattern;

public abstract class Shape implements Cloneable {

	private final String id;
	private final String type;

	public Shape(String id, String type) {
		this.id = id;
		this.type = type;
	}

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	@Override
	public Shape clone() {
		Shape result = null;
		try {
			result = (Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}
}

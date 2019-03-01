package builderPattern;

public abstract class Drink implements Item {

	@Override
	public abstract float getPrice();

	@Override
	public abstract String getName();

	@Override
	public Packing getPacking() {
		return new Bottle();
	}

}

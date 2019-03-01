package builderPattern;

public abstract class Burger implements Item {

	@Override
	public abstract float getPrice();

	@Override
	public abstract String getName();

	@Override
	public Packing getPacking() {
		return new Wrapper();
	}

}

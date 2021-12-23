package builderPattern;

public abstract class Drink implements Item {
	@Override
	public abstract String name();
	@Override
	public abstract float price();
}

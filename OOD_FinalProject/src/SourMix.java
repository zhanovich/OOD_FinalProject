public class SourMix extends CondimentDecorator{
	Drink drink;
	
	public SourMix(Drink drink) {
		this.drink = drink;
	}
	public String getDescription() {
		return drink.getDescription() + ", Sour Mix";
	}
	
	public double cost() {
		return .55 + drink.cost();
	}
}

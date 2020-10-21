public class Ice extends CondimentDecorator{
	Drink drink;
	
	public Ice(Drink drink) {
		this.drink = drink;
	}
	public String getDescription() {
		return drink.getDescription() + ", Ice";
	}
	
	public double cost() {
		return .05 + drink.cost();
	}
}
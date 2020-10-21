public class Cherry extends CondimentDecorator{
	Drink drink;
	
	public Cherry(Drink drink) {
		this.drink = drink;
	}
	public String getDescription() {
		return drink.getDescription() + ", Cherry";
	}
	
	public double cost() {
		return .75 + drink.cost();
	}
}
public class Rum extends SpiritDecorator{
	Drink drink;
	
	public Rum(Drink drink) {
		this.drink = drink;
	}
	public String getDescription() {
		return drink.getDescription() + ", Rum";
	}
	
	public double cost() {
		return 2.50 + drink.cost();
	}
}
public class Gin extends SpiritDecorator{
	Drink drink;
	
	public Gin(Drink drink) {
		this.drink = drink;
	}
	public String getDescription() {
		return drink.getDescription() + ", Gin";
	}
	
	public double cost() {
		return 1.75 + drink.cost();
	}
}
public class Vodka extends SpiritDecorator{
	Drink drink;
	
	public Vodka(Drink drink) {
		this.drink = drink;
	}
	public String getDescription() {
		return drink.getDescription() + ", Vodka";
	}
	
	public double cost() {
		return 2 + drink.cost();
	}
}
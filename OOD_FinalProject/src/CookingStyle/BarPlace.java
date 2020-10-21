package CookingStyle;
public abstract class BarPlace {
	public Drink orderDrink(int type) {
		Drink drink;
		drink = createDrink(type);
		drink.prepare();
		drink.mix();
		drink.decorate();
		drink.serve();
		return drink;
	}
	abstract Drink createDrink(int type);
}
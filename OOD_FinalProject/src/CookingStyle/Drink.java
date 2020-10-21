package CookingStyle;
import java.util.ArrayList;
public abstract class Drink {
	String name;
	String mixType;
	String decoration;
	ArrayList ingridients = new ArrayList();
	double price;
	
	public double getPrice () {
		return price;
	}
	
	void prepare() {
		System.out.println("Crafting " + name);
		System.out.println("Getting spirits: ");
		for (int i = 0; i < ingridients.size(); i++) {
			System.out.println(" " + ingridients.get(i));
		}
	}
	void mix() {
		System.out.println("Mixing all spirits");
	}
	void decorate() {
		System.out.println("Adding decorations");
	}

	void serve() {
		System.out.println("Serving the drink");
	}
	public String getName() {
		return name;
	}
}	
package Menu;
import java.util.Hashtable;
import java.util.Iterator;

public class MartiniMenu implements Menu {
	Hashtable<String, MenuItem> menuItems = new Hashtable<>();

	public MartiniMenu() {
		addItem(
			1,
			"Dry Martini",
			"With Vermouth", 
			true, 
			8.99
		);
		addItem(
			2,
			"Dirty Martini",
			"With Olive Juice", 
			true, 
			8.50
		);
		addItem(
			3,
			"Kids Dirty Martini",
			"Water with Olives", 
			false, 
			1.50
		);
	}

	public void addItem(
			int identifier,
			String name, 
			String description, 
			boolean isAlcoholic, 
			double price
		) {
		MenuItem menuItem = new MenuItem(identifier, name, description, isAlcoholic, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}
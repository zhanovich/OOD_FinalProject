package Menu;
import java.util.ArrayList;
import java.util.Iterator;

public class DesertMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public DesertMenu() {
		menuItems = new ArrayList<>();

		addItem(
			4,
			"Tiramisu",
			"With Khalula liquor", 
			true, 
			6.95
		);
		addItem(
			5,
			"Jello Shots",
			"Watermellon flavor", 
			true, 
			3.99
		);
	}

	public void addItem(
			int identifier,
			String name, 
			String description, 
			boolean isAlcoholic, 
			double price
		) {
		menuItems.add(
			new MenuItem(
				identifier,
				name, 
				description, 
				isAlcoholic, 
				price
			)
		);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
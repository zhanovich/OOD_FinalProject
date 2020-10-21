package Menu;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		if (items.length <= position || items[position] == null) {
			return false;
		} 
		else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}
}
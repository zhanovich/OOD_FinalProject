package Menu;
public class MenuItem {
	int identifier;
	String name;
	String description;
	boolean isAlcoholic;
	double price;

	public MenuItem(
			int identifier,
			String name, 
			String description, 
			boolean isAlcoholic, 
			double price
		) {
		this.identifier = identifier;
		this.name = name;
		this.description = description;
		this.isAlcoholic = isAlcoholic;
		this.price = price;
	}

	public int getIdenitifier() {
		return identifier;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "# "+ identifier + "\t" + name + "\t " + price + 
				"\n" + description + "\n" + 
				"-------------------------------";
	}
}
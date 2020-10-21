package CookingStyle;
public class FancyBar extends BarPlace {
	Drink createDrink(int item) {
//		#1 Dry Martini
		if (item == 1) {
			return new FancyBarDryMartini();
//			# 2 Dirty Martini
		} else if (item == 2) {
			return new FancyBarDirtyMartini();
//		# 3 Kids Martini
		}  else if (item == 3) {
			return new FancyBarKidsMartini();
//		# 4 Tiramisu
		} else if (item == 4) {
			return new FancyBarTiramisu();
//		# 5 Jello Shots
		} else if (item == 5) {
			return new FancyBarJelloShots();
		}
		else return null;
	}
}
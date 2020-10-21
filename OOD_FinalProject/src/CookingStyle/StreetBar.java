package CookingStyle;
public class StreetBar extends BarPlace {
	Drink createDrink(int item) {
//		#1 Dry Martini
		if (item == 1) {
			return new StreetBarDryMartini();
//		# 2 Dirty Martini
		} else if (item == 2) {
			return new StreetBarDirtyMartini();
//		# 3 Kids Martini
		}  else if (item == 3) {
			return new StreetBarKidsMartini();
//		# 4 Tiramisu
		} else if (item == 4) {
			return new StreetBarTiramisu();
//		# 5 Jello Shots
		} else if (item == 5) {
			return new StreetBarJelloShots();
		}
		else return null;
	}
}
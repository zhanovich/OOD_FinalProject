package CookingStyle;
public class ElevatedBar extends BarPlace {
	Drink createDrink(int item) {
//		#1 Dry Martini
		if (item == 1) {
			return new ElevatedBarDryMartini();
//			# 2 Dirty Martini
		} else if (item == 2) {
			return new ElevatedBarDirtyMartini();
//		# 3 Kids Martini
		}  else if (item == 3) {
			return new ElevatedBarKidsMartini();
//		# 4 Tiramisu
		} else if (item == 4) {
			return new ElevatedBarTiramisu();
//		# 5 Jello Shots
		} else if (item == 5) {
			return new ElevatedBarJelloShots();
		}
		else return null;
	}
}
package Menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import CookingStyle.BarPlace;
import CookingStyle.Drink;
import CookingStyle.ElevatedBar;
import CookingStyle.FancyBar;
import CookingStyle.StreetBar;

public class Waitress {
	List<Menu> menus;
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		System.out.println("Menus : ");
		
		menus.forEach(menu -> {
			System.out.println("----------------");
			printMenu(menu.createIterator());
		});
	}
	
	public int getOrder(int order) throws IOException {
		String errorMessage = "Please enter a valid order: ";
        boolean invalid = true;
		System.out.println("To order please enter # of the item");   
	    BufferedReader reader = new BufferedReader(new 
		        InputStreamReader(System.in));
	     do {
	         try {
	             //Get input from keyboard buffer and attempt to parse to an int.
	             order = Integer.parseInt(reader.readLine());
	             //Only executes boolean assignment if an exception isn't thrown.
	             if(order >= 1 && order <= 5) {
	            	 invalid = false;
	             } else {
	            	System.out.print(errorMessage);
            	 	invalid = true;
	             }
	         } catch(NumberFormatException e) {
	             //If it is not a valid int print error message.
	             System.out.print(errorMessage);
	         } catch(IOException e) {
	             e.printStackTrace();
	         }
	     } while(invalid);
	    
	    System.out.println("Your order confirmed"); 
	    return order;
	}
	
	public static int getStylePreference(int style) throws IOException {
		String errorMessage = "Please select a valid cooking style: ";
        boolean invalid = true;
		System.out.println("----------------------");
		System.out.println("Select cooking style:");
		System.out.println("1 - Fancy");
		System.out.println("2 - Elevated");
		System.out.println("3 - Casual");
		System.out.println("Example: 1");
		BufferedReader reader = new BufferedReader(new 
		        InputStreamReader(System.in));
	     do {
	         try {
	             //Get input from keyboard buffer and attempt to parse to an int.
	             style = Integer.parseInt(reader.readLine());
	             //Only executes boolean assignment if an exception isn't thrown.
	             if(style >= 1 && style <= 3) {
	            	 invalid = false;
	             } else {
	            	System.out.print(errorMessage);
            	 	invalid = true;
	             }
	         } catch(NumberFormatException e) {
	             //If it is not a valid int print error message.
	             System.out.print(errorMessage);
	         } catch(IOException e) {
	             e.printStackTrace();
	         }
	     } while(invalid);
	     System.out.println("Style request confirmed"); 
	     System.out.println("----------------------");
	     return style;
	}
	
	public void payBill(double tab) throws IOException {
		String errorMessage = "Please enter a valid amount: ";
        boolean invalid = true;
        double cash = 0;
		System.out.println("----------------------");
		System.out.println("Your final tab is: " + tab);
		System.out.println("Enter amount of money to pay");
		BufferedReader reader = new BufferedReader(new 
		        InputStreamReader(System.in));
	     do {
	         try {
	             //Get input from keyboard buffer and attempt to parse to an int.
	             cash = Double.parseDouble(reader.readLine());
	             if(tab > cash) {
	            	 System.out.println("Enter sufficient amount of money");
	             }
	             //Only executes boolean assignment if an exception isn't thrown.
	             invalid = false;
	         } catch(NumberFormatException e) {
	             //If it is not a valid int print error message.
	             System.out.print(errorMessage);
	         } catch(IOException e) {
	             e.printStackTrace();
	         }
	     } while(invalid || tab > cash);
	     System.out.println("Thank you for your payment. Your change is: " + round((cash - tab), 2)); 
	     System.out.println("----------------------");
	}
	
	public double getCheck(int order, int style, int discount) {
//		Initialize Bar styles
		BarPlace streetBar = new StreetBar();
		BarPlace elevatedBar = new ElevatedBar();
		BarPlace fancyBar = new FancyBar();
		switch(style) {
	//		Fancy
			case 1:
				Drink fancyDrink = fancyBar.orderDrink(order);
				System.out.println("Price is " + round((fancyDrink.getPrice() - (fancyDrink.getPrice()/100) * discount), 2) + "\n");
				System.out.println("Discount was " + round((fancyDrink.getPrice()/100) * discount, 2) + "\n");
				return round((fancyDrink.getPrice() - (fancyDrink.getPrice()/100) * discount), 2);
	//	    Elevated
			case 2:
				Drink elevatedDrink = elevatedBar.orderDrink(order);
				System.out.println("Price is " + round((elevatedDrink.getPrice() - (elevatedDrink.getPrice()/100) * discount), 2) + "\n");
				System.out.println("Discount was " + round((elevatedDrink.getPrice()/100) * discount, 2) + "\n");
				return round((elevatedDrink.getPrice() - (elevatedDrink.getPrice()/100) * discount), 2);
	//		Casual
			case 3:
				Drink casualDrink = streetBar.orderDrink(order);
				System.out.println("Price is " + round((casualDrink.getPrice() - (casualDrink.getPrice()/100) * discount), 2) + "\n");
				System.out.println("Discount was " + round((casualDrink.getPrice()/100) * discount, 2) + "\n");
				return round((casualDrink.getPrice() - (casualDrink.getPrice()/100) * discount), 2);
		  default:
			  System.out.println("Error in system, the order is on us!");
		}
		return 0;
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
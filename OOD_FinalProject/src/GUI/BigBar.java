package GUI;

import Menu.*;
import Loyalty.*;

import CookingStyle.*;
import CookingStyle.Drink;
import Loyalty.LoyaltyTestDrive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class BigBar {
	public static void main(String args[]) throws IOException {
		LoyaltyTestDrive checkLoyalty = new LoyaltyTestDrive();
//		Initialize Menus
		List<Menu> menus = Arrays.asList(
			new MartiniMenu(), 
			new DesertMenu()
		);
//		ordered item id
		int order = 0;
//		Style of the order
		int style = 0;
//		Applied discount
		int discount = 0;
//		Tab for the customer
		double tab = 0;
		int itteration = 0;
		String answer = null;
//		Let the waitress to show the menu
		Waitress waitress = new Waitress(menus);
		do {
			order = 0;
			style = 0;
			discount = 0;
			if(itteration >= 1) {
				System.out.println("To exit enter: No. To order more press Enter.");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				answer = reader.readLine();
				if(answer.equals("No")) {
					break;
				}
			}
			waitress.printMenu();
	//		Get order 
			order = waitress.getOrder(order);
	//		Get style preference
			style = waitress.getStylePreference(style);
	
			
	//		Check Loyalty 
			discount = checkLoyalty.infoFromDB();
	//		Get Check from waitress
			tab += waitress.getCheck(order, style, discount);
			itteration += 1;
		} while(true);
		waitress.payBill(tab);
	}
}
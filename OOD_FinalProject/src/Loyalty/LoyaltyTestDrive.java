package Loyalty;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.*;

public class LoyaltyTestDrive {
	
HashMap<String, Loyalty> LoyaltyList = new HashMap<String, Loyalty>();
 	
	public static void main(String[] args) throws IOException {
		LoyaltyTestDrive checkLoyalty = new LoyaltyTestDrive();
		checkLoyalty.infoFromDB();
	}
 
	public LoyaltyTestDrive() {
		initializeDatabase();
	}

	public int infoFromDB() throws IOException {
		boolean tryAgain = true;
//		First customer
		String name = null;
		System.out.println("To use Loyalty discount enter your name. To exit enter NA");
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		
		do {
			name = reader.readLine();
			Loyalty selection = getNameFromDB(name); 
			
			if(selection != null) {
				Loyalty ownerProxy = getOwnerProxy(selection);
				ownerProxy.getDiscount();
				System.out.println("Loyalty discount set to " + ownerProxy.getDiscount() + "%" + '\n');
				System.out.println("----------------------");	
				tryAgain = false;
				return ownerProxy.getDiscount();
			} else if(name.equals("NA")) {
				System.out.println("No loyalty discount applied" + '\n');
				System.out.println("----------------------");	
				tryAgain = false;
				return 0;
			} else {
				System.out.print("No customer found" + '\n');
				System.out.println("----------------------");	
				tryAgain = true;
			}
	     } while(tryAgain);
		return 0;
		
		
	}

	Loyalty getOwnerProxy(Loyalty preference) {
 		
        return (Loyalty) Proxy.newProxyInstance( 
            	preference.getClass().getClassLoader(),
            	preference.getClass().getInterfaces(),
                new LoyaltyProxy(preference));
	}

	Loyalty getNonOwnerProxy(Loyalty preference) {
		
        return (Loyalty) Proxy.newProxyInstance(
            	preference.getClass().getClassLoader(),
            	preference.getClass().getInterfaces(),
                new NonLoyaltyProxy(preference));
	}

	Loyalty getNameFromDB(String name) {
		try {
			return (Loyalty)LoyaltyList.get(name);
        } catch(NumberFormatException e) {
            //No customer found
            System.out.print("No customer found");
        }
		return null;
		
	}

	void initializeDatabase() {
		Loyalty customer1 = new Loyaltylementation();
		customer1.setCustomerName("Georgy Loriya");
		customer1.setDiscount(10);
		LoyaltyList.put(customer1.getCustomerName(), customer1);
		
		Loyalty customer2 = new Loyaltylementation();
		customer2.setCustomerName("Thomas Billion");
		customer2.setDiscount(0);
		LoyaltyList.put(customer2.getCustomerName(), customer2);
		
		Loyalty customer3 = new Loyaltylementation();
		customer3.setCustomerName("James Toby");
		customer3.setDiscount(15);
		LoyaltyList.put(customer3.getCustomerName(), customer3);
	}

}
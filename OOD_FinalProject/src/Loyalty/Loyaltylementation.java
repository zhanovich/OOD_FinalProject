package Loyalty;
public class Loyaltylementation implements Loyalty{
	
	String name;
	int discount;
	
	public String getCustomerName() {
		return name;
	}

	public int getDiscount() {
		return discount;
	}
	
	public void setCustomerName(String name) {
		this.name = name;	
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
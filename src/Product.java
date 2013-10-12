/**
 * 
 * The productclass represent each product for the receipt. 
 * 
 * @author Confuse
 *
 */

public class Product {

	private String productName;
	//private String productCategory; // not implemented yet
	private double productPrice;
	
	public Product(String name, double price) {
		productName = name;
		productPrice = price;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String toString() {
		return productName + "\t \t" + productPrice;
	}
}

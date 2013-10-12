import java.util.ArrayList;

/**
 * 
 * The receiptclass represent a receipt for the system. Each receipt contains several products. 
 * The class contains functions to add products to the receipt and print the receipt. 
 * 
 * @author Confuse
 *
 */

public class Receipt {

	private static int receiptID;
	private final int currentReceiptID;
	private String cashierName;
	private ArrayList<Product> productList;
	
	/*
	 * Constructor for the receipt. 
	 */
	public Receipt(String cashier) {
		receiptID += 1;
		currentReceiptID = receiptID;
		productList = new ArrayList<Product>();
		cashierName = cashier;
	}
	
	/**
	 * Adds a new product to the receipt. 
	 * @param newProduct the object of the produc to add to the receipt
	 */
	public void addProductToReceipt(Product newProduct) {
		productList.add(newProduct);
	}

	/*
	 * Get the sum of the receipt. Can only be available thru this function. 
	 */
	public double getTotalSum() {
		double totalSum = 0;
		for(Product prod : productList)
			totalSum += prod.getProductPrice();
		return totalSum;
	}

	public String toString() {
		String returnString = new String();
		returnString += "Receipt number " + currentReceiptID + ": \n ";
		for(Product prod : productList) {
			returnString += prod.toString();
			returnString += "\n";
		} // for
		returnString += "Total: " + getTotalSum();
		
		return returnString;
	}

}

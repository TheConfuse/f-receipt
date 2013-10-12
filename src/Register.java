import java.util.Scanner;


public class Register {
	public static void main(String[] args) {
		Scanner registerScanner = new Scanner(System.in);
		System.out.println("Welcome to the register. What is your name? ");
		String cashierName = registerScanner.next();
		Receipt newReceipt = new Receipt(cashierName);
		
		System.out.println("Hi" + cashierName + ", what do you want to do?");
		String regInput = registerScanner.next();
		
		switch(regInput) {
		case "addProduct":
			System.out.print("Input productname: ");
			String inputProductName = registerScanner.next();
			System.out.print("Input price of product: ");
			String inputProductPrice = registerScanner.next();
			Product newProduct = new Product(inputProductName, Integer.parseInt(inputProductPrice));
			newReceipt.addProductToReceipt(newProduct);
			System.out.println("You created a " + inputProductName + " with the price " + inputProductPrice + ".");
			return;
		case "printReceipt":
			newReceipt.toString();
			return;
		default:
			System.out.println("Invalid command, try again. ");
			return;
		}
	
	}
}

import java.util.Scanner;


public class Register {
	public static void main(String[] args) {
		Scanner registerScanner = new Scanner(System.in);
		System.out.println("Welcome to the register. What is your name? ");
		String cashierName = registerScanner.next();
		Receipt newReceipt = new Receipt(cashierName);
		
		System.out.println("Hi " + cashierName + ", what do you want to do?");
		
		boolean continueRegister = true;
		String regInput;
		while(continueRegister == true) {
			System.out.println("addProduct, printReceipt");
			System.out.print(">");
			regInput = registerScanner.next();
			switch(regInput) {
			case "addProduct":
				System.out.println("Input productname: ");
				System.out.print(">");
				String inputProductName = registerScanner.next();
				System.out.println("Input price of product: ");
				System.out.print(">");
				String inputProductPrice = registerScanner.next();
				Product newProduct = new Product(inputProductName, Double.parseDouble(inputProductPrice));
				newReceipt.addProductToReceipt(newProduct);
				System.out.println("You created a " + inputProductName + " with the price " + inputProductPrice + ".");
				break;
			case "printReceipt":
				System.out.println("Receipt number x: ");
				System.out.println(newReceipt.toString());
				break;
			case "exit":
				System.out.println("Thank you for using awesomeregister 0.001!");
				continueRegister = false;
				break;
			default:
				System.out.println("Invalid command, try again. ");
				break;
			} // switch
		} // while
	
	}
}

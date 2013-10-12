import java.util.Scanner;


public class Register {
	
	boolean continueRegister = true;
	
	public Register(String cashierName) {
		Scanner registerScanner = new Scanner(System.in);
		Receipt newReceipt = new Receipt(cashierName);
		System.out.println("Hi " + cashierName + ", what do you want to do?");
		
		String regInput;
		while(continueRegister == true) {
			this.userInputField("addProduct, printReceipt");
			regInput = registerScanner.next();
			switch(regInput) {
			case "addProduct":
				this.userInputField("Input productname: ");
				String inputProductName = registerScanner.next();
				
				this.userInputField("Input price of product: ");
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
	} // register
	
	/**
	 * Printing the specified message to the console. 
	 * 
	 * @param message the message to print
	 */
	public void userInputField(String message) {
		System.out.println(message);
		System.out.print(">");
	}
	
	public static void main(String[] args) {
		Scanner mainScanner = new Scanner(System.in);
		System.out.println("Welcome to the register. What is your name? ");
		System.out.print(">");
		String cashierName = mainScanner.next();
		new Register(cashierName);
		
	}
	
	
}

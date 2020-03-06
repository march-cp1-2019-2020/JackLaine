
	package LineItemApp;

	import java.text.NumberFormat;
	import java.util.Scanner;

	public class LineItemApp {
		
		/* INSTRUCTIONS:
		 * 1. The user is prompted to enter a product code and quantity.  Then based on what the user enters, the price variable is set.
		 *     Add a description variable that is gets set based on the productCode also.
		 * 2. Add the description to the formatted output displayed to the user.
		 */
	    public static void main(String args[]) {
	        System.out.println("Welcome to the Line Item Calculator");
	        System.out.println();

	        Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            // get input from user
	            System.out.print("Enter product code: ");
	            String productCode = sc.nextLine();

	            System.out.print("Enter quantity:     ");
	            int quantity = Integer.parseInt(sc.nextLine());

	            // set product price based on product code
	            double price;
	            String description;
	            if (productCode.equalsIgnoreCase("java")) {
	                price = 57.50;
	                description = "A computer language called java";
	            } else if (productCode.equalsIgnoreCase("jsp")) {
	                price = 57.50;
	                description = "jsp stands for java server pages";
	            } else if (productCode.equalsIgnoreCase("mysql")) {
	            	description = "MySQL is an open-source relational database management system.";
	                price = 54.50;	                
	            } else {
	                price = 0;
	                description = "Book not found";
	            }
	            
	            // calculate total
	            double total = price * quantity;
	            
	            // format and display output
	            NumberFormat currency = NumberFormat.getCurrencyInstance();
	            String priceFormatted = currency.format(price);
	            String totalFormatted = currency.format(total);
	            System.out.println(description);
	            String message = "\nLINE ITEM\n" +
	                "Code:        " + productCode + "\n" +
	                "Price:       " + priceFormatted + "\n" +
	                "Quantity:    " + quantity + "\n" +
	                "Total:       " + totalFormatted + "\n";
	            System.out.println(message);

	            // see if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	        }
	        sc.close();
	        System.out.println("Bye!");
	    }
	}


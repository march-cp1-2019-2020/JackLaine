package murach.ui;
// Jack Laine
import java.util.Scanner;

import murach.db.ProductDB;
import murach.business.LineItem;
import murach.business.Product;

public class LineItemApp {

    public static void main(String args[]) {

        System.out.println("Welcome to the Line Item Calculator");
        System.out.println();

        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();

            System.out.print("Enter quantity:     ");
            int quantity = Integer.parseInt(sc.nextLine());
            
            
            Product product = ProductDataBase.getProduct(productCode);

            
            LineItem lineItem = new LineItem(product, quantity);

            
            String message = "\nLINE ITEM\n" +
                "Code:        " + product.getCode() + "\n" +
                "Description: " + product.getDescription() + "\n" +
                "Price:       " + product.getPriceFormatted() + "\n" +
                "Quantity:    " + lineItem.getQuantity() + "\n" +
                "Total:       " + lineItem.getTotalFormatted() + "\n";
            System.out.println(message);

            
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}
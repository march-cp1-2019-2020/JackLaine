package murach.test;

import java.util.Scanner;

public class CodeTesterApp {


	
	
    public static void main(String args[]) {
    
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter name:");
    	 String name = sc.nextLine();
        System.out.println("Welcome to the Code Tester");
        System.out.println();
        String productCode = "java";
        int tax = (int) 2;
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        String message =
        	"Name:	  "  + name + "\n"+	
            "Code:    " + productCode+ "\n" + 
            "Price:   " + price * 2 + "\n" +
            "Quantity:" + quantity + "\n" +
            "Tax:     " + tax + " percent" + "\n" +
            "Total:   " + total + "+" + 1.98 + "\n";
        System.out.println(message); 

                
        // Jack Laine
        
                
        
        
        System.out.println("Bye!");
    }
}

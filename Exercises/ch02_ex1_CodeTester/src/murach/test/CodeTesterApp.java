package murach.test;

import java.util.Scanner;

public class CodeTesterApp {
// Jack Laine
    public static void main(String args[]) {
    
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter last name:");
    	 String lname = sc.nextLine();
    	 System.out.println("enter first name:");
    	 String fname = sc.nextLine();
        System.out.println("Welcome to the Code Tester " + lname + "," + fname);
        System.out.println();
        String productCode = "java";
        int tax = (int) 2;
        double average = total / quantity;
        System.out.println("enter quanity of item");
        double price = 49.50;
        int quantity = sc.nextInt();
        double total = price * quantity;
        String message =
        	"Name:	  "  + lname + "," + fname + "\n"+	
            "Code:    " + productCode+ "\n" + 
            "Price:   " + price * 2 + "\n" +
            "Quantity:" + quantity + "\n" +
            "Tax:     " + tax + " percent" + "\n" +
            "Total:   " + total + "+" + 1.98 + "\n";
        System.out.println(message); 

                
        
                
        
        
        System.out.println("Bye!");
    }
}

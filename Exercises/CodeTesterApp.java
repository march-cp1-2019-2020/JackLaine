package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        String productCode = "java";
        int tax = (int) 2;
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        String message =
            "Code:    " + productCode+ "\n" + 
            "Price:   " + price * 2 + "\n" +
            "Quantity:" + quantity + "\n" +
            "Tax:     " + tax + "percent" + "\n" +
            "Total:   " + total + "+" + 1.98 + "\n";
        System.out.println(message); 

                
        // Jack Laine
        
                
        
        
        System.out.println("Bye!");
    }
}

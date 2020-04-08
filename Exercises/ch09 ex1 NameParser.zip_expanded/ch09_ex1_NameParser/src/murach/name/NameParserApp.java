package murach.name;

import java.util.Scanner;

public class NameParserApp {
	//Jack Laine
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name ");
        String fname = sc.nextLine();
        System.out.println("enter middle name: (optional)");
        String mname = sc.nextLine();
        System.out.println("enter last name:");
        String lname = sc.nextLine();
        System.out.println("First name: " + fname + "\n");
        System.out.println("Middle name: " + mname + "\n");
        System.out.println("Last name: " + lname + "\n");
    
        sc.close();
    try {
    } catch(java.util.InputMismatchException ime) {
		System.out.println("each part of the name must have one word");
        
		
		
    }
}
}

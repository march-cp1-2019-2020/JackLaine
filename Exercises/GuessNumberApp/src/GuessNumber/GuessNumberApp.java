package GuessNumber;

import java.io.PrintStream;
import java.util.Scanner;

public class GuessNumberApp {
	
	static Scanner sc = new Scanner(System.in);
	
	static int guess;

	public static void main(String[]args) {
		
		int randomNumber = (int)(Math.random() * 10);
		
		//TEACHER NOTES: missing while loop
		System.out.println("Please pick a number between 0 and 10");
		guess = Integer.parseInt(sc.nextLine());
		
		/*TEACHER NOTES: the way you have them nested will not work if they users first guess 
		 * is the correct number or is less than randomNumber.  Try this...temporarily change 
		 * line 14 to set randomNumber to 5.  That way you can predict the random number.  
		 * Now run the code...guess 5 and see what happens. */
		if(guess > randomNumber) {
			System.out.println("that number is too large!");
		
		if (guess < randomNumber) {
			System.out.println("that number is too small!");
				
		if (guess == randomNumber) {
			System.out.println("correct guess!");
		}
				
			}
			
		}
			
			
		
		
	}
}

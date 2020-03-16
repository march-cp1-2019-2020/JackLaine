package GuessNumber;

import java.io.PrintStream;
import java.util.Scanner;

public class GuessNumberApp {
	
	static Scanner sc = new Scanner(System.in);
	
	static int guess;

	public static void main(String[]args) {
		
		int randomNumber = (int)(Math.random() * 10);
		
		System.out.println("Please pick a number between 0 and 10");
		guess = Integer.parseInt(sc.nextLine());
		
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

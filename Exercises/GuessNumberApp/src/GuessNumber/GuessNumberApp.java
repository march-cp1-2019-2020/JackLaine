package GuessNumber;

import java.io.PrintStream;
import java.util.Scanner;

public class GuessNumberApp {
	
	static Scanner sc = new Scanner(System.in);
	
	static int guess;
	static int LIMIT = 10;
	static int count = 1;

	public static void main(String[]args) {
		
		int randomNumber = (int)(Math.random() * 10);
		
		while (true) {
		System.out.println("Please pick a number between 0 and 10");
		guess = Integer.parseInt(sc.nextLine());
		
		if (guess < 1 || guess > LIMIT) {
			System.out.println("invalid guess, try again");
			continue;
		
		if(guess > randomNumber) {
			System.out.println("that number is too large!");
			count++;
			
		if (guess < randomNumber) {
			System.out.println("that number is too small!");
			count++;
				
		if (guess == randomNumber) {
			System.out.println("correct guess!");
		} catch (InputMismatchException ime) {
			System.out.println("you must enter a numerical digit, try again");
		}
				
			}
			
		}
		}
			
		
		
	}
		}
	}

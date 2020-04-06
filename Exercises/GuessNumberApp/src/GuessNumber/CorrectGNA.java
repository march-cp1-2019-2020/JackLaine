package GuessNumber;

import java.util.Scanner;

public class CorrectGNA {

	Scanner sc = new Scanner(System.in);
	
	int count = 1;
	
	while (true) {
		System.out.println("your guess");
		int guess = sc.nextInt();
	}
	
	if (guess < 1 || guess > LIMIT) {
		System.out.println("invalid guess, try again");
		continue;
	}
	
	if (guess < number) {
		System.out.println("too low");
	} else if (guess > number) {
		
	} else {
		System.out.println("you guessed it in " + count + "tries \n");
		break;
	}
		count++;
		
	} catch(InputMismatchException ime) {
		System.out.println("you must enter a numerical digit, try again";)
		
	}
	
	count++;


System.out.println("bye");
}
}
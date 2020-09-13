/* 
     Yilmaz, Ferah
     CSA170
     March 8, 2018
     IC11_GuessingGame
     
 */

package edu.orangecoastcollege.cs170.fyilmaz.ic11;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) 
	{
		//Step 1) Declare needed variables
		int answer, guess, numberCorrect=0,sumCorrect=0;
		Scanner consoleScanner = new Scanner(System.in);
		Random rng = new Random();
		String answerString, guessString;
		
		//Randomly generate a 5-digit answer between 10000 and 99999
		answer = rng.nextInt(90000) + 10000;
		// Converts any number into any String
		answerString= String.valueOf(answer);
		System.out.println("CHEAT CODE: " + answer);
		System.out.print ("\nI have randomly chosen a 5-digit code for you to guess."
				+ "\nEach time you guess, I will tell you how many digits are correct"
				+ " and the sum of the digits that are correct. "
				+ "\nFor example, if the number is \"68420\" and "
				+ "you guess 12468, I will respond:"
				+ "\nNumber of Digits Correct: 1"
				+ "\nSum of Digits Correct     : 4"
				+ "\nFrom deduction, you will know the 4 was correct in the guess."
				+ "\n\nNow its your turn..........................."
				+ ".......................................\n");
		
		do
		{
			System.out.print("\nPlease enter a 5-digit code (your guess): ");
					
			guess = consoleScanner.nextInt();     // 12345
			guessString = String.valueOf(guess);  // "12345"
		
			if(Integer.parseInt(guessString)>= 10000 && Integer.parseInt(guessString)<= 99999)
			{	
		
				// Loop through the answer one number at a time 
				for(int i=0; i<=4; i++)
				{
				
					//If the guess character matches the answer character
					if(answerString.charAt(i) == guessString.charAt(i))
					{
						// Number of digits correct goes up by one
						numberCorrect++;
						// Sum of digits correct goes up by digit
						sumCorrect += Character.getNumericValue(answerString.charAt(i));
					}
			}
		
				System.out.println("Number of Digits Correct: " + numberCorrect);
				System.out.println("Sum of Digits Correct: " + sumCorrect);
				numberCorrect=0;
				sumCorrect=0;
			
			}else
				System.out.println("Guess must be a 5-digit code between 10000 and 99999.\n");
			
			
			}while(guess != answer);
		
			System.out.println("****HOORAY!  You solved it.  You are so smart****");
		
			consoleScanner.close();
	}

}

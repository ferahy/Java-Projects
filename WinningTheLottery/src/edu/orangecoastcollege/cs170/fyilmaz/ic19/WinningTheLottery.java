package edu.orangecoastcollege.cs170.fyilmaz.ic19;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class WinningTheLottery 
{
	public static final int SIZE= 5;
	public static void main(String[] args)
	{
		// Declare the array of winning numbers
		int[] winningNumbers= new int[SIZE];
		int[] guessNumbers= new int[SIZE];
		int spent=0;
		// Let's fill the winning numbers !
		randomlyAssignNumbers(winningNumbers);
		// Let's see what the winning numbers are:
		
		System.out.println("The winning lottery numbers are:\n" + Arrays.toString(winningNumbers));
		
		// Keep looping until 5 out of 5 of the guessNumbers equal winningNumbers
		do{
			// Let's fill out the guess numbers!
			randomlyAssignNumbers(guessNumbers);
			spent++;
					
		}while(howManyCorrect(winningNumbers, guessNumbers) < 5);
		
		// After the loop , we WON the lottery!
		// Print the message : After spending $212,337,663.00, you won the Fantasy 5 Lottery
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("After spending " + currency.format(spent) + ", you won the Fantasy 5 lottery.");
		
	}
	
	// Make a method named howManyCorrect, takes in 2 arrays and returns
	// how many of the numbers are the same 
	public static int howManyCorrect(int[] array1, int[] array2)
	{
		int count = 0;
		for( int i= 0; i< array1.length; i++ )
		{
			if (array1[i]== array2[i])
				count++;
		}
		return count;
	}
	
	public static void randomlyAssignNumbers(int[] anyArray)
	{
		// Random number generator
		Random rng = new Random();
		// Loop through the array and fill it with random numbers between 0 and 36
		for (int  i=0; i< anyArray.length; i++)
			// Random number between 0 and 36
			anyArray[i] = rng.nextInt(37);
	}

}

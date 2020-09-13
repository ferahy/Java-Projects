package edu.orangecoastcollege.cs170.fyilmaz.ic23;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class PresidentialDonations {

	public static void main(String[] args) 
	{
		double sum = 0.0, average, min = Double.MAX_VALUE, max = Double.MIN_VALUE, donation;
		int contributors = 0;
		
		// Open a text file in Java with a Scanner class:
		try{
		Scanner fileScanner = new Scanner(new File ("clinton2016donations.txt"));
		// Loop through all the donations one by one:
		// Use a "while" loop because the file could be empty
		// while = " as long as"
		// As long as the file has another double value to read, keep looping
		while(fileScanner.hasNextDouble())
		{
			// Donation amount comes from the file:
			donation = fileScanner.nextDouble();
			// Add it to the sum
			sum += donation;
			// Add one to the number of contributions
			contributors++;
			// Determine if the donation is a min
			if(donation < min)
				min = donation;
			// Determine if the donation is a max
			if(donation > max)
				max = donation;
			
		}
		// After the loop close the file
		fileScanner.close();
		average = sum / contributors;
		// Print all the statistics for that file
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("For candidate: Hillary Clinton " 
				+ "\nThe minimum contribution was: " + currency.format(min)
				+ "\nThe maximum contribution was: " + currency.format(max)
				+ "\nThe average contribution was: " + currency.format(average)
				+ "\nThe number of contributions was: " + contributors
				+ "\nThe total amount contributed was: " + currency.format(sum));
		
		}
		catch( IOException e)
		{
			System.out.println("File not found.");
		}
		
		sum =0.0;
		contributors = 0;
		
		try{
			Scanner fileScanner = new Scanner(new File ("trump2016donations.txt"));
			// Loop through all the donations one by one:
			// Use a "while" loop because the file could be empty
			// while = " as long as"
			// As long as the file has another double value to read, keep looping
			while(fileScanner.hasNextDouble())
			{
				// Donation amount comes from the file:
				donation = fileScanner.nextDouble();
				// Add it to the sum
				sum += donation;
				// Add one to the number of contributions
				contributors++;
				// Determine if the donation is a min
				if(donation < min)
					min = donation;
				// Determine if the donation is a max
				if(donation > max)
					max = donation;
				
			}
			// After the loop close the file
			fileScanner.close();
			average = sum / contributors;
			// Print all the statistics for that file
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("\nFor candidate: Donald Trump " 
					+ "\nThe minimum contribution was: " + currency.format(min)
					+ "\nThe maximum contribution was: " + currency.format(max)
					+ "\nThe average contribution was: " + currency.format(average)
					+ "\nThe number of contributions was: " + contributors
					+ "\nThe total amount contributed was: " + currency.format(sum));
			
			}
			catch( IOException e)
			{
				System.out.println("File not found.");
			}
		

	}

}

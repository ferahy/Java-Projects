package edu.orangecoastcollege.cs170.fyilmaz.ic25;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieReviews {

	public static void main(String[] args) 
	{
		ArrayList<Double> reviewsList = new ArrayList<>(100);
		double review, total = 0.0;
		try {
			Scanner fileScanner = new Scanner(new File ("MovieReviews.txt"));
			while(fileScanner.hasNextDouble())
			{
				review = fileScanner.nextDouble();
				total += review;
				reviewsList.add(review);
				
			}
			fileScanner.close();
			
			// Print the statistics
			System.out.println("The number of movie reviews is " + reviewsList.size());
			System.out.println("The average review is " + total / reviewsList.size());
			
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}

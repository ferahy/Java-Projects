package edu.orangecoastcollege.cs170.fyilmaz.ic26;

import java.util.HashMap;
import java.util.Scanner;

public class HikingLogApp 
{
	public static void main(String[] args)
	{
		// Let's create a HashMap <key, value>
		// HashMap <String, Integer>
		
		// default capacity = 16
		HashMap<String, Integer> hikingLog = new HashMap<>();
		String hike, date;
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~Welcome to the Hiking Log ~~~~~~~~~~~~~~~~~");
		
		do {
			System.out.print("\nPlease enter name of hike completed (or \"quit\" to exit): ");
			hike = consoleScanner.nextLine();
			if (hike.equalsIgnoreCase("quit"))
				break;
			
			System.out.print("Please enter the date of completion (MM/DD/YYYY)   : ");
			date = consoleScanner.nextLine();
			
			// If the hash map contains hike, add 1 to the value
			if(hikingLog.containsKey(hike))
			{
				int value = hikingLog.get(hike) + 1;
				hikingLog.put(hike, value);
				
			}
				
			// Else, put 1 as the value
			else
			{
				hikingLog.put(hike, 1);
				
			}
			
		} while(!hike.equalsIgnoreCase("quit"));
		
		// After loop, close the consoleScanner
		consoleScanner.close();
		
		// Display statistics
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~Hiking Statistics~~~~~~~~~~~~~~~~~~~~~");
		// Unique hikes completed:
		System.out.println("Unique Hikes Completed: " + hikingLog.size());
		// Calculate the total (of all hikes)
		int total = 0;
		// Let's loop through the values
		for ( int count : hikingLog.values())
		{
			total += count;
		}
		System.out.println("Total Hikes Completed : " + total);
		
		String mostFrequent = "";
		int maxCount = 0;
		for(String name : hikingLog.keySet())
		{
			int value = hikingLog.get(name);
			if(value > maxCount)
			{
				maxCount = value;
				mostFrequent = name;
			}
			    
		}
		System.out.println("Most Frequent Hike      : " + mostFrequent);
	}

}

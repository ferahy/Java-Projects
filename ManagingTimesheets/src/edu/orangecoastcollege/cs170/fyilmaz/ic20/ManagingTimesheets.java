package edu.orangecoastcollege.cs170.fyilmaz.ic20;

import java.util.Scanner;

public class ManagingTimesheets 
{
	// Before main, declare constants
	public static final int ROWS = 3;
	public static final int COLS = 5;

	public static void main(String[] args) 
	{
		// In main , declare the arrays
		double[][] timesheets = new double [ROWS][COLS];
		double[] totals = new double [ROWS];
		String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		Scanner consoleScanner = new Scanner(System.in);
		
		// Let's loop through each employee on each day
		// Shortcut to "refactor" Alt +Shift +R
		for(int e = 0; e < ROWS; e++)
		{
			for(int d = 0; d < COLS; d++)
			{
				System.out.print("Please enter hours worked for employee #"+ (e+1)+
						" on " + days[d] + ": ");
				// Store the value in the timesheet for that employee
				// on that day
				timesheets[e][d] = consoleScanner.nextDouble();
				// Add value to the totals for that employee
				totals[e] += timesheets[e][d];
				
			}
			System.out.println();
		} // After the loops , done with input, close consoleScanner
		consoleScanner.close();
		
		for(int e = 0 ; e < ROWS; e++)
		{
			System.out.println("Total hours worked for employee #" + (e+1) + " : " + totals[e]);
			System.out.println("Average hours worked for employee #" + (e+1) + " : " + totals[e]/COLS + "\n");
			
		}
		
		
	}

}

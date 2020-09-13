/* 
     Yilmaz, Ferah
     CSA170
     March 6, 2018
     IC10_GradingApp
     
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradingApp {

	public static void main(String[] args) 
	{
		double grade, low = Double.MAX_VALUE, average, high = Double.MIN_VALUE , sum=0; 
		int count=0, numberAs=0, numberBs=0, numberCs=0, numberDs=0, numberFs=0;
		Scanner consoleScanner = new Scanner(System.in);
		DecimalFormat oneDp = new DecimalFormat("0.0");
		DecimalFormat zeroDps = new DecimalFormat("0");
		
		System.out.println("Please input grades one per line (or type -1 to quit):");
		
		do{
			// Code to repeat
			grade= consoleScanner.nextDouble();
			
			// Check to see if the grade != -1
			
			if(grade != -1){
				
			// Add 1 to the count
			count++;
			
			// Add grade to the sum 
			sum+=grade;
			
			// Let's determine what letter grade 
			if (grade >= 90)
				numberAs++;
			else if (grade >= 80)
				numberBs++;
			else if (grade >= 70)
				numberCs++;
			else if (grade >= 60)
				numberDs++;
			else 
	            numberFs++;
			
			// Let's check to see if the grade is the new low
			
			if (grade < low)
				low= grade;
			if (grade > high)
				high= grade;
			}
		}
		while(grade != -1);
		
		// Calculate the average
		average = sum / count;
		
		// Display the output after the loop (only once)
		
		System.out.println("\nTotal number of grades = " + count);
		System.out.println("Number of A's= " + numberAs + "\n" +
				"Number of B's = " + numberBs +"\n" + 
				"Number of C's = " + numberCs +"\n" +
				"Number of D's = " + numberDs +"\n" +
				"Number of F's = " + numberFs);   
				System.out.println("Low Grade = "+ zeroDps.format(low)+ "%");
				System.out.println("Class Average = "+ oneDp.format(average)+ "%");
				System.out.println("High Grade = "+ zeroDps.format(high)+ "%");
		
		
		consoleScanner.close();
	}

}

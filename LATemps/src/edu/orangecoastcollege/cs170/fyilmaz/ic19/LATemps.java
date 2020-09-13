package edu.orangecoastcollege.cs170.fyilmaz.ic19;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class LATemps 
{
	public static final int SIZE= 31;
	
	public static void main(String[] args)
	{
		int[] temps = new int [SIZE];
		DecimalFormat twoDigits = new DecimalFormat("#.00");
		Scanner consoleScanner = new Scanner(System.in);
		double sum = 0.0, average;
        int max;
        
        for (int i = 0; i < temps.length ; i++){
        	System.out.print("Please enter daily high for October " + (i < 9 ? "0":"") + (i+1) + ": ");
            temps[i] = consoleScanner.nextInt();
            sum += temps[i];
        }
        average = sum/ temps.length;
        // Sort the array
        Arrays.sort(temps);
        // max = 104
        max = temps[temps.length-1];
        
        // Let's create the freqs array
        int[] freqs = new int [max+1];
        // Let's loop through the temps array to keep a count in the freqs array
        // Use a for each loop
        // "for every single temp in temps array"
        // temp = 78 to begin
        for (int temp : temps)
        {
        	// Increase the frequency of that temp by 1
        	freqs[temp]++;
        }
        
        // After all frequencies have been counted
        int maxFreq=0;
        int mode=0;
        
        for (int i=0; i< freqs.length-1;i++)
        {
        	// If the frequency at i > maxFreq
        	// maxFreq= frequency at i
        	if( freqs[i] > maxFreq)
        	{
        		maxFreq = freqs[i];
        		mode = i;
        	}
        }
        consoleScanner.close();
        
        System.out.println("\n~~~~~~~~~~~Temperature Statistics~~~~~~~~~~");
        
        System.out.println("October's highest daily temperature was: " + temps[30]);
        System.out.println("October's average high temperature was: " + twoDigits.format(average));
        System.out.println("October's most frequent high temp was: " + mode);
    
	}
	

}

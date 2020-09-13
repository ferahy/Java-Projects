package edu.orangecoastcollege.cs170.fyilmaz.ic24;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FrontToBack {

	public static void main(String[] args) 
	{
		String line;
		String[] words;
		
		try
		{
			Scanner fileScanner = new Scanner (new File("Input.txt"));
			PrintWriter fileWriter = new PrintWriter("Output.txt");
			
			// For files , use a while loop (instead of do/while)
			// because they could be empty
			while (fileScanner.hasNextLine())
			{
				// Read a line from the file:
				// line = " Watch this rock."
				line = fileScanner.nextLine();
				// Split the line  into words
				words = line.split(" ");
				// words = {"Watch", "this", "rock"}
				// Swap the front and back:
				// Make a temp variable
				// temp = "Watch"
				String temp = words[0];
				// words[0] = "rock."
				words[0] = words[words.length-1];
				// words[words.length-1] = "Watch"
				words[words.length-1] = temp;
				// words = { "rock.", "this", "Watch"}
				
				// Let's use the Print writer to Output.txt
				// Loop through all the words
				for( int i =0; i < words.length; i++)
					fileWriter.print(words[i]+ " ");
				fileWriter.println();
				
			}
			// Close the file scanner
			fileScanner.close();
			fileWriter.close();
			
		}
		catch(IOException e)
		{
			System.out.println("File not found.");
		}
		

	}

}

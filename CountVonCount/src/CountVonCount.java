/* 
     Yilmaz, Ferah
     CSA170
     March 1, 2018
     IC09_CountVonCount
     
 */

import java.util.Scanner;

public class CountVonCount {

	public static void main(String[] args) {
		
		int magicNumber;
        Scanner consoleScanner = new Scanner(System.in);
        
        System.out.println("Count Von Count: What is the magic number?");
        magicNumber = consoleScanner.nextInt();
        
        //Let's check for invalid input
        if (magicNumber < 1)
        {
        	System.err.println("I'm sorry, but the Count von Count only counts positive numbers! Muhahahaha");
        	//To stop code immediately, use System.exit 
            System.exit(0);
        }
        
        //Loop through all the numbers from 1 to magic number
        
        for (int i = 1; i < magicNumber; i++)
        {
        	// Code to repeat
            System.out.print(i + ", ");
            		
        }
        
        System.out.println( magicNumber + "\n" + magicNumber 
        		+ "! " + magicNumber 
        		+ " is the magic number of the day. "
                + magicNumber + " dancing vegetables are here to celebrate with me! I love dancing vegetables!");
        
        
        consoleScanner.close();
        

	}

}

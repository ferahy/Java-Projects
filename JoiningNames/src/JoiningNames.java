/*
    Yilmaz, Ferah
    CS A170
    February 8, 2018
    IC04_JoiningNames
    
 */


import java.util.Scanner;

public class JoiningNames
{

    public static void main(String[] args)
    {
        // Step 1) Declare all needed variables
        String first, middle, last;
        // Ctrl + Shift + o => Auto Import
        Scanner consoleScanner = new Scanner(System.in);
      
        // Step 2) Prompt user for input
        System.out.print("Please enter your first name: ");
        // To read Strings, use consoleScanner.nextLine()
        first = consoleScanner.nextLine();
        
        System.out.print("Please enter your middle initial: ");
        middle = consoleScanner.nextLine();
        
        System.out.print("Please enter your last name: ");
        last = consoleScanner.nextLine();
        
        // Step 3) Perform any calculations (NONE)
        
        // Step 4) Display output
                          // Michael (length = 7)
        System.out.println("\n" + first + " (length = " + first.length()+ ")");
        System.out.println(middle + " (length = " + middle.length() + ")");
        System.out.println(last + " (length = " + last.length()+ ")");
        
        System.out.println("\n" + last.toUpperCase() + "," + first.toUpperCase() + "," + middle.toUpperCase());
        
        consoleScanner.close();
        
        
        
        
        
        

    }

}

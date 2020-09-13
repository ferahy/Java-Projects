/* 
     Yilmaz, Ferah
     CSA170
     February 25, 2018
     IC06_HackerChallenge
     
 */

import java.util.Scanner;

public class HackerChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date, monthPart, dayPart, yearPart;
		int month, day , year;
		
		Scanner consoleScanner = new Scanner(System.in);
		
		//Prompt user for input:
		System.out.println("Please enter date in the form MM/DD/YYYY");
		// Since the date is one word ( no spaces ) use next()
		date = consoleScanner.next();
		// 02/20/2018
		monthPart = date.substring(0, 2);  // "02"
		dayPart = date.substring(3, 5);    // "20"
		yearPart = date.substring(6);     // "2018"
		
		// To convert Strings into ints
		month = Integer.parseInt(monthPart);
		day = Integer.parseInt(dayPart);
		year = Integer.parseInt(yearPart);
		
		if (month <1 || month > 12) 
	    {
	    System.err.println("Invalid month.");
	    System.exit(0);
	    }

	    else  if ( month == 4 || month == 6 || month == 9 || month ==11  )
	    {
	        if (day> 30) 
	        {
	            System.err.println("Invalid month.");
	        System.exit(0);
	        }
	    }
	   
	switch(month){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	
		if(day > 31){ 
			System.err.println("Invalid day.");
			System.exit(0); }
		break;
	case 2:
		
		if(day > 28)
			{ 
			if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			{
				if(day <= 29)
					System.out.println("Leap year");
				else
				{
					System.err.println("Invalid day.");
					System.exit(0);
				}
			}
			    
			else
				{
				System.err.println("Invalid day.");
				System.exit(0); 
				}
			}
			
		break;

				}
	    if (date.length() != 10 )
	    {
	        System.err.println("Invalid date.");
	        System.exit(0);
	    }
	        if (year < 0 && year <= 9999) //either way; if the year > 9999 , the output will be invalid date 
	        								// because date length must be 10.
	        {
	            System.err.println("Invalid year.");
	            System.exit(0);
	        }
	        else {
	            System.out.println("Valid date.");
	            
	        }
	        
		consoleScanner.close();
	}

}

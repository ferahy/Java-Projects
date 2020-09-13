/* 
     Yilmaz, Ferah
     CSA170
     February 13, 2018
     IC05_BloodAlcoholContent
 */



import java.text.DecimalFormat;
import java.util.Scanner;

public class BloodAlcoholContent {
	// Declare the constants here:
	public static final double OUNCES_ALCOHOL = 1.5 ;
	public static final double BAC_LIMIT = 0.08 ;

	public static void main(String[] args) 
	{
		double numberOfDrinks, BAC, weight;
		Scanner consoleScanner = new Scanner(System.in);
		
		DecimalFormat threeDPs = new DecimalFormat("#.000");
		
		System.out.print("Enter the number of alcoholic drinks consumed : ");
		numberOfDrinks = consoleScanner.nextDouble();
		
		System.out.print("Please enter your weight in Ibs : ");
		weight = consoleScanner.nextDouble();
		BAC = (4.136 * numberOfDrinks * OUNCES_ALCOHOL) / weight;
		
		System.out.println("\nYour BAC is " + threeDPs.format(BAC));
		
		if (BAC >= BAC_LIMIT )
		{
			
			System.out.println("According to the state of California, you are intoxicated. Do not drive!");
			
		}
		
		else 
		{
			
            System.out.println("You are legal to drive on the road. Drive safe!");
            
		}
		
		consoleScanner.close();
		

	}

}

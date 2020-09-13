/* 
     Yilmaz, Ferah
     CSA170
     February 20, 2018
     IC06_BasalMetabolicRatePartDeux
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class BasalMetabolicRatePartDeux {

	public static final int CHOCOLATE_BAR_CALORIES = 230;
	
	public static void main(String[] args) 

    {
        double weight, height, age, bmr, bars;
        String gender;
        int activity;
        // Use scanner for user input
        Scanner consoleScanner = new Scanner(System.in);
        DecimalFormat oneDP = new DecimalFormat("0.0");
        DecimalFormat noDP = new DecimalFormat("0");
        


        // User input
        System.out.println("Please enter your weight (lb): ");
        weight = consoleScanner.nextDouble();
        System.out.println("Please enter your height (in): ");
        height = consoleScanner.nextDouble();
        System.out.println("Please enter your age: ");
        age = consoleScanner.nextDouble();
        System.out.println("Please enter Male or Female");
        // Force it to be UPPERCASE or lowercase
        //female => FEMALE
        gender= consoleScanner.next().toLowerCase();
        String outputGender = gender.substring(0, 1).toUpperCase()  + gender.substring(1);
        
        
        //Let's make a decision to determine gender 
        if (gender.equalsIgnoreCase("female") || gender.toLowerCase().startsWith("F"))
        	
        	 bmr = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        else
 	
        	 bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
        
        System.out.println("Please enter the number corresponding with your activity factor:");
        System.out.println("1. Sedentary (not active)");
        System.out.println("2. Somewhat active (exercise occasionally)");
        System.out.println("3. Active (exercise 3-4 times per week)");
        System.out.println("4. Highly Active( exercise every day)");
        
        activity = consoleScanner.nextInt();
        consoleScanner.close(); // CLOSE THE SCANNER
        
        if(activity == 1 ) // Sedentary, increase bmr by %20
        	bmr = bmr * 1.20;
        	
        else if (activity == 2) // Somewhat active, increase by 30% 
        	bmr *= 1.3;
        else if (activity == 3) // ASctive, increase by 40% 
        	bmr *= 1.4;
        else //Highly Active, increase by 50%
        	bmr *= 1.5;
        
        

        // Number of chocolate bars needed to maintain BMR
        bars = bmr / CHOCOLATE_BAR_CALORIES;

        // Display output to the user
        System.out.println("As a " + outputGender + " your BMR x Activity Factor is "
        		+ noDP.format(bmr) + " and you need to eat " + oneDP.format(bars)
        		+" chocolate bars to maintain this amount of calories.");
    }

}

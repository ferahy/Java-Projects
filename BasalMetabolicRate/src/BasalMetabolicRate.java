import java.text.DecimalFormat;
import java.util.Scanner;

public class BasalMetabolicRate
{

    public static void main(String[] args)
    {
        // Step 1) Declare any needed variables
        double weight, height, age, bmrF, bmrM, barsM, barsF;
        Scanner consoleScanner = new Scanner (System.in);
        //No Decimal places
        DecimalFormat noDPs = new DecimalFormat("0");
        // One decimal place
        DecimalFormat oneDP = new DecimalFormat("0.0");
              
        
        // Step 2) Prompt user for input
        // sysout Ctrl + space
        System.out.print("Please enter your weight (Ib): ");
        weight = consoleScanner.nextDouble();
        
        System.out.print("Please enter your height (in): ");
        height = consoleScanner.nextDouble();
        
        System.out.print("Please enter your weight age: ");
        age = consoleScanner.nextDouble();
        
        //Step 3) Perform calculations
        // Calculating BMR calories for female and male
        bmrF = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        bmrM = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
        
        // Calculating chocolate bars for female and male
        barsF = bmrF / 230;
        barsM = bmrM / 230;
        
        //Step 4) Display output to console 
        System.out.println("\nBMR (female): " + noDPs.format(bmrF) + " calories");
        System.out.println("BMR (male): " + noDPs.format(bmrM) + " calories");
        
        System.out.println("\nIf you are female, you need to consume " + oneDP.format(barsF) + " chocolate bars to maintain weight.");
        System.out.println("If you are male, you need to consume " + oneDP.format(barsM) + " chocolate bars to maintain weight.");
        
        //Make sure to CLOSE your console scanner
        
     
                
        consoleScanner.close();
        
       
      

    }

}

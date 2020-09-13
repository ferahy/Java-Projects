/* 
     Yilmaz, Ferah
     CSA170
     March 1, 2018
     IC09_Magic8Ball
     
 */

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

	public static void main(String[] args)
	{
		
		Random rng = new Random();
		int answer;
		String question, response;
		Scanner consoleScanner = new Scanner(System.in);
		
		do{
		System.out.println("What question would like to ask for the Magic 8 ball?");
        question = consoleScanner.nextLine();
        // answer should be random number between 1 and 8
        answer = rng.nextInt(8)+ 1;
       
        switch(answer)
        {
        	case 1:
        		System.out.println("The answer is: It is certain");
        		break;
            case 2:
               System.out.println("The answer is: It is decidedly so");      
               break;
            case 3:
                System.out.println("The answer is: Most likely");
                break;
            case 4:
                System.out.println("The answer is: Signs point to yes");
                break;   
            case 5:
                System.out.println("The answer is: Reply hazy, try again");
                break;
            case 6:
            	System.out.println("The answer is: Ask again later");
            	break;
            case 7:
            	System.out.println("The answer is: Don't count on it");
            	break;    
            case 8:
            	System.out.println("the answer is: My sources say no");
            	break;
        }
        
        System.out.println("\nWould you like to ask another question? (type Y or N)");
        response = consoleScanner.nextLine().toUpperCase();
		} while(response.startsWith("Y"));
		
		consoleScanner.close();
		System.out.println("Thank you for playing the Magic 8 Ball.");
	       
		 

	}

}

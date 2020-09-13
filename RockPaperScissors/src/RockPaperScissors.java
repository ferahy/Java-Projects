/* 
     Yilmaz, Ferah
     CSA170
     February 22, 2018
     IC07_RockPaperScissors 
     
 */


import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String player1, player2;
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.print("Player 1 (enter R for rock, P for paper, S for scissors): ");
		player1 = consoleScanner.next().toUpperCase();
		System.out.print("Player 2 (enter R for rock, P for paper, S for scissors): ");
		player2 = consoleScanner.next().toUpperCase();
		
		//Make a decision on Player 1:
		switch ( player1 )
		{
		     case "R" :
		    	 switch (player2)
		    	 {
		    	      case "R" :
		    	    	  System.out.println("It's a draw!");
		    	    	  break;
		    	      
		    	      case "P" :
		    	    	  System.out.println("Player 2 wins! Paper covers rock.");
		    	    	  break;
		    	      
		    	      case  "S" :
		    	    	  System.out.println("Player 1 wins! Rock breaks scissors.");
		    	    	  break;
		    	    	    
		    	    	  
		    	 }
		    	 break;
		     
		     case "S":
		    	 switch(player2)
		    	 {
		         case "R" :
	    	    	  System.out.println("Player 2 wins! Rock breaks scissors.");
	    	    	  break;
	    	      
	    	      case "P" :
	    	    	  System.out.println("Player 1 wins! Scissors cut paper.");
	    	    	  break;
	    	      
	    	      case  "S" :
	    	    	  System.out.println("It's a draw!");
	    	    	  break;
		    	 }
		    	 break;
		    	
		     case "P":
		    	 switch(player2)
		    	 {
		    	 case "R" :
	    	    	  System.out.println("Player 1 wins! Paper covers rock.");
	    	    	  break;
	    	      
	    	      case "P" :
	    	    	  System.out.println("It's a draw!");
	    	    	  break;
	    	      
	    	      case  "S" :
	    	    	  System.out.println("Player 2 wins! Scissors cut paper.");
	    	    	  break;
	    	    	  
		    	 }
		    	 break;
		  	 
		    	 
		}
		
		consoleScanner.close();

	}

}

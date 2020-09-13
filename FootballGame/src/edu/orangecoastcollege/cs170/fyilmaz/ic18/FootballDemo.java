package edu.orangecoastcollege.cs170.fyilmaz.ic18;

import java.util.Scanner;

public class FootballDemo 
{

	public static void main(String[] args) 
	{
		String homeTeam,visitorTeam;
		int scoringEvent, team;
		Scanner consoleScanner = new Scanner(System.in);
        
		System.out.print("Please enter home team name: ");
        homeTeam = consoleScanner.nextLine();
        System.out.print("Please enter visitor team name: ");
        visitorTeam = consoleScanner.nextLine();
        
        // Once you name the teams, make a new Football
        
        Football game = new Football(homeTeam, visitorTeam);
        
        do
        {
            System.out.println("\nEnter Scoring Event (or -1 to end game):\n" + 
                                "1) To score touchdown" + 
                                "\n2) To score extra point" + 
                                "\n3) To score conversion" +
                                "\n4) To score field goal" + 
                                "\n5) To score safety\n");
            System.out.print(">>");
                                
            scoringEvent = consoleScanner.nextInt();
            if (scoringEvent == -1)
            {
            	consoleScanner.close();
        		System.exit(0);
            }
            
            System.out.print("\nEnter Team: " + 
                    "\n\n1) For " + homeTeam + " (home)" + 
                    "\n2) For " + visitorTeam + " (visitor)\n\n>>");
            team =consoleScanner.nextInt();
            
            switch(scoringEvent)
            {
            	case 1: // touchdown
            		game.scoreTouchdown((team == 1 ? homeTeam : visitorTeam));
            		break;
            	case 2: // extra point
            		game.scoreExtraPoint((team == 1) ? homeTeam : visitorTeam );
            		break;
            	case 3 : // conversion
            		game.scoreConversion((team == 1) ? homeTeam : visitorTeam);
            		break;
            	case 4:
            		game.scoreFieldGoal((team == 1) ? homeTeam : visitorTeam);
            		break;
            	case 5:
            		game.scoreSafety((team == 1) ? homeTeam : visitorTeam);
            		break;
            
            }
            // Print the game on screen
            System.out.println(game);
        
        }while (scoringEvent != -1);
      
	}
	
}

package edu.orangecoastcollege.cs170.fyilmaz.ic21;

import java.util.Scanner;

public class Sudoku {
	
		// Constants:
	public static final int[][] initialPuzzle = {

	           { 9, 0, 0, 8, 0, 5, 0, 0, 6 },

	           { 1, 0, 3, 0, 0, 0, 5, 0, 4 },

	           { 0, 6, 0, 0, 2, 0, 0, 7, 0 },

	           { 0, 0, 7, 1, 0, 8, 6, 0, 0 },

	           { 4, 0, 0, 0, 0, 0, 0, 0, 9 },

	           { 0, 0, 9, 7, 0, 3, 1, 0, 0 },

	           { 0, 9, 0, 0, 1, 0, 0, 6, 0 },

	           { 3, 0, 2, 0, 0, 0, 4, 0, 7 },

	           { 5, 0, 0, 3, 0, 2, 0, 0, 1 }
	           };
	public static int[][] solvedPuzzle = {

	           { 9, 7, 4, 8, 3, 5, 2, 1, 6 },

	           { 1, 2, 3, 9, 6, 7, 5, 8, 4 },

	           { 8, 6, 5, 4, 2, 1, 9, 7, 3 },

	           { 2, 3, 7, 1, 9, 8, 6, 4, 5 },

	           { 4, 8, 1, 2, 5, 6, 7, 3, 9 },

	           { 6, 5, 9, 7, 4, 3, 1, 2, 8 },

	           { 7, 9, 8, 5, 1, 4, 3, 6, 2 },

	           { 3, 1, 2, 6, 8, 9, 4, 5, 7 },

	           { 5, 4, 6, 3, 7, 2, 8, 9, 1 } 
	           };
	
	public static  final int ROWS = 9;
	public static final int COLS = 9;
	
	public static void main(String[] args)
	{
		// Declare the array
		int[][] workingPuzzle = new int[ROWS][COLS];
		Scanner consoleScanner  = new Scanner(System.in);
		int row, col;
		String operation;
		// Reset the working puzzle (new game)
		resetPuzzle(workingPuzzle);
		// Print the puzzle
		do{
			printPuzzle(workingPuzzle);
			System.out.println("What would you like to do? \n(S) Set square, (R) Reset puzzle, (Q) Quit");
			operation = consoleScanner.next().toUpperCase();
			// Make a decision on the operation:
			switch (operation)
			{
			case "S":
				System.out.println("Which row (1-9) and which column (1-9) do you want to change?");
                row = consoleScanner.nextInt() - 1;
                col = consoleScanner.nextInt() - 1;
                System.out.println("What should the value (1-9) be?");
                workingPuzzle[row][col] = consoleScanner.nextInt();
                if (gameIsWon(workingPuzzle))
                {
                	int i;
                    for (i = 0; i < 10; i++)
                          System.out.println("C*O*N*G*R*A*T*U*L*A*T*I*O*N*S, you WON Sudoku !!!");
                	
                    System.exit(0);
                }
				break;
			case "R" : // reset
				resetPuzzle(workingPuzzle);
				break;
			case "Q" : // quit
				System.out.println( "Thanks for playing! ");
				System.exit(0);
				break;
			}
			
		}
		// Keep playing as long as the game is ! (not) won
		while (!gameIsWon (workingPuzzle));
		// After while loop, user WON!!!
		// Congratulate them.
		consoleScanner.close();
		
	}
	
	// Make a method to reset the puzzle
	public static void resetPuzzle(int[][] workingPuzzle)
	{
		// Let's loop through the working puzzle and assign it to the initial puzzle
		for (int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j< COLS; j++)
			{
				workingPuzzle[i][j]= initialPuzzle[i][j];
			}
		}
		
	}
	
	public static void printPuzzle(int[][] workingPuzzle)
	   {
	       System.out.println(" C 1 2 3 4 5 6 7 8 9");
	       System.out.println("R  -----------------");
	       
	       // Let's loop through the working puzzle
	       for (int i = 0; i < ROWS; i++)
	       {
	    	   // In every row, print the row number followed a
	    	   System.out.print((i + 1) + " |");
	           for (int j = 0; j < COLS; j++)
	           {
	        	   if (workingPuzzle[i][j] == 0)
	                   System.out.print(". ");
	               else
	                   System.out.print(workingPuzzle[i][j] + " ");
	           }
	           // End of the columns
	           System.out.println();
	       
	       }
	   }
	public static boolean gameIsWon(int[][] workingPuzzle)
	   {
		// If the workingPuzzle is the exact same as the solvedPuzzle, return true
	       for (int i = 0; i < ROWS; i++)
	       {
	           for (int j = 0; j < COLS; j++)
	           {
	               if (workingPuzzle[i][j] != solvedPuzzle[i][j]) 
	                   return false;
	           }
	       }
	       // Made it through all rows and all columns, return true
	       return true;
	   }

}

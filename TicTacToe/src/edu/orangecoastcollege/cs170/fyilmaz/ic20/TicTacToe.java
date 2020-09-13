package edu.orangecoastcollege.cs170.fyilmaz.ic20;

import java.util.Scanner;

public class TicTacToe 
{
	public static final int ROWS = 3;
	public static final int COLS = 3;
	static char[][] board = new char[ROWS][COLS];

	public static void main(String[] args) 
	{
		
		int moves = 0, row, col;
		Scanner consoleScanner = new Scanner(System.in);
        for (row = 0; row < ROWS; row++){
            for( col = 0; col < COLS; col++){
                board[row][col] = '*';
            }
        }
		
		System.out.println("Welcome to Tic-Tac-Toe!");
		do{
			printBoard();
            System.out.print("Please enter row: ");
            row = consoleScanner.nextInt()-1;
            System.out.print("Please enter column: ");
            col = consoleScanner.nextInt()-1;
            
            // Place either an'X' or 'O' on the board
            // If moves are EVEN, put an 'X'
            // Else put an 'O'
            board[row][col] = ((moves % 2) == 0 ? 'X':'O');
            // After the move, change it!
            moves++;
			
			// Keep playing the game as long as not won and moves < 9
		}while(moves < 9 && !gameIsWon(row, col, board));
		printBoard();
		consoleScanner.close();
		
		System.out.println(moves != 9 ? "We have a winner!": "It's a tie!");
		
	}
	
	// Make a method that determines whether the game is won
	public static boolean gameIsWon(int x, int y, char[][] board)
	{
		for(int i = 0; i < COLS; i++){
            if(board[x][i] != board[x][y])
                break;
            if(i == COLS-1){
                return true;
            }
        }
    	
        for(int i = 0; i < COLS; i++){
            if(board[i][y] != board[x][y])
                break;
            if(i == COLS-1){
                return true;
            }
        }
        
       
        if(x == y){
            for(int i = 0; i < COLS; i++){
                if(board[i][i] != board[x][y])
                    break;
                if(i == COLS-1){
                    return true;
                }
            }
        }

        
        if(x + y == COLS - 1){
            for(int i = 0;i<COLS;i++){
                if(board[i][(COLS-1)-i] != board[x][y])
                    break;
                if(i == COLS-1){
                    return true;
                }
            }

        }

        return false;
    }
    
	// Make a method that will print the board 
    public static void printBoard(){
        System.out.println("-------------");
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|\n-------------");
        }
    }
    


}


	

	
	 


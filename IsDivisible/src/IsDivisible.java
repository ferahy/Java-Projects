/* 
     Yilmaz, Ferah
     CSA170
     February 13, 2018
     IC05_IsDivisible
     
 */

import java.util.Scanner;

public class IsDivisible {

	public static void main(String[] args) 
	{
		int x, y;
		Scanner consoleScanner = new Scanner(System.in);
		System.out.print("Please enter a number for x: ");
		x = consoleScanner.nextInt();
		System.out.print("Please enter a number for y: ");
		y = consoleScanner.nextInt();
		consoleScanner.close();
		
		// If statement ( conditional statement) or (decision)
		// else = false part
		
		if (x % y == 0)
		{
			System.out.println(x + " is divisible by " + y);
		}
		else
			// False part
			System.out.println(x + " is NOT divisible by " + y);
		
		
	}

}

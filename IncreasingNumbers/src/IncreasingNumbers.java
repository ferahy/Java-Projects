/* 
     Yilmaz, Ferah
     CSA170
     February 13, 2018
     IC05_IncreasingNumbers
 */



import java.util.Scanner;

public class IncreasingNumbers
{
	public static void main(String[] args)
	{
		int x, y, z ;
		
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.print("Please enter a nonnegative number: ");
		x = consoleScanner.nextInt();
		System.out.print("Please enter a nonnegative number: ");
		y = consoleScanner.nextInt();
		System.out.print("Please enter a nonnegative number: ");
		z = consoleScanner.nextInt();
		
		consoleScanner.close();
		
		if( x <0 || y<0 || z<0)
		{
			System.out.print("Please enter a nonnegative numbers only: ");
			
		}
		
		System.out.println("\nThe numbers you entered in increasing order are:");
		
		if ( z < x && y<x && z<y)
		{
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
			
		}
		
		else if (z<y && x<y && z<x) 
		{
			System.out.println(z);
			System.out.println(x);
			System.out.println(y);
		}
		else if (z<y && x<y && z>x)
		{
			System.out.println(x);
			System.out.println(z);
			System.out.println(y);
		}
	
		else if (z>y && z>x && x>y) 
		{
			System.out.println(y);
			System.out.println(x);
	    	System.out.println(z);
	    }
	
		else if (z>y && z>x && x<y) 
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	    
		

			
	}
}
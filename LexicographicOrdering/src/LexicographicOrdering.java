/* 
     Yilmaz, Ferah
     CSA170
     February 22, 2018
     IC07_LexicographicOrdering 
     
 */

import java.util.Scanner;

public class LexicographicOrdering {

	public static void main(String[] args) 
	{
		String s1, s2, s3;
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.println("Please enter 3 strings (in any order): ");
		s1 = consoleScanner.next();
		s2 = consoleScanner.next();
		s3 = consoleScanner.next();
		
		if ( s1.compareTo (s2) < 0 && s2.compareTo(s3) < 0){
			
			System.out.println(s1 + "\n" + s2 + "\n" + s3);
			System.out.println("\nIn Lexicographic ordering, the strings you entered are:");
		}
		
		else if ( s2.compareTo(s1)<0 && s1.compareTo(s3) < 0)
		 {
			 System.out.println("\nIn Lexicographic ordering, the strings you entered are:");
			 System.out.println(s2 + "\n" + s1 + "\n" + s3);
		 }
		 
		 else if ( s3.compareTo(s1)<0 && s1.compareTo(s2) < 0)
		 {
			 System.out.println("\nIn Lexicographic ordering, the strings you entered are:");
			 System.out.println(s3 + "\n" + s1+ "\n" + s2);

		 }
		 else if ( s3.compareTo(s2)<0 && s2.compareTo(s1) < 0)
		 {
			 System.out.println("\nIn Lexicographic ordering, the strings you entered are:");
			 System.out.println(s3 + "\n" + s2 + "\n" + s1);
		 }
			
			consoleScanner.close();
		
		
		
		


	}

}

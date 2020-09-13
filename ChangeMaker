import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.println("Enter a whole number from 1 to 99"
				+ "\nI will find a combination of coins to"
				+ " equal that amount of change.");
		int number = consoleScanner.nextInt();
		int finalNumber = number;
		
		int quarter = (number / 25);
		number = number % 25;
		int dimes = (number / 10);
		number = number % 10;
		int nickels = (number / 5);
		number = (number % 5);
		int penny = number;
		
		System.out.println(finalNumber + " cents in coins can be given as:");
		System.out.println(quarter + " quarter(s)\n"
				+ dimes + " dime(s)\n"
				+ nickels + " nickel(s)\n"
				+ penny + " penny(ies)");
		
		
		consoleScanner.close();
	}

}

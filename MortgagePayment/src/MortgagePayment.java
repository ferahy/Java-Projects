import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgagePayment {

	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.print("Please enter your mortgage payment: $");
		double mortgagePayment = consoleScanner.nextDouble();
		
		System.out.print("Please enter outstanding balance on mortgage: $");
		double outstandingBalance = consoleScanner.nextDouble();
		
		DecimalFormat twoDPs = new DecimalFormat("#,###.00");
		double interestRate = 4;
		
		System.out.println("Of your $" + twoDPs.format(mortgagePayment) + " mortgage payment:");
		
		double interest = (outstandingBalance / 12) / 100 * 4;
		System.out.println("$" + twoDPs.format(interest) + " goes to interest");
		
		double principal = mortgagePayment - interest;
		System.out.println("$" + twoDPs.format(principal) + " goes to principal");
		
		consoleScanner.close();
	}

}

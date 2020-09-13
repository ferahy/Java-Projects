/* 
     Yilmaz, Ferah
     CSA170
     February 27, 2018
     IC08_BasicCalculator 
     
 */


import java.text.DecimalFormat;
import java.util.Scanner;


public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner consoleScanner = new Scanner(System.in);
System.out.println("*****************************************************************************************");
System.out.println("**" + "                                                                                     **");
System.out.println("**" + "                         WELCOME TO FERAH'S BASIC CALCULATOR"+"                         **");
System.out.println("**" + "                                                                                     **");
System.out.println("*****************************************************************************************");
System.out.println("Type one of the following operators:");
System.out.println("+  (for adding numbers)" +
					"\n-  (for subtracting numbers)" +
					"\n*  (for multiplying numbers)" +
					"\n/  (for dividing numbers)"+
					"\n%  (for finding the remainder when two numbers are divided)"+
					"\n^  (for exponentiation - one number raised to the power of the other)");
System.out.println("*****************************************************************************************");

double  divide, power, number1,plus, sub, times,modul, number2;
String operator;
DecimalFormat zeroDPs = new DecimalFormat("0");
DecimalFormat oneDP = new DecimalFormat("#.#");

operator= consoleScanner.next();
System.out.print("Enter an operand(number)");
number1= consoleScanner.nextInt();
System.out.print("Enter an operand(number)");
number2= consoleScanner.nextInt();



switch(operator){
case "+" :
plus = number1+ number2;
	System.out.println(zeroDPs.format(number1) + " + " + zeroDPs.format(number2) +" = "+ zeroDPs.format(plus));
break;

case "-" :
	sub = number1 - number2;
	System.out.println(zeroDPs.format(number1) + " - " + zeroDPs.format(number2) +" = "+zeroDPs.format(sub));
	

	break;	

case "*" :
	times =	number1 * number2;
	System.out.println(zeroDPs.format(number1) + " * " + zeroDPs.format(number2) +" = "+ zeroDPs.format(times));
	break;

case "/" :
	divide = number1 / number2;

	System.out.println(zeroDPs.format(number1) + " / " + zeroDPs.format(number2) +" = "+ oneDP.format(divide) );
	break;

case "%" :
	modul =	number1 % number2;

	System.out.println(zeroDPs.format(number1) + " % " + zeroDPs.format(number2) +" = "+ zeroDPs.format(modul));
	break;

case "^" :
	power = Math.pow(number1,number2);  //method to calculate the power of any given base
	System.out.println(zeroDPs.format(number1) + " ^ " + zeroDPs.format(number2) +" = "+ zeroDPs.format(power));
	
break;
	
	default:
		System.err.println("\nThe operator inserted is invalid. Try again");
		System.exit(0);
	break;
	
}
consoleScanner.close();
	}

}


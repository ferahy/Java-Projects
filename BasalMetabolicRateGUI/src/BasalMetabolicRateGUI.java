/* 
     Yilmaz, Ferah
     CSA170
     February 27, 2018
     IC08_BasalMetabolicRateGUI 
     
 */



import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BasalMetabolicRateGUI extends JFrame{

	public static final double CHOCOLATE_CALORIES = 230.0;
	
	public static void main(String[] args) {	
		
		Scanner consoleScanner = new Scanner(System.in);
		DecimalFormat oneDP = new DecimalFormat("0.0");
		DecimalFormat noDP = new DecimalFormat("0");

		double weight, height, age, bmr = 0.0, bars;
		
		int gender;
		
		String activity;

		//User input 

		weight= Double.parseDouble(
				JOptionPane.showInputDialog(null,"Please enter your weight (Ib): "));
		
		height = Double.parseDouble(
				JOptionPane.showInputDialog(null,"Please enter your height (in): "));
		
		age = Double.parseDouble(
				JOptionPane.showInputDialog(null,"Please enter your age : "));
		
		//Let's make our first showOptionDialog!
		//Start by defining the custom buttons in an ARRAY:
		
		String[] buttons = { "Female", "Male"};
		gender= JOptionPane.showOptionDialog(null,
				"Calculate BMR for Female or Male?", 
				"Identify Gender",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				buttons,
				buttons[0]);
	
		
		String[] options ={
		        "Sedentary (not active)",
		        "Slightly Active (exercise occasionally)",
		        "Active (exercise 3-4 times per week)", 
		        "Highly Active (exercise every day)"};
		
		Object selectedValue = JOptionPane.showInputDialog(null,
		        "Select Activity Level",
		        "BMR Activity Level",
		        JOptionPane.INFORMATION_MESSAGE,
		        null,
		        options,
		        options[0]);
		
		activity = selectedValue.toString();
		
		
		if (gender==0) {
			bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);}
		
		else if (gender==1)
			bmr = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
		else {
			JOptionPane.showInputDialog(null,"Sorry, I don't understand.  Bye.");
			System.exit(0);
		}

		switch (activity) {
		case "Sedentary (not active)":
			bmr *= 1.2;
			break;
		case "Slightly Active (exercise occasionally)":
			bmr *= 1.3;
			break;
		case "Active (exercise 3-4 times per week)":
			bmr *= 1.4;
			break;
		default:
			bmr *= 1.5;
			break;
		}

		bars = bmr / CHOCOLATE_CALORIES;

		JOptionPane.showMessageDialog(null,"As a " + buttons[gender] + ", your BMR x Activity Factor is " + noDP.format(bmr)
				+ " and you need to eat " + oneDP.format(bars) + " chocolate bars to maintain this amount of calories.");

		
		consoleScanner.close();
	}

}

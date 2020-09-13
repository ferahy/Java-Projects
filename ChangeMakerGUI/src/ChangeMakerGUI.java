/* 
     Yilmaz, Ferah
     CSA170
     February 27, 2018
     IC08_ChangeMakerGUI 
     
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChangeMakerGUI extends JFrame
{


	public static void main(String[] args)
    {
        
        int cents, cents2, quarters, dimes, nickels, pennies;
        
        //parent window, message, caption
        //showInputDialog returns a String
        //we use Integer.parseInt to convert to int 
        
        cents = Integer.parseInt (JOptionPane.showInputDialog(null, "Please enter number of cents between 1 and 99:"));
        cents2 = cents;
        
        // Change given in coins
        quarters = cents / 25;
        cents = cents % 25;
        dimes = cents / 10;
        cents = cents % 10;
        nickels = cents / 5;
        pennies = cents % 5; // Left over after filtering out nickels is the amount of pennies

        JOptionPane.showMessageDialog(null,
        		cents2 + " cents in coins can be given as:\n"
                + quarters + " quarter(s)\n" 
                + dimes + " dime(s)\n" 
                + nickels + " nickel(s)\n"
                + pennies + " penny(ies)");
        
        
  }


}

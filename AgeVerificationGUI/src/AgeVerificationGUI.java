
/* 
Yilmaz, Ferah
CSA170
February 22, 2018
IC07_AgeVerificationGUI

*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AgeVerificationGUI extends JFrame{
	public static void main (String[] args) 
	{
		
		int choice;
		
		//Choice is either 0 (YES), 1 ( NO) , or -1 (X)
		choice = JOptionPane.showConfirmDialog(null, "Are you 21 years of age or older?", 
				"Age Verification", JOptionPane.YES_NO_OPTION);
	
		//Decide what to do with a switch:
		switch ( choice )
		{
		
		case JOptionPane.YES_OPTION:
		     //Adult
			JOptionPane.showMessageDialog(null, "Proceed on adult!", "You are an adult",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case JOptionPane.NO_OPTION:
			//Minor
			 JOptionPane.showMessageDialog(null, "Minor Detected", "You shall not pass!", 
					 JOptionPane.ERROR_MESSAGE);
			break;
		case JOptionPane.DEFAULT_OPTION:
			//Aversion
			 JOptionPane.showMessageDialog(null, "You must answer the question", "Aversion Detected", 
					 JOptionPane.ERROR_MESSAGE);
			break;
		
	
		}
}

}

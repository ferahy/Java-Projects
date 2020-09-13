/* 
     Yilmaz, Ferah
     CSA170
     February 13, 2018
     IC04_HackerChallenge_Olaf
 */


import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class HackerChallenge_Olaf extends JApplet{
	
	public void init()
	{
		setSize (300,300);
	}
	
	public void paint (Graphics canvas)
	
	{
		// Eyes
		canvas.drawOval(100, 60, 20, 20);
		canvas.drawOval(120, 61, 19, 19);
		// Nose (upper)
		canvas.drawArc(110, 80, 32, 20, 9, 120);
		// Eyes(inside)
		canvas.fillOval(104, 64, 13, 13);
		canvas.fillOval(123, 64, 13, 13);
		//Nose
		canvas.drawArc(137, 89, 12, 10, -15, 120);
		canvas.drawArc(116, 72, 41, 25, 173, 135);
		//Head(left)
		canvas.drawArc(90, 2, 140, 144, 165, 24);
		//Head (up)
		canvas.drawArc(93, 41, 50, 29, 35, 140);
		// Head (right)
		canvas.drawArc(48, 29, 100, 90, 38, -51);
		//Cheek (right)
		canvas.drawArc(133, 84, 19, 22, 0, 67);
		//Neck (right)
		canvas.drawArc(65, 20, 90, 132, 302, 44);
		//Cheeks
		canvas.drawArc(86, 80, 32, 45, 70, 93);
		// Mouth (side)
		canvas.drawArc(93, 87, 10, 20, 70, 93);
		//Mouth
		canvas.drawArc(96, 77, 90, 30, 170, 110);
		canvas.drawArc(138, 88, 15, 20, 305, 75);
		//Teeth
		canvas.drawArc(116, 101, 25, 13, 150, 210);
		// Neck (left)
		canvas.drawArc(86, 24, 80, 125, 190, 50);
		// Neck
		canvas.drawArc(106,131, 30, 15, 183, 157);
		// Nose marks
		canvas.drawArc(137, 89, 12, 10, 40, 120);
		canvas.drawArc(130, 85, 12, 10, 40, 120);
		canvas.drawArc(124, 86, 12, 10, -200, 50);
		// Upper body (left)
		canvas.drawArc(100, 109, 100, 90, 160, 45);
		// Upper body (bottom)
		canvas.drawArc(105, 162, 33, 18, 190, 150);
		// Upper body ( right)
		canvas.drawArc(42, 120, 100, 78, 28, -50);
		// Lower body (left)
		canvas.drawArc(96, 148, 110, 94, 150, 49);
		//Lower body (right)
		canvas.drawArc(40, 150, 110, 85, 35, -62);
		//Lower body (bottom)
		canvas.drawArc(100, 200, 44, 20, 190, 165);
		//Buttons
		canvas.fillOval(108, 155, 13, 13);
		canvas.fillOval(108, 182, 13, 13);
		canvas.fillOval(109, 198, 13, 13);
		//Legs
		canvas.drawArc(120, 207, 20, 25, 180, 190);
		canvas.drawArc(100, 206, 20, 25, 160, 180);
		

       
		Graphics2D canvas2D = (Graphics2D) canvas;
        canvas2D.setStroke(new BasicStroke(3));
        
        //Eyebrows
        canvas.drawArc(119, 53, 24, 28, 5, 120);
        canvas.drawArc(95, 53, 24, 30, 50, 110);
        
        //Arms
		canvas.drawArc(132, 33, 20, 190, 200, 30);//right
		canvas.drawArc(67, 113, 180, 45, 200, 30);// left
		
		//Fingers
		canvas.drawArc(131, 65, 20, 140, 250, 18);//right
		canvas.drawArc(106, 155, 245, 210, 140, 5);//right
		canvas.drawArc(106, 163, 245, 210, 140, 3);//right
		canvas.drawArc(134, 116, 245, 210, 170, 3);//right
		canvas.drawArc(70, 49, 245, 210, 170, 3);//left
		canvas.drawArc(41, 105, 245, 210, 140, 3);//left
		canvas.drawArc(67, 10, 245, 230, 185, 3);//left
		canvas.drawArc(57, 109, 180, 45, 200, 6);// left
		
		//Hair
		canvas.drawArc(124, 33, 10, 20, 70, 93);
		canvas.drawArc(106, 27, 15, 27, 0, 90);
		canvas.drawArc(97, 30, 20, 20, 0, 80);

      
        
	}

}

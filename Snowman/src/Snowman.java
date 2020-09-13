/* 
     Yilmaz, Ferah
     CSA170
     February 8, 2018
     IC04_Snowman
*/




import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Snowman extends JApplet{
	
	public void init()
	{
		setSize(350, 350);
	}
	
	public void paint (Graphics canvas)
	{
		canvas.setColor(Color.BLACK);
		canvas.drawOval(100, 10, 50, 50);
		
		canvas.setColor(Color.BLACK);
		canvas.drawOval(75, 60, 100, 100);
		
		canvas.setColor(Color.BLACK);
		canvas.drawOval(50, 160, 150, 150);
		
		canvas.fillOval(110, 25, 10, 10);
		canvas.fillOval(130, 25, 10, 10);
		
		canvas.drawArc(115, 35, 20, 15, 180, 180);
		
		
	
	}
	
	
}

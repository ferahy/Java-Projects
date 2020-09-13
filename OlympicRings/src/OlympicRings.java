/* 
     Yilmaz, Ferah
     CSA170
     February 8, 2018
     IC04_OlympicRings
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

// 1) Tell Java we're making an Applet (not console app)
public class OlympicRings extends JApplet
{
    
    // Two entry points (init and paint)
    
    public void init()
    {
        // init sets the size of your canvas
        setSize(350,350);
    }
    
    public void paint (Graphics canvas)
    {
        // How to thicken the line
        Graphics2D canvas2D = (Graphics2D) canvas;
        canvas2D.setStroke(new BasicStroke(5));
        
        
        // to change color use canvas.setColor
        canvas.setColor(Color.BLUE);
        canvas.drawOval(0, 0, 100, 100);
        
        canvas.setColor(Color.YELLOW);
        canvas.drawOval(60, 50, 100, 100);
        
        canvas.setColor(Color.BLACK);
        canvas.drawOval(120, 0, 100, 100);
        
        canvas.setColor(Color.GREEN);
        canvas.drawOval(180, 50, 100, 100);
        
        canvas.setColor(Color.RED);
        canvas.drawOval(240, 0, 100, 100);
        
        
        
        
        
        
    }

}

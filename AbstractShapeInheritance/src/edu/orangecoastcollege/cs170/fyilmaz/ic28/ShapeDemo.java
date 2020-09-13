package edu.orangecoastcollege.cs170.fyilmaz.ic28;

import java.awt.Color;
import java.util.ArrayList;

public class ShapeDemo
{

    public static void main(String[] args)
    {
        
    	ArrayList<Shape2D> ShapeList= new ArrayList<>();
    	
    	ShapeList.add(new Rectangle(Color.BLACK,2,2,4,12));
    	ShapeList.add(new Triangle(Color.BLACK,6,2,6,5));
    	ShapeList.add(new Parallelogram(Color.BLACK,1,1,4,10));
    		
    	for(Shape2D shape: ShapeList){
    
    		if(shape instanceof Rectangle)
    
    			System.out.println("\n"+shape);
    		
    		else if (shape instanceof Triangle)
    			
    			System.out.println(shape);
    		
    		else if (shape instanceof Parallelogram)
			
    			System.out.println(shape);



    	}
   
    }

}

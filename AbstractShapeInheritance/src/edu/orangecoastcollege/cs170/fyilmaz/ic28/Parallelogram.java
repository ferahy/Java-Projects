package edu.orangecoastcollege.cs170.fyilmaz.ic28;

import java.awt.Color;

public class Parallelogram extends Shape2D
{

    private int mHeight;
    private int mWidth;

        public Parallelogram(Color color,int x, int y,int height, int width)
    {
        mcolor=color;
        mX=x;
        mY=y;
        mHeight = height;
        mWidth = width;
    }

		public int getHeight() {
			return mHeight;
		}

		public void setHeight(int height) {
			mHeight = height;
		}

		public int getWidth() {
			return mWidth;
		}

		public void setWidth(int width) {
			mWidth = width;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + mHeight;
			result = prime * result + mWidth;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Parallelogram other = (Parallelogram) obj;
			if (mHeight != other.mHeight)
				return false;
			if (mWidth != other.mWidth)
				return false;
			return true;
		}
		
		public String toString()
	    {
	            String output="";
	                        for(int i=0; i<mHeight;i++)
	                        {
	                            for(int k=0;k<i;k++)
	                            {
	                            	output+=" ";}
	                            
	                            for(int j=0;j<mWidth;j++)
	                            {
	                            	output+="*";  
	                } 
	                            output+="\n";
	            }
	                        output+= "The area of this parallelogram is "+ calculateArea()+ " square units.";
	                        return output; 
	    }
		
		public double calculateArea()
        {
            return mWidth*mHeight;
        }
		
        
        
}


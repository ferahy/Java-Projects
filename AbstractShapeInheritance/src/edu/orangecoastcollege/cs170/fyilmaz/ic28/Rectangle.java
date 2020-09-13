package edu.orangecoastcollege.cs170.fyilmaz.ic28;

import java.awt.Color;
import java.io.Serializable;

	public class Rectangle extends Shape2D implements Serializable
	{
		private int mHeight;
		private int mWidth;

		public Rectangle(Color color,int x, int y,int height, int width)
		{
			mcolor=color;
			mX=x;
			mX=y;
			mHeight = height;
			mWidth = width;
		}

		public int getMheight() {
			return mHeight;
		}

		public void setMheight(int mheight) {
			this.mHeight = mheight;
		}

		public int getMwidth() {
			return mWidth;
		}

		public void setMwidth(int mwidth) {
			this.mWidth = mwidth;
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
			Rectangle other = (Rectangle) obj;
			if (mHeight != other.mHeight)
				return false;
			if (mWidth != other.mWidth)
				return false;
			return true;
		}
		
		public String toString()
		{
		        String output="";
		        for(int i=0; i<mHeight;i++){
		            for(int j=0;j<mWidth;j++){
		                output+="*";
		            }
		            output+="\n";
		        }
		        output+= "The area of this rectangle is "+ calculateArea()+ " square units.";
		    return output; 
		}
		public double calculateArea()
	    {
	        return mWidth*mHeight;
	    }
		
	}

		
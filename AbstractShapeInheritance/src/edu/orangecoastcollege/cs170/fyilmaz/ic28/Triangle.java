package edu.orangecoastcollege.cs170.fyilmaz.ic28;

import java.awt.Color;
import java.io.Serializable;

	public class Triangle extends Shape2D implements Serializable
	{
		private int mHeight;
		private int mBase;

		public Triangle(Color color,int x,int y,int height, int base)
		{
			mcolor= color;
			mX=x;
			mY=y;
			mHeight = height;
			mBase = base;
    
		}

		public int getMheight() {
			return mHeight;
		}

		public void setMheight(int mheight) {
			this.mHeight = mheight;
		}

		public int getMbase() {
			return mBase;
		}

		public void setMbase(int mbase) {
			this.mBase = mbase;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + mBase;
			result = prime * result + mHeight;
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
			Triangle other = (Triangle) obj;
			if (mBase != other.mBase)
				return false;
			if (mHeight != other.mHeight)
				return false;
			return true;
		}
		
		public String toString()
	    {
	        String output="";
	        for(int i=0;i<mBase;i++){
	            for(int j=0;j<i+1;j++){
	                output+="*";
	            }
	            output+="\n";
	        }
	        output+= "The area of this triangle is "+ calculateArea()+ " square units.";
	        return output; 
	    }
		
		public double calculateArea()
	    {
	        return mHeight*mBase/2;
	    }
		
		
		
	}

   

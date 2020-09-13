package edu.orangecoastcollege.cs170.fyilmaz.ic28;

import java.awt.Color;
import java.io.Serializable;

public abstract class Shape2D implements Serializable
{
	
		protected Color mcolor;
		protected int mX;
		protected int mY;
		public Color getMcolor() {
			return mcolor;
		}
		public void setMcolor(Color mcolor) {
			this.mcolor = mcolor;
		}
		public int getX() {
			return mX;
		}
		public void setX(int x) {
			mX = x;
		}
		public int getY() {
			return mY;
		}
		public void setY(int y) {
			mY = y;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + mX;
			result = prime * result + mY;
			result = prime * result + ((mcolor == null) ? 0 : mcolor.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Shape2D other = (Shape2D) obj;
			if (mX != other.mX)
				return false;
			if (mY != other.mY)
				return false;
			if (mcolor == null) {
				if (other.mcolor != null)
					return false;
			} else if (!mcolor.equals(other.mcolor))
				return false;
			return true;
		}
		
		public abstract double calculateArea();
		
		
}		
package edu.orangecoastcollege.cs170.fyilmaz.ic29;

import java.io.Serializable;

public class Produce extends PaleoFood implements Serializable
{
	private boolean mOrganic;

	public Produce(String name, int calories, int carbohydrates, boolean organic) 
	{
		super();
		mName=name;
		mCalories=calories;
	    mCarbohydrates=carbohydrates;
		mOrganic = organic;
	}

	public boolean isOrganic() {
		return mOrganic;
	}

	public void setOrganic(boolean organic) {
		mOrganic = organic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (mOrganic ? 1231 : 1237);
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
		Produce other = (Produce) obj;
		if (mOrganic != other.mOrganic)
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		if (mOrganic==true)
		{
			return "Organic Produce : " + mName+ ", " +mCalories+" calories, "+mCarbohydrates + "g carbs";
			}
    else {
        	return "Produce :" + mName+ ", " +mCalories+" calories, "+mCarbohydrates+"g carbs";    
    
	}
	}
	

}

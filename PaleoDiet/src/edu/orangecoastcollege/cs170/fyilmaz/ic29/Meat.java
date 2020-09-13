package edu.orangecoastcollege.cs170.fyilmaz.ic29;

import java.io.Serializable;

public class Meat extends PaleoFood implements Serializable
{
	private int mType;
	private int mCookingTemp;
	
	public Meat(String name,int calories, int type, int cookingTemp) throws MysteryMeatException
	{
		super();
		mName = name;
		mCalories=calories;
		mCookingTemp = cookingTemp;
		
		if(type!=1 && type!=2)
	        throw new MysteryMeatException();
	        else{
	            mType = type;
	        }
	}

	public int getType() {
		return mType;
	}

	public void setType(int type) throws MysteryMeatException
	{
		
		if(type!=1 && type!=2)
            throw new MysteryMeatException("Mystery meat , don't eat that");
        else
        	mType = type;
	}

	public int getCookingTemp() {
		return mCookingTemp;
	}

	public void setCookingTemp(int cookingTemp) {
		mCookingTemp = cookingTemp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mCookingTemp;
		result = prime * result + mType;
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
		Meat other = (Meat) obj;
		if (mCookingTemp != other.mCookingTemp)
			return false;
		if (mType != other.mType)
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		if(mType == 1){
            System.out.print("");
		return "Meat :" + mName +"," + mCalories +" calories ," + mCarbohydrates +"g carbs,"
            		+ mCookingTemp + "degrees F]";
		}
		else if (mType==2)
            System.out.print("");
        return  "Seafood :" + mName+ ", "+mCalories + " calories, " + mCarbohydrates 
        		+ " g carbs, "+ mCookingTemp + " degrees F ]";
		}
	
}

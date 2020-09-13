package edu.orangecoastcollege.cs170.fyilmaz.ic29;

public abstract class PaleoFood 
{
	protected String mName;
	protected int mCalories;
	protected int mCarbohydrates;
	
	

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public int getCalories() {
		return mCalories;
	}

	public void setCalories(int calories) {
		mCalories = calories;
	}

	public int getCarbonhydrates() {
		return mCarbohydrates;
	}

	public void setCarbonhydrates(int carbonhydrates) {
		mCarbohydrates = carbonhydrates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mCalories;
		result = prime * result + mCarbohydrates;
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
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
		PaleoFood other = (PaleoFood) obj;
		if (mCalories != other.mCalories)
			return false;
		if (mCarbohydrates != other.mCarbohydrates)
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		return true;
	}
	
	
	
	
	
	

}

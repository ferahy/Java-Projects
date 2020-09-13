package edu.orangecoastcollege.cs170.fyilmaz.ic14;

public class Flight 
{
	// 1) Fields 
	private String mCarrier;
	private double mDuration;
	private int mNumber;
	private int mPassengers;
	private PlaneType mPlaneType;
	
	// 2) Parameterized Constructor
	public Flight(String carrier, int number, double duration,PlaneType planetype, int passengers)
	{
		mCarrier = carrier;
		mDuration= duration;
		mNumber= number;
		mPlaneType= planetype;
		mPassengers = passengers;
		
	}
	
	// Copy Constructor (copies all member variables of existing Flight)
	public Flight (Flight other)
	{
		mCarrier = other.mCarrier;
		mDuration= other.mDuration;
		mNumber= other.mNumber;
		mPlaneType= other.mPlaneType;
		mPassengers = other.mPassengers;		
	}
	
	public PlaneType getPlaneType()
    {
        return mPlaneType;
    }
	
	public String getCarrier()
	{
		return mCarrier;
	}
	
	public double getDuration()
	{
		return mDuration;
	}
	
	public int getNumber()
	{
		return mNumber;
	}
	
	public int getPassengers()
	{
		return mPassengers;
	}
	
	public void setCarrier(String carrier)
    {
    	mCarrier = carrier;
    }
	public void setDuration(double duration)
	{
		mDuration = duration;
	}
	public void setNumber (int number)
	{
		mNumber = number;
	}
	public void setPlaneType (PlaneType planetype)
	{
		mPlaneType = planetype;
	}
	public String toString()
	{
		String output = "Flight [Carrier="+ mCarrier +", Duration=" + mDuration + ", Plane Type="
					+ mPlaneType + ", Passengers=" + mPassengers +"]";
		return output;
	}
	
	public boolean equals(Flight other)
	{
		if(mCarrier.equals(other.mCarrier) && mNumber == other.mNumber
				&& mDuration == other.mDuration && mPlaneType == other.mPlaneType
				&& mPassengers == other.mPassengers)
			return true;
		else 
			return false;
	}
	
	// 7) Miscellaneous Methods 
	public boolean addPassengers(int amount)
	{
		// Check the plane types first:
		if(mPlaneType == PlaneType.AIRBUS_320 && (mPassengers + amount) <= 150 )
		{
			mPassengers += amount;	
			return true;
		}
		else if (mPlaneType == PlaneType.BOEING_737 && (mPassengers + amount) <= 200)
		{
			mPassengers += amount;
			return true;
		}
		else 
			return false;
	}
	
	public boolean removePassengers(int amount)
	{
		if ((mPassengers - amount) >= 0)
		{
			mPassengers -= amount;
			return true;
		}
		
		else 
			return false;		
	}
	

}

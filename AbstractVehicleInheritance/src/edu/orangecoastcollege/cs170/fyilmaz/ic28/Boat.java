package edu.orangecoastcollege.cs170.fyilmaz.ic28;

public class Boat extends Vehicle
{
	private int mNumberofCabins;

	public Boat( int year, String manufacturer, int numberofCabins) {
		
		mNumberofCabins = numberofCabins;
		mManufacturer = manufacturer;
        mYear = year;
	}

	public int getNumberofCabins() {
		return mNumberofCabins;
	}

	public void setNumberofCabins(int numberofCabins) {
		mNumberofCabins = numberofCabins;
	}
	
	@Override
	public String toString() {
		return "[Boat: " + mManufacturer + ", " +  mYear + ", " + mNumberofCabins + " cabins]";
	}
		
		
		
	
	

}

package edu.orangecoastcollege.cs170.fyilmaz.ic28;

public class Car extends Vehicle {
	
	private int mNumberOfDoors;
    
	public Car(String manufacturer, int year, int numberOfDoors)
	    {
	        mManufacturer = manufacturer;
	        mYear = year;
	        mNumberOfDoors = numberOfDoors;
	    }

	public int getNumberOfDoors() {
		return mNumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		mNumberOfDoors = numberOfDoors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mNumberOfDoors;
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
		Car other = (Car) obj;
		if (mNumberOfDoors != other.mNumberOfDoors)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Car: " + mManufacturer + ", " +  mYear + ", " + mNumberOfDoors + " doors]";
	}

}

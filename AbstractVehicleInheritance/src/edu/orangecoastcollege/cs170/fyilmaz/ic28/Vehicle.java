package edu.orangecoastcollege.cs170.fyilmaz.ic28;

public abstract class Vehicle
{

    protected String mManufacturer;
    protected int mYear;
    public String getManufacturer()
    {
        return mManufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        mManufacturer = manufacturer;
    }
    public int getYear()
    {
        return mYear;
    }
    public void setYear(int year)
    {
        mYear = year;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mManufacturer == null) ? 0 : mManufacturer.hashCode());
        result = prime * result + mYear;
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Vehicle other = (Vehicle) obj;
        if (mManufacturer == null)
        {
            if (other.mManufacturer != null) return false;
        }
        else if (!mManufacturer.equals(other.mManufacturer)) return false;
        if (mYear != other.mYear) return false;
        return true;
    }

    // NO CONSTRUCTORS IN ABSTRACT CLASSES!!!

    // We still want equals and hashCode

    // NO TOSTRING!!

}

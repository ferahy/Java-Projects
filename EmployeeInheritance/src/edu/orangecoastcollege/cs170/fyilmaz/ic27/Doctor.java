package edu.orangecoastcollege.cs170.fyilmaz.ic27;

import java.text.NumberFormat;

public class Doctor extends Employee
{
	protected double mOfficeFee;
	protected String mSpeciality;
	
	public Doctor(String name, double annualSalary, String id, int yearHired, double officeFee, String speciality) 
	{
		super("Dr.",name, annualSalary, id, yearHired);
		mOfficeFee = officeFee;
		mSpeciality = speciality;
	}
	
	public Doctor(Doctor other) 
	{
		this(other.mName, other.mAnnualSalary, other.mId, other.mYearHired,other.mOfficeFee, other.mSpeciality);
	}

	public double getOfficeFee() {
		return mOfficeFee;
	}

	public void setOfficeFee(int officeFee) {
		mOfficeFee = officeFee;
	}

	public String getSpeciality() {
		return mSpeciality;
	}

	public void setSpeciality(String speciality) {
		mSpeciality = speciality;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(mOfficeFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mSpeciality == null) ? 0 : mSpeciality.hashCode());
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
		Doctor other = (Doctor) obj;
		if (Double.doubleToLongBits(mOfficeFee) != Double.doubleToLongBits(other.mOfficeFee))
			return false;
		if (mSpeciality == null) {
			if (other.mSpeciality != null)
				return false;
		} else if (!mSpeciality.equals(other.mSpeciality))
			return false;
		return true;
	}

	@Override
	public String toString() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return "Doctor [" + mHonorific + " " + mName + ", Id= " + mId + ", Year Hired= " 
	            + mYearHired + ", Annual Salary= " + currency.format(mAnnualSalary) + ", Office Fee= " 
				+ currency.format(mOfficeFee) + ", Speciality= " + mSpeciality + "]";
	}

	
	

}

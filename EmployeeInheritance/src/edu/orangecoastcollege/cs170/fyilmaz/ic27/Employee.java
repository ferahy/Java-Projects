package edu.orangecoastcollege.cs170.fyilmaz.ic27;

import java.text.NumberFormat;

// To enable inheritance, use "extends"
public class Employee extends Person
{
	protected double mAnnualSalary;
	protected String mId;
	protected int mYearHired;
	
	public Employee(String honorific, String name, double annualSalary, String id, int yearHired) 
	{
		super(honorific, name);
		mAnnualSalary = annualSalary;
		mId = id;
		mYearHired = yearHired;
	}
	public Employee(String name, double annualSalary, String id, int yearHired) 
	{
		// Calling the code in the first (parameterized) constructor
		this("", name, annualSalary, id, yearHired);
	}
	
	public Employee (Employee other)
	{
		this(other.mHonorific, other.mName, other.mAnnualSalary, other.mId, other.mYearHired);
		
	}
	

	public double getAnnualSalary() {
		return mAnnualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		mAnnualSalary = annualSalary;
	}

	public String getId() {
		return mId;
	}

	public void setId(String id) {
		mId = id;
	}

	public int getYearHired() {
		return mYearHired;
	}

	public void setYearHired(int yearHired) {
		mYearHired = yearHired;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(mAnnualSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + mYearHired;
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
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(mAnnualSalary) != Double.doubleToLongBits(other.mAnnualSalary))
			return false;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (mYearHired != other.mYearHired)
			return false;
		return true;
	}
	@Override
	public String toString() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return "Employee [" + mHonorific + " " + mName + ", Id= " + mId 
				+ ", Year Hired=" + mYearHired
				+ ", Annual Salary= " + currency.format(mAnnualSalary) + "]";
	}
	
	
	

	
	

}

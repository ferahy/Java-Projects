package edu.orangecoastcollege.cs170.fyilmaz.ic14;

import java.text.DecimalFormat;

public class GradeDistribution 
{
	private double mNumberAs,mNumberBs,mNumberCs,mNumberDs,mNumberFs;

    public GradeDistribution(double NumberAs, double NumberBs, double NumberCs, 
    		double NumberDs, double NumberFs)
    {
        mNumberAs = NumberAs;
        mNumberBs = NumberBs;
        mNumberCs = NumberCs;
        mNumberDs = NumberDs;
        mNumberFs = NumberFs;
    }
    
    public GradeDistribution(GradeDistribution other)
    {
        mNumberAs = other.mNumberAs;
        mNumberBs = other.mNumberBs;
        mNumberCs = other.mNumberCs;
        mNumberDs = other.mNumberDs;
        mNumberFs = other.mNumberFs;
    }

    public double getNumberAs()
    {
        return mNumberAs;
    }

    public double getNumberBs()
    {
        return mNumberBs;
    }

    public double getNumberCs()
    {
        return mNumberCs;
    }

    public double getNumberDs()
    {
        return mNumberDs;
    }

    public double getNumberFs()
    {
        return mNumberFs;
    }

    public void setNumberAs(int NumberAs)
    {
        mNumberAs = NumberAs;
    }

    public void setNumberBs(int NumberBs)
    {
        mNumberBs = NumberBs;
    }

    public void setNumberCs(int NumberCs)
    {
        mNumberCs = NumberCs;
    }

    public void setNumberDs(int NumberDs)
    {
        mNumberDs = NumberDs;
    }

    public void setNumberFs(int NumberFs)
    {
        mNumberFs = NumberFs;
    }

    public void setAllGrades(int number)
    {
    	mNumberAs = number;
        mNumberBs = number;
        mNumberCs = number;
        mNumberDs = number;
        mNumberFs = number;
    }

    
    public boolean equals(GradeDistribution other)
    {
        if (mNumberAs == other.mNumberAs) 
        	return true;
        if (mNumberBs == other.mNumberBs) 
        	return true;
        if (mNumberCs == other.mNumberCs) 
        	return true;
        if (mNumberDs == other.mNumberDs) 
        	return true;
        if (mNumberFs == other.mNumberFs) 
        	return true;
        
      return false;
    }
    
    public String toString(){
    	String result = "";
    	
    	for(int i = 1; i <= mNumberAs; i++)
    		result += "*";
    		result += " A\n";
    	for(int i = 1; i <= mNumberBs; i++)
    		result += "*";
    		result += " B\n";
    	for(int i = 1; i <= mNumberCs; i++)
    		result += "*";
    		result += " C\n";
    	for(int i = 1; i <= mNumberDs; i++)
    		result += "*";
    		result += " D\n";
    	for(int i = 1; i <= mNumberFs; i++)
    		result += "*";
    		result += " F\n";
    	
    	
    	return result;
    	
    }
   
    public double getPercent(String whichGrade)
    {
    	
    	switch(whichGrade)
    	{
    	case "a": return (mNumberAs/getNumberOfGrades()*100);
    	case "b": return (mNumberBs/getNumberOfGrades()*100);
    	case "c": return (mNumberCs/getNumberOfGrades()*100);
    	case "d": return (mNumberDs/getNumberOfGrades()*100);
    	case "f": return (mNumberFs/getNumberOfGrades()*100);
    	
    	default : return 0.0;
    	}
    }
    
    public double getNumberOfGrades()
    {
    	double result = 0;
    	result += mNumberAs;
    	result += mNumberBs;
    	result += mNumberCs;
    	result += mNumberDs;
    	result += mNumberFs;
    	
    	return result;
    }
    
    public String getPercentAs()
    {
    	DecimalFormat ZeroDp = new DecimalFormat("#");
    	return ZeroDp.format(getPercent("a")) + "%";
    }
    
    public String getPercentBs()
    {
    	DecimalFormat ZeroDp = new DecimalFormat("#");
    	return ZeroDp.format(getPercent("b")) + "%";
    }

    public String getPercentCs()
    {
    	DecimalFormat ZeroDp = new DecimalFormat("#");
    	return ZeroDp.format(getPercent("c")) + "%";
    }

    public String getPercentDs()
    {
    	DecimalFormat ZeroDp = new DecimalFormat("#");
    	return ZeroDp.format(getPercent("d")) + "%";
    }

    public String getPercentFs()
{
    	DecimalFormat ZeroDp = new DecimalFormat("#");
    	return ZeroDp.format(getPercent("f")) + "%";
}

}

package edu.orangecoastcollege.cs170.fyilmaz.ic14;

import java.text.DecimalFormat;

public class GradeDistributionDemo 
{

	public static void main(String[] args) 
	{
		GradeDistribution grade = new GradeDistribution(4, 14, 21, 7, 4);
		
		DecimalFormat ZeroDp = new DecimalFormat("#");
		

		System.out.println(ZeroDp.format(grade.getPercent("a")) + "%");
		System.out.println(ZeroDp.format(grade.getPercent("b")) + "%");
		System.out.println(grade.getPercentCs());
		System.out.println(grade.getPercentDs());
		System.out.println(grade.getPercentFs());
		
		System.out.println(grade);
		
	}

}

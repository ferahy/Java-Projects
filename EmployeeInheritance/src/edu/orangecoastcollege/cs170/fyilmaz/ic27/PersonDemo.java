package edu.orangecoastcollege.cs170.fyilmaz.ic27;

import java.util.ArrayList;

public class PersonDemo {

	public static void main(String[] args) 
	{
		// Let's create 3 new people
		// 1 Person
		// 1 Employee
		// 1 Doctor
		
		Person channing = new Person ("Mr." , "Channing Tatum");
		Employee ellen = new Employee("Ms.", "Ellen Degeneres", 5_000_000, "edegeneres", 1999);
		Doctor strange = new Doctor("Strange", 1, "dstrange", 1980, 1 , "Evil");
		
		// Let's store them all in an ArrayList <Person>
		ArrayList<Person> peopleList = new ArrayList<> ();
		peopleList.add(channing);
		peopleList.add(ellen);
		peopleList.add(strange);
		
		// Loop through all the people in the list, print them all out
		for( Person p : peopleList)
			System.out.println(p);
		
		

	}

}

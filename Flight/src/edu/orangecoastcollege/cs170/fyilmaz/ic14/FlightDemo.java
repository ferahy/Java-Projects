package edu.orangecoastcollege.cs170.fyilmaz.ic14;

public class FlightDemo {

	public static void main(String[] args) 
	{
		Flight flight1 = new Flight("Hawaiian", 1, 5.5, PlaneType.AIRBUS_320, 100);
		
		// 2) Creates a new Flight object named flight2 by copying flight1
		Flight flight2 = new Flight(flight1);
		
		// 3) Print both objects to the console
		System.out.println(flight1);
		System.out.println(flight2);
		
		// 4) Compare both Flight objects using the equals method.
		//If they are equal, print the message "Both flights are the same."  
		//Otherwise, print the message "The flights are different."  
		//Then print a blank line (empty line)
		
		if(flight1.equals(flight2))
			System.out.println("Both flights are the same.\n");
		else
			System.out.println("The flights are different.");
		
		// 5) Now, change each of the fields for flight2 with mutators to the following values:
		//Carrier = "Delta"
	    //Flight Number = 1284
	    //Duration = 6.0
	    // Plane Type = PlaneType.BOEING_737
		// [number of passengers will stay the same]
		
		flight2.setCarrier("Delta");
		flight2.setNumber(1284);
		flight2.setDuration(6.0);
		flight2.setPlaneType(PlaneType.BOEING_737);
		
		// 6) Print both objects to the console
		System.out.println(flight1);
		System.out.println(flight2);
		
		if(flight1.equals(flight2))
			System.out.println("Both flights are the same.");
		else
			System.out.println("The flights are different.");
		
		System.out.println("\n~~~~~Adding 100 Passengers to both Flights~~~~~");
		flight1.addPassengers(100);
		flight2.addPassengers(100);
		System.out.println(flight1);
		System.out.println(flight2);
		
		
		
		System.out.println("\n~~~~~Removing 200 Passengers from both Flights~~~~~");
		flight1.removePassengers(200);
		flight2.removePassengers(200);
		System.out.println(flight1);
		System.out.println(flight2);
		
			
	}

}

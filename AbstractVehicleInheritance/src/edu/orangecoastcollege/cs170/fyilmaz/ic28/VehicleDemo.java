package edu.orangecoastcollege.cs170.fyilmaz.ic28;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDemo {
		public static void main(String[] args) {
			
			ArrayList<Vehicle> VehicleList = new ArrayList<>();
			
			Scanner consoleScanner = new Scanner(System.in);
			String name = "";
			
			do{
				System.out.print("Do you have a boat or a car? (or type \"quit\"):");
				name = consoleScanner.nextLine();
				
				if(name.equalsIgnoreCase("quit")) break;
				
				if(name.equalsIgnoreCase("car"))
				{	
					System.out.print("Name of car: ");
					name = consoleScanner.nextLine();
					
					System.out.print("Please enter a year it was made: ");
					int year = consoleScanner.nextInt();
					
					System.out.print("How many doors: ");
					int door = consoleScanner.nextInt();
					
					VehicleList.add(new Car(name, year, door));
				
				}
				
				else if(name.equalsIgnoreCase("boat"))
				{
					System.out.print("Name of boat: ");
					name = consoleScanner.nextLine();
										
					System.out.print("Enter name of dealer: ");
					String make = consoleScanner.nextLine();
					
					System.out.print("Please how many cabins: ");
					int cabins = consoleScanner.nextInt();
					
					System.out.print("Please enter year: ");
					int year = consoleScanner.nextInt();
					
					VehicleList.add(new Boat(year, make, cabins));
				}
				
				else
				{
					System.out.println("Input has to be either car or boat! Please press [enter] to continue");
					
				}
				
				consoleScanner.nextLine();
			}while(!name.equalsIgnoreCase("quit"));
			
			consoleScanner.close();
			
			System.out.println("\n");
			for(Vehicle v: VehicleList){
				System.out.println(v);
			}
		}

}

package edu.orangecoastcollege.cs170.fyilmaz.ic29;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class FoodJournalDemo {
    
	public static void main(String[] args)
    {
        ArrayList<PaleoFood> FoodList = new ArrayList<>();
        Scanner consoleScanner = new Scanner(System.in);
        int type;
        int carbo = 0;
     
        int input = 0;
        File binaryFile = new File("FoodJournal.dat");
        System.out.println("~~~~~~~~~~Welcome to the Paleo Food Journal~~~~~~~~~");
        if (binaryFile.exists())
        {
            try
            {
                ObjectInputStream FileReader = new ObjectInputStream(new FileInputStream(binaryFile));
                PaleoFood[] foodArray = (PaleoFood[]) FileReader.readObject();

                for (PaleoFood food : foodArray)
                {
                    FoodList.add(food);
                    System.out.println(food);
                }
                FileReader.close();
            }
            catch (FileNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("\n[No food eaten. You must be hungry.]");
            
        }
        
        do
        {
        	
            System.out.println("\n********Options Menu*********");
            System.out.println("Enter (1) to record a meat");
            System.out.println("Enter (2) to record a produce");
            System.out.println("Enter (3) to quit");
            
          
            input = consoleScanner.nextInt();
            consoleScanner.nextLine();
            switch (input) {
                case 1: // Meat
                    String nameM = "";
                    int cookingTemp=0;
                    System.out.print("Enter (1) for Meat and (2) for Seafood: ");
                    
                    type = consoleScanner.nextInt();
                    consoleScanner.nextLine();
                    System.out.print("Please enter the name of the Meat eaten: ");
                    nameM = consoleScanner.nextLine();
                    System.out.print("Please enter the heat of the temperature: ");
                    cookingTemp = consoleScanner.nextInt();
                    System.out.print("How many calories was it? ");
                    int calo = 0;
                    calo = consoleScanner.nextInt();
                    System.out.print("How many carbohydrates? ");
                    carbo = consoleScanner.nextInt();
                   

                    
                    try {
                        Meat meat = new Meat(nameM, calo, cookingTemp, type);
                        FoodList.add(meat);
                    } 
                    catch (MysteryMeatException e1) {
                        // TODO Auto-generated catch block
                        e1.getMessage();
                    }
                    
                    for(PaleoFood pf: FoodList) {
            			System.out.println(pf);}
                  
                    break;
                case 2:
                    System.out.print("What was the name of the Produce eaten? ");
                    String name = consoleScanner.nextLine();
                    System.out.print("How many calories? ");
                    int cal = consoleScanner.nextInt();
                    System.out.print("How many carboyhdrates? ");
                    int carb = consoleScanner.nextInt();
                    Produce produce = new Produce(name, cal, carb, false);
                    System.out.print("Enter (1) for organic or (2) for non-Organic ");
                    produce.setOrganic(consoleScanner.nextInt() == 1 ? true : false);
                    FoodList.add(produce);
                    default:
                        System.out.println("Eat healthy and enjoy your break!");
                    break;
                                }

            System.out.println("Total calories Eaten: " + totalCalories(FoodList));
            System.out.println("Number of organic fruits and veggies eaten: " + organicProduceConsumed(FoodList));
        }
        while (input != 3);
        
        consoleScanner.close();
        
        try
        {
            ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream(binaryFile));
            PaleoFood[] foodArray = new PaleoFood[FoodList.size()];
            FoodList.toArray(foodArray);
            fileWriter.writeObject(foodArray);
            fileWriter.close();

        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
       
        public static int totalCalories (ArrayList <PaleoFood> FoodsList)
        {
            int total = 0;
        	for ( PaleoFood pf : FoodsList)
        		total += pf.getCalories();
        	return total;
        	
        }
        
        public static int organicProduceConsumed (ArrayList <PaleoFood> FoodsList)
        {
        	int total =0;
        	
        	for ( PaleoFood pf : FoodsList)
        	{
        		if(pf instanceof Produce)
        		{
        			Produce p = (Produce) pf;
        			if(p.isOrganic())
        				
        				total++;
        		}
        
        	}return total;
        	
            
        	
        }
        
        

}


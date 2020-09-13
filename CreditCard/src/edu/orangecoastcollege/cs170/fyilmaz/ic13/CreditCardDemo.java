package edu.orangecoastcollege.cs170.fyilmaz.ic13;

public class CreditCardDemo 
{
	public static void main(String[] args)
    {
       
        CreditCard card1 = new CreditCard(CardNetwork.VISA, "1234 5678 9123 "
        		+ "4567", "Ferah Yilmaz", "11/2017", "123");
        CreditCard card2 = new CreditCard(CardNetwork.VISA, "1234 5678 9123 "
        		+ "4567", "Someone", "11/2017", "123");
        
        System.out.println(card1);
        System.out.println(card2);
        
        if(card1.equals(card2))
        {
            System.out.println("The cards are the same.\n");
        }
        else
            System.out.println("The cards are different.\n");
        
        card2.setcardholder("Ferah Yilmaz");
              
            System.out.println(card1);
            System.out.println(card2);
            
        if(card1.equals(card2))
        {
            System.out.println("The cards are the same.");
        }
        else
            System.out.println("The cards are different.");
        }	

}

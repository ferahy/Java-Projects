/* 
     Yilmaz, Ferah
     CSA170
     March 1, 2018
     IC09_BatmanAndRiddler
     
 */


public class BatmanAndRiddler {

	public static void main(String[] args) 
	{
		int thousands, hundreds, tens, one;
		
		for (int adress = 1001; adress <= 9999; adress += 2)
		{
			thousands = ( adress % 10000 )/ 1000;
			hundreds = (adress % 1000) / 100;
			tens = (adress % 100) / 10;
			one = (adress % 10) /1;
			
			if (one + hundreds + tens + thousands == 27
					&& thousands != hundreds && thousands != one
					&& hundreds != one && tens != one && tens != hundreds
					&& tens != thousands && one % 2 != 0
					&& tens == thousands / 3 && adress != 9817
					&& adress != 9857 && adress != 9877 && adress != 9897)
				
			System.out.println("The Riddler intends to strike " + adress
					+ " Pennsylvania Avenue.");

		}
		

	}

}

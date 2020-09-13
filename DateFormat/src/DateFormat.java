/* 
     Yilmaz, Ferah
     CSA170
     February 8, 2018
     IC04_DateFormat
 */





import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.println("Please enter the date "
				+ "  (format MM/DD/YYYY) and "
				+ " include the forward slashes:");
		String getDate = consoleScanner.nextLine();
		
		String month = getDate.substring(0, 2);
		String day = getDate.substring(3,5);
		String year = getDate.substring(6, 10);
		
			
		System.out.println("In the European format, "
				+ "DD.MM.YYYY, this date is:\n" + day + "." + month + "." + year);
		
		consoleScanner.close();
	}

}

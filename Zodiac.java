//Maximus Fernandez

//Check the Day. (15pts)
// This depends on the month.
// April, June, September, and November have between 1 and 30 
//days.
// Assume February has 29 days.
// All other months have between 1 and 31 days.
// If the user enters a numeric value that is outside of those ranges,

//Import scanner
import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		//Declare scanner and variables
		Scanner input = new Scanner(System.in);
		int birthMonth;
		int birthDay;
		int monthEnd;
		
		String zodiacSign = "";
		
		//Welcome message
		System.out.println("Hello, I will help you find your Zodiac sign!");
		
		//Asking for user birth month
		System.out.println("Please enter your birth month as a number 1-12.");
		birthMonth = input.nextInt();
		
		//Selects the appropriate day that the month ends on
		//If February, month ends on 29th day
		if (birthMonth == 2) 
		{
			monthEnd = 29;
		} 
		//If April, June, September, or November, 
		//month ends on 30th day
		//if not, the other months end on the 31st
		else if (birthMonth == 4 || birthMonth == 6 
				|| birthMonth == 9 || birthMonth == 11) 
		{
			monthEnd = 30;
		} 
		else 
		{
			monthEnd = 31;
		}
		
		//Asking for user birth day
		System.out.println("Please enter your birth day as a number.");
		birthDay = input.nextInt();
		
		boolean aries = birthMonth == 3 && birthDay >= 21 && birthDay <=monthEnd
				||birthMonth == 4 && birthDay >=1 && birthDay <=19;
		
		
		//Returns indicated zodiac sign
		//If the input does not match the parameters for the zodiac sign, return an error message
		//Aries (March 21 - April 19)
		
		
		ZodiacCalc(birthMonth,birthDay,monthEnd,zodiacSign,aries);
		
		
		//Close Scanner
		input.close();
		
		}

	public static void ZodiacCalc(int birthMonth, int birthDay, int monthEnd, String zodiacSign, boolean aries)
	{
		if(birthMonth < 0) {
			System.out.println("Invalid Month");
		}
		else if (birthDay < 0) {
			System.out.println("Invalid Day");
		}
		
		else if (aries)
		{
			zodiacSign = "Aries";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Taurus (April 20 - May 20)
		else if ((birthMonth == 4 && birthDay >= 20 && birthDay <=monthEnd )
				||(birthMonth == 5 && birthDay >=1 && birthDay <=20))
		{
			zodiacSign = "Taurus";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Gemini (May 21 – June 20)
		else if ((birthMonth == 5 && birthDay >= 21 && birthDay <=monthEnd )
				||(birthMonth == 6 && birthDay >=1 && birthDay <=20))
		{
			zodiacSign = "Gemini";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Cancer (June 21 – July 22)
		else if ((birthMonth == 6 && birthDay >= 21 && birthDay <=monthEnd )
				||(birthMonth == 7 && birthDay >=1 && birthDay <=22))
		{
			zodiacSign = "Cancer";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Leo (July 23 – August 22)
		else if ((birthMonth == 7 && birthDay >= 23 && birthDay <=monthEnd )
				||(birthMonth == 8 && birthDay >=1 && birthDay <=22))
		{
			zodiacSign = "Leo";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Virgo (August 23 – September 22)
		else if ((birthMonth == 8 && birthDay >= 23 && birthDay <=monthEnd )
				||(birthMonth == 9 && birthDay >=1 && birthDay <=22))
		{
			zodiacSign = "Virgo";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Libra (September 23 – October 22)
		else if ((birthMonth == 9 && birthDay >= 23 && birthDay <=monthEnd )
				||(birthMonth == 10 && birthDay >=1 && birthDay <=22))
		{
			zodiacSign = "Libra";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Scorpio (October 23 – November 21)
		else if ((birthMonth == 10 && birthDay >= 23 && birthDay <=monthEnd )
				||(birthMonth == 11 && birthDay >=1 && birthDay <=21))
		{
			zodiacSign = "Scorpio";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Sagittarius (November 22 – December 21)
		else if ((birthMonth == 11 && birthDay >= 22 && birthDay <=monthEnd )
				||(birthMonth == 12 && birthDay >=1 && birthDay <=21))
		{
			zodiacSign = "Sagittarius";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Capricorn (December 22 – January 19)
		else if ((birthMonth == 12 && birthDay >= 22 && birthDay <=monthEnd )
				||(birthMonth == 1 && birthDay >=1 && birthDay <=19))
		{
			zodiacSign = "Capricorn";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} 
		//Aquarius (January 20 – February 18)
		else if ((birthMonth == 1 && birthDay >= 20 && birthDay <=monthEnd )
				||(birthMonth == 2 && birthDay >=1 && birthDay <=18))
		{
			zodiacSign = "Aquarius";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		}
		//Pisces (February 19 – March 20)
		else if ((birthMonth == 2 && birthDay >= 19 && birthDay <=monthEnd )
				||(birthMonth == 3 && birthDay >=1 && birthDay <=20))
		{
			zodiacSign = "Pisces";
			System.out.println("Your zodiac sign is: " +zodiacSign);
		} else {
			System.out.println("Invalid day, please try again.");
		}
	}
	
}

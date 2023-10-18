//Maximus Fernandez

import java.util.Scanner;

public class Winter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creating new scanner
		double[] temps = new double[10]; //array of 10 total double values (indices from 0-9)
		
		System.out.println("Welcome to the below average temperature tester program.");
		
		//User inputs the temperature values for 10 days
		int day1 = 1;
		for (int i=0; i<10; i++) 
		{
			System.out.println("Please enter the temperature for day " + day1);
			day1++;
			temps[i]=input.nextDouble();
		}
		
		//Average temperature
		double avg = ((temps[0]+temps[1]+temps[2]+temps[3]+temps[4]+temps[5]+temps[6]+temps[7]+temps[8]+temps[9])/10);
		System.out.println("The average temperature was: " + avg);
		
		//Below average temperature
		System.out.println("The days that were below average were: ");
		
		int day2 = 1;
		for (int i = 0; i<10; i++) {
			if (temps[i] < avg) {
				System.out.println("Day "+day2+" with "+temps[i]);
				day2++;
			}
		}
		
		
		input.close();
		
	}

}

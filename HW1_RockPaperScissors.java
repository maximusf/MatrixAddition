//Maximus Fernandez
//importing Scanner and Random
import java.util.Random;
import java.util.Scanner;
public class HW1_RockPaperScissors {

	public static void main(String[] args) {
		
		//Creating new scanner for user/bot input + variables
		Scanner input = new Scanner(System.in);
		String userChoice = " ";
		String botChoice = " ";
		boolean runGame = true;
		int botInput;
		int points = 0;
		int ties = 0;
		
		//Greetings display
		System.out.println();
		System.out.println("Welcome to Rock, Paper, Scissors Simulator");
		System.out.println();
		System.out.println("------------------------------------------------");
		
		//For a total of 3 rounds, user will play against the 'computer'
		//'Computer' will use a random number to choose its move
		while (runGame == true)
		{

			for (int i=0; i<3; i++) 
			{
				//User input for rock, paper, scissors choice
				System.out.println("Please choose your move.");
				userChoice = input.nextLine();
				
				
				//Determines the computer's choice
				Random rand = new Random();
				botInput = rand.nextInt(3);
				if (botInput == 0)
				{
					botChoice = "Rock";
				}
				else if (botInput == 1)
				{
					botChoice = "Paper";
				}
				else if (botInput == 2)
				{
					botChoice = "Scissors";
				}
				
				//Displays computer choice
				System.out.println("The computer chose " + botChoice + ".");
				
				//There is a tie if both sides have the same choice (Tie Conditions)
				if (userChoice.equalsIgnoreCase("Rock") && botChoice.equalsIgnoreCase("Rock"))
				{
					System.out.println("There was a tie");
					ties++;
				} 
				else if (userChoice.equalsIgnoreCase("Paper") && botChoice.equalsIgnoreCase("Paper"))
				{
					System.out.println("There was a tie");
					ties++;
				}
				else if (userChoice.equalsIgnoreCase("Scissors") && botChoice.equalsIgnoreCase("Scissors"))
				{
					System.out.println("There was a tie");
					ties++;
				}
				
				//Add a point if round is won (User Win Conditions)
				else if (userChoice.equalsIgnoreCase("Rock") && botChoice.equalsIgnoreCase("Scissors")) 
				{
					System.out.println("You won this round");
					points++;
				}
				else if (userChoice.equalsIgnoreCase("Paper") && botChoice.equalsIgnoreCase("Rock"))
				{
					System.out.println("You won this round");
					points++;
				}
				else if (userChoice.equalsIgnoreCase("Scissors") && botChoice.equalsIgnoreCase("Paper"))
				{
					System.out.println("You won this round");
					points++;
				}	
				else
				{
					System.out.println("You lost this round");
				}
				System.out.println();
				
			}
			//User won game display
			if (points >= 2 && ties >= 0)
			{
				System.out.println("You won this game!");
			}
			else if (ties >= 2 && points >= 0) 
			{
				System.out.println("You tied this game!");
			} 
			else if (points < 2 && ties < 2)
			{
				System.out.println("You lost this game!");
			}
			
			//Resets the score each loop
			points = 0;
			ties = 0;
			
			System.out.println("------------------------------------------------");
			// Program asks if user wants to play again
			System.out.println("Would you like to play again?");
			userChoice=input.nextLine();
			if (userChoice.equalsIgnoreCase("no")){
				runGame = false;
				System.out.println();
				System.out.println("Thank you for playing!");
			}
			
		}
		
		//Closing Scanner
		input.close();

	}

}

import java.util.Scanner;
public class TheLottery2
{
	public static void main( String [] args )
	{
		System.out.println( "WELCOME TO THE JAVA LOTTERY! WIN UP TO $100,000,000!" );

		Scanner input = new Scanner( System.in );

		final int NUMBER_OF_PLAYERS = Input.getInt( "Enter the number of players: " );

		int total[] = new int[NUMBER_OF_PLAYERS];

		String names [] = new String[NUMBER_OF_PLAYERS];
				
		for (int h = 0; h < NUMBER_OF_PLAYERS; h++)
		{
			names [h] = Input.getString( "Enter name of player " + (h + 1) + ": " );
		}

		System.out.println( "_____________________________________________________________________________________________________________________");

		for (int p = 0; p < NUMBER_OF_PLAYERS; p++)
		{
			System.out.println( "\nWelcome " + names [p] );
			for (int j = 0; j < 10; j++)
			{
				int lottery = (int) (Math.random() * 100);
	
    				System.out.println("------------------------------------------------------------------------------------------------------");

				System.out.print( "\nEnter your lottery pick (two digits): " );
				int guess = input.nextInt();
		
				int lotteryDigit1 = lottery / 10;
				int lotteryDigit2 = lottery % 10;

				int guessDigit1 = guess / 10;
				int guessDigit2 = guess % 10;

				System.out.println( "The lottery number is " + lottery );
				String w = "\nWINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER WINNER";
				String w2 = "winner winner winner!";

				System.out.println();

				if (guess == lottery)
				{
					System.out.println( "Exact match: you win $100,000,000" + "\n" + w + w + w + w + w + w + w + w + w + w + w + w + w + w + w + w + w + w + w );
					total[p] += 100000000;
				}
				else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
				{
					System.out.println( "Match all digits: you win $100,000" + "\n" + w2);
					total[p] += 100000;
				}
				else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
				{
					System.out.println( "Match one digit: you win $100" + "\n" + "winner!");
					total[p] += 100;
				}
				else 
				{
					System.out.println( "Sorry, your guess matches no digits" );
				}

				System.out.println();

				if ((lottery - guess == 0 && lottery - guess >= 0 || guess - lottery == 0 && guess - lottery >= 0 ))
				{
					System.out.println( w );
				}
				else if ((lottery - guess < 2 && lottery - guess >= 0 || guess - lottery < 2 && guess - lottery >= 0 ))
				{
					System.out.println( "You were less than 2 away! You win $10,000" + "\n" + w2 );
					total[p] += 10000;
				}
				else if ((lottery - guess < 5 && lottery - guess >= 0 || guess - lottery < 5 && guess - lottery >= 0 ))
				{
					System.out.println( "You were less than 5 away! You win $1,000" + "\n" + w2 );
					total[p] += 1000;
				}
				else if ((lottery - guess < 10 && lottery - guess >= 0 || guess - lottery < 10 && guess - lottery >= 0 ))
				{
					System.out.println( "You were less than ten away! You win $100" + "\n" + w2 );
					total[p] += 100;
				}
				else 
				{
					System.out.println( "Sorry, your guess is very far off" );
				}

				System.out.println( "\nYour total now is: " + total[p] );
			}
			System.out.println( "\n\n\n______________________________________________________________________________________________________" );
			System.out.println( "Your final 10-turn total is: " + total[p] );
		
			if (total[p] >= 100000000)
				System.out.println( "Wow, you're good at this!" );
			else if (total[p] >= 10000000)
				System.out.println( "Amazing job!" );
			else if (total[p] >= 1000000)
				System.out.println( "Great job!");
			else if (total[p] >= 100000)
				System.out.println( "Pretty good!" );
			else if (total[p] >= 10000)
				System.out.println( "Not bad at all" );
			else if (total[p] >= 1000)
				System.out.println( "Okay job" );
			else if (total[p] >= 100)
				System.out.println( "Could've been better" );
			else
				System.out.println ( "Sorry, better luck next time" );
			
			if (p < (NUMBER_OF_PLAYERS - 1))
				System.out.println( "Get ready " + names [p + 1] );
			else 
				System.out.println( "ready to see the game results?" );

			System.out.println( "************************************************************************************************************" );
			System.out.println( "\n\n\n" );
		}
		System.out.println( "\n\n" );
		System.out.println( "Game results:" );
		System.out.println();
           
         	int max = 0; 
         
         	for ( int i = 0; i < total.length; i++) 
             		if (total[i] > max) 
                		max = total[i];
		
		for ( int f = 0; f < total.length; f++)
			if (max == total[f])
				System.out.println( names [f] + " WON! WITH A TOTAL OF $" + total[f] );

		System.out.println( "\nScores: " );
		System.out.println( "\n" );
		
		for (int j = 0; j < total.length; j++)
			System.out.println( names [j] + ": $" + total[j] );	
	}
}
package replit;

import java.util.Scanner;

public class Cons01 {
	/*
	 Write a Scrabble Game for two person
 Rules
OK== 1- At the beginning Ask to first Player enter a word for starting game
OK 2- Then change the player ask to new player if given word is valid or not 
OK		i) If new player accepts the given word add number of letters in the word 
			as points to player who wrote the word And go to step 3
OK     ii) If new player  does not accept the word as valid then print "Invalid word, 
			player X(Current player) won the game" and finish the game

OK  3- Ask to users if user want to continue game or not
OK     i) If player want to continue,
OK      ask to user a letter to add to word
OK      and ask to user side to add (beginning or end)
OK       then add letter to word and run step 2

OK    ii) If player does not want to continue

  then print "Game Finished" and print points  and winner
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int player1Point=0;
		int player2Point=0;
		
		System.out.print("Player1 enter a word : ");
		String word1=scan.next();
		
		System.out.print("player2--> Given word \""+word1+"\" is valid or not?--> \"Y/N\": ");
		
		String cevap=scan.next().toLowerCase();
		if (cevap.equals("y")) {
			player1Point+=word1.length();
			
			System.out.println("Player2, does the user2 want to continue the game?--> \"Y/N\"");
			cevap=scan.next().toLowerCase();
			
			if (cevap.equals("y")) {
				System.out.println("which side to add?-->(Begining or End) B/E");
				String side=scan.next().toLowerCase();
				System.out.println("Enter the letter you want to add to the word");				
				String letter=scan.next();
				
				if (side.equals("b")) {
					word1=letter+word1;
					player2Point+=word1.length();
				}else {
					word1+=letter;
					player2Point+=word1.length();
				}
			}else {
				System.out.println( "Game Finished");
				if (player1Point>player2Point) {
					System.out.println("Winner : player1 "+player1Point);
				}else if (player1Point<player2Point) {
					System.out.println("Winner : player2 "+player2Point);
				}else {
					System.out.println("End in a draw, won brotherhood");
				}
			}
			
			
		}else {
			System.out.println("Invalid word player1 won the game");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

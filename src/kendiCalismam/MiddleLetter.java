package kendiCalismam;

import java.util.Scanner;

public class MiddleLetter {

	public static void main(String[] args) {
		//Question 3
				//1.Ask user to enter a word. If the word has odd number of characters
				//lenth() of characters
				//and has 3 or more characters, print the character in the middle of the word.

		Scanner scan = new Scanner(System.in);
        System.out.print("please enter one String ==> ");
		String str = scan.nextLine();
		
		if (str.length()%2==0) {
			System.out.println("entered words has no middle letter");
		}else {
			System.out.println(str.charAt((int)str.length()/2));
		}
		
		
	}

}

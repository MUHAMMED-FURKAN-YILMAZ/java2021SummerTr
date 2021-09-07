package replit;

public class list08 {

	/*
	 Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.


Input :

I love Java.

Output: 

Reversed sentence : avaJ evol I. 
It is not a palindrome"
	 */
	public static void main(String[] args) {

		 StringBuilder str = new StringBuilder("I love Java.");

	        if (str==str.reverse()) {
	            System.out.println("It is a palindrom sentence");
	        } else {
	            System.out.println("It is not a palindrome");
	        }
	}

}

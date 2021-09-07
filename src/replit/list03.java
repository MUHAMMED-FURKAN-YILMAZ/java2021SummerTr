package replit;

import java.util.Scanner;

public class list03 {
	/*
	 Get a sentence from the user. Accept the sentence received from the user as a parameter, 
	 Invert sentence using Array and write a Method that returns the result as a String to the main method.

	Note: Upper and lower case letters, spaces and special characters will not be changed.

	Input : 

	It is very nice to write code.

	Output : 

	.edoc etirw ot ecin yrev si tI
	 */

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please write a sentence");
		String str=scan.nextLine();
		System.out.println(Invert(str));
		
		scan.close();
	}

	public static String Invert(String str) {
		
		String invertstr="";
		String arr[]=str.split("");
		
		for (int i = arr.length-1 ; i >=0 ; i--) {
			invertstr+=arr[i];
		}
		return invertstr;
		
	}

}

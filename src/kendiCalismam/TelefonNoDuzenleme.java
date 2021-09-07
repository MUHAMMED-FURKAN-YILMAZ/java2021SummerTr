package kendiCalismam;

import java.util.Scanner;

public class TelefonNoDuzenleme {

	public static void main(String[] args) {

		/*
         * Create a method that takes an array of 10 integers (between 0 and 9) and
         * returns a string of those numbers formatted as a phone number (e.g. (555)
         * 555-5555). Examples formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞
         * "(123) 456-7890" formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞
         * "(519) 555-4468" formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞
         * "(345) 501-2527"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("10 haneli telefon numaranizi giriniz");
        StringBuilder numara = new StringBuilder();
        numara.append(scan.next());
        numara.insert(0, "(").insert(4, ") ").insert(9, "-");
        System.out.println(numara);
        
        scan.close();
	}

}

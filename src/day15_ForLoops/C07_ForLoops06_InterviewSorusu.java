package day15_ForLoops;

import java.util.Scanner;

public class C07_ForLoops06_InterviewSorusu {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan 
		// bir String isteyin ve Stringi tersten yazdirin.


		Scanner scan=new Scanner(System.in);		
		System.out.println("Lutfen tersten yazdirmak icin bir string yaziniz");
		
		String str=scan.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.substring(str.length()-1-i, str.length()-i));
		}
		System.out.println("");
		
		// veya böyle olabilir
		
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.substring(i, i+1));
		}
		scan.close();
	}

}

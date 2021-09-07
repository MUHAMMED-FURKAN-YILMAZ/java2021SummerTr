package kendiCalismam;

import java.util.Scanner;

public class StringManipulation03 {

	public static void main(String[] args) {

		// String Manipulation
		
		/* Soru 3) Kullanicidan isim isteyin. Eger
		- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isim giriniz.");
		
		String name=scan.nextLine();
		
		if (name.contains("a") || name.contains("Z")) {		
		   if (name.contains("Z") && name.contains("a")) {
			System.out.println("Girdiginiz isim hem Z hem de a harfi iceriyor");
		   }else if (name.contains("a")) {
			   System.out.println("Girdiginiz isim a harfi iceriyor");
		   }else if(name.contains("Z")){
			System.out.println("Girdiginiz isim Z  harfi iceriyor");
		   }else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
		  }else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
	
		
	scan.close();	
		}

	}	

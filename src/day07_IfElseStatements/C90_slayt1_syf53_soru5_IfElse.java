package day07_IfElseStatements;

import java.util.Scanner;

public class C90_slayt1_syf53_soru5_IfElse {

	public static void main(String[] args) {
		
		/*  slayt.1-syf.53 soru 5:
		 Kullanicidan bir gun alin eger gun " Cuma" ise ekrana "Muslumanlar icin
		 kutsal gun" yazdirin, "Cumartesi" ise ekrana "Yahudiler icin kutsal gun"
		 yazdirin, "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin
		 */

		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen gun ismi giriniz");
		
		String gunIsmi=scan.next().toLowerCase();
	
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
			gunIsmi.equals("carsamba") || gunIsmi.equals("persembe")) {
			System.out.println("Girdiginiz gun özel bir gun degildir");
		}
		else if (gunIsmi.equals("cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		else if (gunIsmi.equals("cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		else if (gunIsmi.equals("pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
		} else {
			System.out.println("Lutfen gecerli gun giriniz");
		}
		
		scan.close();
		
		
		
	}

}

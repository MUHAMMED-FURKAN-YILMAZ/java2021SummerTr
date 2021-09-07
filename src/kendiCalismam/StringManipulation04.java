package kendiCalismam;

import java.util.Scanner;

public class StringManipulation04 {

	public static void main(String[] args) {

		//Soru 4) Kullanicidan isim ve soyismini isteyin ve 
		//		  hangisinin daha uzun oldugunu yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Isminizi girin");
		String name= scan.nextLine();
		
		System.out.println("Soyadinizi girin");
		String surname= scan.nextLine();
		
		if (name.length() > surname.length()) {
			System.out.println("Isminiz daha uzun");
		}else if (name.length() < surname.length()) {
			System.out.println("Soyisminiz daha uzun");
		}else {
			System.out.println("Ýsim soyisim uzunluklari esit");
		}
	scan.close();
	}

}

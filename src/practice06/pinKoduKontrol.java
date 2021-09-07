package practice06;

import java.util.Scanner;

public class pinKoduKontrol {

	public static void main(String[] args) {

		 // INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.
        Scanner scan = new Scanner(System.in);
        System.out.print("PIN kodunuzu giriniz : ");
        int userPin = scan.nextInt();
        int pinCode = 1453;
      
        
        while (pinCode!=userPin) {
		
        System.out.println("basarisiz pin girisi! Tekrar deneyin :");
		userPin=scan.nextInt();
        
        }
        System.out.println("Gayet basarili giris");
	}

}

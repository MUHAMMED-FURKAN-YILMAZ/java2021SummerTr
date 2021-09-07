package day02_Variables_Scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// Kullanicidan iki tam sayi alip bu sayilarin toplam, fark ve carp,mlarini yazdirin
		
		// Kullanicidan deger almak icin 3 adim atmaliyiz.
		// 1- Scanner objesi olusturalim.
		
		Scanner scan= new Scanner(System.in);
		
		// 2- kullanicidan ne istedigimizi yazdiralim
		
		System.out.println("Lutfen iki tam sayi giriniz");
		
		// 3- next methodunu kullanarak girilen degerleri alip, olusturacag�m�z variable'lara atayalim
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Girdiginiz sayilarin toplami :" + (sayi1+sayi2));
		
		scan.close();
		
		
		
		
		
		

	}

}

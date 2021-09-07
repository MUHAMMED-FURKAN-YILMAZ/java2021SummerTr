package day03_DataCasting_Increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		
		// soru7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println("Girdiginiz kelimenin ilk harfi : " + ilkHarf);
		
		scan.close();
	}

}

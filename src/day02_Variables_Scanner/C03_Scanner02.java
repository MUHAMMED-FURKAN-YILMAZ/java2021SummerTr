package day02_Variables_Scanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		
		//  Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki 
		// sekilde yazdirin
		// Isim � soyisim : Mehmet Bulutluoz

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz ");
		
		String name = scan.next();
		
		System.out.println("Lutfen soy isminizi giriniz ");
		
		String surname = scan.next();
			
		System.out.println("isim - soyisim : "+ name +" "+surname);
		
		// eger name ve surname arasina " " icinde bosluk birakmazsak isim soyisim bitisik c�kar. arada bosluk kalsin diye 
		
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}

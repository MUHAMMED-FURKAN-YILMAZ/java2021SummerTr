package day12_StringManipulations;

import java.util.Scanner;


public class C02_StringManipulation02 {

	public static void main(String[] args) {

		/*Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini
		 *  	isteyin ve asagidaki gibi yazdirin
	 			isim-soyisim : M***** B*******
	 			kart no : **** **** **** 1234
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz");
		String name=scan.nextLine();
		
		System.out.println("Lutfen soyadinizi giriniz");
		String surname=scan.nextLine();
		
		System.out.println("Lutfen kredi karti numaranizi giriniz");
		String kkNo=scan.nextLine();
		
		String nameDuzenlenmis= name.substring(0,1).toUpperCase() + // ilk harfi buyuk olarak verir
								name.substring(1).replaceAll("\\w", "*");// ilk harfden sonraki
																		//tum harfleri *'a cevirir.
		String surnameDuzenlenmis= surname.substring(0, 1).toUpperCase() +
									surname.substring(1).replaceAll("\\S", "*"); // \\S veya w kullanilabilir.

		String kkNoDuzenlenmis= "**** **** **** " + kkNo.substring(15);
		
		System.out.println("isim-soyisim : " + nameDuzenlenmis+" "+ surnameDuzenlenmis
							+"\nkart no : "+ kkNoDuzenlenmis);
		
		scan.close();
	}

}

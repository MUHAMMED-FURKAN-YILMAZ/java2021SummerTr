package day42_Exceptions;

import java.util.Scanner;

public class Exceptions10_Throw {

	public static void main(String[] args) {
		/*
		 Soru: Kullanicidan yasini girmesini isteyin. 
		 Kodunuzu kullanici sifirdan kucuk bir sayi girerse 
		 Exception verecek sekilde yazin.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int age=scan.nextInt();
		
		
		//*********1. yol try-catch kullanmadan***********
	/*	
		if (age>=0) {
			System.out.println("yasiniz : "+age);
		}else {
			throw new IllegalArgumentException();
// throw ile 0'in altini exception olarak kabul ettirdik. Ama kodu da BLOKE etmis olur
// Kod bloke olunca devam etmezzz..-->Kod devam etsin istiyorsak try-catck kullanmaliyiz
		}
		System.out.println("dewamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmsutur");	
	*/	
		
		
		//********* 2. yol try-catch kullanarak ***********
		
		try {
			if (age>=0) {
				System.out.println("yasiniz : "+age);
			}else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		// bunda try-catch icinde break olmadigi icin kod devam ediyor. 
		
		
		System.out.println();
		System.out.println("dewamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmsutur");
	

	}

}

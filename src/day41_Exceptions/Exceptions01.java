package day41_Exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
		
		Scanner scan=new Scanner(System.in); 
		
		System.out.print("Bolunen sayi giriniz : ");		
		int sayi1=scan.nextInt();
		
		System.out.print("Bolen sayi giriniz : ");		
		int sayi2=scan.nextInt();
		
		try {
			// e: ArithmeticException class'indan data type ArithmeticException
			//  olan bir exception olan obj. manuel handle yaptik
			System.out.print("Bolum : "+sayi1/sayi2);
		} catch (ArithmeticException e) {		

			// try body'sinden muhtemel hata ArithmeticException olarak catch body'a sart olarak yazdirdik	
			System.err.printf("Hatali giris yaptiniz");// sekilli yazsin diye boyle syso yaptim
			
		}
		
		scan.close();

	}
	

	
	
	

}

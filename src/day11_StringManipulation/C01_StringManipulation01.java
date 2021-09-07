package day11_StringManipulation;

import java.util.Scanner;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
		//kullanicidan bir cumle ve bir kelime alin ,
		//cumlede kelimenin kullanilip kullanilmadigini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz");
		String kelime= scan.next().toLowerCase();
		
		// cumlede kelimenin kullan�l�p kullan�lmad���n� yazd�r�n
		// indexof() kullanal�m
		
		if (cumle.indexOf(kelime)!=-1) {
			System.out.println("Kelime cumlede kullan�lm�s");
		} else {
			System.out.println("Kelime cumlede kullanilmamis");
		
		}	
		//contain () kullanalim daha kolay
		
		if (cumle.contains(kelime)) { // true or false doner
			System.out.println("Kelime cumlede kullan�lm�s");
		}else {
				System.out.println("Kelime cumlede kullanilmamis");
			
		}
	scan.close();
	}

}

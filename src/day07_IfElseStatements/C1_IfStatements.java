package day07_IfElseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
	/*
	  	Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin 
		Ornek: gun=Pazar output = “Hafta sonu”
		gun=Sali output = “Hafta ici”
	 	*** String icin equals method’unu kullanin
	 */
		
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen gun ismini giriniz...");
		
		String gunIsmi=scan.next().toUpperCase();
		
		// bayrak (flag) kullanimi
		int flag = 0;
		
		if (gunIsmi.equals("PAZARTESÝ") || gunIsmi.equals("SALÝ") ||
			gunIsmi.equals("CARSAMBA") || gunIsmi.equals("PERSEMBE") || 
			gunIsmi.equals("CUMA")) 
				 {
			System.out.println("Girdiginiz gun hafta ici");
			flag++;
		}
		
		if (gunIsmi.equals("CUMARTESI") || gunIsmi.equals("PAZAR")) {
			
			System.out.println("Girdiginiz gun hafta sonu");
			flag++;
		}
		
		//pazar yazdigimda ==> flag=1 2. if body'si calisacak
		// sali yazdigimda ==> flag=1 1. if body'si calisacak
		// pazer yazarsak  ==> flag=0
		
		if (flag==0) {
			System.out.println("Lutfen gecerli bir gun ismi yaziniz");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

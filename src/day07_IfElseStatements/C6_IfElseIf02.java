package day07_IfElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		/*
		  Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin 
	Ornek: gun=Pazar output = “Hafta sonu”
	gun=Sali output = “Hafta ici”
	*** String icin equals method’unu kullanin
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen gun ismi yaziniz");
		
		String gunIsmi=scan.next().toUpperCase();
		
		if (gunIsmi.equals("PAZARTESI") || gunIsmi.equals("SALI") || 
			gunIsmi.equals("CARSAMBA") || gunIsmi.equals("PERSEMBE") || gunIsmi.equals("CUMA"))
		 {
	System.out.println("Girdiginiz gun hafta ici");
} else if (gunIsmi.equals("CUMARTESI") || gunIsmi.equals("PAZAR")) {
	
	System.out.println("Girdiginiz gun hafta sonu");	}
else {
	System.out.println("Lutfen gecerli bir gun ismi yaziniz");
}
		
		
		scan.close();
	}

}

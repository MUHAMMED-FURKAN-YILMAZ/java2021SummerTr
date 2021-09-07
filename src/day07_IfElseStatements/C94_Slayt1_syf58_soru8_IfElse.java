package day07_IfElseStatements;

import java.util.Scanner;

public class C94_Slayt1_syf58_soru8_IfElse {

	public static void main(String[] args) {
		/* slayt 1- syf 58-
		 * Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin. 
			Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
			60 – 80.000 arasinda ise “Konusabiliriz”, 
			60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen maas teklifinizi giriniz");
		
		int offer=scan.nextInt();
		
		if (offer>80000) {
			System.out.println("Kabul ediyorum");
		} else if (offer>=60000) {
			System.out.println("Konusabiliriz");
		} else {
			System.out.println("Maalesef kabul edemem");
		}
		scan.close();
		
		
		
		
		
	}

}

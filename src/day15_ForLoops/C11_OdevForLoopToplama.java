package day15_ForLoops;

import java.util.Scanner;

public class C11_OdevForLoopToplama {

	public static void main(String[] args) {
	//Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki 
	//			tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen 2 sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int toplam=0;
		
		if (sayi1<sayi2) {
			for (int i = sayi1 ; i <=sayi2; i++) {
				toplam+=i;
			}
			System.out.println("Girdiginiz sayilar arasi toplami : "+toplam);
		}else if (sayi2<sayi1) {
			for (int i = sayi2 ; i <=sayi1 ; i++) {
				toplam+=i;
			}
			System.out.println("Girdiginiz sayilar arasi toplami : "+toplam);
		}else {
			System.out.println("Sayilar esit ve toplami : "+sayi1+sayi2);
		}
		
		
	scan.close();	
	}

}

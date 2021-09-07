package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		
		//Kullanicidan iki pozitif tam sayi isteyin	/
		// Kullanici negatif sayi girdiginde
		//girilen negatif sayilari yok sayip, yeniden deger isteyin
		//kullanici dogru giris yaptiginda "well done" ve sayilarin carpini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki pozitif tam sayi giriniz");

		int sayi1=0; // burada sayilari kontrol ettirmek icin istenmeyen durumdan bir sayi verilmeli
		int sayi2=0; // nedeni ise while'a sokmak istiyoruz kontrol icin
		
		while (sayi1<=0 || sayi2<=0) {// istenmeyen durumu yaziyoruz
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			
			if (sayi1>0 && sayi2>0) {
	System.out.println("well done \ngirilen sayilarin carpimi : "+(sayi1*sayi2));
		
			}else {
				System.out.println("Lutfn pozitif 2 sayi giriniz");
			}
		}
		
		
		scan.close();
	
		
		
	}

}

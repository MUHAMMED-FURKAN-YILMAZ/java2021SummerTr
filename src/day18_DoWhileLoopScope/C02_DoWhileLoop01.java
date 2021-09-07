package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C02_DoWhileLoop01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki pozitif tam sayi giriniz");

		int sayi1 = 5;//C01 gibi istenmeyen degere gerek yok. verilen deger farketmez do while'da
		int sayi2 = 0;

		do {//C01 class'inda dogru olas bile 1 kez dongu oluyor kontrol 
			// ediliyordu. ancak do while'da basta kontrol eder dogru ise
			//devam eder. Do While--while'in en �nemli farki
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if (sayi1 > 0 && sayi2 > 0) {
				System.out.println("well done \ngirilen sayilarin carpimi : " + (sayi1 * sayi2));

			} else {
				System.out.println("Lutfen pozitif 2 sayi giriniz");
			}
		} while (sayi1 <= 0 || sayi2 <= 0); // yine istenmeyen kisim buaray yazilir
		
	// burada if dogru ise else calismaz while kisminda da false olacagi
	//icin DONGU kirilir(break) while'in icine girmez geri donmez loop'a girmez
	// ama if'i saglamazsa else body calisir ve tekrar yazdirir ardindan
	// while condition'i saglar ve true olacagi icin while calisir ve
	// Dongu'ye girer , loopa girer. Tekrar do'ya donup sayi ister.
		scan.close();

	}

}

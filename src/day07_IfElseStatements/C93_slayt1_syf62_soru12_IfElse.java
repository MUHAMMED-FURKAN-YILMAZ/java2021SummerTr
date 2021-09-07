package day07_IfElseStatements;

import java.util.Scanner;

public class C93_slayt1_syf62_soru12_IfElse {

	public static void main(String[] args) {
		/*
		 * slayt 1 - syf 63- Soru 12) Kullan�c�dan 4 basamakli bir sayi girmesini
		 * isteyin. Girdi�i sayi 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0
		 * ise ekrana �5�e b�l�nen �ift say�� yazd�r�n. Son rakam� 0 de�il ise �5�e
		 * b�l�nen tek say�� yazd�r�n. Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar
		 * deneyin� yazd�r�n
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 4 basamakli bir sayi giriniz");

		int sayi = scan.nextInt();
		
		if (sayi%10==0 || sayi%10==5) {
			if (sayi%10==0) {
				System.out.println("5�e b�l�nen �ift say�");
			}else {
				System.out.println("5�e b�l�nen tek say�");
			}
		}else {
			System.out.println("Tekrar deneyin");
		}

		scan.close();

	}

}

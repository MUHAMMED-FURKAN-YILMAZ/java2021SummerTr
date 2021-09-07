package day07_IfElseStatements;

import java.util.Scanner;

public class C9_NestedIfElse2 {

	public static void main(String[] args) {
		/*
		 * Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		 * Kullanicidan bir sifre girmesini isteyin Eger ilk harf buyuk harf ise “A”
		 * olup olmadigini kontrol edin. Ilk harf A ise “Gecerli Sifre” degilse
		 * “Gecersiz Sifre” yazdirin. Eger ilk harf kucuk harf ise “z” olup olmadigini
		 * kontrol edin. Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre”
		 * yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen sifrenizi giriniz");

		char sifreIlkHarf = scan.next().charAt(0);

		if (sifreIlkHarf >= 'a' && sifreIlkHarf <= 'z') { // kucuk harf
			if (sifreIlkHarf == 'z') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}

		} else if (sifreIlkHarf >= 'A' && sifreIlkHarf <= 'Z') { // buyuk harf

			if (sifreIlkHarf == 'A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}

		} else { // yanlýs giris

			System.out.println("Sifrenin ilk karakteri harf olmali");
		}

		scan.close();
	}

}

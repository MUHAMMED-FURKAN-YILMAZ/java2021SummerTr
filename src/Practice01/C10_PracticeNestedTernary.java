package Practice01;

import java.util.Scanner;

public class C10_PracticeNestedTernary {

	public static void main(String[] args) {
		/*
		 * Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
		 * buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil”
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir harf giriniz.");

		char harf = scan.next().charAt(0);

		System.out.println(harf >= 'A' && harf <= 'Z' ? "Buyuk Harf"
				: harf >= 'a' && harf <= 'z' ? "Kucuk Harf" : "Girdiginiz karakter harf degil");

		scan.close();

	}

}

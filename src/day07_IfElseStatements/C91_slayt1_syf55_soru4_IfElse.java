package day07_IfElseStatements;

import java.util.Scanner;

public class C91_slayt1_syf55_soru4_IfElse {

	public static void main(String[] args) {
		/*
		 * slayt 1 - syf 55- Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 * eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
		 * Diger durumlarda ekrana “Eskenar degil” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz, \ngirdikten sonra 'ENTER' tusuna basiniz");

		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();

		if (kenar1 == kenar2 && kenar2 == kenar3) {

			System.out.println("Girdiginiz ucgen eskenar ucgendir");

		} else {

			System.out.println("Girdiginiz ucgen eskenar ucgen degildir");
		}
		
		scan.close();
	}

}

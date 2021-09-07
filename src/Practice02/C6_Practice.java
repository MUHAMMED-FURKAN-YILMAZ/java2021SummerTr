package Practice02;

import java.util.Scanner;

public class C6_Practice {

	public static void main(String[] args) {

		/*
		 * Problem Tanýmý Kullanýcýdan üç adet sayý alarak bu sayýlarýn bir dik üçgenin
		 * kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
		 * 
		 * (ipucu: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor baðlantýsýndan
		 * yararlanabilirsiniz) Örnek Ekran Çýktýsý birinci kenarý giriniz: 2 ikinci
		 * kenarý giriniz 15 üçüncü kenarý giriniz: 7 Bu bir dik üçgen deðildir. Bu bir
		 * dik üçgendir
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.print("a  kenarýný  giriniz : ");
		int a = scan.nextInt();

		System.out.print("b kenarýný  giriniz : ");
		int b = scan.nextInt();

		System.out.print("c  kenarýný  giriniz : ");
		int c = scan.nextInt();
		if (a <= 0 || b <= 0 || c <= 0) { // negatif sayi girme kontrolü
			System.out.println("hatali giris yaptýnýz");}
		
		else if (a * a + b * b == c * c) { // c kenarý hipotenus
			System.out.println("Ucgeniniz dik ucgendir");
		} else if (a * a * +c * c == b * b) { // b kenarý hipotenus
			System.out.println("Ucgeniniz dik ucgendir");
		} else if (c * c + b * b == a * a) { // a kenarý hipotenus
			System.out.println("Ucgeniniz dik ucgendir");
		} else {
			System.out.println("Dik ucgen degildir");
		}
		scan.close();
	}

}

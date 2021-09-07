package Practice02;

import java.util.Scanner;

public class C6_Practice {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Kullan�c�dan �� adet say� alarak bu say�lar�n bir dik ��genin
		 * kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
		 * 
		 * (ipucu: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor ba�lant�s�ndan
		 * yararlanabilirsiniz) �rnek Ekran ��kt�s� birinci kenar� giriniz: 2 ikinci
		 * kenar� giriniz 15 ���nc� kenar� giriniz: 7 Bu bir dik ��gen de�ildir. Bu bir
		 * dik ��gendir
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.print("a  kenar�n�  giriniz : ");
		int a = scan.nextInt();

		System.out.print("b kenar�n�  giriniz : ");
		int b = scan.nextInt();

		System.out.print("c  kenar�n�  giriniz : ");
		int c = scan.nextInt();
		if (a <= 0 || b <= 0 || c <= 0) { // negatif sayi girme kontrol�
			System.out.println("hatali giris yapt�n�z");}
		
		else if (a * a + b * b == c * c) { // c kenar� hipotenus
			System.out.println("Ucgeniniz dik ucgendir");
		} else if (a * a * +c * c == b * b) { // b kenar� hipotenus
			System.out.println("Ucgeniniz dik ucgendir");
		} else if (c * c + b * b == a * a) { // a kenar� hipotenus
			System.out.println("Ucgeniniz dik ucgendir");
		} else {
			System.out.println("Dik ucgen degildir");
		}
		scan.close();
	}

}

package Practice02;

import java.util.Scanner;

public class C2_Practice {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi yapan kodu yaz�n�z
        a'n�n karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        �rnek Ekran ��kt�s�
        a say�s�n� giriniz: 5
        b say�s�n� giriniz: 3
        c say�s�n� giriniz: 1
        sonu� : 5.333333333333333
        */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("a sayisini giriniz");
		double a=scan.nextDouble();
		
		System.out.println("b sayisini giriniz");
		double b=scan.nextDouble();
				
		System.out.println("c sayisini giriniz");
		double c=scan.nextDouble();
		
		double sonuc=((a*a)-(b*b))/3*c;
		
		System.out.println(" isleminizin sonucu : " + sonuc);
		
		scan.close();
		
		
		
	}

}

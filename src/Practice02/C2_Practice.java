package Practice02;

import java.util.Scanner;

public class C2_Practice {

	public static void main(String[] args) {
		
		/*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333
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

package Practice02;

import java.util.Scanner;

public class C5_PracticeFinal {

	public static void main(String[] args) {
		
		/*
        Kullanýcýdan vize ve final notlarýný alýnýz.
        Kullanýcýn istediði oranlarda vize ve final yüzdeleri 
        not ile not ortalamasýný hesaplayýp
        not ortalamasýný yazdýrýp 50 ve büyük ise "Tebrikler dersi baþarý
         ile geçtiniz..." küçük ise
        "Malesef dersten kaldýnýz..." yazdýrýnýz
         */  

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 1.vize notunu giriniz");
		double vize1=scan.nextDouble();
		
		System.out.println("Lutfen 2.vize notunu giriniz");
		double vize2=scan.nextDouble();
		
		System.out.println("Lutfen vize ortalamasýnýn % kac alýnacagini giriniz");
		double vizeYuzde=scan.nextDouble();		
		
		System.out.println("Lutfen final notunu giriniz");
		double finall=scan.nextDouble();

		System.out.println(" final notunun % kac alýnacagini giriniz");
		double finallYuzde=scan.nextDouble();

		double ortalama= (((vize1+vize2)/2)*vizeYuzde/100)+(finall*finallYuzde/100);
		
		if (ortalama>50) {
			System.out.println("Tebrikler dersi baþarý ile geçtiniz... "+ortalama);
		} else {
			System.out.println("Malesef dersten kaldýnýz... "+ortalama);
		}
		System.out.println(ortalama);
		
		scan.close();
	
	}

}

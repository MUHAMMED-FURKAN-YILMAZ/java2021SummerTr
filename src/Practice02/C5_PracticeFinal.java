package Practice02;

import java.util.Scanner;

public class C5_PracticeFinal {

	public static void main(String[] args) {
		
		/*
        Kullan�c�dan vize ve final notlar�n� al�n�z.
        Kullan�c�n istedi�i oranlarda vize ve final y�zdeleri 
        not ile not ortalamas�n� hesaplay�p
        not ortalamas�n� yazd�r�p 50 ve b�y�k ise "Tebrikler dersi ba�ar�
         ile ge�tiniz..." k���k ise
        "Malesef dersten kald�n�z..." yazd�r�n�z
         */  

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 1.vize notunu giriniz");
		double vize1=scan.nextDouble();
		
		System.out.println("Lutfen 2.vize notunu giriniz");
		double vize2=scan.nextDouble();
		
		System.out.println("Lutfen vize ortalamas�n�n % kac al�nacagini giriniz");
		double vizeYuzde=scan.nextDouble();		
		
		System.out.println("Lutfen final notunu giriniz");
		double finall=scan.nextDouble();

		System.out.println(" final notunun % kac al�nacagini giriniz");
		double finallYuzde=scan.nextDouble();

		double ortalama= (((vize1+vize2)/2)*vizeYuzde/100)+(finall*finallYuzde/100);
		
		if (ortalama>50) {
			System.out.println("Tebrikler dersi ba�ar� ile ge�tiniz... "+ortalama);
		} else {
			System.out.println("Malesef dersten kald�n�z... "+ortalama);
		}
		System.out.println(ortalama);
		
		scan.close();
	
	}

}

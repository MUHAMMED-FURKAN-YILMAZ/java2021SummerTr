package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {

		List <String> isimler = new ArrayList<>(); // elemanlar tek tek eklenmek zorunda
											// coklu ekleme olmaz
		// add() methodu list'in sonuna ekleme yapar
		
		isimler.add("Ali"); 
		System.out.println(isimler);//[Ali]
		isimler.add("Veli"); 
		isimler.add("Ayse"); 
		isimler.add("Fatma"); 
		isimler.add("Ali");// ne verirsek ekler ayni mi degil mi d�s�nmez
		
		isimler.add("Hasan,Kemal,Yasar");// bunlar�n hepsini tek index'e atar. Tek isim kabul etti
		
		System.out.println(isimler);//[Ali, Veli, Ayse, Fatma, Ali, Hasan,Kemal,Yasar]
	
	// ozel bir index'e eklemek isterseniz, o zaman index'li add methodu kullanilir
		
		isimler.add(3, "Nihan");
	
		System.out.println(isimler);//[Ali, Veli, Ayse, Nihan, Fatma, Ali, Hasan,Kemal,Yasar]
		
		isimler.add(0, "Mehmet");
	
		System.out.println(isimler);//[Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali, Hasan,Kemal,Yasar]
	
		
		List<String> yeniList=new ArrayList<>();
	
		yeniList.add("Firat");
		System.out.println(yeniList);//[Firat]
		
		// yeniList'in sonuna isimler listesini eklemek istersek
		yeniList.addAll(isimler);
		
		System.out.println(yeniList);//[Firat, Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali, Hasan,Kemal,Yasar]
		// bastaki firat'in arkasina eklendi
		
		
		// bir de int elementlerin oldugu liste olusturalim
		
		List<Integer> sayilar=new ArrayList<>();// int kabul etmedi. non-primitive istiyor. Wrapper class'tan yardim aliyoruz
		sayilar.add(5);
		
		// yeni list'e sayilar list'i ekleyebilir miyiz
		// farkli bir data turunden liste yada element ekleyemeyiz
		// yeniList.addAll(sayilar);
		// String list'e int list ekleyemeyiz
		
		
		
	}
}

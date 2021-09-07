package practice08._10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
//2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tum elemanlari bir
//listeye kopyalayan ve harf sirasina gore yazdiran bir METHOD yaziniz.
//Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//		   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

		String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
		/*
		"Ali", "Veli", "Ayse"  -->0. kat
		"Hasan", "Can"        -->1.kat
		"Suzan"               -->.kat

 		*/
		yeniList(isim);
	}

	public static void yeniList(String str[][]) {
		List<String> list=new ArrayList<>();

		for (int kat = 0; kat < str.length; kat++) {//katlara giris icin kat kontrolu yapildi
			for (int daire = 0; daire < str[kat].length; daire++) {//her kattaki daireye giris isin daire kontrolu yapildi
				list.add(str[kat][daire]);//girdigimiz her katin her dairesini list icine attik.

			}

		}System.out.println("siralamada onceki list: "+list);
		Collections.sort(list);//list'i naturel order'e gore harf sirasi yaptirdik.
		System.out.println("listin siralanmis hali:"+list);
	}

}

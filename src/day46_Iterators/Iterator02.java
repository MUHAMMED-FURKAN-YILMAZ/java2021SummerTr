package day46_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>(Arrays.asList("t","a","r","i","k"));
		
		System.out.print("ilk hali : "+list);// [t, a, r, i, k]
		
		ListIterator lt=list.listIterator();// ListIterator interfaceden lt1 variable create edildi.
										//degerini listten assign edildi

		while (lt.hasNext()) { // siradaki var mi? demek -->T/F
		String depo=(String) lt.next();//	
			// depoya atmadan yazdirirsak referanslarini getirir
			lt.set(depo+":-)");// List elemanlarini update etti
		
		}
		System.out.println();
		System.out.print("update hali : "+list);// [t:-), a:-), r:-), i:-), k:-)]
		System.out.println();
		
		
		// son elemanina :-) ile update ediniz.
		List<String> list1=new ArrayList<>(Arrays.asList("m","e","l","i","h","a")); 
		
		System.out.print("ilk hali : "+list1);// ilk hali : [m, e, l, i, h, a]
		ListIterator lt1=list1.listIterator();
	
		/*	
			1. yol
	 
		while (lt1.hasNext()) {
			String depo= (String) lt1.next();
			
			if (!lt1.hasNext()) {
				lt1.set(depo+":-)");
			}
	
		}
		System.out.println();
		System.out.println(list1);//[m, e, l, i, h, a:-)]
	*/
	
	// 2. yol
		int count=0;
		while(lt1.hasNext()){
			String depo= (String) lt1.next();
			if (count==list1.size()-1) {
				lt1.set(depo+":-)");
			}
			count++;
		}
		System.out.println();
		System.out.println(list1);//[m, e, l, i, h, a:-)]

//**********************************
		// son elemanina :-) ile update ediniz. elemanlari sondan basa dogru yazdiriniz-->:-) a h i l e m

		List<String> list2=new ArrayList<>(Arrays.asList("s","i","h","a"));

		System.out.print("ilk hali : "+list2);// ilk hali : [s, i, h, a]
		ListIterator lt2=list2.listIterator();

		System.out.println();


		while (lt2.hasNext()) {
			String depo= (String) lt2.next();

			if (!lt2.hasNext()) {
				lt2.set(":-)"+depo);
			}

		}
		while (lt2.hasPrevious()){
			String depo=(String) lt2.previous();// kursorun oncesi elemani return eder.
												// Ve cursoru oncesine getirir
			System.out.print(depo+" ");// :-)a h i s
		}
/*
TRICK: hasPrevious() ve previous() methodlari calismasi icin MUTLAKA-KESINLIKLE hasNext() ve next()
		methodlari calistirilarak cursor(pointer) en sona getirilmeli

	***********	"ITERATOR" ve "LISTITERATOR" arasi farklar : *********

	1-"ITERATOR" sadece hasNext(), next() ve remove() methodlari icerir
	  "LISTITERATOR" ise hasNext(), next() ve remove(), hasPrevious(), previous(), add(), set()
	   	methodlarini icerir.

	2-"LISTITERATOR" sadece listler icin kullanilir.
		Ama ITERATOR tüm collection(List-set-map)elemanlari icin kullanilir.

	3-"ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir




 */




	
	
	}


}

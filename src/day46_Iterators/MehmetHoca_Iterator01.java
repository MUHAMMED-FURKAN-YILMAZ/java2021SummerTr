package day46_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MehmetHoca_Iterator01 {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);//[A, B, C, D]
		
		// Her elemana B harfini ekleyelim
		
		for (String w : list) {
			w+="B";
			System.out.print(w+" ");//AB BB CB DB  
		}
		System.out.println(" ");
		System.out.println(list);// [A, B, C, D]
		
		//Collections'da her yapi index'i desteklemez. Ornegin Set'de index olmaz
		//index olmayinca mecbure tum elemanlara ulasmak icin for-each loop kullanilir.
		//For-each loop ile de update veya delete yapamayiz
		//Bunun icin Java Iterators interface'ini olusturmustur...
		
		
		Iterator it1=list.iterator();
		// next(), hasNext(), remove() method'larina sahiptir.
		//listedeki tum elemanlari iterator kullanarak silelim
		
		
		while(it1.hasNext()) {
			
			it1.next();
			it1.remove();
		}
		System.out.println(list);// []
		System.out.println(list.size());//0
		
		
		
		
		
		
	}

}

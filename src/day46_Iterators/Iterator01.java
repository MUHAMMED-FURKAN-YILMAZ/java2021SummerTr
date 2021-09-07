package day46_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<>(Arrays.asList("z","e","h","r","a"));
		System.out.println("Listin ilk hali "+ l1);

		
		//l1 elemanlarini for kullanarak yazdirin
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" ");
		}	
		System.out.println();
		System.out.println("***************");

		
		//l1 elemanlarini for each kullanarak yazdirin
		for (String w : l1) {
			System.out.print(w+" ");
		}
		System.out.println();
		System.out.println("**************");
		
		
		//l1 elemanlarini for loop kullanarak her elemanin yanina :-) yazdirip update ediniz	
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" :-)");		
		}
		System.out.println();
		System.out.println(":-) sonrasi l1 :"+l1); // for loop ile l1 elemanlari :-) concat edildigi halde
												   // degismedi update edilmedi
		
		
		List<String> l2=new ArrayList<>(Arrays.asList("s","a","i","d"));
		Iterator it1=l2.iterator();	//iterator  it1 variable create edildi. it1 obje degildir. interface'den obje olmaz
		
		while (it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		System.out.println("l2 nin iterator sonrasi: "+l2);//l2 nin iterator sonrasi: []
		

		
		
		
	}

}

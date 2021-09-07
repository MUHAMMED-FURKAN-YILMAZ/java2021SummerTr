package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {

		List<Integer> sayilar= new ArrayList<>();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar.size()); // 2
		System.out.println(sayilar.isEmpty());// false
		System.out.println(sayilar); // [10, 20]
		
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar); // [10, 20, 30, 40]
		
		// remove 2 turlu kullanilabilir
		
		//1- silmek istedigimiz eleman�n index'ini yazarsak
		// o elementi siler ve delil olarak sildigi elementi bize dondurur
		
		
		System.out.println(sayilar.remove(2));  // 30 neden?????
//remove methodu siler ve makbuz olarak da bize bu 30'u ordan al�r bize getirir				
		// sildigini de alttaki koddan anlayabiliriz.
		System.out.println(sayilar); // [10, 20, 40]
		
		int silinenEleman= sayilar.remove(1);// silinenElemana silineni atadik
		
		sayilar.add(silinenEleman);// tekrar ekledik ama sona ekler.
		
		
		
// remove ikinci yontem olarak direkt silmek istedigimiz degeri yazabiliriz
	// ama String icin .Integer icin gecerli degil cunku java index zanneder
		
	// sayilar.remove(20);
		System.out.println(sayilar); // [10, 40, 20]
// eger listemiz sayilardan olusuyosa biz silmesini istedigimiz elementi yazdigimizda
		// java index olarak algilar
		// ama String list icin boyle problem olmaz
		
		
		List<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		System.out.println(isimler.remove("Zeki")); // true
		System.out.println(isimler); // [Ali, Ayse]
		
		isimler.remove("Ayse"); // bu �ekilde gider siler bisey dondurmez. 
//aslinda dondurur ama ne yazdirdim ne atadim. o y�zden biz goremeyiz havada kalir
		System.out.println(isimler);// [Ali]
		
		
// 43. satirda da icine  yazdik. int'te index'tir oras� string'de eleman. 
		boolean sonuc = isimler.remove("Mehmet");
		if (sonuc) {
			System.out.println("Mehmet'i buldum ve sildim");
		}else {
			System.out.println("Mehmet'i bulamadim ve silemedim");
		}
		
		isimler.remove(0);
		System.out.println(isimler);// []
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		System.out.println(isimler);// [Ali, Ayse, Zeki]
		
		isimler.removeAll(isimler);// hepsini siler.
		System.out.println(isimler);// []
		
		
	}

}

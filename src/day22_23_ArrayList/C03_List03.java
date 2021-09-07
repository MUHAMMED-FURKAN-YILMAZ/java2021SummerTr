package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_List03 {

	public static void main(String[] args) {

		List <String> isimler= new ArrayList<>();
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		isimler.set(1, "Fatma");// set kurmak gibi bir anlam� var
								// burada da index'i istedigimizle degistirir
		System.out.println(isimler); // [Ali, Fatma, Zeki]
		
		System.out.println(isimler.set(2,"Mehmet")); // Zeki
//mehmet'i zeki'nin yerine yazdi. Delil olarak da sildigi zeki'yi bana getirdi
		System.out.println(isimler); // [Ali, Fatma, Mehmet]

		
	}

}

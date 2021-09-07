package day29__PassByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue01 {

	public static void main(String[] args) {
		/*
		 Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
		 		Iki method olusturup list elemanlarini artirmayi deneyelim
- 1. Method’da elemanlari for each loop kullanarak artirin
- 2. Method’da elemanlari set method’u kullanarak artirin
- Method’lari arka arkaya cagirip artislarin kalici olup 
	olmadiklarini kontrol edelim.
		 */

		
		
						/* NOOT
						 * 
	JAVA'DA LÝST VEYA ARRAY'IN ELEMANLARINI UPDATE ETTINIZDE 
			ELEMANLAR KALICI OLARAK DEGISIR.
		 (LÝIST VEYA ARRAY DEGIL ELEMANLAR DEGISIR)
		 */
		
		List<Integer> sayiList= new ArrayList<>();
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("ilk olusturdugumuz liste "+sayiList); // [10, 11, 12]
		
		forLoopIleArtir(sayiList);
		System.out.println("for Loop Method'undan Sonra list : "+sayiList);//[10, 11, 12]
		
		
		setIleArtir(sayiList);
		System.out.println("set Method'undan Sonra list : "+sayiList);//[15, 16, 17]
		
	}

	private static void setIleArtir(List<Integer> sayiList) {
		// set ile elemanlari artiralim
		
		for (int i = 0; i < sayiList.size(); i++) {
			sayiList.set(i, sayiList.get(i)+5);
		}
		
		//loop'tan sonra listeyi yazdiralim
		System.out.println("set ile artirimdan sonra list : "+sayiList); //[15, 16, 17]
						
	}

	private static void forLoopIleArtir(List<Integer> sayiList) {
		// for each loop ile elemanlari artiralim.
		System.out.print("for each loop ile artirdigimiz elementler : ");
		for (Integer each : sayiList) {
			
			each+=5;
			System.out.print(each+" ");//15 16 17 
		}	// each loop un disina cikamaz . cunku loop variable'
		System.out.println();
		System.out.println("foreach loop'dan sonra list :"+sayiList);//[10, 11, 12]
		
		// foreach loopta atama yapamadigim icin listeyi kalici olarak degistiremedim
		// for loop kullanip get methodu ile elementleri cagirinca da atama yapamadim.(yaptik olmadi sildik)
		// dolayisi ile for loop ile  elementleri kalici olarak degistiremedik.
	}

}

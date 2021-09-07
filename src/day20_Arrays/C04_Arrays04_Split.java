package day20_Arrays;

import java.util.Arrays;

public class C04_Arrays04_Split {

	public static void main(String[] args) {
		
		String str="Java, candir." ;
		
		//split methodu bize bir array doner
		//donen array'i ya direkt yazdirmaliyiz
		System.out.println(Arrays.toString(str.split(",")));
	
		//veya methoddan donen String barindiran bir array oldugundan
		// bir array olusturup ona assign edebiliriz
		
		String bolunmusKelimeArray[]=str.split(",");
		System.out.println(bolunmusKelimeArray[1]);// bosluk+candir --
													// bi bosluk array'in yazimindan digeri ise kelimeden 
	
		String bolunmusKelimeArray2[]=str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2));// [J, v, , c, ndir.]
		System.out.println(bolunmusKelimeArray2.length);//4 -- a dan bolduk , cumle icindeki
	
		String bolunmusKelimeArray3[]=str.split("");// string'i karakterlere ayirir. charlara boler
		System.out.println(Arrays.toString(bolunmusKelimeArray3));
	
		
		String cumle="Java ogren, rahat yasa";// cumle kac kelimeden olusur?
		String kelimeArrayi[]=cumle.split(" ");
		System.out.println("Cumledeki kelime sayisi : "+kelimeArrayi.length);
		
		// harf sayisini nasil buluruz.
		String cumle2=cumle.replaceAll("\\W", "");
		System.out.println(cumle2);
		
	}

}

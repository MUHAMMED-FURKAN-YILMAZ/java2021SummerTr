package day19_Arrays;

import java.util.Arrays;

public class C01_Arrays01 {

	public static void main(String[] args) {
		
		short arr1 [] = new short[5];
		
		System.out.println(arr1);// ciktisi budur [S@5ccd43c2 Neden?? Cunku
		
		//arr1 data type'i non-primitive'dir.
		// short array'in degil icine koyacagimiz degerlerin data turudur
		//Eger non-primitive bir datayi direkt syso ile yazdirmaya calisirsaniz
		// Java arr1'in REFERANS bilgisini yazdirir.
	
	
	/*
	Soru 1: Elemanlari �Ali� , �Veli�, �Ayse� ve �Fatma� olan bir 
			array olusturun ve bu  array�i yazdirin.
	*/
	
	// 1. Yontem once olusturup, sonra istedigim indexlere deger atiyorum
	String isimler[]= new String[4];
	
	isimler[0]="Ali";
	isimler[1]="Veli";
	isimler[2]="Ayse";
	isimler[3]="Fatma";
	
	System.out.println(Arrays.toString(isimler));
	
	// 2. Yontem, hem olusturup hem de tum indexlere deger atiyorum
	
	String isimler2[]= {"Ali","Veli","Ayse","Fatma"};
	
	
	//isimler array'indeki Veli yerine Hasan yazalim
	
	isimler[1]="Hasan";
	// isimler[5]="Hakan"; // Java 5. index var mi yok mu bilmiyor.Syntex
	// acisindan sorun olmadigi icin CTE vermez. run yapinca RTE verir
	
	
	System.out.println(isimler.length); // 4 array uzunlugu
	//Stringde'de var . ama arrayde parantez yok stringde var.. lenght()
	
	System.out.println(isimler[3]); // Fatma yazdirir.(3.index'i)
	
	System.out.println(isimler[1]);// hasan (son deger)
	
				// TUM ELEMANLARI YAZDIRMA
	
	//1. yol loop kullanma
	// sadece degerleri yazdirmis oluruz
	
	for (int i = 0; i < isimler2.length; i++) {
		System.out.print(isimler2[i]+" ");
	}
	System.out.println();
	
	// 2. yol Arrays class'indan yardim aliriz
	
System.out.println(Arrays.toString(isimler));// koseli parantezli, virgullu
	
	
	
	}

}

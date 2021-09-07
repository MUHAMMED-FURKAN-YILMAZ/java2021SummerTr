package day02_Variables_Scanner;

public class C01_Variables {

	public static void main(String[] args) {
		
	// 1- Farkl� 3 data turunde variable olusturun ve bunlari yazdirin

		String str="Merhaba"; // satirdaki kod sonunda mutlaka ; kullanilmalidir
		
		System.out.println(str); // kelimenin variable oldugunu anlar ve variable'in degerini yazdirir
		
		System.out.println("kelime"); // kelime yazdirir.
		
		int sayi=20;
		
		System.out.println(sayi); // 20 yazdirir
		
		// yazdirirken bas,na aciklama eklemek istersem
		// girilen sayi : 20
		// eger degisken ve aciklamayi birlikte yazdirmak istersek
		// " aciklama " + variableismi ( sayi )
		System.out.println("girilen sayi : " + sayi);
		
		boolean tatildeMi= true;
		
		System.out.println(tatildeMi);
		
		// konsolda bu sene tatile gittiniz mi ? = true
		// variable olmayan kisim : "bu sene tatile gittiniz mi? = "
		// variable'dan gelen kisim ise =  true
		
		
		System.out.println("bu sene tatile gittiniz mi? " + tatildeMi);
		
		/* 2- isim ve soyisim icin iki variable olusturun ve bunlari
		  isminiz : furkan
		  soy isminiz : y�lmaz seklinde yazdirin 
		  */
		 
		
		String name ="Muhammed Furkan";
		String surname="Y�lmaz";
		System.out.println("isminiz : " + name);
		System.out.println("soy isminiz : " + surname );
		
		
		// 3 - iki farkliyi tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin 
		
		int sayi1= 10 ;
		byte sayi2= 5;
		System.out.println(sayi1 + sayi2 );
		
		// toplama isleminin basina aciklama yazmak istersek.
		// iki sayinin toplami =15
		
		System.out.println("iki sayinin toplami = " + sayi1 + sayi2); // sonucu 105 cikiyor
		System.out.println("iki sayinin toplami = " + (sayi1 + sayi2)); // sonucu 15 cikiyor
		
		// String ve sayisal islemleri birlikte yaptirdigimizda matematiksel islemi parantez icine alin
		// yoksa ilkinin sonucu 105 ikincisin 15 olur
		
		
		// 4- bir tam sayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
		
		int sayi3= 15;
		double sayi4= 3.14;
		
		System.out.println(sayi3 + sayi4);
		
		// toplam : 18.14 
		
		System.out.println("toplam : " + (sayi3 + sayi4));
		
		
		// 5- Char data turunde bir variable olusturun ve yazdirin.
		
		char karakter='?';
		System.out.println(karakter);
		System.out.println("girilen karakter : " + karakter);
		
		
		// 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin
		
		int sayi5= 20;
		char harf='M';
		
		System.out.println(sayi5 + harf); // 20M bulmak istiyoruz
		// b�yle yaparsak M yi ASCII table a g�re al�p 20 +77 yapt�. ASCII table da "M"=77
		// char data turundeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devreye girer 
		// Java o karakter yerine  ASCII tablosundaki degeri kullanir.
		
		
		
		
		
		
		
		
		
		
		
	}

}

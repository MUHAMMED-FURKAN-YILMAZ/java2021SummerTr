package day27_StaticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access") // bu main methodda static access ile ilgili 
									 // isleyisi bozmayan kucuk bir hata var ve ben bunu onayliyorum demek
									 // satir 30 ve 36
	public static void main(String[] args) {
		
		// C01'deki variable'lara ulasmak istesem
		// ilk once C01'deki variable'larin instance mi yoksa static mi olduguna bakmam gerekir
		// ornegin sayi ve str instance variable'lardir, dolayisi ile onlara obje uzerinden ulasabilirim
		
		C01 obj1=new C01();
		System.out.println(obj1.str);// Yasasin eclipse
		
		obj1.str="Yasasin Faruk";
		
		System.out.println(obj1.str);// Yasasin Faruk
		
		C01 obj2=new C01();
		System.out.println(obj2.str);// Yasasin eclipse
		
		//sayi2 variable'i static oldugu icin objeye IHTIYAC DUYULMAZ.
		
		System.out.println(C01.sayi2);// 0 cunku default
		
		C01 obj3=new C01();
		
		obj3.sayi2=27;// CTE vermezz.
				// ancak altini sari cizer ve satir numarasi,na unlem koyar
				// cunku Java daha kisa ve emin bir yol varken nicin obje uzerinden ulast�n diye sikayet eder
			    // bu kodun calismasina engel degildir onu icin CTE vermez
				// fakat gereksiz bir islem oldugundan Java bizi uyarir
		
		System.out.println(obj3.sayi2);
		
		C01.sayi2=34; // static variable'lara class ismi.variable ismi yazilarak ulasilabilir
					  // buna static way denir.
		
		System.out.println(C01.sayi2);//34.. static variable'lar ulasabilen her obje
									  // ve her class icin ortaktir	
									  //okul adi gibi
		
		System.out.println(obj2.sayi2); // 34
		System.out.println(obj1.sayi2); //34
		
		// static variable bir yerde degisirse o classta her yerde degisir..(Instance'dan farkli)
		
		
	}

}

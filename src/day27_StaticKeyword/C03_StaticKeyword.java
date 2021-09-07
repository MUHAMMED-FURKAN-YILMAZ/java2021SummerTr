package day27_StaticKeyword;

public class C03_StaticKeyword {
	
	static int sayi=15;
	String str="Java";

	public static void main(String[] args) {
		/*
		 bir method veya variable'i static yapmanin avantaji :
		 
		 Static variable ve methodlara ulasmak istedigimizde classIsmi.methodIsmi
		 yazmamiz  yeterli olur
		 
		 Ornegin array'lerde kullandigimiz Arrays class'i altindaki.toString() methodu 
		 static olarak  java developerlari tarafindan hazirlanmis oldugu icin 
		 Arrays.toString() yazarak method'u rahatlikla kullanabiliyoruz
		 
		 Ancak variable'lari static yapmak biraz riskli 
		 Mesela bir okul uygulamasinda okul ismini static variable olarak olusturursak
		 avantaj olarak her yerden rahatlikla okul ismine ulasabiliriz
		 
		 ama ogrenci objelerinden veya ogretmen objelerinden biri uzerinden okul adi 
		 degistirilirse tum ogrenciler ve tum ogretmenler icin okul adi kalici olarak 
		 degismis olur bu da bir uygulama icin istenmeyen bir durumdur.	 
		 */

		sayi=20;
  // str="static olan main method'dan instance variable'a direkt ulasamazsin ";
		saticMethod(); // static main methoddan static method cagrilabilir
	//staticOlmayanMethod();// main method static oldugu icin static olmayan methodu cagiramayiz
		
		System.out.println(C01.sayi2); // 0
		
		// JAVA RUN T�ME PROGRAMDIR HANGI CLASSTA RUN TUSUNA BASARSANIZ O CLASS CALISIR.
		
	}

	public static void saticMethod() {
		System.out.println("Static variable'lar gokteki ay gibidir");
		sayi=30;
		// str="Buradan ulasilamaz";
			
	}
	
	public void staticOlmayanMethod() {
		System.out.println("static olmayan method calisti");
		
		saticMethod(); // static methodlar her yerden cagrilabilir
		sayi=25; // static variable'lara her yerden ulasilabilir ve deger atanabilir
		str="static olmayan methoddan static olmayan variable'a ulasabilirim";
		
	}
	
}

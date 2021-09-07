package day25_Constructors;

public class C03 {
	
	int sayi=10;
	String isim="Mehmet";
	// ayni package deki farkli class'lardan bu variable'lara ulasabiliriz
	// cunku access modifier yazmazsak default access modifier kullanilir
	// access modifier default ise ayni package'den her yerden kullanilabilir
	
	public static void main(String[] args) {

		// sayi=20;  sayi degiskeni static olmadigi icin main method'dan kullanamam
		// deneme(); deneme method'u static olmadigi icin main method'dan cagiramam
		
		C03 obj1=new C03();
		obj1.deneme();
		// Ayni classta oldugumuz halde static olmadigi icin kullanamadigimiz
		// variable ve method'lari obje olusturarak kullanabiliriz
		
	}

	private void deneme() {
		
		System.out.println("deneme methodu calisti");
	}
	
	
	
}

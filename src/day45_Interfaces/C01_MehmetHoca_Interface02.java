package day45_Interfaces;

public interface C01_MehmetHoca_Interface02 {

	// Soru su : Buradaki default ve static bizim bildigimiz default ve static mi ?
	// Cevap : HAYIR
	
	
	public default void deneme(){// hem public hem default goruyoruz
		System.out.println("default keyword'lu method calisti");
	}
	
	// bizim bildigimiz default access modifier'di
	// bir methodda birden fazla access modifier olur mu ?
	// biim interface de olusturtdugumuz tum methodlar PUBLIC ve abstract'dir.
	// interface'de default keyword kullanarak concrete method olusturabiliriz
	// Buradaki default keyword'u access modifier degil
	// Java'nin ozel bir cozumudur
	// Buradaki default keyword basina yazildigi method'un concrete oldugunu belirtir
	
	static void deneme2(){
		System.out.println("static keyword'lu method calisti");
	}
	
	// yukarida default keyword'u icin yazdiklarimiz static icin de gecerlidir.
	
	// static ve default keyword'u kullanarak olusturdugumuz methodlar 
	// override edilmek 	ZORUNDA DEGILDIR
	
	
	
	
	
}

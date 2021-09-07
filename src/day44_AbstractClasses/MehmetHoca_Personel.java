package day44_AbstractClasses;

public abstract class MehmetHoca_Personel {
	// bir class'i abstract yapmak icin class keyword'udnen once
	//abstract yazzmak yeterlidir
	
	//abstract class'in icinde variable olabilir mi?==> tabiki olabilir
	
	public String isim="Yasin";
	
	// variable'lar abstract olur mu?==> OLAMAZ
	// public abstract int sayi=10;
	
	//abstract class'in tum concrete child'lari abstract class'daki 
	//tum dinamik ozellikleri yani METHODLARI override etmek zorundadir
	
	// bir method abstract olur mu ven asil yapilir?
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	//Bir abstract class'da concrete method yazilabilir mi?
	//Bir abstract class'da abstract ve concrete methodlar olabilir
	// concrete child class'lar abstract method'lari override ETMEK ZORUNDADIR ama
	//concrete methodlari override etmek istege baglidir.
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigorta kapsamindadir");
	}
	
}

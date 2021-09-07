package day45_Interfaces;

public interface C01_MehmetHoca_Interface01 {

// ***Interface clas degildir. interface interface'dir***
//Cunku interface obje uretmez. Oyuzden constructor'i yoktur ve class degildir
	
	
	public void motor();// interface icinde abstract method'lar ve 
						// OZEL concrete method'lar olabilir. 
	
	/*
	 Bir abstract method'un body'si olmadigindan o method'un istenen dinamik 
	 ozelligi nasil gerceklestirecegini bilmemiz mumkun degildir. 
	 Sadece ne yapacagini biliriz. 
	 
	 Bu method bize sunu anlatir: 
	 Beni inherit eden her concrete class'in dinamik motor ozelligi olmalidir.
	 
	 */
	
	void vites();// Beni inherit eden her concrete class'in dinamik vites ozelligi olmalidir
	
	abstract void kasa();// Beni inherit eden her concrete class'in dinamik kasa ozelligi olmalidir
	
	//Interface'de sadece ABSTRACT,PUBLIC method'lar olur.
	//bu iki keyword'u yazsak da yazmasak da Java methodlari bu sekilde kabul eder
	
	//Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	//Bir class sonradan bazi keyword'ler yazilarak interface yazpilamaz
	
	
	String ISIM="Mustafa"; // Java isim kelimesini italik ve bold yapti(bende yapmamis olsa da)
						   // Demek ki tum variable'lar final ve static'dir
	
}

package Practice10;

public class Runner04 {
	/*
	 3 s�n�f olu�turaca��z bu �rne�imizde: 
	 Runner ,calisan ve yonetici s�n�flar�. 
	 Cal��an s�n�f�m�z superclass, yonetici 
	 s�n�f�m�z da subclass olacak. Runner s�n�f�m�z� da 
	 olu�turdu�umuz kodlar�, konsola yazd�rabilmek 
	 i�in olu�turaca��z

�al��an s�n�f�nda isim ,maas ve departman de�i�kenleri olsun.
Parmetresi bu de�i�kenler olan bir constructor olu�tural�m.
Birde bu de�i�kenleri g�r�nt�leyecek bir 
BilgileriGoster methodu olu�tural�m.

Y�netici s�n�f�nda yine parametresi SuperClasstaki 
de�i�kenler olan bir constructor olu�tural�m.
Birde parametresi int zam olan bir method olu�tural�m. 
Bu method bize zam miktar� belirtildi�inde ne kadar
zam yap�lmas� gerekti�ini belirtsin.
	 */
	
	public static void main(String[] args) {
	
		
	Yonetici04 y=new Yonetici04("Furkan",10000, "QA");	
	y.bilgileriGoster();
	y.zamMiktari(500);
	
	}

}

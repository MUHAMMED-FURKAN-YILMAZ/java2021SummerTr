package Practice10;

public class Runner04 {
	/*
	 3 sýnýf oluþturacaðýz bu örneðimizde: 
	 Runner ,calisan ve yonetici sýnýflarý. 
	 Calýþan sýnýfýmýz superclass, yonetici 
	 sýnýfýmýz da subclass olacak. Runner sýnýfýmýzý da 
	 oluþturduðumuz kodlarý, konsola yazdýrabilmek 
	 için oluþturacaðýz

Çalýþan sýnýfýnda isim ,maas ve departman deðiþkenleri olsun.
Parmetresi bu deðiþkenler olan bir constructor oluþturalým.
Birde bu deðiþkenleri görüntüleyecek bir 
BilgileriGoster methodu oluþturalým.

Yönetici sýnýfýnda yine parametresi SuperClasstaki 
deðiþkenler olan bir constructor oluþturalým.
Birde parametresi int zam olan bir method oluþturalým. 
Bu method bize zam miktarý belirtildiðinde ne kadar
zam yapýlmasý gerektiðini belirtsin.
	 */
	
	public static void main(String[] args) {
	
		
	Yonetici04 y=new Yonetici04("Furkan",10000, "QA");	
	y.bilgileriGoster();
	y.zamMiktari(500);
	
	}

}

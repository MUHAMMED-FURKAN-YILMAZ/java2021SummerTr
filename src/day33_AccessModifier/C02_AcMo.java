package day33_AccessModifier;

public class C02_AcMo {
   
	public static void main(String[] args) {
        
		/*
	    Eriþim alanlarý :
	1- Class ýn içi
	2- Paketin içi
	3- Projenin içi (yani diðer paketler)
	
	Public : Projenin her tarafýndan eriþilebilir, yani diðer paketlerden bile. (Class, field, properties, metodlarda, constructor)
	default: Yani hiç bir þey yazýlmazsa, yani diðer adý friendly : sadece paketin içindekiler eriþebilir. (Class, field,properties metodlarda, constructor)
	private: Sadece içinde bulunduðu sýnýf tan eriþilebilir.(field,properties, metodlarda)
	  
	   1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
	       Baska class'lardan "private" class memler'lari (field,properties, metodlarda, constructor) kullanmak mumkun degildir.
	       
	   2) Baska package'lerden object olusturursaniz object olusturulan class'i import etmeniz gerekir.
	       
	   3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni package'de iseniz
	       ulasabilirsiniz. "default" ile "package private" es anlamlidir.
	       
	    4) public class member'lara herkes her yerden ulasabilir(farkli java projesi disinda).
	       
	    5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz. Farkli package'de
	        iseniz iki durum var : a)Child class iseniz ulasabilirsiniz.   b)Child class degil iseniz ulasamazsiniz.
	        
	    6) Class'larda da access modifier kullanilir. Ama sadece "public" ve "default" kullanilir.
	        Class olustururken "private" veya "protected" access modifier kullanilmaz.

	*/
    	
    	
    	C01_AcMo obj1 =new C01_AcMo(); //C01 classindan obj1 creat ettik
        
        System.out.println(obj1.defaultAge);//15
        System.out.println(obj1.protectedAge);//32
        System.out.println(obj1.publicAge);//61
    }
}
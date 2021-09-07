package day25_Constructors;

public class C02_CarRunner {

	public static void main(String[] args) {

		C01 car1=new C01();

		/*
		 *  Bir esitlikte sol taraf declaration
		
  declaration'da data type, variable name	
  String str="Mehmet";
  data type class ismi olabilir.
  primitive data type'larini java olusturmustur, biz primitive data type olusturamayiz
  non-primitive data type'larini java da biz de olusturabiliriz.
  
  C01 car1 yazdigimizda C01 hem class ismi hem de car1 objesinin non-primitive data type'd�r
		
	new C01(); esitligin sagi deger olusturma
	new : keyword'dur ve yeni bir obje olusturacagimizi beyan eder
	C01() ise constructor'd�r.
		*/
		car1.fiyat=10000;
		car1.ilanNo=1001;
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil= 2020;
		// variable'lar sadece deger atamasi yapar
		System.out.println(car1.fiyat+","+car1.ilanNo+", "+car1.marka+", "+car1.model+", "+car1.yil);
		// bu sekilde yazdirabiliriz
		
		car1.maxhiz(200);
		car1.yakit("dizel");
		// methodlar'in ne yapacagi method belirler. methodda yazdir varsa yazdirir
		
		
		// bir araba daha olusturmak istersem car2 yapmam gerekir
		C01 car2=new C01();
		System.out.println("Atanmadan "+car2.fiyat+","+car2.ilanNo+", "+car2.marka+", "+car2.model+", "+car2.yil);
		// arama yapmadigimiz icin default degerler getirir.
		
		car2.fiyat=15000;
		car2.ilanNo=1002;
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil= 2010;
		
		System.out.println("Ataninca "+car2.fiyat+","+car2.ilanNo+", "+car2.marka+", "+car2.model+", "+car2.yil);
		
		car2.yakit("Benzin");
	
	}

}

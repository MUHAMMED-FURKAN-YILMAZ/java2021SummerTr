package day40_Overriding_Overloading;

public class Formen extends Isci {

	public String sorumluOldBolum="bakim";
	public String isim="Emrullah";
	
	public static void main(String[] args) {
		
		//Inharitance'da data type olarak class ismi kullanimi
		
		// Bir classta obje uretirken data type olarak class'in kendisini
		//veya parent(lar)ini kullanabiliriz
		//olusturdugumuz obje ile variable kullanmamiz gerekirse , hangi degeri
		//alacagini anlamak icin once Data type olan class'a gideriz
		//orada aradigimiz variable varsa kullaniriz yoksa
		//parent(lar)ina bakariz. yukari dogru giderken Ýlk buldugumuz degeri kullaniriz. 
		
		
		Formen fr1=new Formen();
	// fr1 objesini kullanarak hangi class'larin variable'lari gorebilirim
		fr1.sorumluOldBolum="Marangozhane"; //--> Formen classi
		fr1.maas=10000; //-->Isci classi
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas);//Emrullah Marangozhane 10000  
		// --> personel class'indan da aldý
		
		
		Isci fr2=new Formen(); // data turu olarak isci secildigi icin--> Isci class'i ve ustunu gorurum
		fr2.bolum="Kaynak atolyesi"; //--> Isci classi
		
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas); // Mesut Kaynak atolyesi 5000
		//fr2.sorumluOldBolum--> bunu kabul etmedi Isci classi ve ustunde olmadýgý icin 
		
		//String isim--> personel isci ve formen hepsinde var "fr2.isim" hangisini yazdirir????
		
/* 		CEVAP==> Eger obje ile ***VARÝABLE'A*** bakacaksaniz
 * fr2.'nin data type'i Isci oldugu icin data type'ina gider once orada arar. 
 * Eger Isci'de yoksa ordan parentine cikar orayi arar. Child'e inmez. 		
 */
		
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//Emre --> yalnizca personel class'ina ulastik
		
		
		
		
		
		
	}
	
	
}

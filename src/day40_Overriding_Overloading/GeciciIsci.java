package day40_Overriding_Overloading;

public class GeciciIsci extends Isci {

	public String calistigiBolum="Yemekhane";
	
	public static void main(String[] args) {
		
	// Overriding == (Gecersiz kilma)
	// bir child class'ta parent class'tan miras alinan method'u 
	// degistirmeye overriding denir	
		
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maasHesapla());// 2400
		gi1.mesai(); //Gecici isciler haftada 25 saat calisir
			
		
	}
	
	// overriding yapmak icin parent class'daki method signature'i
	// ile child class'da bir method olusturulur.
	// signature ayni oldugundan sadece body degisir
	// boylece parent class'daki method CHILD CLASS ICIN gecersiz hale gelir
	public int maasHesapla() {
		return 30*8*10;
	}

	@Override //annotation
	public void mesai() {		
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
	}
	
	// ***anotation -->aciklama, dipnot***
	// Java bu 28. satirda kodu inceleyenler icin bir aciklama getiriyor
	
	// annotation olmasi ile olmamasi arasindaki fark (24-29 ustleri arasi fark)
	// annotation sadece bir aciklama degildir 
	// override yaptigimiz method'u surekli kontrol eder ve parent class'daki
	// overriden method signature'i degistirilirse CTE verdirir.
	
	// eger override edilen parent class'daki method(overriden)'un da 
	// calismasini istiyorsak overriding method'a "super.overridenMethodIsmi" yazariz
	// eger overriding method'da "super." yazilmazsa
	// overriden method calismaz.
	
	
	// ***Access Modifier***
	// Child parent'i sinirlandiramaz
	// Yani overriding method'un access modifier'i overriden method'un 
	// access modifier'indan daha dar olamaz.
	
	
	// ***Return Type***
	// overriden method'un return type'i primitive veya void ise
	// overriding method'un return type'i da ayni olmali
	
	// eger return type primitive degilse
	// (overriding method'un return type'i) olmalidir IS-A (overriden method'un return type'i)
	
	
	
	
	
	
	
	
}

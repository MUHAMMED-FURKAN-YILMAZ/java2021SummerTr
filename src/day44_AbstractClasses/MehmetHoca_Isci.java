package day44_AbstractClasses;

public class MehmetHoca_Isci extends MehmetHoca_Personel {

	public static void main(String[] args) {
		
		MehmetHoca_Isci isci1=new MehmetHoca_Isci();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";//abstract parent class'daki variable'lari istersem kullanabirim
		System.out.println(isci1.isim);
		isci1.ozelSigorta();// abstract parent class'daki concrete method'u istersem kullanirim
				// bu method'u override etmedik ama parent-child iliskisi ile kullanabildik
	}

	@Override
	public void maasHesapla() {
		//   parent class'daki abstract method'u implement(uyarlama) etti
		//1- sen abstract bir class'i parent edindiysen mutlaka oradaki 
		// 	 abstract method'u implement etmelisin
		
		//2- Parent class'daki method'da body olmadigi icin onu kullanmanin anlami yok
		//   biz child class'da body olan method (concrete) kullanip islem yapmaliyiz
		
		System.out.println("isciler icin maas 5000 tl");
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat calisir");
		
	}

}

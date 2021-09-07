package day44_AbstractClasses;

public  class MehmetHoca_IdariPersonel extends MehmetHoca_Personel {

	
	//   extends personel yazarak abstract Personele concrete bir child olusturduk
	//   ve java bize CTE verdi
	//	 Cozum olarak 2 ihtimal var
	//1- Unimplement(uyarlanmamis) methodlari uyarla (implement et)
	//2- Ya da Personel class'indan abstract kelimesini kaldir yada bu clas'a da abstract ekle
	//   Bu class'in calisabilmesi icin 2 islemden birini yapmak zorundayiz

	public static void main(String[] args) {
		
	}
	//concrete bir class'da abstract bir method olabilir mi?
	// abstract bir method sadece abstract bir class'da olusturulabilir
	
//public abstract void surekliCalisma();
	
	//The abstract method surekliCalisma in type MehmetHoca_IdariPersonel 
	//can only be defined by an abstract class
	
	
	@Override
	public void maasHesapla() {
		System.out.println("idari personel maasi 4000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}
	
}

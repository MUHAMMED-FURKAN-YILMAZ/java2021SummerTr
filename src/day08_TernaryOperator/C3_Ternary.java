package day08_TernaryOperator;

public class C3_Ternary {

	public static void main(String[] args) {
		
		// ?==> ise gibi ... ":" soldaki true sagdaki false
		//ternary'de sadece sonucu yazdirabiliriz. aciklama yazdiramayiz
		int sayi=75;
		
		String sonuc= sayi%2==0 ? "Sayi cift" : "Sayi tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi>100 ? "Sayi 100'den buyuk" : 10);
		// Direkt yazdirdigimiz zaman sonuclarin ikisi ayni cinsten olmak 
		// zorunda degil. ama yazdirmiyosan hemen atama yapacaksan ayni cins olmali
	
		
		 int y = 1;
		 int z = 1;
		 int a = y<10 ? y++ : z++;
		 System.out.println(y + "," + z + "," + a);
		
		
		
		
		
	}

}

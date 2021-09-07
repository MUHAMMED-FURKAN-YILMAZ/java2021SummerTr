package kendiCalismam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Urunlu_market_Listesi {

	public static void main(String[] args) {
	/**
	 * Basit bir 5 urunlu manav alisveris programi yaziniz.
	 *
	 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
	 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
	 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
	 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
	 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
	 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
	 * */
	
		
		//PRACTÝCE 8 DE HOCANIN COZUMU VAR
		
		
		
		List<String> urunListesi=new ArrayList<>();
		List<Double> fiyat=new ArrayList<>();
		
		urunListesi.add("Domates - Urun Kodu :1");
		urunListesi.add("Biber - Urun Kodu :2");
		urunListesi.add("Erik - Urun Kodu :3");
		urunListesi.add("Karpuz - Urun Kodu :4");
		urunListesi.add("Seftali - Urun Kodu :5");

		fiyat.add(3.5);
		fiyat.add(4.5);
		fiyat.add(15.0);
		fiyat.add(1.5);
		fiyat.add(7.5);
		
		Scanner scan=new Scanner(System.in);
		
		int kod=0;
		double kilo=0;
		char evetHayir=' ';
		double toplam=0;
		
		do {
		
		System.out.println("Asagidaki listeden aldiginiz urunun kodunu giriniz.\n"+
		urunListesi.get(0)+"\n"+urunListesi.get(1)+"\n"+urunListesi.get(2)+"\n"+
		urunListesi.get(3)+"\n"+urunListesi.get(4));
		kod=scan.nextInt()-1;
		
		System.out.println("Urunun kac kilo oldugunu giriniz. ");// adim 1 sonu
		kilo=scan.nextDouble();
		
		System.out.println("Baska urun alacak misiniz?\nEvet(E)\nHayir(H)");
		evetHayir=scan.next().toUpperCase().charAt(0);		
		
		if (evetHayir=='E') {
		toplam+=fiyat.get(kod)*kilo;
		
		}else if (evetHayir=='H') {
			toplam+=fiyat.get(kod)*kilo;
			System.out.println("Odenecek miktar : "+toplam);
		break;
		
		}else System.out.println("hatali karakter girdiniz" );
		
		
		} while (!(evetHayir=='H'));
		
		scan.close();
		
		
		
		
		
			
		
		
		
		
		
		
		}
}

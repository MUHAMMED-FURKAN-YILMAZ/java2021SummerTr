package kendiCalismam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MarketGunlukKazanc {

	public static void main(String[] args) {
/*
* Bir bakkalin 7 gunluk tum kazanclarini gunluk olarak gosteren bir program yaziniz.
* Ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir method yaziniz.
* Ayrica bakkalin hangi gunler ortalamanin ustune kazandigini gosteren bir method yaziniz.
* Ayrica bakkalin hangi gunler ortalamanin altinda kazandigini gosteren bir method yaziniz.
*
* 1. Adim : Gunleri iceren bir tane ArrayList olusturun. (gunler)
* 2. Adim : Gunluk kazanclari ekleyecegimiz bir tane ArrayList olusturun. (gunlukKazanclar)
* 3. Adim : While dongusu ile kullanicidan 7 gunluk kazanclari tekek teker alip gunlukKazanclar ArrayList'e ekle.
* 4. Adim : getOrtalamaKazanc() adli method ile ortalama kazanci alin.
* 5. Adim : getOrtalamaninUstundeKazancGunleri() adli method olusturun.
* 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
* 			 ortalama kazanctan yuksekse o gunleri return yap.
* 6. Adim : getOrtalamaninAltindaKazancGunleri() adli method olusturun.
* 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
* 			 ortalama kazanctan asagiysa o gunleri return yap.
* */

		
		List<String> gunler=new ArrayList<>();
		
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		List<Double> gunlukKazanclar=new ArrayList<>();
		
		Scanner sc=new Scanner (System.in);
		
		int i=0;
		while (i<7) {
			System.out.println(gunler.get(i)+" gununun kazancini TL cinsinden giriniz : ");
			double kazanc=sc.nextDouble();
			gunlukKazanclar.add(kazanc);
			i++;
		}
	
		double ort=getOrtalamaKazanc(gunlukKazanclar);			
		
		System.out.println("Ortalamanin ustundeki kazandýgýnýz gunler : "+getOrtalamaninUstundeKazancGunleri(ort,gunlukKazanclar,gunler));
		
		System.out.println("Ortalamanin ustundeki kazandýgýnýz gunler : "+getOrtalamaninAltindaKazancGunleri(ort,gunlukKazanclar,gunler));
	
		
	}

	private static String getOrtalamaninAltindaKazancGunleri(double ort, List<Double> gunlukKazanclar,List<String> gunler) {
		
		String ortAltiGun="";
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (gunlukKazanclar.get(i)<ort) {
				ortAltiGun+=gunler.get(i)+" ";
			}
		}
		return ortAltiGun;
	}

	private static String getOrtalamaninUstundeKazancGunleri(double ort, List<Double> gunlukKazanclar, List<String> gunler) {
		
		String ortUstGun="";
		for (int i = 0; i < gunlukKazanclar.size(); i++) {	
			if (gunlukKazanclar.get(i)>ort) {
				ortUstGun+=gunler.get(i)+" ";
			}		
		}
		return ortUstGun;
		
	}

	private static double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
		
		double ort=0;
		for (Double  w: gunlukKazanclar) {
			ort+=w;
		}
		ort/=gunlukKazanclar.size();
	
		System.out.println("ortalama kazanc : "+ort+" TL");
		return ort;
		
	}

	

}

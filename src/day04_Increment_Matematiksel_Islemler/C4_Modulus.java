package day04_Increment_Matematiksel_Islemler;

public class C4_Modulus {

	public static void main(String[] args) {	
		// 5496 sayisinin rakamlar toplamini bulal�m.
		
		int sayi=5496 ;
		int rakamlarToplami=0;
		
		// bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz
		// bu satirda sayi=5496 , rakamlarToplami= 0
		
		
		// 1- sayi%10 ile son basamagi elede ederiz
		
		int rakam= sayi%10;
		
		// 2- Bu rakami rakamlarToplamina ekleriz
		
		rakamlarToplami += rakam ;
		
		// 3- degerini aldigimiz son basamaktan kurtarmak icin sayiyi 10'a boleriz
		
		sayi/=10;
		
		//bu satira geldigimde sayi=549 , rakamlarToplami= 6
		
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		
		
		
		//bu satira geldigimde sayi=54 , rakamlarToplami= 15
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		
		
		//bu satira geldigimde sayi=5 , rakamlarToplami= 19
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		

		//bu satira geldigimde sayi=0 , rakamlarToplami= 24
		
		System.out.println("Rakamlar Toplam� : " + rakamlarToplami);
		System.out.println("Rakamlar Toplam� : " + sayi);
		
		 
	}

}

package day04_Increment_Matematiksel_Islemler;

public class C1_IncrementDecrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		sayi1-=5;
		sayi2+=10;
				
		System.out.println(sayi2/sayi1);// 6
		
		sayi1*=2;
		sayi2++;
		
		System.out.println(sayi2/sayi1);
		
		sayi1/=2;
		double sayi3= sayi2/10;// sayi2 int oldu�undan sayi2/10 i�leminin sonucu java 3 olarak bulur
								// ama atama i�lemi yap�l�rken sayi3 double oldu�undan
								// b�lme i�leminin sonucu olan 3'� casting ile 3.0'a �evirir
		System.out.println(sayi3);
		
		System.out.println(sayi1*sayi2);//155
		System.out.println(sayi1*sayi3);// 15.0
		
		sayi3=(double)sayi2/10;
		
		System.out.println(sayi3);  // 21. satirla ayni olmasina ragmen bu 3.1 oldu
									// cunku esitligin sag tarafinde double ald�k. 
									// once sagdaki islem yapilir sola oyle atilir.
		
		System.out.println(sayi2);//31
		System.out.println((double)sayi2);//31.0
			// basina double koyarak sayi double olmaz. gecici olarak double yaptik
			// esitli�in saginda veya syso da koydugumuzda
			
		sayi2+=0.2;
		System.out.println(sayi2);// sayi2 hala int oldu�u i�in 31 olarak al�r.

	}

}

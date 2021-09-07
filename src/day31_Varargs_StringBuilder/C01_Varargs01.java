package day31_Varargs_StringBuilder;

public class C01_Varargs01 {

	public static void main(String[] args) {

		// Verilen iki sayinin toplamini bulkan bir method yaziniz
		// Verilen uc sayinin toplamini bulkan bir method yaziniz
		
		int sayi1=17;
		int sayi2=20;
		int sayi3=35;
		
		
		ikiSayiTopla(sayi1, sayi2);
		ucSayiTopla(sayi1, sayi2, sayi3);
	
		topla(17,20,35);// varargs methoduna gonderiyoruz.. sayi1 sayi2 sayi3 'de yazabilirdik
	}

	private static void ucSayiTopla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayi toplami : "+(sayi1+sayi2+sayi3));
		
	}

	private static void ikiSayiTopla(int sayi1, int sayi2) {
		System.out.println("iki sayi toplami : "+(sayi1+sayi2));

	}

	public static void topla(int ... sayi) {
		
		int toplam=0;
		for (int i : sayi) {
			toplam+=i;
		}
		System.out.println("varargs toplami : "+toplam);
	}
}

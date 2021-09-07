package day29__PassByValue_mutableClass;

public class C03_ImmutableClasses01 {

	public static void main(String[] args) {

		int sayi=10; // obje olusturma var 1
		
		for (int i = 0; i < 10000; i++) { // obje olusturma var 2
			i++;
			sayi++;
		}
		
		// Bu kodu calistirdigimizda 14. satira kadar java kac obje uretir?
		// Bu soruyu cevaplamak icin degiskenin data type'ina bakmaliyiz
		// sayi'nin data type'i : int
		// int mutable oldugu icin sade sayi ve i objesi olusur sonraki artirimlarda
		// immutable gibi yeni objeler olusturmaz. mutable class objenin degerini gunceller
		
		String str="A";// obje olusturuldu 1
		
		for (int i = 0; i < 10000; i++) {// obje olusturuldu 2
			str+=" "; // burada da variable'i her arttiginda str degistikce obje olusur=>10000
		}			// immutable oldugu icin
		/*
		 20. satir ile 24. satir arasinda kac obje olusur?
		 i int oldugu icin sadece 1 tane variable olusturulur
		 str String oldugundan 10002 obje olusturulur
		 */
		
		
		
		
	}

}

package day18_DoWhileLoopScope;

public class C04_Scope01 {
//1- Main methodun d�s�nda olusturulan variable'lara CLASS LEVEL variable denir.
	
	int sayi1;
	int sayi2=10;
	
	String str1;
	String str2="java";
	
	//3- static olmayan variable'lar static alanlardan ulasilamaz
	
	static boolean anladinMi;
//2-  static olarak tanimlanan variable'lar class icinden her yerden kullanilabilir
//(static olsun veya olmasin her methoddan ulasabiliriz ve kullanabiliriz)
	static boolean biliyorMusun=true;
	static char harf;
	static String str;
	
	//4- Class level'da olusturulan variable'lar (static olsun veya olmasin)
	// deger atamadan da kullanilabilir
	// eger biz deger atamazsak Java class level'daki variable'lara
	//default degerler atar
	// sayisal degerler icin =0 , boolean =false, string=null, char=' '

	public static void main(String[] args) {
	
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			i=10;
			String isim="Mehmet";
		}

		// System.out.println(i); // scope disinda i'yi kullanamayiz
		
		// i=10;	// scope disinda i'yi kullanamayiz
		
		int sayi;
		
		//sayi++;
		//System.out.println(sayi);	
	
		//method1(); // main method static kulubune uye, 
					//bu kulube uye olmayanlari muhatap almaz
		
		method2();
		anladinMi=true;
		// System.out.println(str1); // static olmad�g�ndan kullandirmadi
System.out.println("main method icinde anladinMi'nin degeri : " +anladinMi);
System.out.println("main method icinde harf'in degeri : " +harf);
System.out.println("main method icinde str'nin degeri : " +str);	

	}
	
	public void method1() {
	
		System.out.println("method1 calisti");
		sayi1=20;
		System.out.println(anladinMi);
		System.out.println(str1);
	}
	
	public static void method2() {

		System.out.println("method2 calisti");
		System.out.println(biliyorMusun);
		// System.out.println(sayi2);// satatic yapmadan  ulasilmiyor
		
	}
	
	
}

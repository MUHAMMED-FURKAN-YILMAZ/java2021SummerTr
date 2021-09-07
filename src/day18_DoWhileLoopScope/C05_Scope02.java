package day18_DoWhileLoopScope;

public class C05_Scope02 {
	
	// 7- Eger birden fazla local'de (methodda) kullanacaginiz variable varsa
	// bunu class level'da olusturmalisiniz
	// 8-  variable'in static olup olmamasina nasil karar verirsiniz?
	// bu sorunun cevabi variable'in kullanilacagi locallerle ilgilidir
// eger kullanilacak local static'se o zaman variable'i static yapmak zorundayiz

	int sayiClass=10;
	static int sayiClassStatic;

	public static void main(String[] args) {

	// 5- class level'da olmayan variable'lara local variable denir.
	// 6- local variable'lar static olarak tanimlanamaz
		int sayiMain=10;	
		//System.out.println(sayiClass); static olmadigi icin kabul etmedi 
		sayiClassStatic++;// bunu kullanabildik cunku static main method'da static
	
	// Local variable'lar deger atanmadan olusturulabilir 
	// ANCAK deger atanmadan KULLANILAMAZ
	int sayi;
	sayi=10;
	System.out.println(sayi);
	
	
	}

	public void method1() {
	//System.out.println(sayiMain);// kullanilamaz
	
	
	}
	public static void method2() {
	//System.out.println(sayiMain);// kullanilamaz
		
		
		
	}
	
}

package day41_Exceptions;

public class MehmetHoca_Exceptions03 {

	public static void main(String[] args) {
		//try-catch blogundaki e'nin gorevi
		
		int sayi1=20;
		int sayi2=0;
		
		Exceptions01 exp=new Exceptions01();
		//esitligin solundaki Exceptions01 hem class adi hem de exp objesi icin data type'dir

		try {
			System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
		//ArithmeticException Java'da bir class ve e objesi icin data type
			//e ise ArithmeticException class'indan olusturdugumuz objenin adi
			// o zaman ismi e olmak zorunda degildir ama genelde e kullanilir
			
			System.out.println("sayiyi 0'a bolemezsin");// bizim kullaniciya vermmek istedigimiz mesaj
			
			System.out.println(e);// java.lang.ArithmeticException: / by zero

			// bu durumda hem java'ya sorunu yazmasi icin firsat vermis 
			// hem de application'i bloke etmemis oluruz
		
		System.out.println(e.getMessage());/// by zero
		
		e.printStackTrace();
		/* java.lang.ArithmeticException: / by zero
				at day41_Exceptions.MehmetHoca_Exceptions03.main(MehmetHoca_Exceptions03.java:15)
		 */		
		}
		
		System.out.println("Kod bloke olmamiss");
	}

}

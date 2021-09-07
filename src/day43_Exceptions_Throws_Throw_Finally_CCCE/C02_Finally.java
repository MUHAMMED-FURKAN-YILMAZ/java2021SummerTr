package day43_Exceptions_Throws_Throw_Finally_CCCE;

public class C02_Finally {

	public static void main(String[] args) {

		/*
		 * finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		 * Finnally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi 
		 * ongoremedigim bir exception olustugunda da calisir.
		 * Final cumlesi :finally blogu her durumda mutlaka kesinlikle ca-li-sirrr.
		 */
		
		
		
		
		
		int [] arr= {34,35,41,63,21};
		
		try {
			System.out.println(arr[30]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("hatali index girdiniz");
		}
		
		finally {
			System.out.println();
			System.out.println("Finally block calisti");
		}
		
		// Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		// Finnally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		// ongoremedigim bir exception olustugunda da calisir....

	}

}

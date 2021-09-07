package day18_DoWhileLoopScope;

public class C06_DoWhileLoop_Homework {

	public static void main(String[] args) {
		
		//Soru 1 ) 9 den 190 e kadar 7 nin kati olan 
		//		   tum tamsayilari ekrana yazdiriniz

		int sayi=9;
		
		do {
			if (sayi%7==0) {
				System.out.println(sayi+" ");
			}
			sayi++;
					
		} while (sayi<=190);
		
		
	}

}

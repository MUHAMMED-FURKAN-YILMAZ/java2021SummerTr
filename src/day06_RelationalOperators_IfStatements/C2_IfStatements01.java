package day06_RelationalOperators_IfStatements;

public class C2_IfStatements01 {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		if (a > b) {
			System.out.println("a b'den buyuk");
		}

		if (a == b) {
			System.out.println("sayilar esit");
		}

		if (a > b || a + b < 10) {
			System.out.println("yasasin Java"); // sartin sonucu True ise if body calisir.
		} // False ise if body calismaz,
			// body calissa da calismasa da body'den sonraki satira gider.

		
		
		if (a+b<0 || a*b>20) {
			System.out.println("bitti bu is");// yazdirmaz c�nk� ikisi de false sart gerceklesmemis
		}
		
		
		
		
		
	}

}

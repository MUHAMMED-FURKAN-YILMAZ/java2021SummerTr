package practice05;

public class ornek10 {

	public static void main(String[] args) {
//      1
//      2 3
//      4 5 6
//      7 8 9 10
//      11 12 13 14 15
//      16 17 18 19 20 21
//      22 23 24 25 26 27 28
//      29 30 31 32 33 34 35 36

		int a=1;
		for (int baba = 1; baba <=8; baba++) {
			for (int ogul = 1; ogul <=baba ; ogul++) {
				System.out.print(a++ +" ");
			}
		System.out.println();		
		}

	}

}

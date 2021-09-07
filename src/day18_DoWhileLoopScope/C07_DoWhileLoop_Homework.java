package day18_DoWhileLoopScope;

public class C07_DoWhileLoop_Homework {

	public static void main(String[] args) {

	//Soru2 )�m� harfinden baslayarak �c� harfine kadar tum harfleri yazdirin.

		// Do while ile
		/*
		  char c='m';
		
		do {
			if (c<='m' && c>='c') {
				System.out.print(c+" ");
				c--;
			}
		} while (c<='m' && c>='c');
		*/
		
		// sadece while ile
		
		char c1='c';
		char m='m';
		
		while (c1<=m) {
			System.out.print(m+" ");
			m--;
		}
		
	}

}

package day04_Increment_Matematiksel_Islemler;

public class C3_PreDecrement_PostDecrement {

	public static void main(String[] args) {
		
		
		int sayi1=20;
		
		int sayi2=sayi1--; // �nce de�eri ver sonra azalt 
		
		System.out.println("post decrement sayi1 : "+  sayi1 );//19
		System.out.println("pre decrement sayi2 : "+  sayi2 );//20
		
		
		System.out.println(--sayi2);//19 .. �nce azalt sonra yazd�r
		
		System.out.println(sayi2--);//19.. �nce yazd�r  sonra azalt( ama 18 tekrar yazdirilirsa )
		
		System.out.println(sayi2);//18..  sadece yazd�r
		
		

	}

}

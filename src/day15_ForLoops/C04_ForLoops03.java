package day15_ForLoops;

import java.util.Scanner;

public class C04_ForLoops03 {

	public static void main(String[] args) {
		
		//Soru 4) Kullanicidan 100’den kucuk pozitif bir tamsayi isteyin. 
		//1’den baslayarak girilen sayiya kadar 3’un kati olan s
		//ayilari yazdirin.
		
	Scanner scan=new Scanner(System.in);		
	System.out.println("Lutfen 100'den kucuk pozitif bir tam sayi girin");
	
	int sayi=scan.nextInt();
	
	for (int i = 1; i <sayi; i++) {
		if (i%3==0) {
			System.out.print(i+" ");
		}
	}
		scan.close();
		
	}

}

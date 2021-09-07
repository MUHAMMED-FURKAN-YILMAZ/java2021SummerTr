package day17_NestedForLoopsWhileLoops;

import java.util.Scanner;

public class C01_NestedForLoop01 {

	public static void main(String[] args) {
		/*
		 Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve 
		 		   girilen rakama gore asagidaki sekli cizdirin
		 		   *
		 		   * *
		 		   * * *
		 		   * * * *
		 */

		// outer-- s�ray� kontrol edecek
		// inner-- 1. s�raya 1 tane , 2. s�raya 2 tane yazd�racak...
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam=scan.nextInt();
		
		// mesela kullanici 5 girmis olsun 
		for (int satirNo = 1; satirNo <=rakam ; satirNo++) {
			for (int i = 1; i <=satirNo ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}

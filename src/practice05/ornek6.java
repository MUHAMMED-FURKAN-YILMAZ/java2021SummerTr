package practice05;

import java.util.Scanner;

public class ornek6 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Matrisin boyutunu kullanýcýdan okuyup.
        Sadece diyagonu (köþegeni) 1 olan ve
        diðer elemanlarý 0 olan bir kare matrisi ekrana bastýrýn.
       Ekran Çýktýsý
        Bir sayý giriniz: 7
        1000000
        0100000
        0010000
        0001000
        0000100
        0000010
        0000001
        Bir sayi giriniz: 5
        10000
        01000
        00100
        00010
        00001
   */
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayý giriniz : ");
        int sayi = scan.nextInt();
		
		for (int i = 1; i <=sayi; i++) {
			for (int j = 1 ; j <=sayi; j++) {
				if (i==j) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}System.out.println();
		}
		scan.close();
	}

}

package haftaninSorulari;

import java.util.Scanner;

public class SalyangozKaresi {

	public static void main(String[] args) {
		/*
		  Problem Tanımı
            Verilen boyuttaki bir kare matrisin içerisine salyangoz (helezon)
             şeklinde ardışık sayıları yerleştiriniz.
             ipucu: maksimum sayınız girilen sayının karesine eşittir.
           
             Örnek Ekran Çıktıları
            Bir sayi giriniz: 3
            1 2 3
            8 9 4
            7 6 5
           
            Bir SAyi giriniz : 5
            1  2  3  4  5
            16 17 18 19 6
            15 24 25 20 7
            14 23 22 21 8
            13 12 11 10 9
          
            Bir sayi giriniz: 4
            1 2 3 4
            12 13 14 5
            11 16 15 6
            10 9 8 7
		 */

		int sayi=0;
		
		Scanner scan=new Scanner(System.in);
	
		do {
			System.out.println(" Bir sayi giriniz");
			sayi = scan.nextInt();
			
			if (sayi>0) {
				for (int satir = 1; satir <=sayi ; satir++) {
					for (int sutun = 1; sutun <= sayi ; sutun++) {
						
					}
				}
		/*
		    1 2 3
            8 9 4
            7 6 5		
		 */
				
				
			}else {
				System.out.println("Pozitif sayi giriniz");
			}		
		} while (sayi<=0);
		
		
	}

}

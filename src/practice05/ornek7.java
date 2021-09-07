package practice05;

import java.util.Scanner;

public class ornek7 {

	public static void main(String[] args) {
		
		/*  Problem Tanýmý
        Girilen bir sayý kadar satýr ve sütünu olan ve
        sað kenara dayalý üçgeni basan kodu yazýnýz.
        Ekran Çýktýsý
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
   
        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayý giriniz : ");
        int sayi = scan.nextInt();
        for (int baba = 1; baba <=sayi; baba++) {
           for (int bosluk = sayi-baba; bosluk >0; bosluk--) {
             System.out.print(" ");
           }   
           for (int yildiz = 1; yildiz <=baba; yildiz++) {
             
            System.out.print("*");
        }
                    
           
           System.out.println();
        
    }
     scan.close();  
	}

}

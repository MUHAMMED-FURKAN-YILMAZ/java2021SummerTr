
package practice05;

import java.util.Scanner;

public class ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullan?c?dan 5 adet say? isteyiniz
        // Bu say?lardan 5 ile 10 aras?ndakiler hari?, di?erlerinin toplam?n? bulunuz.
        // bu soruyu continue kullanarak ??z?n?z.
        //continue komutu bulundugu kod blogunda mevcut islemi atlar.
        Scanner scan = new Scanner(System.in);
        int top=0;
        
        for (int i = 1; i <=5; i++) {
            System.out.print("bir sayi giriniz : ");
            int sayi=scan.nextInt();
            if (sayi>5 && sayi<10) {
            	System.out.println("girdiginiz sayi 5 ile 10 arasinda oldugundan isleme girmeyecek");
            	continue;
	}
            top+=sayi;    
       }
        System.out.println("girdiginiz sayilar toplami :"+top);
        scan.close();
}
}
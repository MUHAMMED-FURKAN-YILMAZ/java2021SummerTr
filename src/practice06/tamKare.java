package practice06;

import java.util.Scanner;

public class tamKare {

	public static void main(String[] args) {
	
		 /*
        Girilen pozitif bir sayýnýn tam kare olup olmadýðýný bulunuz,
        tamkare ise true  deðilse false yazdýrýnýz.
        
         Not: sqrt gibi fonksiyonlarý  kullanmayýn.
         
         Example 1:
         Input: 16
         Output: true
         Not: bu sayý tamkare çünkü 4*4 = 16
        
         Example 2:
         Input: 25
         Output: true
         Note: bu sayý tamkare çünkü 5*5=25
       
         Example 3:
         Input: 14
         Output: false
      */
     Scanner scan = new Scanner(System.in);
     System.out.print("bir sayý giriniz : ");
     int sayi = scan.nextInt();

     int count=1;
     
     boolean b=false;
     
     while (count*count<=sayi) {
		if (count*count==sayi) {
			b=true;
			System.out.println(b);
		
		}
		count++;
		
	}if (b==false) {
		System.out.println("false");
	}
    
	}

}

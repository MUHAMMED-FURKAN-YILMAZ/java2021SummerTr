package practice06;

import java.util.Scanner;

public class armstrongSayi_ornek1 {

	public static void main(String[] args) {
		
	// kullanýcýdan alýnan bir sayinin Armstrong sayi olup olmadigini
	//kontrol eden program yazin
    // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
    // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
           
     Scanner scan=new Scanner(System.in);
     System.out.print("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz : ");
     int sayi =scan.nextInt();
     int ilkDeger=sayi;// ilkDeger atanmaz ise sayi degeri while 
     					//iþleminden sonra deðiþerek 0 olur.
     int rakam;
     int kuplerToplami=0;
     
     while (sayi!=0) {
		rakam=sayi%10;
		sayi/=10;
		kuplerToplami+=rakam*rakam*rakam;
	}
        if (kuplerToplami==ilkDeger) {
System.out.println("gayet basarili girdiginiz sayi armstrong sayidir :");
		}else {
        System.out.println("maalesef armstrong sayi degildir");
		}
        scan.close();
	}

}

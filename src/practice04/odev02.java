package practice04;

import java.util.Scanner;

public class odev02 {

	public static void main(String[] args) {
		
		/* Problem Tanýmý :
        Basit 4 iþlem yapan bir hesap makinesi methodu kodlayýnýz....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinýz.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirýnýz.
      */

		Scanner scan =new Scanner(System.in);
		
		System.out.println("yapacaginiz islem sembolünü (+,-,*,/) seklinde giriniz.");
		char symbol=scan.next().charAt(0);
	
		System.out.println("Ýslemi yapacaginiz iki sayiyi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (symbol=='+') {
			System.out.println(sayi1+sayi2);
		}else if (symbol=='-') {
			System.out.println(sayi1-sayi2);
		}else if (symbol=='*') {
			System.out.println(sayi1*sayi2);
		}else if (symbol=='/'){
			System.out.println(sayi1/sayi2);
		}else {
			System.out.println("hatali islem girdiniz");
		}
		
		scan.close();
	}

}

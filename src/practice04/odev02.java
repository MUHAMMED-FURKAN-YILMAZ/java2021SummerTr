package practice04;

import java.util.Scanner;

public class odev02 {

	public static void main(String[] args) {
		
		/* Problem Tan�m� :
        Basit 4 i�lem yapan bir hesap makinesi methodu kodlay�n�z....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalin�z.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdir�n�z.
      */

		Scanner scan =new Scanner(System.in);
		
		System.out.println("yapacaginiz islem sembol�n� (+,-,*,/) seklinde giriniz.");
		char symbol=scan.next().charAt(0);
	
		System.out.println("�slemi yapacaginiz iki sayiyi giriniz");
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

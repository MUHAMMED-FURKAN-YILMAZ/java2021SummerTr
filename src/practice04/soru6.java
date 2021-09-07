package practice04;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {

		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
        
		Scanner scan=new Scanner(System.in);
		
		System.out.print("degistireceginiz birimi giriniz : ");		
		String birim=scan.nextLine();// saat mil kg
		
		System.out.print("cevirilecek birim miktari giriniz : ");		
		double miktar=scan.nextDouble();// 5 saat 35 mil 65 kg
		
		cevirici(birim, miktar);
	}
	public static void cevirici(String birim,double miktar) {
		switch (birim) {
		case "saat":
			System.out.println(miktar*3600);
			break;
		case "mil":
			System.out.println(miktar*1.6);
			break;
		case "kilogram":
			System.out.println(miktar*1000);
			break;
		default:
			System.out.println("hatali veri girdiniz");
		}
	}
}

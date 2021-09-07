package practice04;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {

		/*
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */

		Scanner scan =new Scanner(System.in);
		
		System.out.print("Aldiginiz urunun adedini giriniz : ");
		int adet=scan.nextInt();
	
		System.out.print("Aldiginiz urunun liste fiyatini TL olarak giriniz : ");
		double fiyat=scan.nextDouble();
		fiyat*=adet;
		
		System.out.print("Musteri kartiniz var mi (Y or N) : ");
		char kart=scan.next().toUpperCase().charAt(0);
		
		if (kart=='Y') {
			if (adet>10) {
				System.out.println(fiyat*80/100+" TL");
			}else {
				System.out.println(fiyat*85/100+" TL");
			}
			
		}else {
			if (adet>10) {
				System.out.println(fiyat*85/100+" TL");
			}else {
				System.out.println(fiyat*90/100+" TL");
			}
		scan.close();
		}

		
	}

}

package practice06;

import java.util.Scanner;

public class sayininBasamakDegeriToplami {

	public static void main(String[] args) {
		  /*
	     * kullan�c�dan al�nan bir sayinin basamak rakamlar�n�n 
	     * toplamini while loop ile hesaplayan bir method yaz�n�z.
	     */
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Lutfen bir sayi giriniz : ");
	        int sayi = scan.nextInt();
	        
	         rakamTopla(sayi);
	           scan.close();
	}

	public static int rakamTopla(int sayi) {
		
		int toplam=0;
		
		do {
			toplam+=sayi%10;
			sayi/=10;
		} while (sayi>0);
		
		System.out.println("girdiginiz sayinin toplami : "+toplam);
		return toplam;
	}

}

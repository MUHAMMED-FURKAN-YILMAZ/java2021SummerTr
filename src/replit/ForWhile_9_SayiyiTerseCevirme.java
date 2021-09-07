
package replit;

import java.util.Arrays;
import java.util.Scanner;
public class ForWhile_9_SayiyiTerseCevirme {

	public static void main(String[] args) {
		
		/*
	Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz. (Mulakat Sorusu)

		Input :1238
		Output :Girilen Numananin Tersi: 8321
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		String sayi=scan.next();
		
		String arr[]= new String[sayi.length()];
		
		int i=0;
		
		while (i<sayi.length()) {
			arr[sayi.length()-1-i]=sayi.substring(i, i+1);
			
			i++;
		
		}
		System.out.print("Girilen numaranin tersi : ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		
		scan.close();
		
	}
}
package day41_Exceptions;

import java.util.Scanner;

public class MehmetHoca_Exceptions02 {

	public static void main(String[] args) {
		// Kullancidan 2 tam sayi alin ve bolumleri yazdirin
		
		int count=1;
		Scanner scan=new Scanner(System.in); 
		
		while(count<100) {
		
		
		System.out.print("Lutfen bolunecek sayi giriniz : ");		
		int sayi1=scan.nextInt();
		
		System.out.print("Lutfen kaca bolmek istediginizi yazin : ");		
		int sayi2=scan.nextInt();
		
		/* Java exceptionslari handle etmek icin bir cozum uretmezsek
		   Jaca exception ile karsilastiginda calismayi durdurur(stops execution)
		   throws exception (exception firlatir demek)(problemin kaynagini bize gosterir)
		   
		     tum application durmus olur...
		     Musterinin kullandigi bir uygulama icin bu KABUL EDILEMEZ.
		     Bunun icin muhtemel sorunlari ongormeli ve 
		     Java'ya bu sorunla handle edebilmesi icin yol gostermelidir.
		*/
		
			System.out.println("islem no : "+ count);
		try {
			System.out.println("bolme isleminin sonucu : "+sayi1/sayi2);

		} catch (ArithmeticException e) {
			System.out.println("sayiyi 0'a bolemezsin");
		}
		count++;
		}
		
		scan.close();

	}

}

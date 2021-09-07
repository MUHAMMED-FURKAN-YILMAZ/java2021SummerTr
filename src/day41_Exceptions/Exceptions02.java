package day41_Exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		int count=1;
		
		while (count<=2) {
			System.out.print("Bolunen sayi giriniz : ");		
			int sayi1=scan.nextInt();
			
			System.out.print("Bolen sayi giriniz : ");		
			int sayi2=scan.nextInt();
			
			try {
				System.out.println("bolum : "+sayi1/sayi2);
			} catch (ArithmeticException e) {
			System.out.println("Hatali giris yaptiniz");// manuel handle
			System.out.println(e.getMessage());// by zero--> (hatanin en kisa metni)--> handle edilecek veridir
			
			e.printStackTrace();// java.lang.ArithmeticException: / by zero
			//Bolunen sayi giriniz : 	at day41_Exceptions.Exception02.main(Exception02.java:20)
			// ustteki iki satiri yazdirir (hatanin uzun metni.. handle edilmesi icin tum veriler igetirdi)
			}
			
			count++;
		}
		
		System.out.println("dewamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmsutur");
		scan.close();

	}
}

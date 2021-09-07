package day17_NestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		//Soru 7 ) Kullanicidan bir sayi alin ve 
		//		   bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int i=sayi;
		int toplam=0;
		int rakam=0;
		while (i>0) {
			rakam=i%10;
			toplam+=rakam;
			i/=10;// while da burada i'yi degistirdigim icin artirmaya 
				  // gerek kalmadi. for'a göre + ozellik
		}
System.out.println("girdiginiz "+sayi+" sayisinin rakamlar toplami : "+toplam);
//eger sayiyi i ye esitlemeyip uzerinde yapsaydik burada sayiyi kullanamazdik		

	scan.close();
	} 

}

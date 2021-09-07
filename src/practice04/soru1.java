package practice04;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {

	//kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 
	//2 ayri kelimeye ayiriniz
	// ad ayri soyad ayri sekilde ekrana yaziniz
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Adinizi soyadinizi giriniz");
	String adSoyad=scan.nextLine(); // ali can
	
	String ad=adSoyad.substring(0, adSoyad.indexOf(" "));
	String soyad= adSoyad.substring(adSoyad.indexOf(" ")+1);
	System.out.println("adiniz : "+ad+"\nsoyadiniz : "+ soyad);
	
	scan.close();
	
	}

}

package practice04;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {

		//Kullanýcýdan alacaðýnýz, 3 kelimedne oluþan ismi
        // Örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.

		Scanner scan=new Scanner(System.in);
		System.out.println("3 kelimeden olusan isim giriniz");
		String isim=scan.nextLine().toUpperCase(); 
		
		String name1=isim.substring(0, isim.indexOf(" "));
		String name2=isim.substring(isim.indexOf(" ")+1, isim.lastIndexOf(" "));
		String name3=isim.substring(isim.lastIndexOf(" ")+1);
	
		char n1= name1.charAt(0);
		char n2= name2.charAt(0);
		char n3= name3.charAt(0);
		
	System.out.println("adiniz : "+name1+" ikinci adiniz : "+name2+" soyadiniz : "+name3);
	System.out.println(n1+"."+n2+"."+n3);
	scan.close();
	}
}

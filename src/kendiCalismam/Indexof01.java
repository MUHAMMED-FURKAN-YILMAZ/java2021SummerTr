package kendiCalismam;

import java.util.Scanner;

public class Indexof01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Bir cumle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("cumlenin icinde aradýgýnýz kelimeyi giriniz");
		String kelime=scan.next();
		
		int ilkIndex=cumle.indexOf(kelime);
		int sonIndex=cumle.lastIndexOf(kelime);
		
		if (ilkIndex==-1) {
			System.out.println("Kelime cumlede kullanilmamis");
		}else if (ilkIndex==sonIndex) {
			System.out.println("Kelime cumlede 1 kez kullanilmis");
		}else {
			System.out.println("Kelime cumlede 1 'den fazla kullanilmis");
		}
		scan.close();
	}

}

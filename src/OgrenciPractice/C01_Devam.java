package OgrenciPractice;

import java.util.Scanner;

public class C01_Devam {

	public static void main(String[] args) {
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen sayilar giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		scan.nextLine();// int den sonra string alm�yor sistemi durdurmam gerekiyor 
						// o y�zden bu islemi kullandim
		String isimler=scan.nextLine();
		System.out.println("yenideger");
		
		scan.close();
	}

}

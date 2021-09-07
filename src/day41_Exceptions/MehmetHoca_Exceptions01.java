package day41_Exceptions;

import java.util.Scanner;

public class MehmetHoca_Exceptions01 {
	 public static void main(String[] args) {
		
	// Kullancidan 2 tam sayi alin ve bolumleri yazdirin
	
	Scanner scan=new Scanner(System.in); 
	
	System.out.print("Lutfen bolunecek sayi giriniz : ");		
	int sayi1=scan.nextInt();
	
	System.out.print("Lutfen kaca bolmek istediginizi yazin : ");		
	int sayi2=scan.nextInt();
	
	// Java exceptionslari handle etmek icin try-catch blogu olusturmustur
	try {
		System.out.println("bolme isleminin sonucu : "+sayi1/sayi2);

	} catch (ArithmeticException e) {
		System.out.println("sayiyi 0'a bolemezsin");
	}
	
	scan.close();
	
	 }
}

package day08_TernaryOperator;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		// Soru3)Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		double num=scan.nextDouble();
		
	System.out.println(num>=0 ? num : -1*num);
	
	// if ile yapmak isteseydik
	
	if (num>0) {
		System.out.println("Girdiginiz sayinin mutlak degeri : " + num);
	} else {
		System.out.println("Girdiginiz sayinin mutlak degeri : " + -num);
	}
	
	scan.close();
	}
}

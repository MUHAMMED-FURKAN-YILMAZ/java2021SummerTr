package day08_TernaryOperator;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse
		// “Rakam veya negatif sayi3” , 100’den kucukse “iki basamakli sayi”degilse 
		// “uc basamakli veya daha buyuk sayi” yazdirin

		
		Scanner scan= new Scanner(System.in);
		
		System.out.println(" Lutfen bir tam sayi giriniz");
		
		int num=scan.nextInt();
		
		System.out.println(num<10 ? "Rakam veya negatif sayi" : num<100 ? "iki basamakli sayi" : "Uc basamakli ya da daha buyuk" );
		
		scan.close();
		
	}

}

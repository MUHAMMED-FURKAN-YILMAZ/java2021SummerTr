package day08_TernaryOperator;

import java.util.Scanner;

public class C7_NestedTernary02 {

	public static void main(String[] args) {
	//	Soru4) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
	//  girilen degerlere  gore dikdorgenin kare olup olmadigini yazdirin.

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
		
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		System.out.println(num1<=0 || num2<=0 ? "Lutfen gecerli uzunluk giriniz" : num1==num2 ? "Kare" : "Kare degil");
		
		scan.close();
	}

}

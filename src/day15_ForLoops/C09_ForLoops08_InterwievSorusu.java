package day15_ForLoops;

import java.util.Scanner;

public class C09_ForLoops08_InterwievSorusu {

	public static void main(String[] args) {
	/*Soru 11 ) Interview Question Kullanicidan 10’den kucuk bir sayi 
	 isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
	 */
		 
		Scanner scan=new Scanner(System.in);		
		System.out.println("Lutfen 10'dan kucuk bir sayi yaziniz");
		
		int sayi=scan.nextInt();
		int faktoriyel=1;// 1 carpmada etkisiz oldugu icin
		
		for (int i = 1 ; i <=sayi ; i++) {
			faktoriyel*=i;
		}
		System.out.println("Girdiginiz sayinin faktoriyeli: "+ faktoriyel);
		
	// kullanici 5 girdiyse bu islemin sonucunda konsolda 
	//	5!=1*2*3*4*5 =120 yazdiralim.
		
	
	
	}

}

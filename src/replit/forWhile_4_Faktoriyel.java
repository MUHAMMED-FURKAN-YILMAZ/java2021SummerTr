package replit;

import java.util.Scanner;

public class forWhile_4_Faktoriyel {

	public static void main(String[] args) {
		/*
		 Girdi olarak bir tamsayý kabul eden ve 
		 faktöriyel hesaplayan programi yazýniz.

		Input : 6

		Output: 6!=65432*1=720
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		System.out.print(sayi+"!=");
		for (int i = sayi; i >= 1; i--) {
			faktoriyel*=i;
			System.out.print(i);
			if (i!=1) {
				System.out.print("*");
			}
		
		}
		System.out.println("="+faktoriyel);	
		scan.close();
	}

}

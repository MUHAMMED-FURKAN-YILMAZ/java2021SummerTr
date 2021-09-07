package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list05 {

	/*
	 * Write a program that accepts an integer as input and 
	  prints first 10 prime numbers greater than input 
	Check numbers if they are even or not in a return method.

	Input : 5

	Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
	 
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int sayi=scan.nextInt();
		
		int sayac;	
		int count = 0;
		List<Integer> list=new ArrayList<>();
	
		
			for (int i = sayi+1; i < Integer.MAX_VALUE; i++) {
				sayac=0;
				for (int j = 2; j < i; j++) {
					
					if (i%j==0) {
						sayac++;
					}
				}
					if (sayac==0) {						
						list.add(i);				
						count++;
					}
				
				if (count==10) {
					break;
				}
			}
			System.out.println(list);

			
	}

}

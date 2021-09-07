package day15_ForLoops;

import java.util.Scanner;

public class C11_Palindrome9 {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi 
		//			String’in palindrome olup olmadigini kontrol eden bir program yazin

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Palindrome olup olmadýgýný ogrenmek istediginiz kelimeyi giriniz");
		String str=scan.next().toLowerCase();
		
		String palindrome="";
		
		for (int i = 0; i < str.length(); i++) {
		
			palindrome+=str.substring(str.length()-i-1, str.length()-i);		
			
		}
		if (str.equals(palindrome)) {
			System.out.println("Girdiginiz isim palindrome'dur");
		}else {
			System.out.println("Girdiginiz isim palindrome degildir");
		}	
		scan.close();
			
			
			
			
	
	}

}

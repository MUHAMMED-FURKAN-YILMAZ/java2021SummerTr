package day32_StringBuilder;

import java.util.Scanner;

public class C03_StringBuilder_Soru_Polindrome {

	public static void main(String[] args) {
		/*
		 * Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak 
		 * cümleyi ters çeviren ve cümlenin palindrom	 
	       olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan)
	        bir Java programý yazýn.
	    (without case sensitivity)
	    Eg : input : I love Java
	    Output: "Reversed sentence : avaJ evol I .
	       It is not a palindrome"
*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ifadeyi giriniz");
		String str= sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		String ters=sb.reverse().toString();
		
		if (str.equalsIgnoreCase(ters)) {
			System.out.println("Girdiginiz ifade polindrome'dur "+ters);
		}else {
			System.out.println("Girdiginiz ifade polindrome degildir "+ters);
		}

	}

}

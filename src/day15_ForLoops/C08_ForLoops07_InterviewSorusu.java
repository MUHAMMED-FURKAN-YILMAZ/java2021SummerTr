package day15_ForLoops;

import java.util.Scanner;


public class C08_ForLoops07_InterviewSorusu {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan 
		// bir String isteyin ve Stringi terse ceviren program yazin.

		Scanner scan=new Scanner(System.in);		
		System.out.println("Lutfen tersten yazdirmak icin bir string yaziniz");
		
		String str=scan.nextLine();
		String terstenStr="";
		
		for (int i = 0; i < str.length(); i++) {
			
		terstenStr+= str.substring(str.length()-1-i, str.length()-i);
		}
		System.out.println(terstenStr);
			
		// yada  C07'deki gibi diger yoldan yapilabilir
		
		String terstenStr2="";
		
		for (int i=str.length()-1 ; i>=0; i--) {
			terstenStr2+= str.substring(i, i+1);
		}
		System.out.println(terstenStr2);
	scan.close();
	}

}

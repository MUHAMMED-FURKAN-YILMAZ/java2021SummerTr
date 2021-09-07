package replit;

import java.util.Scanner;

public class If_Switch_Ternary_02_AdSoyadKkNO {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Adinizi ve soyadinizi giriniz");
		String name=scan.nextLine();
		String name1= name.substring(0,name.indexOf(" "));
		name1=name1.substring(0, 1).toUpperCase()+name1.substring(1).replaceAll("\\w", "*");
		
		String surname=name.substring(name.indexOf(" ")+1);
		surname=surname.substring(0, 1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");
		
		System.out.println("Kredi karti numaranizi giriniz");
		String kkNo=scan.nextLine();
		String changekkNo="**** **** **** "+kkNo.substring(12);
		
		
		System.out.println("Name : "+"\n"+name1+" "+surname+"\nCCN : "+changekkNo);
					
	 scan.close();		
		
		
		
		
	}
}

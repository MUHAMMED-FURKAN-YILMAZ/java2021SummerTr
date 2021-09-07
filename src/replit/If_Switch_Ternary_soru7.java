package replit;

import java.util.Scanner;

public class If_Switch_Ternary_soru7 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Uzunlugu en az 2 olan isim giriniz");
		
		String isim=scan.next();
		
		if (isim.length()>=2) {
			System.out.println(isim.substring(isim.length()-2)+(isim.substring(isim.length()-2))+
					(isim.substring(isim.length()-2)));	
		}
		
		

	}

}

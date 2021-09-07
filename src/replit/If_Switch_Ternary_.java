package replit;

import java.util.Scanner;

public class If_Switch_Ternary_ {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("3 harfli isim giriniz");
		String isim=scan.next();
		
	System.out.println(isim.substring(0,1).equalsIgnoreCase(isim.substring(1,2)) || 
	isim.substring(1,2).equalsIgnoreCase(isim.substring(2)) || 
	isim.substring(0,1).equalsIgnoreCase(isim.substring(2)) ? 
	"isim ayni karakterlere sahiptir" : "Dizenin benzersiz karakterleri var");		
		
		
	}

}

package Practice03;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {

		// Kullan�c�dan alaca��n� bir stringde bo�luk 
		// karakterinin olup olmad���n� kontrol ediniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		
		String str=scan.nextLine().toLowerCase();
		
		boolean varMi= str.contains(" ");
		
		System.out.println(varMi);
		
		// veya
		// System.out.println("girdiginiz kelimede "+str.contains(" "));
		scan.close();
	}

}

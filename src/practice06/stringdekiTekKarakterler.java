package practice06;

import java.util.Scanner;

public class stringdekiTekKarakterler {

	public static void main(String[] args) {
		// kullanýcýdan alýnan bir stringdeki indexi tek 
		//olan karakterleri yazdiriniz.
        
		Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");// yunusciftci
       
        String str=scan.nextLine();
       int i=0; 
        
        do {
        	if (i%2==1) {
				System.out.print(str.charAt(i)+", ");//index'i tek olan karakteri yazdir
			}
			i++;
		} while (i<str.length());
scan.close();	}

}

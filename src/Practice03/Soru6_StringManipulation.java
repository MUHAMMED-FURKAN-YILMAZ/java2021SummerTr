package Practice03;

import java.util.Scanner;

public class Soru6_StringManipulation {

	public static void main(String[] args) {

		/* StringMethods
        String girildiginde ilk iki karakteri haric stringin kalan harflerini 
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de yazdiran kod yaziniz
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str=scan.nextLine().toLowerCase();
		
		if (str.startsWith("gh")) {
			System.out.println(str);		
		}else if (str.startsWith("g")) {
			System.out.println(str.charAt(0)+str.substring(2));
		}else if (str.charAt(1)=='h') {
			System.out.println(str.substring(1));
		}else {
			System.out.println(str.substring(2));
		}
			
		scan.close();
		
		
	}

}

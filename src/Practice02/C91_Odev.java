package Practice02;

import java.util.Scanner;

public class C91_Odev {

	public static void main(String[] args) {
		/* 
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */

		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
	
		int num =scan.nextInt();
		
		if (num<0) {
			System.out.println("Negatif Sayi");
		} else if (num<10) {
			System.out.println("Rakam");
		} else {
			System.out.println("Pozitif Sayi");
		}
		scan.close();

		/*
		ternary þekliyle
		String result=(num<0 ? "Negatif Sayi" : num<10 ? "Rakam" : "Pozitif Sayi");
		System.out.println(result);
		*/
		
	}

}

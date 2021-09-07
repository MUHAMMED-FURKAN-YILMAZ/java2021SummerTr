package Practice02;

import java.util.Scanner;

public class C7_Practice {

	public static void main(String[] args) {

 /* Kullanici tarafýndan girilen bir sayinin
  * mutlak degerini yazdirmak icin bir program yazin
  */
	
		Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz");
        int a=scan.nextInt();
	
        System.out.println(a<0 ? "Girdiginiz sayinin mutlak degeri : "+(-a) : "Girdiginiz sayinin mutlak degeri : "+a);
       
	}

}

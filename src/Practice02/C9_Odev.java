package Practice02;

import java.util.Scanner;

public class C9_Odev {

	public static void main(String[] args) {
		
		/*
        Kullanicidan bir character girmesini isteyiniz
     Character harf ise kucuk harf olup olmadigini kontrol ediniz
     Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
     Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
     Harf degilse ekrana "Harf degil" yazdiriniz
     97:a  122:z ascii değeri
      
     */
		// ternary
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir karakter giriniz");
	
	char karakter=scan.next().charAt(0);
	//ternary ile
	System.out.println(karakter<'A' || karakter>'Z'&& karakter<'a' || karakter>'z' ? "Harf degildir": karakter>='A'&& karakter<='Z'? "Buyuk Harf" : "Kucuk Harf" );
	
	
	/* İf ile
	if (karakter>='A' && karakter<='Z') {
		System.out.println("Buyuk Harf");
	} else if (karakter >='a' && karakter<='z') {
		System.out.println("Kucuk Harf");
	} else {
		System.out.println("Harf Degil");
	}
	*/
	scan.close();
	
	/* Scanner scan = new Scanner(System.in);
​
        System.out.print("Bir character giriniz : ");
        char ch = scan.next().charAt(0);
​
        System.out.println("*****  TERNARY çözümü  *****");
​
        String result = ((ch <= 'z' && ch >= 'a') || (ch >= 'A' && ch <= 'Z')) ?
                ((ch <= 122 && ch >= 97) ? "Kucuk Harf" : "Buyuk Harf") : "Harf Degil";
​
        System.out.println(result);
​
        System.out.println("*****  if  çözümü  *****");
​
        if ((ch <='z' && ch>='a')||(ch <='Z' && ch>='A')) {
            if (ch <=122 && ch >=97) {
                System.out.println("küçük harf");
​
            }else System.out.println("Büyük harf");
​
        }else System.out.println("Harf değil");
    }
}	  	  
	 */
	}

}

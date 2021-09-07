package Practice02;

import java.util.Scanner;

public class C1_UcgenDikKenar_Math {

	public static void main(String[] args) {
		
		/*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       kök almak için Math.sqrt(sayi) metodunu kullanýnýz 
         */
		Scanner scan= new Scanner(System.in);
		System.out.print("a dik kenarini giriniz: ");
		int a=scan.nextInt();
		
		System.out.print("b dik kenarini giriniz: ");
		int b=scan.nextInt();
		
		double h= Math.sqrt((a*a)+(b*b));
		System.out.println("ucgeninizin hipotenusu : "+h);
		
		scan.close();
		
	}

}

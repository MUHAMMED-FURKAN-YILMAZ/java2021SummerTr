package Practice02;

import java.util.Scanner;

public class C1_UcgenDikKenar_Math {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.
        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       k�k almak i�in Math.sqrt(sayi) metodunu kullan�n�z 
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

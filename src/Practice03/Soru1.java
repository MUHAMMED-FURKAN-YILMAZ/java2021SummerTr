package Practice03;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {

		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re 
		//ekrana A, B, C veya D yazd�r�n.
        // 1. 0()dahil ile 50 arasi - D   
        // 2. 50(dahil) ile 60 aras� - C   
        // 3. 60(dahil) ile 80 aras� - B  
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.
        
        // switch() de long kullanilmaz, float kullanilmaz, 
		//double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.

		
		Scanner scan=new Scanner(System.in);
		System.out.print("notunuzu giriniz");
		
		int not=scan.nextInt();
		
		if (not>=0 && not<50) {
			not =50;
		} else if (not>=50 && not<60) {
			not=60;
		}else if (not>=60 && not<80) {
			not=80;
		}else if (not>=80 && not<=100) {
			not=100;
		}
		
		switch (not) {
		case 50:
			System.out.println("Notunuz D ");
			break;
		case 60:
			System.out.println("Notunuz C ");
			break;
		case 80:
			System.out.println("Notunuz B ");
			break;
		case 100:
			System.out.println("Notunuz A ");
			break;
		default: 
			System.out.println("Gecerli not giriniz");
			break;
		}
		scan.close();
	}

}

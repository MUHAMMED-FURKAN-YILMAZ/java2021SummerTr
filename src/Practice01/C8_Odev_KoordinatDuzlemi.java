package Practice01;

import java.util.Scanner;

public class C8_Odev_KoordinatDuzlemi {

	public static void main(String[] args) {
		
		// Kullan�c�dan ald���n�z ikilinin hangi  koordinat noktas�n�n hangi
		// b�lgede oldu�unu yazd�ran bir kod yaz�n�z.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen koordinat noktalarini \nonce \"x\" ardindan \"y\" olacak sekilde giriniz. \nx'i girdikten sonra ENTER'a basiniz");
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if (x==0 && y==0) {
			System.out.println("Girdiginiz nokta orijindedir.");
		} else if (x==0 && y!=0) {
			System.out.println("Girdiginiz nokta y ekseni uzerindedir.");
		} else if (x!=0 && y==0) {
			System.out.println("Girdiginiz nokta x ekseni uzerindedir.");
		} else if (x>0 && y>0) {
			System.out.println("Girdiginiz nokta 1. bolgededir.");
		} else if (x<0 && y>0) {
			System.out.println("Girdiginiz nokta 2. bolgededir.");
		} else if (x<0 && y<0) {
			System.out.println("Girdiginiz nokta 3. bolgededir.");
		} else {
			System.out.println("Girdiginiz nokta 4. bolgededir.");
		}
		scan.close();
		
		
		
		
		
		
		
		
		
	}
	
	

}

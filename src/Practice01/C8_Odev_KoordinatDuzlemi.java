package Practice01;

import java.util.Scanner;

public class C8_Odev_KoordinatDuzlemi {

	public static void main(String[] args) {
		
		// Kullanýcýdan aldýðýnýz ikilinin hangi  koordinat noktasýnýn hangi
		// bölgede olduðunu yazdýran bir kod yazýnýz.

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

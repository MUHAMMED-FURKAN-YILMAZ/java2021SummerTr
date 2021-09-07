package practice06;

import java.util.Scanner;

public class yuksekliktenBirakilanTop {

	public static void main(String[] args) {
	//belirli bir(kullan�c� girecek)  y�kseklikten bir top serbest dusme ile b�rakil�maktadir.
	// top serbest b�rak�ld�ktan  sonra s�rekli birakildigi y�ksekli�in % 75 '� kadar zeminden yukar� do�ru z�plamaktad�r
	// Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde olay sonlandirilmaktadir.
    // Bu ana kadar topun toplam ald��� yolu ve topun zemine  vurma say�s�n� bulunuz.
	  
	        Scanner scan = new Scanner(System.in);
	        System.out.print("topun birakilacagi yuksekligi giriniz : ");
	        double birakilanYukseklik=scan.nextDouble();
	       
	        double toplamYol =birakilanYukseklik;
	        int count=0;
	        
	        while (birakilanYukseklik>=1) {
				birakilanYukseklik=birakilanYukseklik*3/4;
				toplamYol+=birakilanYukseklik*2;
				count++;
			}
	        System.out.println("topun zemine vurma sayisi : "+count);
	        System.out.println("topun toplam aldigi yol : "+toplamYol);
	}

}

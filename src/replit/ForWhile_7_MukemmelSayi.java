package replit;

import java.util.Scanner;

public class ForWhile_7_MukemmelSayi {

	public static void main(String[] args) {
		/*
 	Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
	Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, 
	herhangi bir say� M�kemmel Say� olarak bilinir.
			Input : 6
			Output: 6 Mukemmel Sayidir.
			
			Input 7
			Output: 7
		 	Mukemmel Sayidir degildir.
 */
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Sayi giriniz");
	int sayi=scan.nextInt();
	int toplam=0;
	
	
	for (int i =1 ; i < sayi ; i++) {
		if (sayi%i==0) {
			toplam+=i;
		}	
	}
		if (toplam==sayi) {
			System.out.println(sayi+" Mukemmel Sayidir.");
		}else {
			System.out.println(sayi+" Mukemmel Sayi degildir.");
		}
		
	/*
	int i=1;
	while (i<sayi) {
		if (sayi%i==0) {
			toplam+=i;
		}
		
		i++;
	}
	if (toplam==sayi) {
		System.out.println(sayi+" Mukemmel Sayidir.");
	}else {
		System.out.println(sayi+" Mukemmel Sayi degildir.");
	}
	*/
	scan.close();
	}				

	}



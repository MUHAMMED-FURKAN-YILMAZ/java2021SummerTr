package kendiCalismam;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
	
		/* Problem Tan�m�
        Verilen iki say�n�n kombinasyonunu bulan kodu yaz�n�z.
        Hat�rlatma C(n,r) = n! / (r!(n-r)!)
        
        Ekran ��kt�s�
        Birinci say�y� giriniz: 15
        Ikinci say�y� giriniz: 4
        Kombinasyon: 1365
        
        Birinci say�y� giriniz: 5
        Ikinci say�y� giriniz: 3
        Kombinasyon: 10
       
        !her say�da dogru veriyor 15 ile 4 ? 2 veriyor
      */

	/*	Scanner scan=new Scanner(System.in);
		System.out.print("N degerini giriniz : ");
		int n=scan.nextInt();
		System.out.print("R degerini giriniz : ");
		int r=scan.nextInt();
		
		int fak1=1;
		int fak2=1;
		int fak3=1;
		
		for (int i = 1; i <=n ; i++) {
			fak1*=i;
		}
		for (int j = 1; j <=r ; j++) {
			fak2*=j;
	}
	
		for (int k = 1; k <= n-r; k++) {
			fak3*=k;
		}
	int carpim=fak2*fak3;
	int kombinasyon=fak1/carpim;
	
	 System.out.println(n + " Say�s�n�n " + r + "'li" + " Kombinasyonu = " + kombinasyon);
		
	*/
		Scanner klavye = new Scanner(System.in);
        System.out.print("N De�erini Giriniz : ");
        int n = klavye.nextInt();

        System.out.print("R De�erini Giriniz : ");
        int r = klavye.nextInt();

        int faktoriyel_1 = 1;
        int faktoriyel_2 = 1;
        int faktoriyel_3 = 1;
        int fark = n - r;

        for (int i = 1; i <= n; i++) {

            faktoriyel_1 = faktoriyel_1 * i;
        }
        System.out.println("N Say�s�n�n Fakt�riyeli : " + faktoriyel_1);

        for (int j = 1; j <= r; j++) {

            faktoriyel_2 = faktoriyel_2 * j;
        }
        System.out.println("R Say�s�n�n Fakt�riyeli : " + faktoriyel_2);

        for (int k = 1; k <= fark; k++) {

            faktoriyel_3 = faktoriyel_3 * k;
        }
        System.out.println("(N-R)'nin Fakt�riyeli : " + faktoriyel_3);

        int carpim = faktoriyel_2 * faktoriyel_3;
        int kombinasyon = faktoriyel_1 / carpim;

        System.out.println(n + " Say�s�n�n " + r + "'li" + " Kombinasyonu = " + kombinasyon);	
		
}
}

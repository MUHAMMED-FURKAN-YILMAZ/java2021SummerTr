package Practice02;

import java.util.Scanner;

public class C90_Odev {

	public static void main(String[] args) {
		// Kullan�c�dan bir pozitif tamsay� girmesini isteyin, o pozitif tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
        // 3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
        // �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
	
	
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen pozitif tam sayi giriniz :");
	
		int sayi=scan.nextInt();
		
		
		  if (sayi<0) {
		 
			System.out.println("Hatali sayi girdiniz. Lutfen pozitif tam sayi giriniz");
		} else if (sayi>=100 && sayi<1000) {
			 System.out.println("Girdiginiz sayi 3 basamaklidir");
		}else if (sayi%2==0) {
			System.out.println("Girdiginiz sayi 3 basamakli olmayan cift sayi");
		} else {
			System.out.println("Girdiginiz sayi 3 basamakli olmayan tek sayi");
		}
		scan.close();
	/*
		ternary hali
		 System.out.println(sayi<0 ? "Hatali sayi girdiniz. Lutfen pozitif tam sayi giriniz" : sayi>=100 && sayi<1000 ? "Girdiginiz sayi 3 basamaklidir" : sayi%2==0 ? "Girdiginiz sayi 3 basamakli olmayan cift sayi" : "Girdiginiz sayi 3 basamakli olmayan tek sayi");
	
	*/
	
	
	
	}

}

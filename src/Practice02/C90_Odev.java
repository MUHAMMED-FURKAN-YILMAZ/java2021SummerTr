package Practice02;

import java.util.Scanner;

public class C90_Odev {

	public static void main(String[] args) {
		// Kullanýcýdan bir pozitif tamsayý girmesini isteyin, o pozitif tamsayý 3 basamaklý ise ekrana “3 Basamaklý” yazdýrýn.
        // 3 basamaklý degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn.
        // Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”
	
	
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

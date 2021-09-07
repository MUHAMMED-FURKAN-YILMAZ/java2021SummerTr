package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C08_DoWhileLoop_Homework {

	public static void main(String[] args) {

		// Soru 6 ) Kullanicidan toplamak icin sayi isteyin ve 
				// toplam 500�e ulasincaya kadar devam
		        // istemeyi ettirin. Toplam 500�e ulastiginda veya 
				// gectiginde toplami ve kac sayi
		        // girildigini yazdirin
		
		int toplam=0;
		int sayi=0;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Toplanmasini istediginiz sayiyi giriniz");
			
			 sayi=scan.nextInt();
			 				 
				 toplam+=sayi;
				 count++;									
			
		} while (toplam<500);
		
		System.out.println(count+" tane sayi girdiniz. "
				+ "\nGirilen sayilar toplami : "+toplam);
		
		scan.close();
		
		

	}

}

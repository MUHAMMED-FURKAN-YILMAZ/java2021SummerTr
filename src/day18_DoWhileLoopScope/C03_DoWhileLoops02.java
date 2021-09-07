package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoops02 {

	public static void main(String[] args) {
		/*
		Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		islemi bitirmek icin 0�a basmasini soyleyin.
	 	Kullanici 0�a bastiginda toplam kac pozitif sayi girdigini ve 
	 	girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
	 	Kullanici negatif sayi girerse ignore(girmemis gibi) edin
	*/
		double sayi=0;
		int count=0;
		double toplam=0;
		
		Scanner scan = new Scanner(System.in);

	do {
System.out.println("Toplanmasini istediginiz pozitif  sayilar girin "
		+ "			\nislemi bitirmek icin 0'a basiniz");
	
	sayi=scan.nextDouble();
	
//Kullanicidan ald�g�m sayiyi pozitif mi diye kontrol edelim
	if (sayi>0) {
		
		toplam+=sayi;
		count++;
		
	}else if (sayi<0) {
		
	
		System.out.println("pozitif sayi girmeliydiniz " 
				+"\nBu sayi negatif oldugu icin yok sayiyorum");
	}

	} while (sayi!=0);
		
		System.out.println("girdiginiz sayilardan "+ count+" tanesi pozitifti "
				+"ve pozitif sayilar toplami : "+toplam);
		
		
		scan.close();
	}

}

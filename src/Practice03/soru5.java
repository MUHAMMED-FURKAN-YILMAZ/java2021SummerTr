package Practice03;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {

		/*
	      Bakıye öğrenme para çekme yatırma ve çıkış işlemlerinin 
	      olduğu bir bankamatik pr kodlayınız
	     */

		System.out.println("******************");	
		System.out.println("JAVA BANK ATM'ye Hos geldiniz");	
		
		System.out.println("1. islem : Bakiye sorma\n2. islem : Para cekme\n3. islem : Para yatirma\n4. islem : Cikis");	
	
		int bakiye =5000;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen yapacaginiz islemi seciniz");
		int secim=scanner.nextInt();
		
		switch (secim) {
		case 1:{
			System.out.println("bakiyeniz: "+bakiye);
			break;
		}
		case 2:{
			System.out.println("Cekeceginiz miktari giriniz : ");
			int cekilenMiktar=scanner.nextInt();
			if (cekilenMiktar>bakiye) {
				System.out.println("Bakiyeniz yeterli degil");
			}else {
				bakiye-=cekilenMiktar; // bakiyeden cekilen miktari cikardik
				System.out.println("Yeni bakiyeniz :"+bakiye);
			}
			break;
		}
		case 3:{
			System.out.println("Yatiracaginiz miktari giriniz: ");
			int yatirilanMiktar=scanner.nextInt();
			bakiye+=yatirilanMiktar;// bakiyeye yatirilan miktari ekledik
			System.out.println("Yeni bakiyeniz :"+bakiye);
			break;
		}
		case 4:{
			System.out.println("Cikisiniz yapiliyor");
			break;
		}
		}
		scanner.close();
		
	}

}

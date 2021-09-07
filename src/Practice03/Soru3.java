package Practice03;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		// Kullanicidan aldiginiz Yilin ay numarasýna göre , 
		// ayýn kaç gün olduðunu sayý ile yazdýrýnýz

		Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen yilin kacinci ayinda oldugunuzu giriniz : ");
        int ay = scanner.nextInt();
		
      switch (ay) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
		System.out.println("Girdiginiz ay 31 gun cekiyor");
		break;
		
      case 4:
      case 6:
      case 9:
      case 11:
    	  System.out.println("Girdiginiz ay 30 gun cekiyor");
    	  break;
    	  
      case 2:
    	  System.out.println("Yilinizi giriniz");
    	  int  yil=scanner.nextInt();
    	  
    	  if (yil%4==0) {
			System.out.println("Girdiginiz ay 29 gun cekiyor");
		}else {
			System.out.println("Girdiginiz ay 28 gun cekiyor");
		}break;
		
      default:
			System.out.println("Hatali giris yaptiniz");
	}
		
		scanner.close();
		
	}

}

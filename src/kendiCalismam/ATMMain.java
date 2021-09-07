package kendiCalismam;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
/*
 		1. Para �ekme
        2. Para Yat�rma
       	3. havale
        4. Bakiye sorgulama      
        5. password olusturma
        6. password degistirme
        7. Kart �ade
 */
		System.out.println("Karti yerlestiriniz");
		
		Scanner scan=new Scanner(System.in) ;
		ATM atm=new ATM();
		
		System.out.println("Sifrenizi giriniz");
		String sifre=scan.next();
		
		boolean kontrol=atm.passwordKontrol(sifre);// t yada f olarak dondu
		
		if (kontrol==false) {
			System.out.println("isleminiz sonlanmistir");
		}else {
			boolean cikilsinMi=false;
	        while(!cikilsinMi) {
		System.out.println("Yapmak istediginiz islemi tuslayiniz\n1. Para �ekme\n"
				+ "2. Para Yat�rma \n3. Bakiye sorgulama "+"\n4. Password degistirme "
				+ "\n5. Kart �ade");	
			
			int islem=scan.nextInt();
			
			switch (islem) {
			case 1:
			atm.paraCekme();
				break;
			case 2:
			atm.paraYatirma();	
				break;
			case 3:
				System.out.println("Guncel bakiyeniz : "+atm.getBakiye()+" TL");
				break;
			case 4:
				atm.setPassword(atm.passwordDegistirme());// password degisti
				System.out.println(atm.getPassword());// password degistigini veya degismedigini gostersin diye
				break;
			case 5:System.out.println("Kart iade ediliyor...\nC�kis yapiliyor...\nIyi gunler dileriz ");
				cikilsinMi=true;
				break;
			default:
				 System.out.println("Hatali menu sectiniz");
				break;
			}
	        }
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}

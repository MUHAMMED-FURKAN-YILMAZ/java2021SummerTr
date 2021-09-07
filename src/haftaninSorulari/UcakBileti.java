package haftaninSorulari;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		
		/*
	    A þehrinden uçmak isteyen bir kiþi 
	    B þehrine 500km / C þehrine  700km /  D þehrine  900 km mesafededir.
	    km birim fiyati : 0.10$ 
	    12 yasindan kucukse toplam fiyat %50 indirim 
	    12 ve 24 yas arasindaysa 10% indirim
	    65 yasindan buyukse 30% indirim
	    gidis donus bilet alirsa yaþ indirimlerinden hariç 20% indirim
	    bu kosullara gore yolcudan gideceði mesafeyi isteyip ucak bilet 
	    ucretini hesaplayan program yazýnýz
	    */
		
		 Scanner scan = new Scanner (System.in);

	        System.out.print("Java airlines'a hosgeldiniz !\n(B | C | D) \nLutfen ucmak istediginiz sehri giriniz :");
	        String city = scan.next().toLowerCase();

	        System.out.print("Ucusunuzun  \nTek yon icin '0' cift yon icin '1' i tuslayiniz");
	        int flightType = scan.nextInt();

	        System.out.print("Lutfen yasinizi giriniz : ");
	        int age = scan.nextInt();




	        double priceB = 0.10 * 500;
	        double priceC = 0.10 * 700;
	        double priceD = 0.10 * 900;
	        if (city.equals("b") || city.equals("c") || city.equals("d")) {


	            if (age > 65) {
	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceB*0.70)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceB*0.70+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.70)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC*0.70+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.70)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.70+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }
	            } else if (age >= 12 && age <= 24){




	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceB*0.90)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceB*0.90+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.90)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC*0.90+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.90)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.90+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }
	        }
	            } else if(age>0 && age <12) {

	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.50)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.50+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");}


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.50)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC*0.50+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.50)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.50+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }
	            } else if (age > 0 ){

	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.80)+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");}


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.80)+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.80)+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    } else {
	                        System.out.println("Lutfen gecerli bir istikamet seciniz !! \n( B | C | D)");
	                    }


	                }

	            }else if(age<=0){

	                System.out.println("***************************************************");

	                System.out.println("Lutfen gecerli bir yas giriniz !! \n(Bebekler ucusumuza kabul edilmez)");



	            }}


	       /* Scanner scan = new Scanner(System.in);
	        System.out.println("Lütfen yaþýnýzý giriniz : ");
	        int yas = scan.nextInt();
	       Scanner sc = new Scanner(System.in);
	        System.out.println("biletiniz çift yön mü olacak ? : ");
	        String ciftYon = sc.nextLine();
	        double kmFiat = 0.10;
	        if (ciftYon.equalsIgnoreCase("evet")) {
	            double ciftYonFiyat = kmFiat * 4 / 5;//gidiþ dönüþ için %20 indirim=4/5 orana denk gelir..
	            if (yas>=0 && yas < 12) {
	                System.out.println("bilet ücretiniz : $" + (ciftYonFiyat / 2) );
	            } else if (yas >= 12 && yas <= 24) {
	                System.out.println("bilet ücretiniz : $" + (ciftYonFiyat * 9 / 10));
	            } else if (yas > 24 && yas <= 65) {
	                System.out.println("bilet ücretiniz : $" + ciftYonFiyat);
	            } else if (yas > 65) {
	                System.out.println("bilet ücretiniz : $" + (ciftYonFiyat * 7 / 10));
	            }else System.out.println(" yaþýnýzý hatalý  girdiniz");
	        }
	        else if (ciftYon.equalsIgnoreCase("hayýr")) {
	            if (yas>=0 && yas < 12) {
	                System.out.println("bilet ücretiniz : $" + (kmFiat / 2));
	            } else if (yas >= 12 && yas <= 24) {
	                System.out.println("bilet ücretiniz : $" + (kmFiat * 9 / 10));
	            } else if (yas > 24 && yas <= 65) {
	                System.out.println("bilet ücretiniz : $" + kmFiat);
	            } else if (yas > 65) {
	                System.out.println("bilet ücretiniz : $" + (kmFiat * 7 / 10));
	            }else System.out.println(" yaþýnýzý hatalý  girdiniz");
	        }else System.out.println(" ucuþ için tek yon cift yon cevabýnýzý hatalý  girdiniz");
	     */  
	}

}

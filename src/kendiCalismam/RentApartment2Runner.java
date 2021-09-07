package kendiCalismam;

import java.util.Scanner;

public class RentApartment2Runner {
	/* 
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo
​
   Bütün variable'lar için getter ve setter oluşturunuz.
​
    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
​
    Main class'ın içinde;
    userName rent is amountOfRent
     */
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("adinizi giriniz : ");
		String name=scan.nextLine();
		

		System.out.print("dairenizde talep ettiginiz oda sayisini giriniz : ");
		int odaSayisi=scan.nextInt();
		

		System.out.print("balkon tercihinizi giriniz (true/false): ");
		boolean balcony=scan.nextBoolean();
		
		
		RentApartment2 kiraci=new RentApartment2();
		
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
		
		int topKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
		
		System.out.println(kiraci.getName()+" kira ücretiniz :"+topKira);
		scan.close();
	}

}

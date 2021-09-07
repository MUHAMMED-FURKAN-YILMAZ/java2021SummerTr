package day34_Encapsulation;

import java.util.Scanner;

public class C06_RentApartmentMain {

	public static void main(String[] args) {
		
		C05_RentApartments amountOfRent=new C05_RentApartments();

		int rent=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("kiralamak istediginiz apartments'in oda sayisini giriniz : ");
		amountOfRent.setRoomCount(sc.nextInt());
		rent=amountOfRent.room(amountOfRent.getRoomCount());	
		
		System.out.println("Apartments'te balkon olsun mu?\\nHayir(false)\\nEvet(true)");
		amountOfRent.setBalconyOrNo(sc.nextBoolean());
		
		rent+=amountOfRent.balkon(amountOfRent.isBalconyOrNo());
		System.out.println("toplam kiraniz "+rent+"$");
		
		sc.close();
	}

}

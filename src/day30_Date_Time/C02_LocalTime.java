package day30_Date_Time;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {

		LocalTime zaman= LocalTime.now(); // bu zaman sürekli isler
		System.out.println("Aktual zaman : "+zaman);
		
		LocalTime time1= LocalTime.of(12, 35, 23);// bu saat bu dakika bu saniyeye gittik
		System.out.println(time1);// 12:35:23
		
		System.out.println("þu zamandan 2 saat ileri 34 dk geri 45 sn ileri : "+zaman.plusHours(2).minusMinutes(34).plusSeconds(35));// 21:40:56.215621
		
		
		// sistem hizi hesaplama... zaman2-zaman
		for (int i = 0; i < 10000; i++) {
			System.out.print(i);
		}
		LocalTime zaman2= LocalTime.now();
		System.out.println();
		System.out.println(zaman2); // Javanin ilem yaparken 9. satirdan 24. satira kadar olan hizi boyle bulunur. 
		
		
		
		// ulke saatleri hesaplama: 
		
		ZonedDateTime japan=ZonedDateTime.now(ZoneId.of("Japan"));// japonyanin aktuel saatini alir
		System.out.println(japan);
		
		
	}

}

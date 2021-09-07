package day30_Date_Time;

import java.time.LocalDate;

public class C01_LocalDate {
public static void main(String[] args) {
	LocalDate tarih= LocalDate.now();//tarih isiminde obj creat ettik.TRICK :new anahtari kullanilmaz
	System.out.println("bugunun tarihi : "+tarih);//2021-08-02
	
	System.out.println("bugunden 21 gun sonrasi : "+tarih.plusDays(21));//2021-08-23
	
	System.out.println("bugunden 3 yil sonrasi : "+tarih.plusYears(3));//2024-08-02
	System.out.println("bugunden 3 gun  5 ay 2 yıl sonrası :"+tarih.plusDays(3).plusMonths(5).plusYears(2));//2024-01-05
	System.out.println("bugunden 40 gun oncesi : "+tarih.minusDays(40));//2021-06-23
	System.out.println("bugunun 5 yıl öncesi 2 ay sonrasi 3 hafta ertesi : "+tarih.minusYears(5).plusMonths(2).plusWeeks(3));//2016-10-23
	
	/*
	 * localDate classindan uretilen obj method chain kuralınıa uyar . ve methodlar ayni (homojen ) olmak zorunda degildir EX:15. satir..
	 */
	
	System.out.println(tarih.getDayOfMonth());//2
	System.out.println(tarih.getDayOfWeek());//MONDAY
	System.out.println(tarih.getMonthValue());//8
	System.out.println(tarih.getMonth());//AUGUST
	
	LocalDate dogmGnDate =LocalDate.of(1974, 4, 3);
	System.out.println("dogum tarıhı : "+dogmGnDate);//1974-04-03
	System.out.println("dogum gunu : "+dogmGnDate.getDayOfWeek());//WEDNESDAY
	
	System.out.println(tarih.isAfter(dogmGnDate));//true
	System.out.println(dogmGnDate.isBefore(tarih));//true
	
	System.out.println("bugun artik yil mi : "+tarih.isLeapYear());//false
}
}

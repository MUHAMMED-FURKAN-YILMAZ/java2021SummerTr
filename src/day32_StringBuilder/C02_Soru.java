package day32_StringBuilder;

import java.time.LocalTime;

public class C02_Soru {

	public static void main(String[] args) {
		// 1000 kere donecek bir loop yazalim
	      // loop'da String ve StringBuilder kullanip 
	      // oncesinde ve sonrasinda zaman alalim
	      // hizlarini karsilastiralim
		// SB ne kadar hizli String yavas goruluyor
		String s="";
		StringBuilder sb=new StringBuilder();
		LocalTime lt=LocalTime.now();
		System.out.println("string oncesi zaman : "+lt);
		
		
		for (int i = 0; i <= 1000; i++) {
			s+=i;
		}
		System.out.println(s);
		
		System.out.println();
		
		LocalTime lt2=LocalTime.now();
		System.out.println("String sonrasi SB oncesi zaman : "+lt2);
		for (int i = 0; i <=1000; i++) {
			sb.append(i);
		}
	
		System.out.println(sb);
		System.out.println();
		LocalTime lt3= LocalTime.now();
		System.out.println("SB sonrasi zaman : "+lt3);
		
		
		
	}
}
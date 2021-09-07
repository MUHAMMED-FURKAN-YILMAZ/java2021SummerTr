package day30_Date_Time;

import java.time.LocalDate;

public class C05ComparingDate {

	public static void main(String[] args) {

		LocalDate bugun = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 5, 15);
		int fark=bugun.compareTo(date);
		
		System.out.println(bugun);
		System.out.println(date);
		System.out.println(fark);//1 :karsilastirma iki tarihin en buyuk parcasinin 
		 // farkini verir. burada da yil farki verdi.yil esit olsa bu sefer ay'a bakar
		// onun sonucunu 1 gibi verir. bu da esitse gune bakar. en buyuk parca farki
		
		
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}

package day30_Date_Time;

import java.time.LocalDate;
import java.time.Month;

public class C06_Sorular {

	public static void main(String[] args) {
		/*TODO
        Which of the following can be inserted into the blank to create a 
        date of June 21, 2014?
        A. new LocalDate(2014, 5, 21);
        B. new LocalDate(2014, 6, 21);
        C. LocalDate.of(2014, 5, 21);
        D. LocalDate.of(2014, 6, 21);
        E. LocalDate.of(2014, Calendar.JUNE, 21);
        F. LocalDate.of(2014, Month.JUNE, 21);           
      
      
      CEVAP F
      */

		
		
		// TODO
        // What is the output of the following code?
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        /*
         * A. 2018 APRIL 2 
         * B. 2018 APRIL 30 
         * C. 2018 MAY 2
         * D. 2021 APRIL 2 
         * E. 2021 APRIL
         * 30 F. 2021 MAY 2 G. A runtime exception is thrown.
         */
		
        //CEVAP--B
        
        
        
        
	}

}

package day30_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _2_Soru {

    public static void main(String[] args) {

        /*TODO
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(1453, 5, 29);

           F. LocalDate.of(1453, Month.MAY, 21);
         */

        LocalDate date1 = LocalDate.of(1453, 6, 21); // D
        System.out.println("date1 = " + date1);

       LocalDate date2 = LocalDate.of(2014, Month.MAY, 29);  // F
        System.out.println("date2 = " + date2);

    }
}

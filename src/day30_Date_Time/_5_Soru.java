package day30_Date_Time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _5_Soru {

    public static void main(String[] args) {

        //  TODO
        //      What is the output of the following code?

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);  // of ifadesi ile en son eklenen geçerlidir

        d = d.minus(p);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));  // B --> 10.05.2013 11:22

 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/
        // Ya da:
        DateTimeFormatter f2 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(d.format(f2));

    }
}
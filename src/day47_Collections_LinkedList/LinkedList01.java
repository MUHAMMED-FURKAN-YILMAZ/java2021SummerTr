package day47_Collections_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String > ll1=new LinkedList<>(Arrays.asList("erdem","mehmet","samet","said","yagmur"));
        System.out.println(ll1);// [erdem, mehmet, samet, said, yagmur]

        ll1.add("merve"); //--> add yapilan node LinkedList'in sonuna eklenir.
        System.out.println(ll1);//[erdem, mehmet, samet, said, yagmur, merve]

        ll1.add(2,"faruk eczanesi");//--> 2. index'e node eklenir
        System.out.println(ll1);//[erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve]


        LinkedList<String > ll2=new LinkedList<>(Arrays.asList(":-)",";-("));

        ll1.addAll(ll2);// ll1 sonuna ll2 node'larini ekler
        System.out.println(ll1);// [erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(]

        ll1.addFirst("gayet");//--> ilk index'e node  ekler
        System.out.println(ll1);//[gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(]

        ll1.addLast("basarili");//--> son index'e node ekler.
        System.out.println(ll1);//[gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]

        ll1.addAll(3,ll2);//--> 3. index'e collection obj ll2 ekler.
        System.out.println(ll1);//[gayet, erdem, mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]

        ll1.remove();// ilk node siler ve silinen node'u return eder
        System.out.println(ll1);//[erdem, mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]

        //Eger listemiz integer'lardan olusuyorsa parantez icine yazdigimiz sayinin index mi
        //yoksa sayi mi oldugunu karistirmamak icin Java parantez icine yazilani index kabul eder

        ll1.removeFirst();// ilk node'u daha hizli siler ve silinen node'u return eder
        System.out.println(ll1);//[mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]

        ll1.remove("faruk eczanesi");//"faruk eczanesi" node'unu siler ve T/F doner
        System.out.println(ll1);//[mehmet, :-), ;-(, samet, said, yagmur, merve, :-), ;-(, basarili]

        ll1.remove(2);// 2. indexteki node siler ve silinen node'u return eder
        System.out.println(ll1);//[mehmet, :-), samet, said, yagmur, merve, :-), ;-(, basarili]

        ll1.removeFirstOccurrence(":-)");//--> ilk gorulen node silinir ve T/F doner
        System.out.println(ll1);//[mehmet, samet, said, yagmur, merve, :-), ;-(, basarili]

        ll1.add(3,"basarili");
        System.out.println(ll1);//[mehmet, samet, said, basarili, yagmur, merve, :-), ;-(, basarili]

        ll1.removeLastOccurrence("basarili");// son gorunen node silinir ve T/F doner
        System.out.println(ll1);//[mehmet, samet, said, basarili, yagmur, merve, :-), ;-(]




        LinkedList<Integer > ll3=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

        ll3.remove(2);// adi 2 olan node'u degil, index'i siler ve dondurur
        System.out.println(ll3);//[1, 2, 4, 5, 6]

        //ll3.remove(33);
        //System.out.println(ll3);// IndexOutOfBoundsException exception'i firlatir

        ll3.remove(ll3.indexOf(6)); // index'i degil sayiyi sildik
        System.out.println(ll3);//[1, 2, 4, 5]

        ll1.removeAll(ll2);//ll1 den ll2 obj siler
        System.out.println(ll1);//[mehmet, samet, said, basarili, yagmur, merve]

        ll2.add("oguz");
        System.out.println(ll2);//[:-), ;-(, oguz]

        System.out.println(ll1.element());// mehmet--> element() methodu list'in ilk node'unu verir.


        System.out.println(ll1.get(4));//yagmur  -->get(i) indexteki elemani return eder


    }
}

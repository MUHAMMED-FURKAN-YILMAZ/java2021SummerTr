package project_Iterator;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class Iterator {
    public static void main(String[] args) {
        List<String> list2=new ArrayList<>();
        list2.add("ALI");
        list2.add("veli");
        list2.add("Ayse");
        list2.add("fatma");
        System.out.println(list2);

        //For each kullanarak listedeki tum elemanlarin isimlerini buyuk harf yapalim ve yazdiralim

        for (String w:list2) {
            System.out.println(w.toUpperCase());
        }
        System.out.println(list2); //[ALI, veli, Ayse, fatma]

        for (int i=0; i<list2.size();i++){
        list2.set(i,list2.get(i).toUpperCase());
        }
        System.out.println(list2);//[ALI, VELİ, AYSE, FATMA]

        System.out.println("-----------------------------");

        ListIterator <String> it= list2.listIterator();
        while (it.hasNext()){
            String temp=it.next();
            it.set(temp.toLowerCase());
        }
        System.out.println(list2);//[alı, veli, ayse, fatma]
    }





}

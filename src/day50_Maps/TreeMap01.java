package day50_Maps;

import java.util.TreeMap;

public class TreeMap01 {
/*
1) TreeMap elemanlari natural order'a gore siralar
2) TreeMap, Map'lerin en yavasidir.
3) TreeMap'lerde key'ler icin "null" kullanilmaz.
4) TreeMap'lerde value'lar icin "null" istenildigi kadar kullanilabilir.
5) TreeMap'ler syncronized ve thread-safe degildirler.
 */
    public static void main(String[] args) {
    //-->TreeMap'lerde key'lerde null kullanilamaz

        TreeMap<Integer,String> tm =new TreeMap<>();

        tm.put(101,"alaattin");
        tm.put(102,"salih");
        tm.put(103,"berk");
        tm.put(104,"suleyman");
        tm.put(105,"ebikgabik");

        System.out.println(tm);//{101=alaattin, 102=salih, 103=berk, 104=suleyman, 105=ebikgabik}

      //  tm.put(null,"topla");//NullPointerException firlatir-->key null olamaz

        tm.put(106,null);
        System.out.println(tm);//{101=alaattin, 102=salih, 103=berk, 104=suleyman, 105=ebikgabik, 106=null}

        //ceiling==> tavan demek
        System.out.println(tm.ceilingKey(101));//101-->ceilingKey() method'u istenen key degerini (101) return eder
        System.out.println(tm.ceilingKey(111));//null-->ceilingKey() method'u istenen key degerini (111)
                                                // yoksa ustunu return eder o da ypksa null return eder
        System.out.println(tm.ceilingKey(99));//101--> (99)yoksa en yakin ustunu verir ustu yoksa null
        System.out.println(tm.ceilingEntry(102));//102=salih --> entry'siyle getirdi
        System.out.println(tm.ceilingEntry(100));//101=alaattin --> olmadigi icin en yakin ustunun entry'siyle getirdi

        //  floorKey()--> ceilingKey()'in tam tersidir
        System.out.println(tm.floorKey(111));//106

        //descendingKeySet()--> key'leri azalan siralama ile return eder
        System.out.println(tm.descendingKeySet());//[106, 105, 104, 103, 102, 101]

        //keySet()-->key'leri artan siralama ile return eder
        System.out.println(tm.keySet());//[101, 102, 103, 104, 105, 106]


        System.out.println(tm.headMap(104));//{101=alaattin, 102=salih, 103=berk}--> girilen key'deki
                                                    // kendisine kadar olan entry'leri getirir(KENDI HARIC)

        System.out.println(tm.headMap(104,true));//{101=alaattin, 102=salih, 103=berk, 104=suleyman}
                                     //girilen key'deki kendisine kadar olan entry'leri getirir(KENDI DAHIL)

        System.out.println(tm.tailMap(102));//{102=salih, 103=berk, 104=suleyman, 105=ebikgabik, 106=null}
                //girilen key'deki kendisine kadar olan entry'leri getirir(KENDI DAHIL)

        System.out.println(tm.tailMap(102, false));//{103=berk, 104=suleyman, 105=ebikgabik, 106=null
                //girilen key'deki kendisine kadar olan entry'leri getirir(KENDI HARIC)

    }
}

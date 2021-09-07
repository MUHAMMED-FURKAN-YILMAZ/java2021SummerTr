package day50_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MehmetHoca_Maps03 {
    public static <Entry> void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();

        map1.put(101, "Ali, Can, Java");
        map1.putIfAbsent(102,"Veli, Yan, Java");
        map1.put(103,"Ali, Yan, C#");

        System.out.println(map1);//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
        System.out.println(map1.size());//3

        // entry--> key,value ikilisinden olusan tum eleman
        System.out.println(map1.entrySet());//[101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#]
        //-->curly braces degil koseli parentez. yani set gibi dusunebiliriz
        System.out.println(map1.entrySet().size());// 3--> kalip halinde ceviriyor

       // Set<String > mapdenSet= map1.entrySet();--> bu sekilde cevirmedi
        Set<Map.Entry<Integer, String>> mapdenSet= map1.entrySet();//--> bu sekilde izin verdi

        for ( Map.Entry<Integer, String>w:mapdenSet) {
            System.out.println(w);//101=Ali, Can, Java
                                  // 102=Veli, Yan, Java
                                  // 103=Ali, Yan, C#
        }

        System.out.println(map1.equals(mapdenSet));//false
                    // -->Icındeki elemanlar ayni olsa bile false dondu cunkü biri map biri set

        System.out.println(map1.get(101));//Ali, Can, Java--> key olmadan yalnizca value verdi


    }
}

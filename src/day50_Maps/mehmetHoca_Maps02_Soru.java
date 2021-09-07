package day50_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mehmetHoca_Maps02_Soru {
    // Asagida verilen map'de yazilim dili java olana kisi isimlerini
    // bir liste olarak donduren method yaziniz

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");

        String istenenDil = "java";
        List<String> isimList = javaBilenler(map1, istenenDil);
        System.out.println(isimList);
    }

    public static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
        // System.out.println(map1.entrySet());//[101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#]
        //--> köseli parantez'den de anlasilacagi uzere set ..
        List<String> isimListesi = new ArrayList<>();
        for (String each : map1.values()) {//-->eleman1=Ali, Can, java / eleman2=Veli, Yan, java / eleman3=Ali, Yan, C#
            String arr[] = each.split(", ");//-->index0= Ali / index1= Can / index2= java

            if (arr[2].equalsIgnoreCase(istenenDil)) {//-->index2 javaya eşitse isimi dondur (key)
                isimListesi.add(arr[0]);
            }
        }


        return isimListesi;
    }

}

package day50_Maps;

import java.util.HashMap;
import java.util.Map;

public class MehmetHoca_Maps05 {
    public static void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();

        map1.put(101, "Ali, Can, Java");
        map1.putIfAbsent(102,"Veli, Yan, Java");
        map1.put(103,"Ali, Yan, C#");

        System.out.println(map1.get(101));//Ali, Can, Java
        System.out.println(map1.get(105));//null
        System.out.println(map1.getOrDefault(105,"Aradiginiz key map'de yok"));//Aradiginiz key map'de yok

        System.out.println(map1.keySet());//[101, 102, 103] --> set halinde key'leri verir

        map1.replace(103,"Mesut, Aksu, Java");//--> put ile de bu islemi yapabiliriz
        System.out.println(map1);//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Mesut, Aksu, Java}


        Map<String, Integer> map2= new HashMap<>();

        map2.put("H",1);
        map2.put("e",1);
        map2.put("l",2);
        map2.put("o",3);

        System.out.println(map2);//{e=1, H=1, l=2, o=3}
        map2.compute("H",(key,value)->10);
        System.out.println(map2);// {e=1, H=10, l=2, o=3}

        map2.computeIfAbsent("A", v->15);//-->A key'i yoksa A key'ini ve 15 value'yu ekle( methoddaki v temsili . ne yazsan olur)
        map2.computeIfAbsent("H", value->5);//--> H key'i oldugu icin degisiklik yapmadi
        System.out.println(map2);// {A=15, e=1, H=10, l=2, o=3}

        map2.computeIfPresent("H", (key, value)->20);//->A key'i varsa A key'inin value'sunu 20 yap yoksa karisma
        map2.computeIfPresent("m", (key, value)->20);//->m key'i olmadigi icin degisim yapmadi
        System.out.println(map2);//{A=15, e=1, H=20, l=2, o=3}


    }
}

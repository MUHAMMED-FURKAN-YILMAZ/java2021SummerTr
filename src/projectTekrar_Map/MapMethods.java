package projectTekrar_Map;

import java.util.HashMap;

public class MapMethods {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(101, "Ali Han");// eleman eklemek için kullanılır.
        hm1.put(102, "veli Can");
        hm1.put(103, "Ayşe Tan");
        hm1.put(101, "Kemal Yildiz"); // ayni key kullanildiginda eski kaydin uzerine yazar.
        System.out.println(hm1);

        hm1.put(104,"Veli Can");// tekrarli key'e izin vermez ancak tekrarli value'ya izin verir
        System.out.println(hm1);

        hm1.put(null,"merve aslan");
        System.out.println(hm1);
        hm1.put(null,"Hakan Inal");
        System.out.println();

        hm1.put(105,null);
        System.out.println(hm1);
        hm1.put(106,null);
        System.out.println(hm1);


        System.out.println(hm1.get(103));

        System.out.println(hm1.values());

        System.out.println(hm1.keySet());

        hm1.putIfAbsent(104, "Kubilay tuncel");// var olan belirtilen key'e ait key ve value oldugu icin eklemedi
        System.out.println(hm1);

        hm1.putIfAbsent(105,"faruk efehan");//-> null degerine ekleme yapti
        System.out.println(hm1);


        hm1.putIfAbsent(107,"hakan tetik");
        System.out.println();

        System.out.println("1. map'in eleman sayisi "+hm1.size());

        HashMap<Integer,String> hm2=new HashMap<>();

        hm2.put(107,"Elma");
        hm2.put(106,"Armut");
        hm2.put(200,"mandalina");

        System.out.println("2. map'in eleman sayisi "+hm2.size());

        hm1.putAll(hm2);
        System.out.println("hm1 "+hm1);
        System.out.println("hm2 "+hm2);

        hm2.remove(200);
        System.out.println(hm2);


    }

}

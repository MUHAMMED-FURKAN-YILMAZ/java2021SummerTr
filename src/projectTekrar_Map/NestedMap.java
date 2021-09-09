package projectTekrar_Map;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        /*
        KimlikNo    :   ad: Nilufer
                        soyad: Demir
                        Adres: Ankara
                        Bolum: dev

        KimlikNo    :   ad: Ayse
                        soyad: Can
                        Adres: Ankara
                        Bolum: qa
         */

        HashMap<Integer, HashMap<String,String>> kisiListesi=new HashMap<>();

        HashMap<String,String> kisi1=new HashMap<>();
        kisi1.put("ad","Nilufer");
        kisi1.put("soyad","Demir");
        kisi1.put("Adress","Ankara");
        kisi1.put("Bolum","dev");


        HashMap<String,String> kisi2=new HashMap<>();
        kisi2.put("ad","Ayse");
        kisi2.put("soyad","Can");
        kisi2.put("Adress","Ankara");
        kisi2.put("Bolum","qa");

        kisiListesi.put(1548,kisi1);
        kisiListesi.put(9856,kisi2);
        System.out.println(kisiListesi);


        // MAPLARDEN DATA GETIRME ************************

        System.out.println(kisiListesi.get(1548)); //map'te get methodu ile ic kisimdaki key'e karsilik gelen value'yu getirdi
        System.out.println(kisiListesi.get(1548).get("ad"));// bunda ise 1548 key'in value'sundaki ad key'inin value'sunu aldik

        System.out.println(kisiListesi);
        System.out.println("-----------------------------------");

        for (Map.Entry<Integer, HashMap<String, String>> entry : kisiListesi.entrySet()) {
            System.out.println("Kisi Ismi= " + entry.getValue().get("ad")+" "+entry.getValue().get("soyad")+" "+ entry.getValue().get("Bolum"));

        }


    }
}

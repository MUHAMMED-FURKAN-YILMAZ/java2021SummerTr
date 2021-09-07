package day50_Maps;

import java.util.HashMap;

public class Ex01 {
    /*
    Ad ve soyad bulunduruan iki ayrı array'i bir map' eklaeyip yazdırınız.
   // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
     */
    public static void main(String[] args) {

        String ad[]={"ahmet","ahmet can","haluk"};
        String soyad[]={"şeref","erdem","bilgin"};

        HashMap<String,String> adSoyad=new HashMap<>();
        for (int i=0; i<ad.length;i++){
            adSoyad.put(ad[i],soyad[i]);
        }
        System.out.println("adSoyad = " + adSoyad);//adSoyad = {ahmet=şeref, ahmet can=erdem, haluk=bilgin}

    }

}

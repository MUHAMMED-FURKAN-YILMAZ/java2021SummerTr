package day50_Maps;

import java.util.HashMap;
import java.util.Map;

public class MehmetHoca_Maps04_soru {
    //Veeilen bir stringdeki harfleri ve harflerin kacar kez kullanildigini
    // return eden bir method yaziniz
    //      Ornek:
    //      Input:Hellooo
    //      output: H:1, e=1, l=2, o=3
    public static void main(String[] args) {
        String input="Hellooo";
        Map<String,Integer> methoddanGelenMap=harfSayisiBul( input);
        System.out.println(methoddanGelenMap);//{e=1, H=1, l=2, o=3}
    }

    public static Map<String, Integer> harfSayisiBul(String input) {
        String harfler[]=input.split("");
        Map<String,Integer> harfKullanimSayisi= new HashMap<>();

        for (String w:harfler) {
            if (harfKullanimSayisi.containsKey(w) ) {
                harfKullanimSayisi.put(w,harfKullanimSayisi.get(w)+1);
            }else{
                harfKullanimSayisi.put(w,1);
            }
        }

        return harfKullanimSayisi;
    }
}

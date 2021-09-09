package projectTekrar_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListofMap {
    public static void main(String[] args) {
        // Maplerde bir key'e karsilik birden fazla value olabilir mi?

        /*
        meyveler                --> elma
                                    armut
                                    cilek

        sebzeler                --> kabak
                                    patlican
                                    marul
                                    ispanak

        vitaminler              -->a
                                   b
                                   c
                                   d
         */
//---> Arrays.asList ile de yapilabilirdi
        HashMap<String, List<String>> karisik= new HashMap<>();


        List<String > meyveler=Arrays.asList("elma","armut","cilek");
        karisik.put("meyveler", meyveler);

        List<String > sebzeler=Arrays.asList("kabak","patlican","marul","ispanak");
        karisik.put("sebzeler",sebzeler );

        List<String > vitaminler=Arrays.asList("a","b","c","d");
        karisik.put("vitaminler", vitaminler);



        System.out.println(karisik.get("sebzeler").get(1));// patlican .. --> ilki map key cagirdik value geldi, map'den
                                          // farkli olarak 2. get()'de index girdik list'te sira oldugu icin sayi girdik



    }
}

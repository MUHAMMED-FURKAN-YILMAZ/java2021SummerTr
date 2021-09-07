package day50_Maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(101,"Levent");
        m1.put(102,"Said");
        m1.put(103,"Hasan");
        m1.put(104,"Canan");
        m1.put(105,"Ayse");
        System.out.println(m1);//{101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.remove(101);// belirtilen key'deki entry: key+value silinir
        System.out.println(m1);//{102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.remove(102,"said");//key value eslesmesi olursa entry silinir eslesme (said!=Said) olmazsa silinmez false doenr
        System.out.println(m1);//{102=Said, 103=Hasan, 104=Canan, 105=Ayse}
        m1.remove(102,"Said");
        System.out.println(m1);//{103=Hasan, 104=Canan, 105=Ayse}

        m1.remove(111,"Salih");// olmayan key'deki entry'i silme islemi yapilmaz
        System.out.println(m1.remove(111, "Salih"));//false
        System.out.println(m1);//{103=Hasan, 104=Canan, 105=Ayse}

        System.out.println(m1.size());// 3



        HashMap<Integer,String> m2=new HashMap<>();

        m2.put(1,"guzel");
        m2.put(2,"insan");
        m2.put(3,"javacan");
        System.out.println(m2);//{1=guzel, 2=insan, 3=javacan}

        m1.putAll(m2);//m1 map'e m2 put edildi dolayisiyle m1 update oldu ancak m2 ayni degerde.
        //TRICK : putAll() methodu calismasi icin her iki map'in Data type'lari eslesmeli
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=Hasan, 104=Canan, 105=Ayse}

        m1.compute(103,(key,value)->"haluk");//--> verilen map'deki istenen key degerine sahip
                                                 // elemanin value'sini varsa update eder yoksa ekler
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse}

        m1.compute(109,(key, value)->"merve hanim");//109 key olmadigi icin entry put edildi
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=merve hanim}

        m1.computeIfAbsent(111, value->"said ipek");//--> istenen key degeri map'te yoksa o key'i ve
                                                        //value'yi ekler, map'de varsa bisey yapmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=merve hanim, 111=said ipek}

        m1.computeIfAbsent(109, value->"ipek");//map'de 109 key varligini kontrol eder. 109 key oldugu icin update yapmaz
        System.out.println(m1);// {1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=merve hanim, 111=said ipek}

        m1.computeIfPresent(109, (key, value)->"rabia");//map'de 109 key varligini kontrol eder. 109 key oldugu icin
                                                            // rabia value ile update yapar
        System.out.println(m1);// {1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=rabia, 111=said ipek}

        m1.computeIfPresent(115, (key, value)->"rabia");//map'de 115 key varligini kontrol eder. 115 key olmadigi icin
        // rabia value ile update yapilmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=rabia, 111=said ipek}


    }
}

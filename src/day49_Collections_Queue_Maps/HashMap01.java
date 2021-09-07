package day49_Collections_Queue_Maps;

import java.util.HashMap;

public class HashMap01 {
    /*
1) Map'ler key-value yapisini kullanirlar.
                2) Key'ler tekrarli deger kabul etmez. (unique olmalidirlar/Kimlik numaralari gibi)
                3) Value'lar tekrarli olabilirler. (Isimler gibi)
                4) Uc farkli Map vardir:
                    a) HashMap      : En cok kullanilani, en hizlilari. Hizli olabilmek icin siralamayi rastgele yapar.
                                              Hizli olabilmek icin synchronize olmazlar ve thread-safe degildirler.
                                              Bir tane key null olabilir, birden fazla value null olabilir.

                    b) HashTable    :
                    c) TreeMap      :
 */
    public static void main(String[] args) {
// key-value iliskis var ve key unique olmali
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(101,"Levent");
        m1.put(102,"Said");
        m1.put(103,"Hasan");
        m1.put(104,"Canan");
        m1.put(105,"Ayse");
        System.out.println(m1);//{101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.put(101,"harun");// key value'su update edilir eski veri uzerine yeni girilen veri yazilir
        System.out.println(m1);//{101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}
        m1.put(106,"Canan");// ayni value farkli key'a atanabilir. unique olmak zorunda degil
        System.out.println(m1);//{101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}

        m1.put(null,"haluk");// key degeri null alabilir
        System.out.println(m1);//{null=haluk, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
        m1.put(null,"hakan");
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}

        m1.put(107,null);// value degerleri coklu null alabilir
        m1.put(108,null);// value degerleri coklu null alabilir
        m1.put(109,null);// value degerleri coklu null alabilir
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null}

        System.out.println(m1.get(103));//Hasan
        System.out.println(m1.values());//[hakan, harun, Said, Hasan, Canan, Ayse, Canan, null, null, null]
                                        // -->map'deki tum elemanlarin value'lerini return eder
        System.out.println(m1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107, 108, 109]
                                        // --> setlerde tekrar mumkun degil

        System.out.println(m1.getOrDefault(106, "boyle bir eleman yoktur"));//Canan
        System.out.println(m1.getOrDefault(111, "boyle bir eleman yoktur"));//boyle bir eleman yoktur
        //--> o key varsa value'sunu getir, yoksa "boyle bir eleman yoktur" 'yi dondur

        m1.putIfAbsent(110, "ahmet");//--> belirtilen key'de value yoksa verilen value'yi ekler...
                                     // yazdirilirsa belirtilen key'de value varsa o value'yi return eder

        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

        m1.putIfAbsent(105,"salih");//--> 105 key'de Ayse value oldugu icin put edilmedi
        System.out.println(m1.putIfAbsent(105, "salih"));//Ayse-->105 key'deki value'yi return eder

        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}
        //--> putIfAbsent()=> eger yoksa ata demek..

        m1.putIfAbsent(null,"ipek");//null key'de hakan valur olduguicin ipek put edilmedi
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

        m1.putIfAbsent(107,"oguz");// 107 key'de value null oldugu icin oguz put edildi
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=oguz, 108=null, 109=null, 110=ahmet}


    }
}

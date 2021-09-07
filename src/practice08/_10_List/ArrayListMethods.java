package practice08._10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
    /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object turunden olmalidir
                - primitivelerin wrapper classlari Buyuk harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanimlama) :
    Array den farki boyut esnekligidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
          Siz eleman ekledikce List length'ini artirir, siz eleman sildikce List length'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullaniriz.
    List<wrapper Class> name = new List<>()      *****yanlisss (<> :jenerik wrapper Class dan parametre alir.)
    List<wrapper Class> name = new ArrayList<>() *****dogru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****dogru
    ArrayList<wrapper Class> name = new ArrayList<>()  *****yanlisss

    List'e ilk deger atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayi= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print icin:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamina gelir. ArrayList, Set, Map ler java collections sinifi nesneleridir.

 */
        System.out.println("******** List tanimlama ilk deger atama(initialize)*********");
        //1. yol :
        List<Integer> listSayilar = new ArrayList<>();
        listSayilar.add(1);
        listSayilar.add(23);
        listSayilar.add(35);
        listSayilar.add(17);

        //2.yol :
        ArrayList<String> listIsimler = new ArrayList<>(Arrays.asList("Reha", "hakan", "haluk", "ahsen", "ZEHRA", "CEMAL"));// daha pratik
//"Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"
        //3. yol :
       ArrayList<String> listUlkeler = new ArrayList<>(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));

        System.out.println("listIsimler : " + listIsimler);
        System.out.println("listSayilar :" + listSayilar);
        System.out.println("listUlkeler : " + listUlkeler + "\n");

        System.out.println("******** List'e eleman ekleme : add() *********");

        //List e eleman ekleme metodu: name.add(eleman);ekleme yapilan eleman list in surekli sonuna eklenir. list elemanlarinda tekrar olabir.
        listSayilar.add(-123);
        System.out.println(listSayilar);//[1, 23, 35, 17, -123]
        
        //index (yer) belirterek eleman ekleme :name.add(index,eleman);
        listSayilar.add(2, 33);// git suraya su elemani koy: 2. index e 33 koy.2. index ten sonrakilerin sirasi bir ilerledi.
        System.out.println("2. index'e 33 eklendi " + listSayilar + "\n");//[1, 23, 33, 35, 17, -123]

        System.out.println("******** ozel bir metod:Collections nCopies kullanimi... *********");
        // ozel bir metod:Collections nCopies kullanimi...
        // nCopies(int n, Object o);  n elemanli nums arrayi olusturur ve hepsini o ile doldurur
        // Collection.fill(List, o); ise tanimlanmis ve deger atanmis arrayList'in tum elemanlarini o ile doldurur
        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println("nums : 10 tane 5 den olusan arrayList :" + nums + "\n");//[5,5,5,5,5,5,5,5,5,5] 10 tane 5 den oluşan arrayList

        System.out.println("******** Ozel bir metod: addAll(Collection C) *********");/*
            addAll(Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri (daha sonra girilecek)) sona ekler

            addAll(int index, Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri)  belirtilen indexten itibaren ekler
            # arrayin kalan elemanlarini kaydirir
         */

        // ArrayList listRakam tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listRakam = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // ArrayList listIkiBasamakli tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listIkiBasamakli = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // ArrayList listRakam2 tanimlanip, initializer icinde initialize ediliyor
        ArrayList<Integer> listRakam2 = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        };

        // listRakam yazdirliliyor
        System.out.println("listRakam : " + listRakam);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        // listIkiBasamakli elemanlari listRakam'e ekleniyor
        listRakam.addAll(listIkiBasamakli); //listIkiBasamakli elemanlari listRakam'e ekleniyor

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nin sona eklenmis hali");
        System.out.println("listRakam ListIkiBasamakli eklenmis hali : " + listRakam); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50]


        // listIkiBasamakli elemanlari listRakam'e 3. index ten sonra ekleniyor.
        listRakam.addAll(3, listIkiBasamakli); 

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nin 3.indexten itibaren listRakam'a eklenmis hali" + listRakam + "\n");//[1, 2, 3, 10, 20, 30, 40, 50, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50]

        System.out.println("******** List'in icinden istenen index'teki elemani alma : get() *********");
        listIsimler.get(2);//listIsimler icinde 2. index teki eleman haluk alindi.
        System.out.println("listIsimler'den 2. index teki eleman haluk alindi : " + listIsimler.get(2) + "\n"); //haluk

        System.out.println("******** List'in boyutunu bulma : size() *********");
        //List in boyutu: size: name.size();--> listedeki  eleman sayisini verir.
        System.out.println("listSayilar'in eleman sayisi : " + listSayilar.size() + "\n");// 6

        System.out.println("******** List'in istenen elemanini silme : remove() *********");

        //List  ten istenen bir elemani silme : name.remove();--> suu elemani sil kaldir.
        listSayilar.remove(3);//3. index teki elemani sil
        listIsimler.remove("haluk");//isimler list inden haluk sil
        System.out.println("listSayilar 3. index teki elemani silindi : " + listSayilar);//[1, 23, 33, 17, -123] 35 silindi
        System.out.println(listSayilar.remove("-123"));// false:
        System.out.println(listIsimler); //[Reha, hakan, ahsen, ZEHRA, CEMAL]
        System.out.println(listIsimler.remove("haluk"));//false olmayan elemani silme komutu false verir.


        //tekrarli eleman varsa ilk index dekini siler...
        listIsimler.add("Reha");
        System.out.println("listIsimler'in sonuna Reha eklenmis hali : " + listIsimler);//[Reha, hakan, ahsen, ZEHRA, CEMAL, Reha]
        listIsimler.remove("Reha");
        System.out.println("listIsimler'de buldugu ilk reha'yi silindi : " + listIsimler);//[hakan, ahsen, ZEHRA, CEMAL, Reha]

        //olmayan elemani silmek icin eror vermez...kod calisir....
        listIsimler.remove("haluk");//haluk varsa siler yoksa hata vermeden kod devam eder.
        System.out.println(listIsimler.remove("haluk"));// isimler obj haluk kaldirmaya gider olmayan elemandan dolayi false verir.
        
        System.out.println(listIsimler + "\n"); //[hakan, ahsen, ZEHRA, CEMAL, Reha]

        System.out.println("******** List'te herhangi bir elemanin index(yerini) bulma : indexOf() *********");
        System.out.println("indexOf ZEHRA sonrasi :" + listIsimler.indexOf("ZEHRA"));//2 -->ZEHRA 2. index te
        System.out.println("indexOf haluk sonrasi :" + listIsimler.indexOf("haluk"));//-1 -->haluk isimler list inde olmadigi icin.olmayan elemanin index i sorguladiginda error vermez run:-1 verir

        Collections.sort(listSayilar);   //list elemanlarini siraladik
        System.out.println("listSayilar'da 48'in indexOf sonrasi :" + listSayilar.indexOf(48) + "\n");//list icinde 48 elemaninin index i soruldu 48 elemanı listte olmadigi icin -1 verdi

        System.out.println("******** List'te herhangi bir elemanin son bulma index(yerini) bulma : lastIndexOf() *********");
        // lastIndexOf(Object O):Belirtilen elemanin son bulunma index'ini verir, eleman yoksa -1 doner.
        ArrayList<Integer> tekrarlilist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 7, 8, 9));
        System.out.println("2 elemaninin listede son bulundugu yerin index'i :" + tekrarlilist.lastIndexOf(2) + "\n");//5 : 2 den ikincisinin yani sonuncusunun bastan index'i


        System.out.println("******** list teki istenen hehangi bir  elemani update etme :set() *********");


        //list teki istenen herhangi bir  elemani update (set) etme: name.set(index,eleman);--> su index deki elemani su eleman ile degistir.
        listIsimler.set(0, "ahmet");
        System.out.println("listIsimler'de 0. inex'e ahmet set edildi : " + listIsimler + "\n"); //[ahmet, ahsen, ZEHRA, CEMAL, Reha]
        //  isimler.set(0,"ahmet",1,"ali");-->list te coklu set metodu calismaz.buz gibi INTERVIEW sorusu....

        System.out.println("******** list teki istenen hehangi bir parcasini alma :subList(int fromIndex, int toIndex) *********");
        /*
            subList(int fromIndex, int toIndex)
            Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

         */
        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> listParcasi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(listParcasi);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("2. index dahil, 5. index haric parcası alındu : " + listParcasi.subList(2, 5));//[3, 4, 5] 2. elemanı alir, 5 . eleman alinmaz

        // yeni bir yeniList arrayList'i list.subList() ile de tanimlanabilir
        ArrayList<Integer> yeniList = new ArrayList<>(listParcasi.subList(4, 8));

        System.out.println("list.subList(4,8) ile yeniList tanimlandi : " + yeniList + "\n"); //[5, 6, 7, 8]


        System.out.println("******** list'in bos dolu oldugunu ogrenme : isEmpty() *********");
        //list in bos-dolu sorgusu: isEmpty :name.isempty(); --> name listi bos mu degil mi? true-false verir.
        System.out.println(listIsimler.isEmpty() + "\n");//false


        System.out.println("******** List te istenen eleman var mi yok mu ogrenme : contains() *********");

        // List'te istenen eleman var mi yok mu?: contains: name.contains(eleman); -->true-false
        System.out.println("listIsimler'de ipek elamani var mi? : " + listIsimler.contains("ipek") + "\n");//false ipek yok

        System.out.println("******** List'teki elemanlari duzenli siralama : Collections.sort() *********");

        // List  teki elemanlari duzenli siralama :String:alfabetik(Natural Order), int:kucukten buyuge...Collections.sort(name);

        Collections.sort(listIsimler);//String sirasi
        System.out.println("listIsimler'de harf sirasi  : " + listIsimler);//[CEMAL, Reha, ZEHRA, ahmet, ahsen]

        Collections.sort(listSayilar);//int sirasi
        System.out.println("listSayilar'da kucukten buyuge elemanlarin sirasi : " + listSayilar + "\n"); //[-123, 1, 17, 23, 33]

        //***Onemli*** System.out.println( Collections.sort(list)); -->seklinde metod print icinde calismaz

        System.out.println("******** List'teki elemanlari duzenli tersten siralama : Collections.reverse() *********");
        Collections.reverse(listSayilar);
        System.out.println("listSayilar'daki elemanlari duzenli tersten siralamasi  = " + listSayilar + "\n"); //[33, 23, 17, 1, -123]

        ArrayList<Integer> ipek = new ArrayList<>(Arrays.asList(45, 23, 67, -100, 1, 0)); 
        System.out.println("ilk hali: reverse olmadan : "+ipek); //[45, 23, 67, -100, 1, 0] index sirasina gore
        Collections.reverse(ipek);
        System.out.println("reverse hali : "+ipek);//[0, 1, -100, 67, 23, 45]

        //****COOOK ONEMLI Collections.reverse()--> methodu listteki elemanlari index sirasina gore tersten siralar.

        System.out.println("******** List'teki elemanlari max min elemanini bulma : Collections.max/min() *********");
        System.out.println("listSayilar deki en buyuk sayi = " + Collections.max(listSayilar)); //33
        System.out.println("listSayilar deki en kucuk sayi = " + Collections.min(listSayilar) + "\n");//-123

        System.out.println("******** List'teki belli bir degerdeki elemanlara , baska bir deger atama : Collections.replaceAll() *********");
        // belli bir degerdeki elemanlari , baska bir deger atar
        Collections.replaceAll(listSayilar, 33, 9);
        System.out.println("listSayilar'da 33 degerindeki elemanlara 9 degeri atandi  = " + listSayilar + "\n");//[9, 23, 17, 1, -123]

        System.out.println("******** List'teki elemanlara ayni degeri atama : Collections.fill() *********");
        Collections.fill(listSayilar, 8);
        System.out.println("listSayilar'a tum elemanlara 8 atandi = " + listSayilar + "\n"); //[8, 8, 8, 8, 8]


        System.out.println("******** iki list'in esitligini bulma : equals() *********");
        //Equals :esit mi degil mi: name1.equals(name2);--> name1 name2 tipatip ayni mi? list teki elemanlarin hem index hem de icerigini ayni olmali

        List<String> name1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> name2 = new ArrayList<>(Arrays.asList("b", "a"));
        List<String> name3 = new ArrayList<>(Arrays.asList("A", "b"));
        List<String> name4 = new ArrayList<>(Arrays.asList("A", "b"));
        System.out.println(name1.equals(name2));// name1  name2 ile tipatip ayni? -->false
        System.out.println(name1.equals(name3));// name1  name3 ile tipatip ayni? -->false
        System.out.println(name3.equals(name4) + "\n");// name3  name4 ile tipatip ayni? -->true

        System.out.println("******** list'i Array'a cevirme : toArray() *********");

        //list'i Array'a cevirme: toArray();
        //1. Yontem: toArray() methodu'nun icinde parametre olarak new String[0] kullaniniz
        String arr[] = listIsimler.toArray(new String[0]);//arr adinda String tipinde bir array tanimladik.isimlerden(List) toArray ile yeni String tipi obj degerleri atadik
        System.out.println("listIsimler'in array hali: "+Arrays.toString(arr));//[CEMAL, Reha, ZEHRA, ahmet, ahsen]


        //2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secilir
        //Object class, Java'da butun class'larin parent'idir.Yani Object class ortak atadir.
        //Object class, Java'da parent'i olmayan tek class'dir.
        //String, Object class'in child'i oldugundan data type olarak bazi durumlarda
        //String yerine Object kullaniriz.
        Object arr1[] = listSayilar.toArray();
        System.out.println("listSayilar'in  array hali: "+Arrays.toString(arr1)+"\n");

        System.out.println("******** Array'i list'e cevirme : Arrays.asList(arrName) *********");

        //asList() methodu array'leri list'e cevirmek icin kullanilir.
        //asList() methodu parametre olarak array'in ismini kabul eder.

        String arr2[] = {"Aliye", "Canan"};

        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);//[Aliye, Canan]


        //Cook Onemli....
        // Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak
        //esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
        //list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"


        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("******** list'i  bosaltma silme : clear() *********");
        //List i bosaltma silme : name.clear();
        listIsimler.clear();// isimler list ini bosalt. temizle, elemanlarini sil.
        System.out.println(listIsimler);// [] bos list verdi.
    }

}

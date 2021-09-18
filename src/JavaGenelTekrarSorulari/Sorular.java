package JavaGenelTekrarSorulari;

public class Sorular {
        /*
        1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        Test Data
        34
        Beklenen Çıktı
        7
        *********************************************************************
        2---1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
        Hint: For döngüsü kullanınız.
        Beklenen Çıktı:
        1
        2
        3
        4
        .
        .
        .
        19
        20
        ************************************************************************
        3----elirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

        Örnek Sonuç:
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        5 x 4 = 20
        5 x 5 = 25
        5 x 6 = 30
        5 x 7 = 35
        5 x 8 = 40
        5 x 9 = 45
        5 x 10 = 50
        ************************************************************************
        4----1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

         Beklenen çıltı:

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910

        ************************************************************************
        5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
        Test Data:
        Yarım elmas uzunluğu : 7
        Beklenen Çıktı:
              *
             ***
            *****
           *******
          *********
         ***********
        *************
         ***********
          *********
           *******
            *****
             ***
              *
          ************************************************************************

         6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
               değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
                1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

        Sesli harfler: a,e,i,o,u

        Test Data:
        a

        Beklenen Çıktı:
        a harfi sesli harfdir.

        Test Data:
        d

        Beklenen Çıktı:
        d harfi sesiz harftir.

        Test Data:
        we  yada %

        Beklenen Çıktı:
        Yanlis karakter girdiniz!
          ************************************************************************
        7-----
           Ugly Number:

        Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


        Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

        Test Data:
        13

        Beklenen çıktı:
        ugly number  degildir

        Test Data:
        25
        Beklenen Çıktı:

        ugly number
         ************************************************************************
        8----
         Girilen String değerde tersten yazan Java kodunu yazınız.

        Test Data:
        java
        avaj
        ************************************************************************
        9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

        Test Data:
        str1: Java is
        str2: fun

        Beklenen Çıktı:
        java is fun
        ************************************************************************
        10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

        Test Data:
        Java is easy

        Aranan String: is

        Bektenen Çıktı:
        True

        Aranan String: and

        Beklenen Çıktı:False
        ************************************************************************
        11----
        Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.

        Test Data:
        good

        Beklenen Çıktı:
        goo
        ************************************************************************
        12----
        Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

        Test Data:
        Java is fun

        Beklenen Sonuç:
        JAVA IS FUN

        ************************************************************************
        13----
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

        Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

        Test Data:
        madam

        Beklenen Çıktı:
        True
        ************************************************************************
        14----
        Girilen iki String veriyi karşılaştıran Java kodu yazınız.


        Test data:
        1. String : techproed.com
        2. String : Techproed.com

        Beklenen Çıktı:
        False

        Test data:
        1. String : techproed.com
        2. String : techproed.com

        Beklenen Çıktı:
        true
        ************************************************************************
        15----
        Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

        Test Data:
        Java is fun


        Beklenen Çıktı
        0. pozisyondaki karakter : J

        5. pozisyondaki karakter : i

        ************************************************************************
        16----
        Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

        Test Data:
        java is fun

        Beklenen Çıktı:
        JAVA IS FUN
        ************************************************************************

        17---
        Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

        Test data:
        12,24,34

        Beklenen Çıktı:
        12
        ************************************************************************
        18----
        Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

        Test Data:
        java is fun

        Beklenen Çıktı:

        Stringdeki sesli harf sayısı: 4

        ************************************************************************
        19----
        Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.

        Test Data:
        2017

        Beklenen Çıktı:
        false
        ************************************************************************
        20----
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        not: Test datadaki değerleri kullanınız.


        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
        ************************************************************************
        21----
        Array deki sayıları tolpayan Java kodunu yazınız.

        array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Beklenen Çıktı:
        Array toplamı: 55
        ************************************************************************
        22----
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

        Array =  [20, 30, 25, 35, -16, 60, -100 ]

        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0
        ************************************************************************
        23----
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

        Beklenen Çıktı:
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
        ************************************************************************
        24----
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]


        Aranan Değer:2020
        Beklenen Çıktı:True

        Aranan Değer:2010
        Beklenen Çıktı :False
        ************************************************************************
        25----
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

        Array: [12,15,43,23,56,76,78,90,77,43]

        Aranan değer:56

        Beklenen Çıktı:
        56 sayısı arrayin 4. elemanı

        ************************************************************************
        26-----
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:
        [Python, JAVA, PHP, Perl, C#, C++]

        ************************************************************************
        27----
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

        Array: [1232,2345,5467,678,3454,2312,3451]

        ************************************************************************
        28----
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

        Array: [1,2,3,4,5,6,7,8,9]

        Beklenen Çıktı:

        Tek Sayilar: 5
        Cift Sayilar: 4
        ************************************************************************
        29----
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java"

        ************************************************************************
        30---
        Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010

        Beklenen Çıktı:
        1010100
        ************************************************************************
        31----
        Saati saniyeye çeviren java methodunu yazınız.

        Test Data:
        howManySeconds(2);
        Beklenen çıktı:
         7200
        ************************************************************************
        32----
        İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

        num1 = num2 => true
        ************************************************************************
        33-----
        Bir arrayi tersine çeviren  method yazınız.

        Test Data:

        reverse [1, 2, 3, 4]
        return  [4, 3, 2, 1]
        ************************************************************************
        34-----
        String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.


        Test Data:
        isFourLetters(["Tomato", "Potato", "Pair"])

         ["Pair"]
        ************************************************************************
        35----
        Methoda iki sayı girelim ve  bize bir array dönsün.
         Array elemanları 1.sayının 2. sayı kadar kendisi ile
         toplamından oluşsun.

        Test Data:
        arrayOfMultiples(7, 5)

        sonuç: [7,14,21,28,35]

        ************************************************************************
        36-----
        Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

        Test Data:

        isPrime(31)
        true

        isPrime(18)
        false
        ************************************************************************
        37-----
        Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

        Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        Test data
        hackerDili("javayı severim")
        j4v4yı 53v3r1m

        İpucu harfleri değiştirin ve ekrana yazdırın.
        ************************************************************************
        38----
        Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

        Örnek -
        farkBul([10, 15, 20, 2, 10, 6])
        18

        ************************************************************************
        39-----
        Bir dizi içerisindeki pozitif tam sayı sayısını ve
        negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

        Örnek:
        countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
        [10, -65]
        // Toplam 10 pozitif sayı var.
        // Tüm negatif sayıların toplamı -65'tir.

        Notlar :
        Boş bir dizi verilirse, boş bir dizi döndürür: []
        0 pozitif değil.

        ************************************************************************
        40----
        Girilen sayının ingilizce yazılışını return eden bir method yazınız.

        Örnek

        numToEng(0)
        zero

        numToEng(18)
        eighteen

        numToEng(126)
        one hundred twenty six

        numToEng(909)
        nine hundred nine

        ************************************************************************
        41-----
        Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

        Örnek
        makeTitle("Bu bir başlıktır")
        Bu Bir Başlıktır

        makeTitle("tüm ilk harfler büyük olacak")
        Tüm İlk Harfler Büyük Olacak

        ************************************************************************
        42----
        İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
        küçük yapan bir method yazınız.

        Örnekler
        getKelime("kal", "em") ? "Kalem"
        getWord("gözl", "emlemek") ? "Gözlemlemek"
        getWord("zor", "luk") ? "Zorluk"
        ************************************************************************
        43----
        Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
        Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.


        Örnekler

        kayipHarfler("abdefg")
        Çıktı : c

        kayipHarfler("mnopqs")
        Çıktı : r

        kayipHarfler("abcdefgh")
        Çıktı : Sıralı Harfler

        ilk örnekte :  /// b harfinden sonra c gelmemiş
        ikinci örnekte : /// p harfinden sonra r gelmemiş
        ************************************************************************
        44----
        String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
         Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için bu String için sonuç 1 olacak.
         Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

        Örnekler:
        duplicates("Hello World!")
        Çıktı : 2
        duplicates("foobar")
        Çıktı : 1
        duplicates("helicopter")
        Çıktı : 1
        ************************************************************************
        45-----
        Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

        Şartlar:
        * Bir mail adresinde @ karakteri olmalı
        * Bir mail adresinde . (nokta) karakteri olmalı
        * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

        Örnekler
        validateEmail("@gmail.com")
        Çıktı : false

        validateEmail("gmail")
        Çıktı : false

        validateEmail("hello@gmail")
        Çıktı : false

        validateEmail("hello@edabit.com")
        Çıktı : true
        ************************************************************************
        46----
        Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen bir program yazınız.

        Örnekler:
        kontrolEt("abc", "bc") ➞ true
        kontrolEt("abc", "d") ➞ false
        kontrolEt("samurai", "zi") ➞ false
        kontrolEt("feminine", "nine") ➞ true
        kontrolEt("convention", "tio") ➞ false
        ************************************************************************
        47----
        Ortadaki harfi alabileceğimiz bir program yazın. Eğer harf sayısı 2 nin katına eşitse,
        ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

        Examples

        ortadakiHarf("test")
        Çıktı : es
        ortadakiHarf("testing")
        Çıktı : t
        ortadakiHarf("middle")
        Çıktı : dd
        ortadakiHarf("A")
        Çıktı : A
        ************************************************************************
        48-----
        İki farklı Array'i birleştiren bir program yazınız.

        Örnekler:

        birlestir([1, 3, 5], [2, 6, 8])
        Çıktı : [1, 3, 5, 2, 6, 8]

        birlestir([7, 8], [10, 9, 1, 1, 2])
        Çıktı : [7, 8, 10, 9, 1, 1, 2]

        birlestir([4, 5, 1], [3, 3, 3, 3, 3])
        Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
        ************************************************************************
        Fazla mesaiyi hesaplayan bir program yazınız.
        Yazacağınız program toplam kazancı return etsin.

        Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
        fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

        Daha sonra şu şekilde bir program yazınız :

        Örnek :
        saatlik çalışma ücreti : 40.0
        hangi saat başladı : 9.0
        hangi saat bitti : 20.0
        mesaiyi kaçla katlayacağız : 1.8

        ucretHesapla(9.0,20.0,40.0,1.8);

        9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
        17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

        toplam = 536.0
        ************************************************************************
        Yazılan saati diğer saat biçimine çeviriniz.
        Eğer yazılan saat 12 saatlik biçimde yazılmışsa (örneğin 06:00 pm), 24 saatlik biçime çeviriniz.
        Eğer yazılan saat 24 saatlik biçimde yazılmışsa (örneğin 19:30), 12 saatlik biçime çeviriniz.


        Examples
        zamaniCevir("12:00 am") ➞ "0:00"

        zamaniCevir("6:20 pm") ➞ "18:20"

        zamaniCevir("21:00") ➞ "9:00 pm"

        zamaniCevir("5:05") ➞ "5:05 am"
        ************************************************************************
        Youtube video sayfasının urlsinde yer alan video id'sini return eden bir method yazınız :

         ÖRNEKLER
        youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
        ID : XPEr1cArWRg

        youtubeId("https://youtu.be/BCDEDi5gDPo")
        ID : BCDEDi5gDPo

        youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
        ID : vxP3bY-XxY4
        ************************************************************************
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

        Array elemanları:  siyah,sari,mavi,turuncu

        Beklenen Çıktı:
        siyah
        sari
        mavi
        turuncu
        ************************************************************************
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

        Array List:  siyah,mavi,kirmizi,beyaz

        en başa: pembe
        mavi-kirmizi arasına yesil  renk eklenecek.

        Beklenen Çıktı:
        [pembe,siyah,mavi,yesil,kirmizi,beyaz]
        ************************************************************************
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

        ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

        Beklenen Çıktı:

        Arrayin 1. elemani: beyaz
        Arrayin 3. elemani: sari
        ************************************************************************
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

        Array Elemanları: sari,yesil,mavi,pembe

        mavi rengini turuncu ile değiştirelim.

        Beklene Çıktı:
        [sari,yesil,mavi,pembe]
        [sari,yesil,turuncu,pembe]
        ************************************************************************
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

        ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

        Beklenen Çıktı:

        Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        siyah
        mavi
        kirmizi
        yesil
        mor
        turuncu
        ************************************************************************
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

        LinkedList elemanları: sari,mavi,mor,yesil,beyaz

        Beklenen Çıktı:
        sari
        mavi
        mor
        yesil
        beyaz
        ************************************************************************
        bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

        1. elemandan itibaren yazdıralım.

         Beklenen Çıktı:
        beyaz
        mavi
        yesil
        turuncu
        ************************************************************************
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

        LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

        Beklenen Çıktı:

        Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        Listenin ilk elemani: sari
        listenin son elemani: beyaz
        ************************************************************************
        Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

        LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

        Beklenen Çıktı:
        Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
        LinkedList Tersi:
        mor
        beyaz
        kirmizi
        yesil
        mavi
        sari
        ************************************************************************
        Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

        LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

        hint:  Collections.swap();

        Beklene Çıktı:
        Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        Swap sonrası durum: [siyah,kirmizi,beyaz,mavi,yesil,turuncu]
        ************************************************************************
        HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.


        HashSet List: sari,mavi,kirmizi,yesil,mor

        Beklenen Çıktı:
        TreeSet elements:
        kirmizi
        mavi
        mor
        sari
        yesil
        ************************************************************************
        Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

        HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

        Beklenen Çıktı:
        Tree Set Elemanlari:
        kirmizi
        mavi
        sari
        turuncu
        yesil
        ************************************************************************
        Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

        TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

        Beklenen Çıktı:
        beyaz
        kirmizi
        mavi
        sari
        siyah
        yesil
        ************************************************************************
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

        TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

        Beklenen Çıktı:
        Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        Tersten Siralanisi:
        yesil
        turuncu
        sari
        mavi
        kirmizi
        ************************************************************************
        Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

        TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

        Beklenen Çıktı:
        Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
        ilk elemen: kirmizi
        son eleman: yesil
        ************************************************************************
        Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

        TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

        Beklenen Çıktı:

        Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
        Tree eleman sayısı: 5
        ************************************************************************
        Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

        1. TreeSet: mavi,yesil,kirmizi,sari
        2. TreeSet: yesil,mavi,pembe,turuncu

        Beklenen Çıktı:
        1. TreeSet: [kirmizi,mavi,sari,yesil]
        2. TreeSet: [mavi,pembe,turuncu,yesil

        Karsilastirma Sonucu:
        no
        yes
        no
        yes
        ************************************************************************
        Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

        priority queue elemanları: sari,yesil,mavi,kirmizi

        Beklenen Çıktı:
        Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]


         */

}

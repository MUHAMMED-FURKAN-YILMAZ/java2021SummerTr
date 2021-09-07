package Group_Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SayisalLoto {
    /*
    1-Kullanıcıdan haftanin sonuçlarını al.(6Top--random)

-Random r=new Random(); //random sınıfı
 int a=r.nextInt(7);
 Burada parantez içerisine 7 yazmamızın sebebi,1 den 7'ye  kadar değerler üretmesidir.Fakat buna 7 dahil değildir.
 Eğer parantez içerisini boş bırakırsak -2147483648 ve +2147486647 arasındaki bütün int değerlerini üretir.

 --Java'da random sayı üretmenin bir diğer yolu yolu da Math sınıfında bulunan Random metodudur.
int sayi = (int)(Math.random()*49);
System.out.println(sayi);

    2-Kullanicidan oynamış olduğu kolonun numaralarını al.(Top[6])
    3-1.ve2.maddeyi karşılaştır.(nested for-if-else)
    4-sonucu ekrana yaz.
    5-Başka Kolon oynayıp oynamadığını sor(do || while)
    6-Başka kolan oynamışsa 2.maddeye geri dön.Aksi takdirde,programi bitir.
     */

    public static void main(String[] args) {

        String devamMi = "";
        do {
            int kolon[] = new int[6];
            Scanner scan = new Scanner(System.in);
            System.out.println("Kolonunuzdaki 6 numarayi giriniz :");

            for (int i = 0; i < kolon.length; i++) {
                kolon[i] = scan.nextInt();

            }
            System.out.println(Arrays.toString(kolon));

            List<Integer> eslesenler = new ArrayList<>();

            eslesenler = karsilastir(kolon, rastGeleNumaraUret());
            if (eslesenler.size() == 0) {
                System.out.println("Hic tutturamadiniz!! tekrar deneyiniz");
            } else {
                System.out.println("Tebrikler " + eslesenler.size() + " tane tutturdunuz..");
            }
            System.out.println("Devam etmek istiyor musunuz(E/H)");

            devamMi = scan.next();

        } while (devamMi.equalsIgnoreCase("e"));

        System.out.println("Gayet Basarisiz");

    }

    public static int[] rastGeleNumaraUret() {

        int lotoNumber[] = new int[6];
        for (int i = 0; i < lotoNumber.length; i++) {
            lotoNumber[i] = 1 + (int) (Math.random() * 49);
        }

        return lotoNumber;

    }


    public static List<Integer> karsilastir(int[] kolon, int[] rastGeleNumaraUret) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < kolon.length; i++) {
            if (kolon[i] == rastGeleNumaraUret[i]) {
                lst.add(kolon[i]);
            }
        }
        return lst;
    }


}

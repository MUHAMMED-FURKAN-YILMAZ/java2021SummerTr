package day48_Collections_Set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet04 {
    /*
    Main method altinda bir double hashSet olusturunuz.
  ve bu seti, adi setOlustur ve return tipi hashSet double olan
  ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
  Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek
  ayri bir method olusturarak hashSetin degerlerinin toplamini alacaksiniz.
  Çıktı--> sonuc = 44.69
     */
    public static void main(String[] args) {

        HashSet<Double> hs=new HashSet<>();

        double sonuc=toplaminiAl(setOlustur());
        System.out.println(sonuc);
    }

    private static double toplaminiAl(HashSet<Double> dhs) {

        double top=0;
        for (double w:dhs){
            top+=w;
        }
        return top;
    }

    public static HashSet<Double> setOlustur() {
        HashSet<Double> hs=new HashSet<>(Arrays.asList(3.23 , 3.10 , 5.12 , 10.12 , 23.12));


        return hs;
    }
}

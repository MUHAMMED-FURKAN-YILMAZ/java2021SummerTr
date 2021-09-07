package kendiCalismam;

import java.util.Locale;
import java.util.Scanner;

public class AdimNedir {
/*
    Soru-2 -> 'Adım Nedir' isimli bir java uygulaması yazılacak.
     Kullanıcı maksimum 20 hakta "kalemtraş" kelimesini tahmin edecek. Tahmin sistemi şu şekilde çalışmalı:
• Kullanıcı 9 harflik bir kelime tahmin edeceğini bilecek.
• Tahmin için yazılan kelime ile anahtar kelime arasında uyuşan bütün harfler kullanıcıya gösterilmeli.
 Örnek girdiler ve çıktılar şu şekilde olacak:
anahtar kelime "kalemtraş"  (kullanıcıya gösterilmeyecek)
tahmin kelimesi "silgi"
doğru tahmin edilen harfler = 1
doğru yerdeki harf = 1
anahtar kelime "kalemtraş" (kullanıcıya gösterilmeyecek)
tahmin kelimesi "masraf"
doğru tahmin edilen harfler = 1
doğru yerdeki harf = 1 / a /
doğru tahmin edilip yanlış yerde olan harfler = 3 / mar /
anahtar kelime "kalemtraş" (kullanıcıya gösterilmeyecek)
tahmin kelimesi "salon"
doğru tahmin edilen harfler = 2
doğru yerdeki harf = 2 / al /
doğru tahmin edilip yanlış yerde olan harfler = 0
anahtar kelime "kalemtraş" (kullanıcıya gösterilmeyecek)
tahmin kelimesi "elmastraş"
doğru tahmin edilen harfler = 5
doğru yerdeki harf = 5 / traş /
doğru tahmin edilip yanlış yerde olan harfler = 4 / elma /
• Oyunun sonunda kullanıcı tahminlerinden her hangi biri başarılı olursa "Tebrikler "Kalemtıraş" kelimesini bildin!"
 mesajını, başarısız olursa da "Üzgünüm. Başarılı olamadın. Güç seninle olsun!" mesajını görecek.
  Uygulama kaynak kodu ile beraber gönderilecek.

    */

    public static void main(String[] args) {
        System.out.println("Adim nedir isimli uygulamaya hos geldiniz");
        Scanner sc =new Scanner(System.in);
        int i=20;
        String kelime="kalemtiras";
        String tahmin="";

        System.out.println("Kelime " + kelime.length()+" harften olusmaktadir");

        int dogruTahminEdilenHarf=0;
        int dogruYerdekiHarf=0;

       do {
        String bos="";

       System.out.println("Kelimeyi tahmin etmek icin "+ i +" tane tahmin hakkiniz kaldi");
           System.out.println("Tahmininizi giriniz");
           tahmin=sc.nextLine().toLowerCase();

             for (int j=0; j<tahmin.length();j++){
                 if (kelime.contains(Character.toString(tahmin.charAt(j)))){
                    if (tahmin.indexOf(j)==kelime.indexOf(j)){
                       if (!bos.contains(Character.toString(tahmin.charAt(j)))){
                           bos+=tahmin.charAt(j);
                           dogruTahminEdilenHarf++;
                           dogruYerdekiHarf++;
                        }
                    }else dogruTahminEdilenHarf++;
                 }
             }
           System.out.println("dogruYerdekiHarf = " + dogruYerdekiHarf);
           System.out.println("dogruTahminEdilenHarf = " + dogruTahminEdilenHarf);

       }while (i==0);





    }
}


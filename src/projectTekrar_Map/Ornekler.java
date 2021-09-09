package projectTekrar_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ornekler {
    /*
      1- Kullanıcıdan bir kisinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
      2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
      3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
      4- Tum kullanicilarin isimlerini ekrana yazdirin
     */

    public static void main(String[] args) {

        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

        Scanner sc=new Scanner(System.in);
        String secim="";

        do {

            HashMap<String, String> kisiBilgileri = new HashMap<>();


            System.out.println("Isim soyisim giriniz");
            kisiBilgileri.put("ad", sc.nextLine());

            System.out.println("Adresinizi giriniz");
            kisiBilgileri.put("adres", sc.nextLine());

            System.out.println("Telefon numaranizi giriniz");
            kisiBilgileri.put("tel", sc.nextLine());

            System.out.println("Kimlik numaranizi giriniz");
            kisiListesi.put(sc.nextInt(), kisiBilgileri);
        sc.nextLine();

            System.out.println(kisiBilgileri);
            System.out.println(kisiListesi);

            System.out.println("Devam etmek istiyor musunuz(E/H)");
           secim= sc.nextLine();

        }while(secim.equalsIgnoreCase("E"));

        System.out.println("goruntulemek istediginiz kisinin kimlik numarasini girin");
        System.out.println(kisiListesi.get(sc.nextInt()));


    }
}

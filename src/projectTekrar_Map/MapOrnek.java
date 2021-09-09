package projectTekrar_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapOrnek {
    public static void main(String[] args) {


        HashMap<Integer, String> ogrenciBilgileri = new HashMap<>();
        ogrenciBilgileri.put(937, "Ali Can-7/B");
        ogrenciBilgileri.put(531, "Ayse Cetin-8/A");
        ogrenciBilgileri.put(856, "Ahmet Demir-5/B");
        ogrenciBilgileri.put(214, "Melek Durmaz-6/C");
        ogrenciBilgileri.put(632, "Can Mert-6/C");

        // yeni bir ogrenci girisi yapilsin . var olan numara ile kayit yapilmaya calisildiginda
        // o numarali kaydin oldugunu ve o numaraya ait kisinin bilgisini getirsin
        // eger belirtilen numara kayitli degilse kayda eklenmistir desin.


        Scanner scan = new Scanner(System.in);
        System.out.println("numara giriniz");
        int numara = scan.nextInt();
        scan.nextLine();
        System.out.println("Ogrenci bilgisi giriniz");
        String bilgi = scan.nextLine();

        if (ogrenciBilgileri.putIfAbsent(numara, bilgi) == null) {// null donuyorsa boyle bir kayit yoktur demektir.. Yani ekleme yapilmistir
            System.out.println("kaydiniz eklenmistir " + ogrenciBilgileri.get(numara));
        } else {
            System.out.println("Boyle bir kayit mevcuttur. : Kayit " + ogrenciBilgileri.putIfAbsent(numara, bilgi) + " kisisine aittir.");
        }

        // bir numara girildiginde o kisiye ait sinif bilgisini bize gostersin
        // eger kayit yok ise boyle bir kayit yok mesaji versin

        System.out.println(" numara giriniz ");
        int num = scan.nextInt();

        if (ogrenciBilgileri.containsKey(num)) {
            System.out.println(ogrenciBilgileri.get(num).substring(ogrenciBilgileri.get(num).indexOf('-') + 1));
        } else {
            System.out.println("böyle bir kayıt yok ");
        }

/*    DIGER YOL
        if (ogrenciBilgileri.putIfAbsent(num,bilgi)==null){
            System.out.println("kaydiniz alinmistir"+ ogrenciBilgileri.get(num));
        }else{
            System.out.println("boyle bir kayit mecvuttur : Kayit"+ ogrenciBilgileri.putIfAbsent(num,bilgi)+" kisisine aittir");
        }*/


    }
}

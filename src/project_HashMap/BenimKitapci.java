package project_HashMap;

import java.util.*;

public class BenimKitapci {
    /*
     * Bir kitapci icin program yapalim
     *
     * Kitap no 1000'den baslayarak sirali no olsun Her kitap icin kitapAdi,
     * yazarAdi,yayinYili,fiyati bilgilerini girelim
     *
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
     * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
     * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- Bitir
     */

    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, List<BenimKitapci>> kitap = new HashMap<>();
    static int kitapNo = 1000;

    String kitapAdi;
    String yazarAdi;
    String yayinYili;
    String fiyati;

    public BenimKitapci(String kitapAdi, String yazarAdi, String yayinYili, String fiyati) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyati = fiyati;
    }

    public static void main(String[] args) {
        String secim;
       do {
           System.out.println("1-Kitap Ekle" +
                   "\n2-Numara ile Kitap Goruntule" +
                   "\n3-Bilgi ile Kitap Goruntule" +
                   "\n4-Numara ile Kitap Sil" +
                   "\n5-Tum kitaplari Listele" +
                   "\n6-Cikis");

           System.out.println("Hangi islemi yapmak istiyorsunuz ");
            secim = scan.next();

           switch (secim) {
               case "1":
                   kitapEkle();
                   break;
               case "2":
                   noIleGoruntule();
                   break;
               case "3":
                   bilgiIleGOruntule();
                   break;
               case "4":
                   noIleSil();
                   break;
               case "5":
                   listele();
                   break;
               case "6":
                   System.out.println("Gorusmek Uzere!");
                   break;
               default:
                   System.out.println("Gecerli bir islem seciniz!");
                   break;
           }
       }while (!secim.equals("6"));
       }


    public static void listele() {
        for (Map.Entry<Integer,List<BenimKitapci>> w: kitap.entrySet() ) {
            System.out.println(w.getKey()+" ==> "+w.getValue());
        }
    }

    public static void noIleSil() {
    }

    public static void bilgiIleGOruntule() {
    }

    public static void noIleGoruntule() {
    }

    public static void kitapEkle() {
        scan.nextLine();
        System.out.println("Eklemek istediginiz kitabin adini giriniz");
        String kitapAdi = scan.nextLine();
        System.out.println("Eklemek istediginiz kitabin yazarinin adini giriniz");
        String yazarAdi = scan.nextLine();
        System.out.println("Eklemek istediginiz kitabin yayin yilini giriniz");
        String yayinYili = scan.nextLine();
        System.out.println("Eklemek istediginiz kitabin fiyatini giriniz");
        String fiyati = scan.nextLine();

        BenimKitapci con=new BenimKitapci(kitapAdi,yazarAdi,yayinYili,fiyati);
        List<BenimKitapci> l= new ArrayList<>();
        l.add(con);

        kitap.put(kitapNo++,l);

    }

    @Override
    public String toString(){
        return kitapAdi+" "+yazarAdi+" "+yayinYili+" "+fiyati;
    }

}

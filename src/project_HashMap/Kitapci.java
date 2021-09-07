package project_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kitapci {
    /* Bir kitapci icin program yapalim
     *
     * Kitap no 1000'den baslayarak sirali no olsun
     * Her kitap icin kitapAdi, yazarAdi,yayinYili,fiyati bilgilerini girelim
     *
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun
     * 1- kitap ekle
     * 2- numara ile kitap goruntule
     * 3- bilgi ile kitap goruntule
     * 4- numara ile kitap sil
     * 5- Tum kitaplari listele
     * 6- Bitir
     */

    static Scanner scan=new Scanner(System.in);
    static HashMap<Integer,String> kitap=new HashMap<>();
    static int kitapNumarasi=1000;

    public static void main(String[] args) {
        topluKitapEkle();
        menu();


    }

    public static void menu() {
        int secim;
        do {
            System.out.println("1-Kitap Ekle" +
                    "\n2-Numara ile Kitap Goruntule" +
                    "\n3-Bilgi ile Kitap Goruntule" +
                    "\n4-Numara ile Kitap Sil" +
                    "\n5-Tum kitaplari Listele" +
                    "\n6-Cikis");

            System.out.println("Hangi islemi yapmak istiyorsunuz ");
             secim = scan.nextInt();

            switch (secim) {
                case 1:
                    kitapEkle();
                    break;
                case 2:
                    noIleGoruntule();
                    break;
                case 3:
                    bilgiIleGOruntule();
                    break;
                case 4:
                    noIleSil();
                    break;
                case 5:
                    listele();
                    break;
                case 6:
                    System.out.println("Gorusmek Uzere!");
                    break;
                default:
                    System.out.println("Gecerli bir islem seciniz!");
                    break;
            }
        }while (secim!=6);
    }

    private static void listele() {
        for (Map.Entry<Integer, String> entry : kitap.entrySet())
        {     System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue()); }
    }

    private static void noIleSil() {
        System.out.println("Silmek istediginiz kitabin numarasini giriniz");
        int noSil= scan.nextInt();
        kitap.remove(noSil);
    }

    public static void bilgiIleGOruntule() {
        scan.nextLine();
        System.out.println("Hangi bilgi ile aramak istersiniz");
        String bilgi= scan.nextLine();
        int flag=0;

        for (Map.Entry<Integer,String> entry: kitap.entrySet()) {

            if (entry.getValue().contains(bilgi)) {

                System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("Aradiginiz kritere uygun kitap bulunamadi");
        }
    }

    private static void kitapEkle() {
        scan.nextLine();
        System.out.println("Lutfen kitabin adini giriniz: ");
        String kitapIsim = scan.nextLine();
        System.out.println("Lutfen yazarin adini giriniz: ");
        String yazarAdi = scan.nextLine();
        System.out.println("Kitabin yayin yilini giriniz: ");
        String yayin = scan.next();
        System.out.println("Kitabin satis fiyatini giriniz: ");
        String fiyat = scan.nextLine();
        scan.nextLine();
        kitap.put(kitapNumarasi++,kitapIsim+", "+yazarAdi+", "+yayin+", "+fiyat);
        System.out.println("kitabiniz basariyla eklenmistir");
    }

    public static void noIleGoruntule() {
        System.out.println("Listelemek istediginiz kitabin numarasini giriniz");
        int kitapNo= scan.nextInt();
        System.out.println(kitap.get(kitapNo));
    }

    public static void topluKitapEkle() {
        kitap.put(9999, "ali can evde, ali han, 2001, 11");
        kitap.put(9998, "ali can yolda, ali han, 2005, 10");
        kitap.put(9997, "yanlizlik, Veli Kul, 2005, 21");
        kitap.put(9996, "Sen, Ayse Unal, 2005, 30");
    }


}

package project_Otomat;

import java.util.*;

public class OtomatBenim {
    /*
projemizin adı YIYECEK OTOMATI

--15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
Bu ürünler ekranda listelensin

--Ürün seçip, para miktarı giriniz
--girdiğiniz para fazla ise üstünü versin,
eksik ise ekleme yapmanızı istesin
--Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,
para kontrolünü de yaparak işlem yapmaya devam etsin...
NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
oop concepte ait öğrendiklerimizi kullanmaya çalışalım...
     */
    static Map<Integer,Double> m=new HashMap<>();
    static List<String> l=new ArrayList<>(Arrays.asList("su","meyve suyu","kahve","cay","americano","latte","kapucino","kola"));
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hos geldiniz...");
        Thread.sleep(1000);
        urunuListele();

    }

    public static void urunuListele() throws InterruptedException {

        m.put(1,1.0);
        m.put(2,1.5);
        m.put(3,3.0);
        m.put(4,2.0);
        m.put(5,2.5);
        m.put(6,3.0);
        m.put(7,3.5);
        m.put(8,4.0);

        System.out.println("URUN KODU\tFIYAT\t\tURUNLER");
        System.out.println("===========================================");
        for (int i=0; i< l.size();i++){
            System.out.println(i+1+"\t\t\t"+(m.get(i+1))+" TL\t\t"+l.get(i));
        }
        urunSec();
    }

    public static void urunSec() throws InterruptedException {
        String onay="";
        int secim =0;
        do {

           System.out.println("Secmek istediginiz urun numarasiniz giriniz");
            secim = scan.nextInt();
           System.out.print("Secilen urun : " + l.get(secim - 1) + "\t" + m.get(secim)+" TL");
            System.out.println();
           System.out.println("Islemi onayliyor musunuz (E/H)");
            onay = scan.next().toUpperCase();
       }while(onay.equalsIgnoreCase("H"));

       odeme(m.get(secim));

        System.out.println(l.get(secim - 1)+" siparisiniz hazirlaniyor..");
        System.out.println("Lutfen bekleyin...");
        Thread.sleep(1000);

    }

    public static void odeme(Double odenecek) {
        double odenen=0;
       do{
        System.out.println("Odeme yapacaginiz miktari giriniz");
        odenen+=scan.nextDouble();

        if (odenen == odenecek ) {
            System.out.println("Siparis hazirlanma asamasina geciyor");
        } else if (odenen > odenecek) {
            System.out.println("Siparis hazirlanma asamasina geciyor\nLutfen para ustunuzu aliniz");
            System.out.println("Para ustu = "+(odenen-odenecek)+" TL");
        } else {
                System.out.println("Eksik odeme yaptiniz...\nLutfen " + (odenecek - odenen) + " Tl daha ekleme yapiniz");
        }
        }while (odenen < odenecek);
        System.out.println("oldu");
    }


}

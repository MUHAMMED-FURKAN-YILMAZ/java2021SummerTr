package OgrenciPractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C04_Shop {
    ArrayList<C04_Urunler> secilenUrunler=new ArrayList<>();
    double toplamAlisVerisTutar;
    int taksit;

    LinkedHashMap<LocalDate,Double> taksitler= new LinkedHashMap<>();

    void menuListe(){
        int i=0;
        for (C04_Urunler urun: C04_Urunler.values()) {
            System.out.println(++i+"\t"+urun.toString());
        }
    }

    ArrayList<C04_Urunler> urunSec (C04_Shop gs){
        boolean secimTamamMi = false;
        String secim="";
        Scanner sc= new Scanner(System.in);

        do {
            menuListe();
            System.out.println("Almak istediginiz urunlerin numarasini giriniz, Birden fazla urun secebilirsiniz (14)");
            System.out.println("Secimleriniz : ");
            secim=sc.nextLine();
            secim=secim.replaceAll("[^12345]","");

            if (urunSecimKont(secim)){
                secimTamamMi=true;
            }
        }while (!secimTamamMi);

        return strUrunArrayList(secim);
    }

    ArrayList<C04_Urunler> strUrunArrayList(String str){
        String[] strArry=str.split("");
        ArrayList<C04_Urunler> urunler=new ArrayList<>();

        for (int i=0; i<strArry.length;i++){
            urunler.add(C04_Urunler.values()[Integer.parseInt(strArry[i])-1]);
        }
        return urunler;
    }


    int taksitBelirle(){
        boolean secimOk=false;
        String secim="";
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Odemeniz gereken Toplam Taksit tutari : "+toplamAlisVerisTutar);
            System.out.println("kac taksit yapilsin : ");
            secim=sc.nextLine();
            if (urunSecimKont(secim)) {
                secimOk=true;
            }
        }while(!secimOk);

        return Integer.parseInt(secim);
    }


    void  taksitlendir(){
        LocalDate bugun=LocalDate.now();
        LocalDate ilkOdemeTarihi=LocalDate.of(bugun.getYear(), bugun.getMonth(),3);

        int tamTaksitTutari =(int) (toplamAlisVerisTutar/taksit);
        int i=1;
        for (i=1 ; i< taksit; i++){
            taksitler.put(ilkOdemeTarihi.plusMonths(i),(double) tamTaksitTutari);
        }

        taksitler.put(ilkOdemeTarihi.plusMonths(i),(double) toplamAlisVerisTutar-((i-1)*tamTaksitTutari));
    }

    void hesaplaToplamAlisVerisTutari(){
        double fiyat=0;
        for (C04_Urunler urunler:secilenUrunler) {
            fiyat+=urunler.getPrice();
        }
        toplamAlisVerisTutar=fiyat;
    }

    void taksitleriYazdir(){
        System.out.println("Aldiginiz Urunler : ");
        System.out.println("----------------------");

        for (C04_Urunler urunler:secilenUrunler) {
            System.out.println(urunler.toString());
        }

        System.out.println("Toplam odenecek Miktar :"+toplamAlisVerisTutar);
        System.out.println("Tercih edilen Taksit Miktari = "+taksitler);
        System.out.println("Odeme tablosu : ");
        System.out.println("---------------------");

        int i=0;
        System.out.println( "Taksitler ---  Ödeme Tarihi --- Fiyat");
        for (Map.Entry<LocalDate,Double> entry: taksitler.entrySet()){
            System.out.println(++i+" . taksit :"+entry.getKey()+" "+entry.getValue());
        }
    }

    boolean urunSecimKont(String str) {
        boolean ret=false;
        try{
            long i =Long.parseLong(str);
            ret = true;
        }catch (Exception e){
            ret=false;
        }
    return  ret;
    }





}

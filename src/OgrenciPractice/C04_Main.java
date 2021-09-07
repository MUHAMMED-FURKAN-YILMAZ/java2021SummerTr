package OgrenciPractice;

public class C04_Main {
//  Müşterinin alacağı bir ürün için taksit yapılcacaktır.
//  Kullanıcıdan Alıncak olan malın ücret ve kaç taksit olacağı bilgisini alınız.
//  Taksit rakamları kuruşlu çıkıyorsa kuruşlar toplanıp, son taksite eklensin.
//  Günün tarihine göre 1 ay atlatarak oluşan taksit tarihi ve
//  ödencek taksit miktarının listesini yazdırınız.

    public static void main(String[] args) {
        C04_Shop gs=new C04_Shop();
        gs.secilenUrunler=gs.urunSec(gs);
        for (C04_Urunler urunler : gs.secilenUrunler){
            System.out.println(urunler.toString());
        }

        gs.hesaplaToplamAlisVerisTutari();
        gs.taksit= gs.taksitBelirle();
        gs.taksitlendir();
        gs.taksitleriYazdir();


    }





}

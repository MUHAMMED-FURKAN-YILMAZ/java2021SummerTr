package project_Encapsulation;

public class Ogrenci {
    /*
       (string) ad,telefon,no bilgisi olacak
       hepsi private
       farkli bir class'ta,
       klavyeden girilen 10 adet ogrenciye ait bilgiyi ekranda goruntuleyecegiz
         */

    private String ad;
    private String tel;
    private int no;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String telefon, int no) {
        this.ad = ad;
        this.tel = telefon;
        this.no = no;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", tel='" + tel + '\'' +
                ", no=" + no +
                '}';
    }
}

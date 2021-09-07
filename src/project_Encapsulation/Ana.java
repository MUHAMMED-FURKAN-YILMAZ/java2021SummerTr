package project_Encapsulation;

public class Ana {

    private String ad="Ahmet";
    private  int yas=40;
    String adres="Ankara";

    public Ana() {
    }

    public Ana(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }



    public int getYas() {
        return yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {// generate'den yapip modifiye edebiliriz
        return
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", adres='" + adres ;
    }

    public static void main(String[] args) {

    }
}

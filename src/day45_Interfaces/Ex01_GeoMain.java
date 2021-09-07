package day45_Interfaces;

public class Ex01_GeoMain {
    /*
    Kare, Dikdortken, ve cember sınıflarından oluşacak bir geometri programı yapılmak isteniyor.
    bunların ayrı ayrı , fakat ortak metodlarının (cevresi() ve alani() )zorunlu olabilmesi için
    gerekli yapıyı kurunuz ve yazınız.
     */
    public static void main(String[] args) {

        Ex01_Dikdortgen dd=new Ex01_Dikdortgen();
        System.out.println("dikdortgenin alani= "+dd.alan(3.5, 5.5));
        System.out.println("dikdortgenin cevresi= "+dd.cevre(3.5, 5.5));

        Ex01_Cember c=new Ex01_Cember();
        System.out.println("cemberin alani= "+c.alan(3.0));
        System.out.println("cemberin cevresi= "+c.cevre(3));

        Ex01_Kare k=new Ex01_Kare();
        System.out.println("karenin alani= "+k.alan( 7));
        System.out.println("karenin cevresi= "+k.cevre(5));

    }
}

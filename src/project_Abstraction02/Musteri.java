package project_Abstraction02;

import java.util.Scanner;

public class Musteri {

    AnaAbstract anaabstract;
    Scanner scan= new Scanner(System.in);
    public void alisVeris(){
        System.out.println("Ekmek Hesaplamasi");
        System.out.println("Kac adet ekmek almak istiyorsunuz?");
        int x=scan.nextInt();

        System.out.println("Ekmek fiyati : "+ anaabstract.ekmekAl(x)/x+" TL");
        System.out.println("Odeyeceginiz miktar : "+anaabstract.ekmekAl(x)+" Tl");

    }
}

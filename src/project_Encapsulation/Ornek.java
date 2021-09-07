package project_Encapsulation;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Ana obj=new Ana();
        System.out.println(obj.getAd());//Ahmet
        System.out.println(obj.getYas());//40
        System.out.println(obj.adres);//Ankara
/*
        System.out.println("ad giriniz: ");
        obj.setAd(scan.nextLine());

        System.out.println("yas giriniz");
        obj.setYas(scan.nextInt());
*/
        Ana obj2=new Ana("ali",25);

        System.out.println(obj2.getAd());//ali
        System.out.println(obj2.getYas());//25

        System.out.println(obj.getAd());//ayse
        System.out.println(obj.getYas());//10

        System.out.println(obj);

    }
}

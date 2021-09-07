package project_Abstraction02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        Musteri musteri= new Musteri();
        System.out.println("Nereden alisveris yapacaksiniz (1-Market/ 2-Halk Ekmek) ");
        int secim= scan.nextInt();

        if (secim==1) {

            musteri.anaabstract=new Market();

        }else if (secim==2){
            musteri.anaabstract=new HalkEkmek();

        }
        musteri.alisVeris();



    }
}

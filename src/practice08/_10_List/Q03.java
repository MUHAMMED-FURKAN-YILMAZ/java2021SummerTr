package practice08._10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list olusturunuz ve bu list'deki tum sayilarin karesinin
   toplamini bulunuz. Sonucu ekrana yazdiriniz.
    */
    	// list'i int yaparak da bulabilirdik remove kullanmak icin String ile yaptik
        List<String> liste = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Listeye atamak uzere elemanlarinizi giriniz: ");
        System.out.println("Yeterli elemana ulasinca 'q' giriniz!");

        String islem ="";
        int sum = 0;

        while (!(islem.equalsIgnoreCase("q"))) {

            System.out.print("sayi giriniz: ");
            islem = scanner.nextLine();

            liste.add(islem);


        }
      liste.remove(liste.size() - 1);// veya lýst.remove("q") ;
      			//Trick :liste  girilen son eleman q silindi.

        for (String w : liste) {
            int y = Integer.parseInt(w);
            sum += y * y;
        }
        System.out.println(liste + " nin elemanlarinin kareleri toplami = " + sum);

       
    }
}

package practice08._10_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 6 elemanli bir dizinin
        // sadece tek elemanlarini ayri diziye bir metodda atayarak
        // main de yazdiriniz.

        Scanner sc=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i=0; i< dizi.length; i++){
            System.out.print("Sayi giriniz = ");
            dizi[i]= sc.nextInt();
        }

        System.out.println(tekElemanlar(dizi));
    }

    public static ArrayList<Integer> tekElemanlar(int[] sayi)
    {
        ArrayList<Integer> liste=new ArrayList<>();

        for (int i=0; i< sayi.length; i++){
            if(sayi[i]%2==1){
                liste.add(sayi[i]);
            }
        }

        return liste;
    }


}

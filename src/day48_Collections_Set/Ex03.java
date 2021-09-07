package day48_Collections_Set;

import java.util.*;

public class Ex03 {
      /*
        main islemleri
        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist olusturun
        2.  ekrana yazdirin
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu yazin
        4.  sonucu ekrana yazdirin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin
        7.  Hem Set hem de ArrayList'e method ile hazirlanacak olan 20 elemanli,
            elemanlari 0-10 arasinda random sayilardan olusan arraylist'i ekleyin
        8. Sonuc Set ve ArrayList'i yazdirin
        9. Set icinde cift olan elemanlari iterator kullanarara silin
     */
      public static void main(String[] args) {

            ArrayList <Integer> list=randomList(15,15,0);
            System.out.println("list "+list);
            System.out.println("*************************");

            System.out.println(tekrarlariSil(list));

            Set<Integer> listToSet= new HashSet<>(list);
            System.out.println("listToSet = " + listToSet);

            ArrayList<Integer> setToList=new ArrayList<>(listToSet);
            System.out.println("setToList = " + setToList);

            listToSet.addAll(eklenecekList(15,15,0));
            setToList.addAll(eklenecekList(15,15,0));

            System.out.println("eklenmis setToList = " + setToList);
            System.out.println("eklenmis listToSet = " + listToSet);

            ListIterator it=setToList.listIterator();

            while (it.hasNext()){
                  if ((int)it.next()%2==1){
                        continue;
                  }else{
                        it.remove();
                  }
            }

            System.out.println("Ciftler silinmis setToList = " + setToList);



      }

      private static Collection<Integer> eklenecekList(int size, int max, int min) {
            ArrayList<Integer> l=new ArrayList();
      for (int i =0; i<size; i++) {
            l.add((int) (min + Math.random() * (max - min + 1)));
      }
      return l;
      }

      private static Set<Integer> tekrarlariSil(ArrayList<Integer> list) {
            Set<Integer> tekrarsiz=new HashSet<>(list);
            return tekrarsiz;
      }

      private static ArrayList<Integer> randomList(int size, int max, int min) {
            ArrayList<Integer> listRandom=new ArrayList<>();
            for (int i=0; i< size; i++){
                  listRandom.add((int) (min + Math.random() * (max - min + 1)));
            }
            return listRandom;
      }
}

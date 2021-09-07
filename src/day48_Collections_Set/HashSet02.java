package day48_Collections_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet02 {
    public static void main(String[] args) {
        /*
        İcinde degerleri olan bir array'i arraylist e cevirecek
  return tipi arrayList olacak bir metod yaziniz.
  {“reha”, “hakan”, “haluk”, “ipek”, “ahsen”}
  main metod altinda metod ile gelen listeyi kullanarak
  HashSet, TreeSet ve linkedHashSet leri doldurun.
         */

        String arr[]={"reha", "hakan", "haluk", "ipek", "ahsen"};

        ArrayList<String> list= cevir(arr);

        System.out.println("list : "+list);//list : [reha, hakan, haluk, ipek, ahsen]

        HashSet<String> hs=new HashSet<>(list);
        TreeSet<String> ts=new TreeSet<>(list);
        LinkedHashSet<String> lhs=new LinkedHashSet<>(list);

        System.out.println("HashSet hali :"+hs);//HashSet hali :[ahsen, hakan, reha, ipek, haluk]
        System.out.println("TreeSet hali :"+ts);//TreeSet hali :[ahsen, hakan, haluk, ipek, reha]
        System.out.println("LinkedHashSet hali :"+lhs);//LinkedHashSet hali :[reha, hakan, haluk, ipek, ahsen]







    }

    public static ArrayList<String> cevir(String[] arr) {
        ArrayList<String> ArrList=new ArrayList<>();;

        for(String w: arr){
           ArrList.add(w);
       }
        return ArrList;
    }
}

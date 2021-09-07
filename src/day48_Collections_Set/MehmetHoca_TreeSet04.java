package day48_Collections_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MehmetHoca_TreeSet04 {
    public static void main(String[] args) {
        Set<String> set1=new TreeSet<>();

        System.out.println(System.currentTimeMillis());
        for (int i=0; i<10000;i++){
            set1.add(""+i);
        }
        System.out.println(System.currentTimeMillis());

        System.out.println("===========================");

        Set<String> set2=new HashSet<>();
        System.out.println(System.currentTimeMillis());
        for (int i=0; i<10000;i++){
            set2.add(""+i);
        }
        System.out.println(System.currentTimeMillis());


        TreeSet<String> set3=new TreeSet<>(set2);// hashset olan set2'yi treeSet olan 3'e cevirdik
    }
}

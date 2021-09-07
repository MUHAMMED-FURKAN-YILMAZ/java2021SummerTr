package day49_Collections_Queue_Maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Deque_01 {
    public static void main(String[] args) {

        /*
      Fifo : First in first out--> elemanlar ilk eklenen ilk silinir eczane, yemekhane ve sektorlerde
            zaman kaydi olan elemanlarin tutulmasinda kullanilir
    -Queue interface'inin iki subClass constructor'u ile obje create edilebilir .
        LinkedList cost ile obj create edilirse elemanlar Queue icinde insertion order'a gore siralanir
    -PriorityQueue cost ile obj create edilirse elemanlar Queue icinde Java'nin kendine
        ozel algoritmasina gore siralanir

         */

        Queue<String > q1=new LinkedList<>();
        q1.add("basri");
        q1.add("hakan");
        q1.add("sedef");
        q1.add("ahmet");
        System.out.println(q1);//[basri, hakan, sedef, ahmet]--1 java  LinkedList geregi isertion order'a gore sira olusturdu

        Queue<String > q2=new PriorityQueue<>();
        q2.add("rabia");
        q2.add("oguz");
        q2.add("yagmur");
        q2.add("mehmet");
        System.out.println(q2);//[mehmet, oguz, yagmur, rabia]--> java kendi priorityQueue(oncelik) algoritmasi calistirdi


        System.out.println(q1.peek());// basri--> ilk elemani silmeden return eder
        System.out.println(q1);//[basri, hakan, sedef, ahmet]

        System.out.println(q1.poll());//basri--> ilk elemani silerek return eder
        System.out.println(q1);//[hakan, sedef, ahmet]

      //  q1.clear();// artik q1 bos
     //   System.out.println(q1.poll());// bos bir obj'den eleman silip return etme komutu girdik-->null
    //    System.out.println(q1.remove());//NoSuchElementException-->exc firlatti

     //   q1.remove();
     //   System.out.println(q1);//[sedef, ahmet]

        System.out.println(q1.offer("merve"));// true
        System.out.println(q1);//[hakan, sedef, ahmet, merve]--> offer method'u add() methodu gibi eleman ekler
                               // ancak eleman siniri konulduysa add() method'u IllegalStateException firlatir
                                // ancak offer() methodunda bu durum olmadan calismaya devam eder






    }
}

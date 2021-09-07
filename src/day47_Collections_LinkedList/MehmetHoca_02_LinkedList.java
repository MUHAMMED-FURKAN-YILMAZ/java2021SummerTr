package day47_Collections_LinkedList;
import java.util.LinkedList;
public class MehmetHoca_02_LinkedList {
    public static void main(String[] args) {

        LinkedList<Object> ll1= new LinkedList<>(); // yavas

        //Colletions'da esitligin sol tarafina <> icine data type yazilmazsa
        //veya data type olarak Object yazilsa collections calisir
        //ama boyle bir kullanimda surekli casting yapildigi icin
        //zaman ve hafiza acisindan verimli degildir

        System.out.println(System.currentTimeMillis());// dateTime objesi olusturmaya gerek kalmadan
                                                        // sistemden nili saniyeyi  aliyor
        for (int i=0; i<1000;i++){
            ll1.add("A"+i); // concatenation
            ll1.add(20+i); // toplama
            ll1.add('C'+i); // ascii degeri
        }
        System.out.println(System.currentTimeMillis());

        System.out.println("====================");

        LinkedList ll2= new LinkedList<>();// burada gorunmuyor ama eclipse'de sari yazdiriyor.
        System.out.println(System.currentTimeMillis());
        for (int i=0; i<1000;i++) {
            ll2.add("B"+i);
            ll2.add(25+i);
            ll2.add('K'+i);
        }
        System.out.println(System.currentTimeMillis());

        System.out.println("====================");


        LinkedList<Integer> ll3= new LinkedList<>();// hizli
        System.out.println(System.currentTimeMillis());
        for (int i=0; i<1000;i++) {
            ll3.add(10+i);
            ll3.add( 10+i);
            ll3.add(20 + 'C'+i);
        }
        System.out.println(System.currentTimeMillis());



    }
}

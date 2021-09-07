package day48_Collections_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MehmetHoca_HashSet01 {
    /*
    Verilen bir Array'deki tekrarli elemanlari silip
    unique elemanlardan olusan bir Array'e ceviren
    bşr method yaziniz
     */
    public static void main(String[] args) {

        int arr[]={2,3,4,3,5,3,6,4,7,4,8,5};
        
     int tekrarsizArray[]=tekrarlariSil(arr);
        System.out.println("Main method icinde array olarak :"+Arrays.toString(tekrarsizArray));

    }

    private static int[] tekrarlariSil(int[] arr) {

        Set<Integer> set1=new HashSet<>(); // set olusturduk


        for (Integer w : arr){// array'deki her bir elemani Set'e atip tekrarlardan kurtulduk
            set1.add(w);
        }
        System.out.println("Set olarak method icinde :"+set1);// [2, 3, 4, 5, 6, 7, 8]

        int tekrarsizArray[]=new int[set1.size()];// set'in size'ini alip bu buyuklukte array olusturduk

        int index=0;// Set'deki elemanlari array'e ekledik array index'e
                    //ihtiyac duydugu icin bu variable'i olusturduk
        for(int each :set1){// set'deki tum elemanlari tekrarsizArray' attik
            tekrarsizArray[index]=each;
            index++;
        }

        return tekrarsizArray;
    }
}

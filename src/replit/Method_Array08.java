package replit;

import java.util.Arrays;

public class Method_Array08 {
    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

        Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6};

       // int newArr[]=arrBirlestir(arr1, arr2);
        System.out.println(Arrays.toString(arrBirlestir(arr1, arr2)));
    }

    private static int[] arrBirlestir(int[] arr1, int[] arr2) {
    int newArr[]=new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            newArr[i]=arr1[i];
        }
        for (int i = arr1.length; i < arr1.length+arr2.length ; i++) {
            newArr[i]=arr2[i- arr1.length];
        }

        return newArr;
    }
}

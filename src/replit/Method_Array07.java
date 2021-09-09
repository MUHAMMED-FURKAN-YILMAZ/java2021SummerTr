package replit;

import java.util.Arrays;

public class Method_Array07 {
    /*
    Write a method that accepts an array as parameter and returns sum off all
    elements in the array Then print the result in the main method.

        Eg :
        input : {1,2,3,4,5,6,7,8};
        output: 36
     */
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8};
        parametersSum(arr);

    }

    private static void parametersSum(int[] arr) {
        System.out.println(Arrays.stream(arr).reduce(0, Math::addExact));
    }
}

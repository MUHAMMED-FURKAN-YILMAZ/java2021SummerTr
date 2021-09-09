package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Array04 {
    /*
    Create a custom return type method accepts a name as parameter and prints the name as a char array.
        (do not use toCharArray() method)
        Input : John
        Output :[J, o, h, n]
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");

        String str=sc.nextLine();
        String arr[]= str.split("");

        System.out.println(Arrays.toString(arr));
    }
}

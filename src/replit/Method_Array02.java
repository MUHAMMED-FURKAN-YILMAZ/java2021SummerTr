package replit;

public class Method_Array02 {
    /*
    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC
     */
    public static void main(String[] args) {
        String str="Coding is greate." ;
        String[] arr=str.split("");
        String terstenStr="";

        for (int i = arr.length-1 ; i >=0 ; i--) {
            terstenStr+=arr[i];
        }
        System.out.println(terstenStr);

    }
}

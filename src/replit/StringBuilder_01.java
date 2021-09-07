package replit;

public class StringBuilder_01 {
    /*
     Write a java program which accept a sentence as parameter,
     than reverses sentence by using StringBuilder
   and checks if sentence is palindrome or not
   (without case sensitivity)
   Eg : input : I love Java
   Output: "Reversed sentence : avaJ evol I .
   It is not a palindrome"
     */
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("I love Java");
        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Reversed sentence : avaJ evol I . It is not a palindrome");
        }









    }
}

package replit;

import java.util.Arrays;

public class Method_Array03 {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the digits, 
		  present in the given string.

input : ade1r4d3 

output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()
         
		 */
		String str= "ade1r4d3";
        int sum=0;
        
        String arr[]= str.split("");
        System.out.println(Arrays.toString(arr));       
        
        for (String w : arr) {
            
            if(Character.isDigit(Integer.valueOf(w.charAt(0)))) {
            sum+=Integer.valueOf(w);
            } else {
                continue;
            }
        }
        System.out.println(sum);
	}
	
}		
	
package day42_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions07 {
	public static void main(String[] args) {
	
		int [] arr= {1,2,3,4};
		
		System.out.println(arr[1]);//2
		System.out.println(arr[3]);//4
//		System.out.println(arr[5]);// ArrayIndexOutOfBoundsException unchecked
		
		List <String> list=new ArrayList<>(Arrays.asList("merve","hakan","firat"));
		
		System.out.println(list.get(2));//firat
		System.out.println(list.get(0));//merve
//		System.out.println(list.get(5));//ArrayIndexOutOfBoundsException
		
		//Array ve listlerde olmayan bir index ile islem yapilirsa 
		//java bize ArrayIndexOutOfBoundsException (unchecked) hatasini verir
		
		String str = "furkan";
//		str.substring(7);// StringIndexOutOfBoundsException
		
		
		
		
		
		
		
		
		
		
	}
}

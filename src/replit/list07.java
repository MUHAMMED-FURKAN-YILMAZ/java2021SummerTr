package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list07 {
/*
write a Java program to removes a specific element from an array and
put the remaining elements in a new array and prints the new array


Input :{1,2,3,4,5,6} 

element:6

Output : [1,2,3,4,5]

	 
	 */
	public static void main(String[] args) {

		 List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	        List<Integer>list2=new ArrayList<>();

	        list1.remove(5);
	        for (int i=0; i<list1.size();i++){
	            list2.add(list1.get(i));
	        }
	        System.out.println(list2);
	}

}

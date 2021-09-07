package replit;

import java.util.ArrayList;
import java.util.List;

public class list04 {

	/*
	 Write a program that deletes the letters 'a' from the names 
	 in the list given as input.


         INPUT : 
         list1={"Ali","Veli","Ayse","Fatma","Omer"}

         OUTPUT : 
         
         [Veli,Omer]
	 */
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Veli");
		list.add("Ayse");
		list.add("Fatma");
		list.add("Omer");
		
		List<String> list2=new ArrayList<>();
		
		
		for (String w : list) {
			if (w.toLowerCase().contains("a")) {
				continue;
			}else {
				list2.add(w);
			}
		}
		
		System.out.println(list2);	
		
	}

}

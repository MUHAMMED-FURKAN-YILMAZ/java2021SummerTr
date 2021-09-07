package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list06 {

	/*
	 Write a program to find the common elements between two String Arrays (without case sensitivity)
 
Input1 : {John,Brad,Ange,Sofia,Emily}
 
Input2 : {sofia,brad,grace,emily,hazel}


Output : [sofia,brad,emily]
	 */
	public static void main(String[] args) {
		 List<String>list1=new ArrayList<>(Arrays.asList("John","Brad","Ange","Sofia","Emily"));
	        List<String>list2=new ArrayList<>(Arrays.asList("sofia","brad","grace","emily","hazel"));
	        List<String>list3=new ArrayList<>();

	        for (int i=0; i<list2.size();i++){
	            for(String w :list1){
	                if (list2.get(i).equalsIgnoreCase(w)){
	                    list3.add(list2.get(i));
	                }
	            }
	        }
	        System.out.println(list3);
	}

}

package replit;

import java.util.Arrays;
import java.util.List;

public class list02 {
	/*
 Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : 
String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:
          
[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]  
		 */
	public static void main(String[] args) {
	
	String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
	List<String> list=Arrays.asList(names);
	
	String temp=list.get(2);
	
	list.set(2,list.get(7));
	
	list.set(7,temp);
	System.out.println(list);
	
	
	}

}

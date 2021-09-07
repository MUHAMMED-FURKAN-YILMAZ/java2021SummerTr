package kendiCalismam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {	
		
		 /*
	     Kullanicidan alinan bir tamsayiya kadar FIBONACCI dizisi olusturun.
	     1-1-2-3-5-8-13-21-34....
	     */

	        Scanner scan = new Scanner(System.in);
	        System.out.println("pozitif bir tamsayi giriniz : ");
	        int num = scan.nextInt();
	        
	        List<Integer> list= new ArrayList<>();
	        list.add(1);
	        list.add(1);
			
	        int i=2;
	        int newnum=0;
	        while (newnum<num) {
			newnum=list.get(i-2)+list.get(i-1);
			list.add(newnum);
			i++;
			}
	        list.remove(list.size()-1);
	        System.out.println(list);
			
	       
	    }

}

package Practice07._09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlerini kullanarak
		 *  asagidaki outputu alin.
		 * input : Congratulations
	 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    
	 * sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

		 */
		String str = "Congratulations";
		String arr[]=str.split("");
		
		for (int i = arr.length-1; i >=0; i--) {	
			if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u") ) {
				arr[i]="i";
			
			}
			String yeni=arr[i].replaceAll(",", "");
			System.out.print(yeni);
		}	
		
	
	
	}

}

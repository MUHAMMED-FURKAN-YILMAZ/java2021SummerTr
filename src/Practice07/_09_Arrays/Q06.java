package Practice07._09_Arrays;

import java.util.Arrays;

public class Q06 {
	public static void main(String[] args) {

		/*
		 * write a java program to find the second largest number in the array?
		 *  Maximum and minimum number in the array? 
		 * (Dizideki en buyukk ikinci sayiyi, maksimum
		 * ve minimum sayiyi bulmak icin bir java programi yazin)
		 * 
		 * int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		 * 
		 */

		int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		
		Arrays.sort(arr);
		
		System.out.println("Dizideki en buyuk ikinci sayi : "+arr[arr.length-2]);
		System.out.print("Dizideki max deger : "+arr[arr.length-1]+" \nDizideki min deger : "+arr[0]);
		
		
		
	}

}

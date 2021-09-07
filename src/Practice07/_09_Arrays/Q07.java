package Practice07._09_Arrays;

import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		/*
	 * write a method that accepts a 2 dimensional array and finds the max value
	 * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
	 * Input : {{1,2,-3},{41,5},{6,7,18}} 
	 * Output : 41 
		 */
		
		int arr [][]= {{1,2,-3},{41,5},{6,7,18}};
		
		int uzunluk=0;
		
		
	
		for (int i = 0; i < arr.length; i++) {
			uzunluk+=arr[i].length;
		}
		
		int yeniArr[]=new int [uzunluk];
		
		int sayac=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				yeniArr[sayac]=arr[i][j];
			sayac++;
			}
		}
	
	Arrays.sort(yeniArr);
	System.out.println("array'in max elemani : "+yeniArr[yeniArr.length-1]);
	
	
		
	}

}

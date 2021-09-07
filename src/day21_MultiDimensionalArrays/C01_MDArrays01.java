package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays01 {

	public static void main(String[] args) {

		int arr[][]= {{1},{2,3,4},{5,6,7,8}};
		
		// Bu array'i nested for loop ile yazdiralim
		
		for (int i = 0; i < arr.length; i++) { // bu loop outer array'in elementlerini getirir.
			
			  // arr [0] arr[1] arr[2]
			
			for (int j = 0; j < arr[i].length; j++) {// length in �n�ndeki [i] dikkat. bu i outer array'in 
				// index array'lerinin length'ine kadar uzat�yor. biri 1 biri 3 biri 4 oldu. 
				System.out.print(arr[i][j]+" ");
			}
	
		System.out.println("");
		
		
		}

		System.out.println(Arrays.deepToString(arr));// deep-- array'in derinlemesine, dibine kadar gidiyor
		
	}

}

package Practice07._09_Arrays;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
	//asagidaki multi dimensional arrayle'in ic arraylerindeki tum elemanlarin 
	//toplamini birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan
	// ve yeni array'i ekrana yazdiran bir program yaziniz  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
		
		int arr[][] = { {1,2,3}, {4,5,11}, {6,7}, {8, 9, 10}};
		int sonuc[] = new int[arr.length];
		
		
		for(int i=0; i<arr.length; i++) {
			
			int sum=0;
			
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
			}			 
			sonuc[i] = sum;
			
		}
		
		System.out.println(Arrays.toString(sonuc));
	}
		
	}
		


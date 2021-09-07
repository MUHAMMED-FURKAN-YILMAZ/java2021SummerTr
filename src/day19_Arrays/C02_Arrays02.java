package day19_Arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {

		int arr[]= new int[5];
		
		System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0]

		// ben bir kez olusturdugum array'in sonradan uzunlugunu degistirebilir miyim?
		
		// [0, 0, 0, 0, 0, 5] yapabilir miyim?
		
		// arr[5]=5; 
		
		// array'in lenght'i sonradan DEG�ST�R�LEMEZ !!
		// array'i kullanissiz yapan da bu ozelligidir.
		
		 arr[2]=1;
		 System.out.print(Arrays.toString(arr)); //[0, 0, 1, 0, 0]
		
		
		arr= new int[6]; // keyword onemli.. new demek yeni demek
		// bu ekleme yapmaz 6 elementlik yeni bir array atar. Onceki �l�r
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]
		
		// ARRAY'in lenght'i DEG�ST�R�LEMEZ................	
		
	}

}

package kendiCalismam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayiTerstenYazdirma {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen bir string giriniz ==> ");
		String str = scan.nextLine();
		
		String arr[] = str.split("");
		// System.out.println(Arrays.toString(arr));
		
		String terstenArr[] = new String[str.length()];
		
		System.out.println(arr.length);
		
		for (int i = arr.length-1; i >= 0; i--) {
			// 4
			// 4
			// 0
			
			// 4
			// 3
			// 1
			terstenArr[arr.length -1  - i] = arr[i];
		}
		System.out.println(Arrays.toString(terstenArr));
		
		
	}

	}



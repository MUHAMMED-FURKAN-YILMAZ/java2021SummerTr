package Practice07._09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve 
	// array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin 
	//arasinki farki gosteren
	// java programi yazin
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Kac elemanli bir array olusturmak istiyorsunuz? ");
	int boyut = scan.nextInt();//4
	
	int arr[]=new int[boyut];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Array'inizin "+i+". index elemanýný giriniz : ");
		arr[i]=scan.nextInt();
	
	}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Array'inizin max-min eleman farki :"+(arr[arr.length-1]-arr[0]));
		scan.close();
	}

}

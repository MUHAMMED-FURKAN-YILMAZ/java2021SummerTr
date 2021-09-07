package day20_Arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {

		// Verilen bir array'i buyukten kucuge siralayan bir method yaziniz

		int arr[]= {3,15,10,11,9};
			
		arr=arrayiSirala(arr);	//call'a degil arr'ye dönsun diye
		
		arrayiTerstenSirala(arr);// = temp oldu 
	
		//System.out.println(Arrays.toString(arrayiTerstenSirala(arr))); sadece yazdirmak istersek
	
		arr=arrayiTerstenSirala(arr);
		System.out.println("Tersten siralanmis hali : "+Arrays.toString(arr));
	}

	private static int[] arrayiTerstenSirala(int[] arr) {
		
		int []temp=new int[arr.length]; // eski array ile ayni uzunlukta bir array olusturdum
		// su an [0,0,0,0,0] cunku default atadi.
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]= arr[arr.length-1-i];
		}
		// temp array'i istedigim gibi arr'nin ters siralanisi oldu
		// bunu main methoda dondurmem yani return etmem lazim
		return temp;
			
	}

	private static int[] arrayiSirala(int[] arr) {
		// oncelikle array'i kucukten buyuge siralayalim
		Arrays.sort(arr);
		System.out.println("Siralanmis hali : "+Arrays.toString(arr));
		return arr;
		
	}

	
	
	

}

package day31_Varargs_StringBuilder;
public class C04_Varargs04 {	
	public static void main(String[] args) {	
	
		
		int arr[]= {1,3,5,7,9};
	System.out.println("array toplami : "+arrTopla(arr));
	System.out.println("varargs toplami : "+varargsTopla(1,3,5,7,9));		
	System.out.println("varargs'in array parametreli toplami : "+varargsTopla(arr));
// varargs array gibi davrandigi icin herhangi bir array'i parametre olarak alabilir
	
	}
	// array elemanlarini toplayan method
	private static int arrTopla(int[] arr) {
		int topla = 0;
		for (int a : arr) {
			
			topla+=a;	
		}
		
		return topla;
	}
	//varargs elemanlari toplayan method
	private static int varargsTopla(int... i) {
	int toplam=0;
	for (int a : i) {
		toplam+=a;
	}
		return toplam;
	}
}

package Practice07._09_Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  verilen bir int  Arrayde toplamlari istenen degere
		 *   esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] 
		 * arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */
		int[] arr = { 5, 7, -6, 4, 2, 15, 3, 8, 1 };
		int istenenToplam = 9;
		
		for (int i = 0; i < arr.length; i++) {// ilk toplanacak sayi tekrari-->5
			for (int j = i+1; j < arr.length; j++) {//ikinci toplanacak sayi tekrari-->5+7..
				
				if(arr[i]+arr[j]==istenenToplam) {

	System.out.println(arr[i]+" ile "+arr[j]+" toplami :"+istenenToplam);
				}
			}
		}
		
	}

}

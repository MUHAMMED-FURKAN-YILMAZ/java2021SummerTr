package day21_MultiDimensionalArrays;

public class C02_MdArrays02 {

	public static void main(String[] args) {
		/*
		 *Soru 1 ) Asagidaki multi dimensional array�in tum elemanlarinin 
		 			*carpimini ekrana  yazdiran bir method yaziniz. 
		 			*{ {1,2,3}, {4,5,6,7} }
		 */

		int arr[][]={ {1,2,3}, {4,5,6,7} };
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {// outer array icin
			
			for (int j = 0; j < arr[i].length; j++) {// inner array icin
				
				carpim*=arr[i][j];

			}
			
			
		}
		
		System.out.println("tum elementlerin carpimi : "+ carpim);
		
		
	}

}

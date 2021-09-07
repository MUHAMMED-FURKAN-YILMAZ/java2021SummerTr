package day22_23_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C08_List_08 {

	public static void main(String[] args) {
		
		String arr[]= {"3","5","7"};
		
		List <String> arrList= Arrays.asList(arr);

		System.out.println("List olarak : "+ arrList); 
		
		arr[1]="Ali";// array'in bir eleman�n� degistigimde
					// otomatik olarak list'i de degistiriyor
		
		System.out.println("List olarak2 : "+ arrList); 
		
		arrList.set(0, "Ayse"); // biz list'ten degistirdik ama
								// java array'i de degistiriyor
		
		System.out.println("list : "+arrList);
		System.out.println("array : "+Arrays.toString(arr));
		
	}

}

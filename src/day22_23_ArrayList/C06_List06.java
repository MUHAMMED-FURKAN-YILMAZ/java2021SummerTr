package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_List06 {

	public static void main(String[] args) {
		
		// 100' den buyuk ilk 20 fibonacci sayisini list olarak yazdirin

	//  bir yolu bu		
		List<Integer> fibonacci= new ArrayList<>();
		List<Integer> istenenSayilar=new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		int count=0;
		int sayi=0;
		int i=1;
		
		do {
			sayi=fibonacci.get(i-1)+fibonacci.get(i);// index(0) + index(1)
			fibonacci.add(sayi);
			
			if (sayi>100) {
			
				istenenSayilar.add(sayi);	
				count++;
			}
			i++;		
			
		} while (count<20);
		
		System.out.println(istenenSayilar);
//[144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 
// 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269]
			
	}

}

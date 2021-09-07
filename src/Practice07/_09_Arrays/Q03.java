package Practice07._09_Arrays;
public class Q03 {

    public static void main(String[] args) {
 //bir int Array elemanlarinin isaretini(+-)degistiren  bir method yaziniz.
        // input : 1, 2,-3, 4,-5,-6
        //output :-1,-2, 3,-4, 5, 6

        int[] arr = {1, 2, -3, 4, -5, -6};
    
        sayininTersi(arr);
		}
      
    

	private static int[] sayininTersi(int[] arr) {
		for (int w: arr) {// arr'nin her bir elemani - ile carpilmasi
			// sira gerektirmedigi icin kodun hizli calismasi icin 
			//for each kullandik		
	w*=-1;		
	System.out.print(w+", ");
		
		}
		return arr;
		}
}

package day12_StringManipulations;

public class C05_StringManipulation05 {

	public static void main(String[] args) {
		
		/* 
		 * Soru 2) String seklinde verilen asagidaki 
		 	fiyatlarin toplamini bulunuz
 			String str1 = �$13.99�
 			String str2 = �$10.55�
 			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.		  	  
		 */
	
		String str1 = "$13.99";
	 	String str2 = "$10.55";
	
	 	str1=str1.replace("$", "");
	 	str2=str2.replace("$", "");
	 	
	 	System.out.println(str1+str2); // $'lardan kurtulduk ama hala String 
	 									//oldugu icin concatenation yapt�.
	 	Double sayi1= Double.parseDouble(str1);//sagdaki D' neden buyuk.. wrapper class 
	 										  //oldu method kullanmak icin
	 	Double sayi2=Double.parseDouble(str2);
	 	// soldakini de buyuk yazmak daha iyi olur ilerisi icin 
	 	// cunku biri kucuk biri buyuk olursa biri non-primitive 
	 	// digeri primitive olur. ilerde kar�s�kl�k olmamas� icin
	 	
	 	System.out.println("iki sayinin toplami : $"+ (sayi1+sayi2));
	 	
	}

}

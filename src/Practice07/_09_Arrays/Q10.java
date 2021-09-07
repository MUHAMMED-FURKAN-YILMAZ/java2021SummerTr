package Practice07._09_Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarili"  Diziyi "CoookBasarili" ye cevirin )
			*
			*/
		
		
		String str = "GayetBasarili";
		
		str=str.replace("Gayet","Coook");
		
		System.out.println(str);
		
		String arr[]=new String [1];
		
		arr[0]= str;
		
	}

}

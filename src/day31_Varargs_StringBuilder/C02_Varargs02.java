package day31_Varargs_StringBuilder;
public class C02_Varargs02 {
	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren 
		// concat isimli bir method olusturunuz
		
		concat("m","e","r","v","e");
	
	}

	private static void concat(String... string) {
		String top="";
		for (String w : string) {
			top=top.concat(w); 	// veya bu soru için boyle de olurdu .top+=w;
	
		}
		System.out.println(top);
	}

}

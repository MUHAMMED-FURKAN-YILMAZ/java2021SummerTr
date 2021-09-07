package kendiCalismam;

public class StringManipulation {

	public static void main(String[] args) {

		//  String Manipulation 
		
		//Soru 1) String methodlarini kullanarak 
		//“ Java ogrenmek123 Cok guzel@ ” String’ini 
		//“Javogrenmek cok guzel.” sekline getirin.

		String str1=" Java ogrenmek123 Cok guzel@ ";
		
		String str2= str1.trim().replaceAll("\\d", "").replace('@','.').replaceFirst("\\s", "");
		
		System.out.println(str2);
		
	}

}

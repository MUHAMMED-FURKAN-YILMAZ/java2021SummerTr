package day43_Exceptions_Throws_Throw_Finally_CCCE;

import java.util.Iterator;

public class Error_MehmetHoca01 {

	public static void main(String[] args) {
		
//	 System.out.println(20/0);--> RTE degil RunTimeException		
		
//		String str="asd;--> CTE'dir.. 
		//		Cunku cift tirnagi tamamlamadikca kod calismaz
		
	//Bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir.
		
	// Java'da Eror dendiginde onune gecilemeyen, kod ile cozulemeyen
	// sistemden kaynakli buyuk hatalardir	
		
	// Error'lar unchecked'dir ve Java bunlari on goremez
	//ancak gerceklestiginde kodun calismasi durdurulur
		
		String str="";
		for (int i = 0; i < 1000000; i++) {
			str+=i;
		}
		
		
	}

}

package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions05 {

	public static void main(String[] args) {
		
		/*icice try-catch yerine 1 tane try ve multiple catch blogu kullanabiliriz
	Ancak bu durumda yazdigimiz ezception'lar arasinda Parent-Child iliskisi varsa onca child classi yazmaliyiz
		  Aksi takdirde(yani once parent yazilirsa) child'a is kalmaz
		  Jaca erisilemez catch-blogu diyerek CTE verir 
		*/
		
		/*
		 Eger handle edilecek exceptions'lar arasinda parent-child iliskisi
		 varsa parent class exception'i create edilip child class exception'i
		 olmadan da code calisir ANCAK:
	OLUMLU DURUM  : Tek catch body ile exceptions handle edilebilir
    OLUMSUZ DURUM : Bir hata durumunda hatanin turu vs. ulasilamayacagi
		 		    icin verileri handle edilme imkani olmaz
		 */
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Muhammed Furkan Yýlm\\eclipse-workspace\\java2021SummerTr\\src\\day41_Exceptions\\file");
		 
		int i=0;
		
			while ((i=fis.read())!=-1) {
				System.out.print((char)(i));
			
			}
			fis.close();
		}
		 
		catch (IOException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Aradigin file yerinde");
		System.out.println("dewamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmsutur");
		
	}
}

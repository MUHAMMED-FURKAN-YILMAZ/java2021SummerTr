package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {
	public static void main(String[] args) { // (inner try-catch) yada (parent-child try-catch)
		
		//Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		//Java "Ya dosyayi bulamazsam" der ve bizden cozum uretmemizi bekler.
		// Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
		
		
		try {// file'a erisimi kontrol ediyor. file var mý yok mu bakiyor hatasini handle ediyor
			FileInputStream fis=new FileInputStream("C:\\Users\\Muhammed Furkan Yýlm\\eclipse-workspace\\java2021SummerTr\\src\\day41_Exceptions\\file");
		 // checked exception'dir
		int i=0;
		try { // file'i okumayi ve yazdirma islemini handle ediyor-->"child try-catch"
			while ((i=fis.read())!=-1) {// int degeri fis obj read methodu ile atandiginda -1'e esit degilse while body'e gir
				// gidip hepsini getirdi ama ascii'yi getirdi geri bunu karakterlere cevirmem lazim
				System.out.print((char)(i));
			
			}
		} catch (IOException e) { // [ I : input , O : output ] demektir
			e.printStackTrace();// daha cok kullanilir cunku hatanin tum verisini verir handle kolayligi saglar
			// tum hata aciklamalarini yazdirir ama kod bloke olmaz
			
			System.out.println(e.getMessage());
		}
		}
		
		
		
		
		
		catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Aradigin file yerinde");
		System.out.println("dewamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmsutur");

		
		
		
				
	}
}

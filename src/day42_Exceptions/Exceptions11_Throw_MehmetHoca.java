package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions11_Throw_MehmetHoca {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Muhammed Furkan Yýlm\\eclipse-workspace\\java2021SummerTr\\src\\day41_Exceptions\\file");

		// try-catch blogu exception ile handle etmekte kullanilir
		// throws keyword'u ise declaration'dir dolayisiyla
		// throws kullanilan bir method'da exception olusursa KOD BLOKE olur.
		
		int i=0;
		
		while ((i=fis.read())!=-1) {
			System.out.print((char)(i));
		}
		// Eger birden fazla exception icin throws keyword'u kullanacaksak 
		// yazacagimiz exception'larin iliski ve siralama onemli olur
		// eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa
		// once child exception yazilmalidir. Aksi takdirde child exception erisilemez olur
		
		
		// Eger yazacaklarimiz arasinda parent-child iliskisi varsa
		// istersek sadece parent'i yazdirmamiz yeterli olacaktir.
		
	}

}

package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	
	public static void main(String[] args) {
		
		/* 
		 Parentten child'e exceptions==> object->Throwable->Exception->IOException->FileNotFoundException
		 */
		// try'in icine birdeb cok catch yapilacaksa catch'ler childden parente dogru gitmeli. attaki ornekte
		//(FileNotFoundException)[child] ile (IOException)[parent].. yerlerini degistirirsek CTE verir 
		
		
		/*
		 Eger kodumuzu yazdirdigimizda birden fazla exception'la iliskili durum
		 olusuyorsa ic ice try-catch olusturabiliriz
		 
		 Bu ornekte ilk once dosyayi okutmk istedik,Java "Ya dosyayi bulamazsam"
		 diye bizden yardim sitedi. Biz de try-catch blogu ile FileNotFoundException
		 ile handle etmesine yardimci olduk.
		 Sonrasinda dosyadaki yazilari okumaya calistik ve Java yeniden 
		 "Ya dosyayi okuyamazsam" diye yardim istedi.
		 Biz de try-catch blogu ile IOException ile handle etmesini sagladik.
		 */
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Muhammed Furkan Yýlm\\eclipse-workspace\\java2021SummerTr\\src\\day41_Exceptions\\file");
		 // ** biz FileInputStream class'inin ozelliklerini kullanmak icin fis isminde obj. olusturduk
			
		int i=0;
		
			while ((i=fis.read())!=-1) {
				System.out.print((char)(i));
			// i++ koymadik cunku read methodu i'yi kendi artiriyor.
			}
			fis.close();// fiss obj close edildi
		}
		 catch (FileNotFoundException e) { 
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
						
		
		catch (IOException e) { // dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Aradigin file yerinde");
		System.out.println("dewamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmsutur");

		
		
	}
}

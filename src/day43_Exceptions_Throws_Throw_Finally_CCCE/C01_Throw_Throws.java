package day43_Exceptions_Throws_Throw_Finally_CCCE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Throw_Throws {

	public static void main(String[] args) throws IOException {

		try {	
			 
		FileInputStream fis=new FileInputStream("C:\\Users\\Muhammed Furkan Yýlm\\eclipse-workspace\\java2021SummerTr\\src\\day41_Exceptions\\file");
		 
		int i=0;
			while ((i=fis.read())!=-1) {
				
			}
				System.out.print((char)(i));
		fis.close();	
		}finally {
			
			System.out.println("Finally block calisti");
		}			
				
				
	/*
	 * throws keyword'u sadece declaration'dir. 
	 * throws kullanilan methodda ecxeption olursa CODE BLOKE olur
	 * Exceptions arasinda parent-child iliskisi varsa 
	 * parent class exception throws'dan sonra yazilmali
	 */
		
				
			}
}

package replit;

public class ForWhile_8_adanzyeAsii {

	public static void main(String[] args) {
		
		/*
		 'a' ile 'z' aras�ndaki karakterlerin ascii de�erlerini 
		 	yazd�ran bir Java program� yaz�n.
		 */
		char ch='a';
				
		while (ch<='z') {
		
			System.out.println("Ascii value of "+ch+" = "+(ch+0));
			
			ch++;
		}
		
	}

}

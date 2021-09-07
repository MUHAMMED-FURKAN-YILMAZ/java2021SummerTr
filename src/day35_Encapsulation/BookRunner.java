package day35_Encapsulation;

import java.util.Scanner;

public class BookRunner {

	/*
	  Book class'ý verilmiþtir.
    Ýki tane attributes oluþturunuz.
    bookName ve authorName (String ile)
    Book class'ýný kapsülleyin. (Encapsulate)
    Main class'ýn içine object  oluþturun ve sonucu yazdýrýnýz.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
	 */
	
	public static void main(String[] args) {
		
		Book kitap=new Book();
		Scanner scan=new Scanner(System.in);
		System.out.println("son okudugunuz kitabi giriniz ");
		String kitap2=scan.nextLine();
		kitap.setBookName("calikusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1.kitabim :"+kitap.getBookName()+"\nikinci kitabim :"+kitap.getAuthorName());
		
		scan.close();
		
		
	}

}

package practice09;

public class BookClass {

	String title, author;
    int publish;
    static int pages;

	public BookClass(String title, String author, int publish) {
		super();
		this.title = title;
		this.author = author;
		this.publish = publish;
	}

	public static void main(String[] args) {
		/*
	     * Write program as a Book class that will have 2 Constructors. While creating
	     * an object make sure: Instance variables are being initialized Both
	     * Constructors are being executed
	     */
 // Program�, �rnek de�i�kenlerin ad� ve adresi olan bir Student s�n�f� olarak yaz�n.
   // Bu de�i�kenleri ba�latacak bir kurucu olu�turun. DisplayInfo y�ntemiyle verilen
      // ��rencinin ad�n� ve adresini yazd�r�n.
	
	BookClass kitap1=new BookClass("suc ve ceza", "Dostoyevski",2000);
	BookClass kitap2=new BookClass("calikusu", "Resat Nuri",1935);
	
	kitap1.disPlay();
	kitap2.disPlay();	
	}

	private void disPlay() {
		System.out.println("kitapiniz : "+title+" yazari : "+author+" yayin yili : "+publish);
		
	}

}

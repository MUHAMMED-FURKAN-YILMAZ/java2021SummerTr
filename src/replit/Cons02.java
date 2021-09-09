package replit;


public class Cons02 {
	/*Mainde bir ogrencinin degiskenlerini olu�turun ve bu de�i�kenleri atamay� kullan�n
	 Changename, parametre olarak ogrenci ad�nda bir y�ntem olu�turun
	 bilgileri al�n ve y�ntemdeki t�m bilgileri de�i�tirin ve yeni bilgileri ekleyin
	 yazd�r
	 Main y�nteminde Rename y�ntemini �a��rd���m�z sat�r hemen ard�ndan ��renci bilgilerini yeniden yazd�r�r.
	 changesurname ad�nda bir y�ntem olu�turun, 
	 bu y�ntem parametre de�i�keni al�rken "lastname" dir. Y�ntemde, kullan�c�dan yeni bir 
	 soyad� girmesini isteyin ve
	 eski soyad�n� de�i�tir (yani can).*/
	
	String isim;
    int yas;
    
    public Cons02(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
        System.out.println(isim +" " + yas);
    }
    public Cons02() {
        
    }
    public static void main(String[] args) {
        /*Biri parametreli, di�eri parametresiz 2 constructor olu�turun.
        Bu cons.lari kullanarak en az 2 nesne olu�turun ve �zelliklerini konsolda yazd�r�n.*/
    Cons03 obj1= new Cons03("Fatma",15);
    Cons03 obj2= new Cons03("Ayse",20);
    
 
    
        
    }

	
	
}

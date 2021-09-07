package replit;


public class Cons02 {
	/*Mainde bir öðrencinin deðiþkenlerini oluþturun ve bu deðiþkenleri atamayý kullanýn
	 Changename, parametre olarak öðrenci adýnda bir yöntem oluþturun
	 bilgileri alýn ve yöntemdeki tüm bilgileri deðiþtirin ve yeni bilgileri ekleyin
	 yazdýr
	 Main yönteminde Rename yöntemini çaðýrdýðýmýz satýr hemen ardýndan öðrenci bilgilerini yeniden yazdýrýr.
	 changesurname adýnda bir yöntem oluþturun, 
	 bu yöntem parametre deðiþkeni alýrken "lastname" dir. Yöntemde, kullanýcýdan yeni bir 
	 soyadý girmesini isteyin ve
	 eski soyadýný deðiþtir (yani can).*/
	
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
        /*Biri parametreli, diðeri parametresiz 2 constructor oluþturun.
        Bu cons.lari kullanarak en az 2 nesne oluþturun ve özelliklerini konsolda yazdýrýn.*/
    Cons03 obj1= new Cons03("Fatma",15);
    Cons03 obj2= new Cons03("Ayse",20);
    
 
    
        
    }

	
	
}

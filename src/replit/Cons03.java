package replit;

public class Cons03 {

	/*
	 1- Create 2 constructors one is with parameters, 
	  the other one is without parameter.
	 2- By using that constructors create at least 2 objects 
	  then print their features on the console.
	 */
	
	/*Biri parametreli, diðeri parametresiz 2 constructor oluþturun.
	Bu cons.lari kullanarak en az 2 nesne oluþturun ve özelliklerini konsolda yazdýrýn.*/

	String isim;
	int yas;
	
	public Cons03(String isim, int yas) {

		this.isim = isim;
		this.yas = yas;
		System.out.println(isim +" " + yas);
	}

	public Cons03() {
		
	}
	public static void main(String[] args) {
		/*Biri parametreli, diðeri parametresiz 2 constructor oluþturun.
		Bu cons.lari kullanarak en az 2 nesne oluþturun ve özelliklerini konsolda yazdýrýn.*/

    Cons03 obj1= new Cons03("Fatma",15);
    Cons03 obj2= new Cons03("Ayse",20);
    
 
    
		
	}
	}
	
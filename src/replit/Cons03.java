package replit;

public class Cons03 {

	/*
	 1- Create 2 constructors one is with parameters, 
	  the other one is without parameter.
	 2- By using that constructors create at least 2 objects 
	  then print their features on the console.
	 */
	
	/*Biri parametreli, di�eri parametresiz 2 constructor olu�turun.
	Bu cons.lari kullanarak en az 2 nesne olu�turun ve �zelliklerini konsolda yazd�r�n.*/

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
		/*Biri parametreli, di�eri parametresiz 2 constructor olu�turun.
		Bu cons.lari kullanarak en az 2 nesne olu�turun ve �zelliklerini konsolda yazd�r�n.*/

    Cons03 obj1= new Cons03("Fatma",15);
    Cons03 obj2= new Cons03("Ayse",20);
    
 
    
		
	}
	}
	
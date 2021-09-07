package day44_AbstractClasses;

public abstract class  MehmetHoca_YanHizmetler extends MehmetHoca_Personel {

	//abstract bir class'in abstract child'ini olusturursak 
	//tum method'lari implement etmek zorunda olmayiz
	// Java bilir ki bu child son class degil, mutlaka bunun 
	// child'i concrete child class'i olacak
	
	public static void main(String[] args) {
		
//		MehmetHoca_YanHizmetler obj1=new MehmetHoca_YanHizmetler();
		// abstract bir class'dan obje uretilemez
		// Cannot instantiate the type MehmetHoca_YanHizmetler
	}
	
	
}

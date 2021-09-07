package day45_Interfaces;

public class C01_MehmetHoca_InterfaceRunner03 implements C01_MehmetHoca_Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanimlanmis bir variable veya method 
		// baska classdan classIsmi.methodIsmi seklinde cagrilabilir
		
		C01_MehmetHoca_Interface02.deneme2(); // static keyword'lu method calisti
		
		// Default keyword'u ile olusturdugumuz method ise obje uzerinden cagrilir
		
		C01_MehmetHoca_InterfaceRunner03 obj1=new C01_MehmetHoca_InterfaceRunner03();
		obj1.deneme();// default keyword'lu method calisti

		
		
		
		
	}

}

package day27_StaticKeyword;

public class C01 {
	
	int sayi=10;
	String str="Yasasin eclipse";
	static int sayi2;
	
	
	public static void main(String[] args) {
		
 //System.out.println(sayi);// sayi instance bir variable oldugu icin 
		//direkt main methoddan kullanilamaz
// ancak instance variable'lara obje uzerinden ulasabilirim
		
		//obje olusturmak icin constructor kullanmaliyim
		//bu class'da constructor var mi? gorunmese de VAR.. default constructor 
		
	C01 obj1 = new C01();
	// soldaki C01 : CLASS ISMI ve ayni zamanda DATA TYPE'dir
	// sagdaki C01() : class ismi ile ayni ama yaninda () oldugu icin CONSTRUCTOR'dir
	
	// obj1.sayi; CTE verir cunku ya ATAMA yapmaliyiz veya YAZD�RMAL�Y�Z
	
	System.out.println(obj1.sayi); // 10.. ya yazdirmaliyiz 
		
	obj1.sayi=44; // ya da atama yapmaliyiz
	
	//System.out.println(sayi);// obje urettik diye instance'a direkt ulasamayiz obje kullanmaliyiz
	
	System.err.println(obj1.sayi); // 44
		
	
	C01 obj2=new C01();
	System.out.println(obj2.sayi);// 10.. hangi objede degisiklik yapiliyorsa o objenin 
								  // instance variable degisir diger objedekiler etkilenmez
	
	obj2.sayi=34;
	
	
	System.out.println(sayi2);
	// java run time programdir
		
	}

}

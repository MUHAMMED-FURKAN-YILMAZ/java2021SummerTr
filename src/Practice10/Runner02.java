package Practice10;

public class Runner02 {

	public static void main(String[] args) {
		myMethod();

	}
public static void myMethod() {
	subClass02 subC=new subClass02();
	System.out.println("subClass degisken degeri : "+subC.num);
	subC.goster();	

	Super02 superC=new Super02();
	System.out.println("superclass degisken degeri : "+superC.num);
	superC.goster();
}
	
}

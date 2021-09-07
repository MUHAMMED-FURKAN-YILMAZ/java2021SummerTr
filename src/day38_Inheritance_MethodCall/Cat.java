package day38_Inheritance_MethodCall;

public class Cat extends Mammal{

	 int c=9;// parenti ile ayni
	 int d=5;	
	 
	 public Cat() {
		 System.out.println("p'siz constructor Cat");
	 }
	 
	public Cat(String s) {
		this();
		System.out.println(super.c);
		System.out.println("String p'li constructor Cat");
	}



	public void mC() {
		System.out.println("cat");
	}
	
	public void mD() {
		System.out.println("nankor kedi");
	}
	
	
}
	
		
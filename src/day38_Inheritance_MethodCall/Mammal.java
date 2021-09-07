package day38_Inheritance_MethodCall;

public class Mammal extends Animal{

	 int c=7;
	 int m=4;// parenti ile ayni
	
	
	public Mammal() {
		this('A');
		System.out.println("p'siz mammal constructor");
	}
	 
	public Mammal(char c) {
		super(34);// parent'ten p'li cons call ettik
		System.out.println("char p'li mammal constructor");
	}

	public void mA() {// parenti ile ayni	
		System.out.println("mammal");
	}
	
	public void mC() {
		System.out.println("cat"+"mammal");
	}
	
	public void mD() {
		System.out.println("nankor mammal");
	}
	
	
	
	
	
	
}

package day38_Inheritance_MethodCall;

public class Animal {
	
	public int a=5;
	public int m;
	
	public Animal() {
		System.out.println("p'siz animal constructor");
	}
	
	public Animal(int i) {
		System.out.println("int p'li animal constructor");
	}

	
	public void mA() {
		System.out.println("animal");
	}
	
	public void mM() {
		System.out.println("animal"+" mamal");
	}
	
}

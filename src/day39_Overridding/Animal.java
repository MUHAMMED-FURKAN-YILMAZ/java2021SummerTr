package day39_Overridding;

public class Animal {

	
	public void beslenme() {
		System.out.println("tum hayvanlar beslenir..");
	}
	
	public void tatli() {
		System.out.println("trilece");
	}
	
	public String icecek() {
		System.out.println("nigde gazozu");
	return "ohhh";
	}
	
	public Integer topla() {
		return 34+6;
	}
	
	public Animal fatih() {
		return new Animal();
	}
	
}
